//package com.anilgubbala.web.controller;
//
//import com.anilgubbala.services.BeerService;
//import com.anilgubbala.web.model.BeerDto;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.UUID;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.BDDMockito.then;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(BeerControllerTest.class)
//class BeerControllerTest {
//
//    @MockBean
//    BeerService beerService;
//
//    @Autowired
//    MockMvc  mockMvc;
//
//    @Autowired
//    ObjectMapper objectMapper;
//
//    BeerDto validBeer = new BeerDto().builder()
//            .beerName("Beer1")
//            .beerStyle("PALE_ALE")
//            .upc(1234567890L)
//            .build();;
//
////    @Before
////    public void setUp() {
////        validBeer = new BeerDto().builder()
////                .beerName("Beer1")
////                .beerStyle("PALE_ALE")
////                .upc(1234567890L)
////                .build();
////    }
//
//    @Test
//    public void handleUpdate() throws Exception {
//        BeerDto beerDto = validBeer;
//        beerDto.setId(null);
//        String beerDtoJson = objectMapper.writeValueAsString(beerDto);
//
//        mockMvc.perform(put("/api/v1/beer/" + UUID.randomUUID())
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(beerDtoJson))
//                .andExpect(status().isNoContent());
//
//        then(beerService).should().updateBeer(any(), any());
//
//
//    }
//
//
//
//
//}