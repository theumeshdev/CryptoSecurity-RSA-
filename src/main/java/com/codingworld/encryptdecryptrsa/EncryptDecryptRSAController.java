
package com.codingworld.encryptdecryptrsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptDecryptRSAController {

  @Autowired

  EncryptDecryptService encryptDecryptService;

  @GetMapping("/createKeys")
  public void createPrivatePublickey() {
    encryptDecryptService.createKeys();
  }

  @PostMapping("/encrpyt")
  public String encryptMessage(@RequestBody EncryptionRequest encryptionRequest) {
    return encryptDecryptService.encryptMessage(encryptionRequest.getData());
  }


  @PostMapping("/decrpyt")
  public String decryptMessage(@RequestBody DencryptionRequest dencryptionRequest) {
    return encryptDecryptService.decryptMessage(dencryptionRequest.getData());
  }
}
