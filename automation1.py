from selenium import webdriver

driver = webdriver.Chrome()
driver.get('https://www.kayak.ch')

coockiesAccept = driver.find_element_by_xpath('//*[@id="c0DrT-currencyConversionInfoDialogContent"]')
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
acceptButton = driver.find_element_by_xpath('//*[@id="Mbvz"]/div[5]/div/div[3]/div/div/div[2]/div/div/div[1]/button/div[1]/div')
acceptButton.click()






