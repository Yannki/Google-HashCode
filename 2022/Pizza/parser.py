from files import input_files, output_files
from copy import deepcopy


def readFile(file_num):
    customers = []
    customer = {}
    likes = []
    dislikes = []

    f = open(input_files[file_num], "r")
    num_Customers = int(f.readline())

    for i in range(num_Customers):
        f.read(1)
        likes = f.readline().split()
        f.read(1)
        dislikes = f.readline().split()
        customer["likes"] = likes
        customer["dislikes"] = dislikes

        customers.append(deepcopy(customer))
    f.close
    return customers


def writeFile(data, file_num):
    f = open(output_files[file_num], "w")
    f.write("4 ")
    f.writelines(data)
    f.close


writeFile("cheese mushrooms tomatoes peppers", 0)
