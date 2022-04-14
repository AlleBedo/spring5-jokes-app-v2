package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

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
@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
