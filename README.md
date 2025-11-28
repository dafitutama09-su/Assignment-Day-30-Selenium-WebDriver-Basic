# Assignment Day 30 – Introduction to Selenium WebDriver & Basic Operations

Repository ini berisi project automation Selenium yang saya kerjakan menggunakan IntelliJ IDEA dan Java.  
Selain source code, repository ini juga memuat jawaban reflection sesuai instruksi tugas.

---

## 📌 Project Overview

- **Tools:** IntelliJ IDEA, Java, Selenium WebDriver  
- **Tujuan:** Membangun automation dasarnya Selenium untuk mempraktikkan locator, basic interactions, dan arsitektur WebDriver seperti pada materi PPT.  
- **Isi project:**  
  - Struktur Selenium  
  - Locator (ID, Name, XPath, CSS)  
  - Basic operations (click, sendKeys, getText)  
  - Simple selenium flow

---

## ✨ Reflection Answers

### **1. Keputusan teknis paling berpengaruh**
Bagi saya, keputusan teknis yang paling penting adalah memilih **locator yang stabil**.  
Dari materi PPT tentang *Locator* dan *Best Practice Locator*, saya belajar bahwa penggunaan `id`, `name`, atau relative XPath membuat Selenium lebih konsisten menemukan elemen melalui DOM.

Locator yang buruk membuat automation checkout mudah gagal atau flakey.  
Karena semua aksi Selenium bergantung pada menemukan elemen yang benar di DOM, keputusan ini sangat menentukan keberhasilan keseluruhan script.

---

### **2. Pemahaman baru tentang bagaimana Selenium menirukan tindakan user**
Dari tugas ini dan materi kemarin, saya memahami bahwa Selenium bekerja dengan **menirukan user sungguhan**:
- klik,
- input text,
- mengambil tulisan,
- dan interaksi dasar lainnya melalui WebDriver.

Selenium selalu berinteraksi melalui DOM sehingga membutuhkan **locator yang tepat** dan **sinkronisasi (wait)** agar elemen siap diakses.  
Pemahaman ini membuat saya lebih siap menghadapi halaman dinamis, alur panjang seperti checkout, serta skenario kompleks di aplikasi nyata.

---
