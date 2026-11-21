package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id) {
        return new Address("115 New Cavendish Street", "London", "W1W 6UW");
    }
}