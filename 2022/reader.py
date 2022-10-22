from files import input_files, output_files
from copy import deepcopy


def readFile(file_num):
    num_file = 0
    num_contribute = 0
    contributors = {}
    projects =[]
    project = {}
    data = []

    f = open(input_files[file_num], "r")
    num_contribute, num_file = map(int,f.readline().split())

    for i in range (num_contribute):
        name, num = f.readline().split()
        num = int(num)
        for j in range(num):
            language, level = f.readline().split()
            contributors[name] = {}
            contributors[name][language] = level
    
    for i in range(num_file):
        project = []
        p_name, time, score, best, con = f.readline().split()
        time = int(time)
        score = int(score)
        best = int(best)
        con = int(con)
        project.append(p_name)
        project.append([time,score,best,con])
        skills = {}
        for j in range(con):
            language,level = f.readline().split()
            skills[language] = level
            project.append(skills)
        projects.append(project)

    f.close
    return (contributors,projects)


def writeFile(data, file_num):
    f = open(output_files[file_num], "w")
    f.write("4 ")
    f.writelines(data)
    f.close

data1,data2 = readFile(0)
