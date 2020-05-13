from selenium import webdriver
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.common.keys import Keys
options = Options();
options.add_argument("--headless");
name = "Markit16May2019"
location = "Noida"
driver = webdriver.Firefox(executable_path='/usr/local/bin/geckodriver',options=options)
#driver = webdriver.Firefox(firefox_options=options);
driver.get("http://192.168.0.5:8080/EmployeeManagementSystem/project.jsp")
assert "Registration" in driver.title
elem = driver.find_element_by_name("name")
elem.send_keys(name)
elem = driver.find_element_by_name("location")
elem.send_keys(location)
elem.send_keys(Keys.RETURN)
driver.close()
