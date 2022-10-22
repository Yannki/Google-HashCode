class Worker:
    name = ""
    skill = {}
    assiged = {}

    def __init__(self, name):
        self.name = name

    def add_skill(self, skill, level):
        self.skill[skill] = level

    def assign(self, project, start_date):
       self.assiged[project] = start_date

    def is_available(self, at_time):
        for project in self.assiged.keys:
            
            if (at_time >= self.assiged[project] 
            and at_time <= self.assiged[project] + project.duration):
                return False
        return True



    