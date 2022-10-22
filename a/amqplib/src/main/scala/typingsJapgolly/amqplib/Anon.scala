package typingsJapgolly.amqplib

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.amqplib.amqplibStrings.timestamp
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mechanism extends StObject {
    
    var mechanism: String
    
    var password: String
    
    def response(): Buffer
    
    var username: String
  }
  object Mechanism {
    
    inline def apply(mechanism: String, password: String, response: CallbackTo[Buffer], username: String): Mechanism = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], response = response.toJsFn, username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    extension [Self <: Mechanism](x: Self) {
      
      inline def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: CallbackTo[Buffer]): Self = StObject.set(x, "response", value.toJsFn)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var mechanism: String
    
    def response(): Buffer
  }
  object Response {
    
    inline def apply(mechanism: String, response: CallbackTo[Buffer]): Response = {
      val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = response.toJsFn)
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setMechanism(value: String): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: CallbackTo[Buffer]): Self = StObject.set(x, "response", value.toJsFn)
    }
  }
  
  trait ServerProperties extends StObject {
    
    var serverProperties: typingsJapgolly.amqplib.propertiesMod.ServerProperties
  }
  object ServerProperties {
    
    inline def apply(serverProperties: typingsJapgolly.amqplib.propertiesMod.ServerProperties): ServerProperties = {
      val __obj = js.Dynamic.literal(serverProperties = serverProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerProperties]
    }
    
    extension [Self <: ServerProperties](x: Self) {
      
      inline def setServerProperties(value: typingsJapgolly.amqplib.propertiesMod.ServerProperties): Self = StObject.set(x, "serverProperties", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("!")
    var Exclamationmark: timestamp
    
    var value: Double
  }
  object _empty {
    
    inline def apply(value: Double): _empty = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("!")("timestamp")
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def setExclamationmark(value: timestamp): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
