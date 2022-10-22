from reader import readFile

contributors, projects = readFile(0)

names = []
for i in contributors:
    names.append(i)

sol = ""

for i in projects:
    sol = sol + i[0] + "\n"
    for j in range(1,len(i)):
        for l in names:
            if contributors[l].get(list(j.keys()[0])) != None:
                  

