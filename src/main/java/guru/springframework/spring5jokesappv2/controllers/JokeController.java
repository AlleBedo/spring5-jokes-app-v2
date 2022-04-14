package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Insert a description here.
 *
 * Bugs: none known
 *
 * @author  abedini abedini@doxee.com
 * @createDate  14/04/2022
 *
 * Copyright (C) 2022 Doxee S.p.A. C.F. - P.IVA: IT02714390362. All Rights Reserved
 */
@Controller
public class JokeController {

  private final JokeService jokeService;

  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke(Model model){

    model.addAttribute("joke", jokeService.getJoke());

    return "index";
  }
}
