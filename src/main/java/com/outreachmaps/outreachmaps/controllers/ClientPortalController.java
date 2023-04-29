package com.outreachmaps.outreachmaps.controllers;

import com.outreachmaps.outreachmaps.data.ClientRepository;
import com.outreachmaps.outreachmaps.models.Client;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("client-portal")
public class ClientPortalController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("search")
    public String displayClientSearchForm(Model model){
        model.addAttribute(new Client());
        return "client-portal/search";
    }

    @PostMapping("search")
    public String processClientSearchForm(@ModelAttribute @Valid Client newClient,
                                          Errors errors, Model model){
        clientRepository.save(newClient);
        return "redirect:";
    }

}
