package vn.edu.fpt.P00023.bo
  1. Validate.java
      - Các method validate dữ liệu nhập vào từ bàn phím
      - Mothod "Press Yes/No to continue or exit"
  2. BusinessObject.java
      - Menu và các chức năng trong bài Lab 
      - Add Fruit theo thứ tự fruitID tăng dần từ 1 và validate nếu đã có trong database thì sẽ edit lại thông tin của Fruit 
      - Add new Order theo thứ tự orderID tăng dần từ 1
        + Trong 1 order có Customer Name và list order 
        + validate quantity 0 < n <= Fruit's Quantity trong 
        
package vn.edu.fpt.P00023.entity 
  1. Fruit.java 
      - Tạo Object Fruit bao gồm contructor và các method getter, setter, toString 
      - Mothod getExistID dùng để validate fruitID đã có trong database hay chưa 
  2. Order.java 
      - Tạo Object Order bao gồm contructor và các method getter, setter

package vn.edu.fpt.P00023.gui
  1. Main.java 
      - ONLY public static void main(String[] args){ }
