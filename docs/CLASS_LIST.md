*SDAMS GROUP GUIDE*

*Brief Rules*
* Java Swing only
* Text files only, no database
* Each role sees only its own menu
* Validate every input
* Must run with no errors
* OOP concept must be clear in code
* Extra features = extra marks

*Team Rules*
* Screens go in your role folder
* Data classes go in model/
* Data files go in src/data/
* Only edit your own files
* Ask the group before changing shared files
* Every screen needs a Back button
* Current user: LoggedIn.getUserId()

*Data Rules*
* Comma separated, block commas in input
* ID is always the first column
* Date yyyy-mm-dd, money 80.00
* Empty field = -
* Formats: docs/DATA_FORMATS.md

*Classes Made (shared)*
* login/Login
* login/LoggedIn
* model/User
* model/Staff
* model/Manager, Administrator, Instructor, Student, FacilitiesOfficer, AttendanceOfficer
* model/UserFile
* Dashboard for every role
* Demo data in all txt files

*Admin (OOP: Inheritance) – DONE*
* admin/AdminDashboard
* admin/ManageStaff
* admin/ManageStudents
* admin/PaymentRecords

*Manager (OOP: Polymorphism) – to do*
* manager/ManageAdministrators
* manager/StaffReport
* manager/RevenueReport
* model/RevenueCalculator

*Instructor (OOP: Abstraction) – to do*
* instructor/ManageClassSchedule
* instructor/IssueFacilityProblem
* instructor/ViewInstructorRating
* model/ClassSession (empty, fill in)
* model/FacilityIssue (empty, fill in)
* model/Record (abstract class)

*Student (OOP: Encapsulation) – to do*
* student/BookClasses
* student/ManagePayment
* student/InstructorRating
* model/Booking, Payment, Rating (empty, fill in)
* Keep payments.txt format, Admin reads it

*Facilities Officer (OOP: Interface) – to do*
* facilitiesofficer/EquipmentInventory
* facilitiesofficer/FacilityProblemManagement
* facilitiesofficer/StockReport
* model/Equipment (empty, fill in)
* model/Searchable (interface)

*Attendance Officer (OOP: Composition) – to do*
* attendanceofficer/ManageAttendance
* attendanceofficer/AttendanceRecords
* attendanceofficer/AttendanceReport
* model/Attendance (empty, fill in)

*Deadline: 06/12/2026, 11:59 PM (Sunday)*

---

*SDAMS 小组指南*

*作业规定*
* 只用 Java Swing
* 只用 txt 文件，不能用数据库
* 每个角色只能看到自己的菜单
* 每个输入都要验证
* 程序必须无错误运行
* 代码要清楚体现 OOP 概念
* 额外功能可以加分

*团队规则*
* 界面放在自己的角色文件夹
* 数据类放在 model/
* 数据文件放在 src/data/
* 只改自己的文件
* 改共用文件前先问小组
* 每个界面都要有返回按钮
* 当前用户：LoggedIn.getUserId()

*数据规则*
* 用逗号分隔，输入时禁止逗号
* ID 永远放第一列
* 日期 yyyy-mm-dd，金额 80.00
* 空值写 -
* 详细格式：docs/DATA_FORMATS.md

*已完成的类（共用）*
* login/Login
* login/LoggedIn
* model/User
* model/Staff
* model/Manager, Administrator, Instructor, Student, FacilitiesOfficer, AttendanceOfficer
* model/UserFile
* 每个角色的主页
* 所有 txt 文件已有示例数据

*管理员（OOP：继承）– 已完成*
* admin/AdminDashboard
* admin/ManageStaff
* admin/ManageStudents
* admin/PaymentRecords

*经理（OOP：多态）– 待做*
* manager/ManageAdministrators
* manager/StaffReport
* manager/RevenueReport
* model/RevenueCalculator

*教练（OOP：抽象）– 待做*
* instructor/ManageClassSchedule
* instructor/IssueFacilityProblem
* instructor/ViewInstructorRating
* model/ClassSession（空的，需填写）
* model/FacilityIssue（空的，需填写）
* model/Record（抽象类）

*学生（OOP：封装）– 待做*
* student/BookClasses
* student/ManagePayment
* student/InstructorRating
* model/Booking, Payment, Rating（空的，需填写）
* 不要改 payments.txt 格式，管理员会读取

*设施管理员（OOP：接口）– 待做*
* facilitiesofficer/EquipmentInventory
* facilitiesofficer/FacilityProblemManagement
* facilitiesofficer/StockReport
* model/Equipment（空的，需填写）
* model/Searchable（接口）

*考勤管理员（OOP：组合）– 待做*
* attendanceofficer/ManageAttendance
* attendanceofficer/AttendanceRecords
* attendanceofficer/AttendanceReport
* model/Attendance（空的，需填写）

*截止日期：2026/12/06，晚上 11:59（星期日）*
