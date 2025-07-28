# written by: Beth Kieler
# July 2025
# Purpose: sample bits of practice code in preparation for employment exam
#

import os
import hashlib
from collections import defaultdict

def get_folder_path():
    # This function will obtain the folder path.

    while(True):
        print(f"Please provide the full path of the folder to read.")
        folder_path = input("PATH:  ").strip()
        if os.path.isdir(folder_path):
            print(f"The folder exists.")
            return folder_path
        else:
            print(f"The folder does not exist. Try again")
    ##### END get_folder_path() ######

def folder_read(folder_path):
    # This function will read the contents of a folder.
    all_files = []
    for root, dirs, files in os.walk(folder_path):
        for file in files:
            full_path = os.path.join(root, file)
            all_files.append(full_path)
    return all_files
    ##### END folder_read() ######

#creating a hash with typical chunk size
def get_file_hash(filepath, chunk_size=8192):
    hasher = hashlib.sha256() #initialize object with cryptographic hash function
    try:
        with open(filepath, 'rb') as f: #opens in binary read mode
            while chunk := f.read(chunk_size):
                hasher.update(chunk)
    except Exception as e:
        print(f"Error hashing file {filepath}: {e}")
        return None
    return hasher.hexdigest() #finalizes hash


def duplicate_name(file_paths):
    # This function will check for duplicate names.
    name_map = defaultdict(list)
    for one_path in file_paths:
        filename = os.path.basename(one_path)
        name_map[filename].append(one_path)

    duplicate_names = {} #dictionary of duplicates

    for name, paths in name_map.items():
        if len(paths) > 1:
            duplicate_names[name] = paths

    return duplicate_names
    ##### END duplicate_name() ######

def duplicate_content(file_paths):
    content_map = defaultdict(list)
    for one_path in file_paths:
        file_hash = get_file_hash(one_path)
        if file_hash:
            content_map[file_hash].append(one_path)

    dup_file_content = {}
    for hash_value, path_list in content_map.items():
        if len(path_list) >1:
            dup_file_content[hash_value] = path_list
    return dup_file_content
### END duplicate_content()






##### START PROGRAM ######
if __name__ == "__main__":
    allowed_choice = ("1239")
    end_program = 1
    while(end_program):
        print(f" \nChoose which program example to run by entering a number 1 - 3.")
        print(f" 1. Read contents of a folder and find duplicates. \n2. \n3.  ")
        choice = input("Choice: ")

        # Check if the input string is not empty
        if choice[0]:
            if (choice[0] in allowed_choice):
                print(f"You entered: {choice[0]}")
            else:
                print(f"You have not made a valid choice.")
                end_program = 0
        else:
            print("No character was entered.")
            end_program = 0

        match choice[0]:
            case "1":
                path = get_folder_path()
                folder_information = folder_read(path)
                name_duplicates = duplicate_name(folder_information)
                content_duplicates = duplicate_content(folder_information)
                print("Here are the names of duplicate names.")
                print (name_duplicates)
                print("Here are the items that have duplicate content.")
                print(content_duplicates)
            case "2":
                print(f"You entered: {choice[0]}")
            case "3":  # The wildcard '_' acts as a default case
                print(f"You entered: {choice[0]}")
            case "9":
                print("quitting")
                break

##### END PROGRAM ######