from tkinter import scrolledtext


class Project:
    name = ""
    score = 0
    best_before = 0 
    duration = 0
    roles = {}

    def __init__(self, name, score, best_before, roles):
        self.name = name
        self.score = score
        self.best_before = best_before
        self.num_roles = len(roles)
        for role in roles:
            self.roles[role] = roles[role]

    def start_date(self):
        return self.best_before - self.duration

    def expiry_date(self):
        return self.score + self.best_before

    def num_of_roles(self) :
        return len(self.roles)

    roles = set()
    all_projects = set()


