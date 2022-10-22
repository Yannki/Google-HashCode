class Solution:
    assigns = {}

    def __init__(self, projects, workers):
        self.projects = projects
        self.workers = workers

    def assign(self,time, project, workers):
        self.assigns[project] = workers
        for worker in workers:
            worker.assign(project)
        


    def who_is_availible(self,at_time):
        result = set()
        for worker in self.workers: 
            if worker.is_availible(at_time):
                result.add(worker)

        return result

    def to_string(self, workers):
        result = ""
        result += f"{len(self.assign)}\n"
        result += f"{self.name}\n"
        for worker in workers:
            result += f"{worker} "
        result += "\n"