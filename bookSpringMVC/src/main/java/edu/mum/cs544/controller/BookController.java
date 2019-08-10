package edu.mum.cs544.controller;

//import edu.mum.cs544.model.Book;
//import edu.mum.cs544.service.BookService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.annotation.Resource;
//
//@Controller
//public class BookController {
//    @Resource
//    BookService bookService;
//
//    @GetMapping("/")
//    public String redirectRoot(){
//        return "redirect:/book";
//    }
//
//    @GetMapping("/book")
//    public String getALL(Model model){
//        model.addAttribute("book", bookService.getAll());
//        return "bookList";
//    }
//
//    @PostMapping("/book")
//    public String add(Book book){
//        bookService.add(book);
//        return "redirect:/book";
//    }
//
//    @GetMapping("/book/{id}")
//    public String viewAdd(@ModelAttribute Book book, Model model){
//        model.addAttribute("msg", "Add");
//        return "bookDetail";
//    }
//
//    @GetMapping("/book/{id}")
//    public String get(@PathVariable int id, Model model){
//        model.addAttribute("book", bookService.get(id));
//        model.addAttribute("msg","Update");
//        return "bookDetail";
//    }
//
//    @PostMapping("/book/{id}")
//    public String update(Book book, @PathVariable int id) {
//        bookService.update(book); // car.id already set by binding
//        return "redirect:/book";
//    }
//
//    @PostMapping(value="/book/delete")
//    public String delete(int bookId) {
//        bookService.delete(bookId);
//        return "redirect:/book";
//    }
//}
