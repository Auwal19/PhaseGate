
student_grade = """
    =============================================
              Welcome Lagbaja School
    =============================================
"""

print(student_grade)


def get_scores(number_of_students, number_of_subjects):

    student_scores = []

    for student in range(number_of_students):

        scores = []

        print(f"\nStudent {student + 1}")

        for subject in range(number_of_subjects):

            score = int(input(f"Enter score for subject {subject + 1}: "))

            while score < 0 or score > 100:
                print("Invalid score. Enter another score from 0 to 100")
                score = int(input(f"Enter score for subject {subject + 1}: "))

            scores.append(score)

        student_scores.append(scores)

    return student_scores


def calculate_results(student_scores):

    student_totals = []
    student_averages = []

    for student in range(len(student_scores)):

        total = 0

        for subject in range(len(student_scores[student])):
            total += student_scores[student][subject]

        average = total / len(student_scores[student])

        student_totals.append(total)
        student_averages.append(average)

    return student_totals, student_averages


def display_results(student_scores, student_totals, student_averages):

    print("\n========== STUDENT RESULTS ==========")

    for student in range(len(student_scores)):

        print(f"\nStudent {student + 1}")
        print("Scores:", student_scores[student])
        print("Total:", student_totals[student])
        print("Average:", student_averages[student])


def calculate_subject_results(student_scores):

    number_of_students = len(student_scores)
    number_of_subjects = len(student_scores[0])

    subject_totals = []

    print("\n========== SUBJECT SUMMARY ==========")

    for subject in range(number_of_subjects):

        total = 0

        for student in range(number_of_students):
            total += student_scores[student][subject]

        average = total / number_of_students

        subject_totals.append(total)

        print(f"\nSubject {subject + 1}")
        print("Total:", total)
        print("Average:", average)

    return subject_totals


def display_class_summary(student_totals, student_averages, subject_totals):

    class_total = sum(student_totals)

    number_of_students = len(student_totals)
    number_of_subjects = len(subject_totals)

    class_average = class_total / (number_of_students * number_of_subjects)

    print("\n========== CLASS SUMMARY ==========")

    print("Class total:", class_total)
    print("Class average:", class_average)


def main():

    number_of_students = int(input("Enter number of students: "))
    number_of_subjects = int(input("Enter number of subjects: "))

    student_scores = get_scores(number_of_students, number_of_subjects)

    student_totals, student_averages = calculate_results(student_scores)

    display_results(
        student_scores,
        student_totals,
        student_averages
    )

    subject_totals = calculate_subject_results(student_scores)

    display_class_summary(
        student_totals,
        student_averages,
        subject_totals
    )


main()
