package typingsJapgolly.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broker extends StObject {
  
  var broker: String
  
  var clientId: String
  
  var queueSize: Double
}
object Broker {
  
  inline def apply(broker: String, clientId: String, queueSize: Double): Broker = {
    val __obj = js.Dynamic.literal(broker = broker.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], queueSize = queueSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broker]
  }
  
  extension [Self <: Broker](x: Self) {
    
    inline def setBroker(value: String): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
  }
}
