finalLog = ""
finalLog = finalLog + '[1] task 1 success \n'
finalLog = finalLog + '[2] task 2 success \n'
finalLog = finalLog + '[3] task 3 success \n'
finalLog = finalLog + '[4] task 4 success \n'
finalLog = finalLog + '[5] task 5 success \n'
try:
    print(1 / 0)
except ZeroDivisionError as err:
    finalLog = finalLog + '[6] task 6 Exception:' + str(err) + ' \n'
finalLog = finalLog + '[7] task 7 success'
print(finalLog)
print('all task has been executed')
