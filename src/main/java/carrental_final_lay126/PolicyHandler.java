package carrental_final_lay126;

import carrental_final_lay126.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCarRented_StarInsert(@Payload CarRented carRented){

        if(carRented.isMe()){
            System.out.println("##### listener StarInsert : " + carRented.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCarRentalCanceled_StarInsert(@Payload CarRentalCanceled carRentalCanceled){

        if(carRentalCanceled.isMe()){
            System.out.println("##### listener StarInsert : " + carRentalCanceled.toJson());
        }
    }

}
