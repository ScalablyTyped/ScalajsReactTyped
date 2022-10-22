package typingsJapgolly.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.anon.ContactData
import typingsJapgolly.awsLambda.awsLambdaStrings.ContactFlowEvent
import typingsJapgolly.awsLambda.awsLambdaStrings.TELEPHONE_NUMBER
import typingsJapgolly.awsLambda.handlerMod.Callback
import typingsJapgolly.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerConnectContactFlowMod {
  
  type ConnectContactFlowCallback = Callback[ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.VOICE
    - typingsJapgolly.awsLambda.awsLambdaStrings.CHAT
  */
  trait ConnectContactFlowChannel extends StObject
  object ConnectContactFlowChannel {
    
    inline def CHAT: typingsJapgolly.awsLambda.awsLambdaStrings.CHAT = "CHAT".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CHAT]
    
    inline def VOICE: typingsJapgolly.awsLambda.awsLambdaStrings.VOICE = "VOICE".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.VOICE]
  }
  
  trait ConnectContactFlowEndpoint extends StObject {
    
    var Address: String
    
    var Type: TELEPHONE_NUMBER
  }
  object ConnectContactFlowEndpoint {
    
    inline def apply(Address: String): ConnectContactFlowEndpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Type = "TELEPHONE_NUMBER")
      __obj.asInstanceOf[ConnectContactFlowEndpoint]
    }
    
    extension [Self <: ConnectContactFlowEndpoint](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setType(value: TELEPHONE_NUMBER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectContactFlowEvent extends StObject {
    
    var Details: ContactData
    
    var Name: ContactFlowEvent
  }
  object ConnectContactFlowEvent {
    
    inline def apply(Details: ContactData): ConnectContactFlowEvent = {
      val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Name = "ContactFlowEvent")
      __obj.asInstanceOf[ConnectContactFlowEvent]
    }
    
    extension [Self <: ConnectContactFlowEvent](x: Self) {
      
      inline def setDetails(value: ContactData): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      inline def setName(value: ContactFlowEvent): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectContactFlowHandler = Handler[ConnectContactFlowEvent, ConnectContactFlowResult]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsLambda.awsLambdaStrings.INBOUND
    - typingsJapgolly.awsLambda.awsLambdaStrings.OUTBOUND
    - typingsJapgolly.awsLambda.awsLambdaStrings.TRANSFER
    - typingsJapgolly.awsLambda.awsLambdaStrings.CALLBACK
    - typingsJapgolly.awsLambda.awsLambdaStrings.API
  */
  trait ConnectContactFlowInitiationMethod extends StObject
  object ConnectContactFlowInitiationMethod {
    
    inline def API: typingsJapgolly.awsLambda.awsLambdaStrings.API = "API".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.API]
    
    inline def CALLBACK: typingsJapgolly.awsLambda.awsLambdaStrings.CALLBACK = "CALLBACK".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.CALLBACK]
    
    inline def INBOUND: typingsJapgolly.awsLambda.awsLambdaStrings.INBOUND = "INBOUND".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.INBOUND]
    
    inline def OUTBOUND: typingsJapgolly.awsLambda.awsLambdaStrings.OUTBOUND = "OUTBOUND".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.OUTBOUND]
    
    inline def TRANSFER: typingsJapgolly.awsLambda.awsLambdaStrings.TRANSFER = "TRANSFER".asInstanceOf[typingsJapgolly.awsLambda.awsLambdaStrings.TRANSFER]
  }
  
  trait ConnectContactFlowQueue extends StObject {
    
    var ARN: String
    
    var Name: String
  }
  object ConnectContactFlowQueue {
    
    inline def apply(ARN: String, Name: String): ConnectContactFlowQueue = {
      val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectContactFlowQueue]
    }
    
    extension [Self <: ConnectContactFlowQueue](x: Self) {
      
      inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectContactFlowResult = StringDictionary[String | Null]
  
  type CustomerAudio = Null | StartedCustomerAudio | (StartedCustomerAudio & StoppedCustomerAudio)
  
  trait StartedCustomerAudio extends StObject {
    
    var StartFragmentNumber: String
    
    var StartTimestamp: String
    
    var StreamARN: String
  }
  object StartedCustomerAudio {
    
    inline def apply(StartFragmentNumber: String, StartTimestamp: String, StreamARN: String): StartedCustomerAudio = {
      val __obj = js.Dynamic.literal(StartFragmentNumber = StartFragmentNumber.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartedCustomerAudio]
    }
    
    extension [Self <: StartedCustomerAudio](x: Self) {
      
      inline def setStartFragmentNumber(value: String): Self = StObject.set(x, "StartFragmentNumber", value.asInstanceOf[js.Any])
      
      inline def setStartTimestamp(value: String): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoppedCustomerAudio extends StObject {
    
    var StopFragmentNumber: String
    
    var StopTimestamp: String
  }
  object StoppedCustomerAudio {
    
    inline def apply(StopFragmentNumber: String, StopTimestamp: String): StoppedCustomerAudio = {
      val __obj = js.Dynamic.literal(StopFragmentNumber = StopFragmentNumber.asInstanceOf[js.Any], StopTimestamp = StopTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoppedCustomerAudio]
    }
    
    extension [Self <: StoppedCustomerAudio](x: Self) {
      
      inline def setStopFragmentNumber(value: String): Self = StObject.set(x, "StopFragmentNumber", value.asInstanceOf[js.Any])
      
      inline def setStopTimestamp(value: String): Self = StObject.set(x, "StopTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
