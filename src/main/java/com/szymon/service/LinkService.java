package com.szymon.service;

import com.szymon.model.Link;
import com.szymon.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Service
public class LinkService {

    @Autowired
    private LinkRepository linkRepository;

    public List<Link> fetchLinks(Principal principal) {
//        List<Link> list = new ArrayList<>();
//        list.add(new Link("About", "/home"));
//        list.add(new Link("Service", "/home"));
//        list.add(new Link("Contact", "/home"));
//        return list;

        List<Link> links = new ArrayList<>();
        Iterable<Link> iterable = linkRepository.findAll();
        iterable.forEach(links::add);
        return links;
    }

}
