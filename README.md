# WESTERN GOVERNOR UNIVERSITY 
## D288 – BACK-END PROGRAMMING
## Matthew Gibson
## 11/04/2023

### Task B
* Created starter files with the Spring Initializer
* Added files to project

### Task C
* Refactored com.example.demo to edu.wgu.backend
* edu.wgu.backend: created config, controllers, dao, entities, and services packages
<br><br>
* RestDataConfig.java: copied file into package
* RestDataConfig.java - Line 3: changed package name to match project
* RestDataConfig.java - Lines 37-41: temporarily commented out lines to avoid errors
<br><br>
* application.properties - lines 1-14: copied content from provided file

### Task D
* edu.wgu.backend.entities - lines 10-35: created Country.java class and added fields
* edu.wgu.backend.entities - lines 11-49: created Cart.java class and added fields
* edu.wgu.backend.entities - lines 10-40: created CartItem.java class and added fields
* edu.wgu.backend.entities - lines 11-42: created Vacation.java class and added fields
* edu.wgu.backend.entities - lines 11-46: created Excursion.java class and added fields
* edu.wgu.backend.entities - lines 10-51: created Customer.java class and added fields
* edu.wgu.backend.entities - lines 9-35: created Division.java class and added fields
* edu.wgu.backend.entities - line 4: created StatusType.java enum and added fields
<br><br>
* edu.wgu.backend.entities: removed placeholder.md
<br><br>
* Division.java - line 30: added arguments to @OneToMany annotation
* Customer.java - line 46: added arguments to @OneToMany annotation
* Cart.java - line 44: added arguments to @OneToMany annotation
* Cart.java - lines 22, 25: changed vacation mapping to @ManyToOne and changed excursion mapping to @OneToMany
* Vacation.java - line 37: added arguments to @OneToMany annotation
* CartItem.java - lines 25-30: changed @OneToMany annotation to @ManyToMany and added a join table to Excursion
* Excursion.java - lines 41-46: changed @OneToMany annotation to @ManyToMany and added a join table to CartItem