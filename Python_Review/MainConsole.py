# written by: Beth Kieler
# July 2025
# Purpose: sample bits of practice code in preparation for employment exam
#

import os

def folder_read():
   # This function will read the contents of a folder and check for duplicate names.
    valid_path = 1

    while(valid_path):
        print(f"Please provide the full path of the folder to read.")
        folder_path = input("PATH:  ")
        if os.path.isdir(folder_path):
            print(f"The folder exists.")
        else:
            print(f"The folder does not exist.")
    print("end of folder_read")





allowed_choice = ("123")
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
            folder_read()
        case "2":
            print(f"You entered: {choice[0]}")
        case _:  # The wildcard '_' acts as a default case
            print(f"You entered: {choice[0]}")


























