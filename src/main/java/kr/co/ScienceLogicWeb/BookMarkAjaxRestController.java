package kr.co.ScienceLogicWeb;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
public class BookMarkAjaxRestController {
    private List<BookMark> bookmarks = new ArrayList<>();

    @RequestMapping(method = RequestMethod.POST, path = "/bookmark")
    public String registerBookmark(@RequestBody BookMark bookmark){
        bookmarks.add(bookmark);
        return "registered";

    }
    @RequestMapping(method = RequestMethod.GET, path="/bookmarks")
    public List<BookMark> getBookmarks(){
        return bookmarks;
    }
}
