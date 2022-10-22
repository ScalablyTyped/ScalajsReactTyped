package typingsJapgolly.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to use when enqueuing messages. Attributes can be set before each queue.enqOne() or queue.enqMany().
  */
trait EnqueueOptions extends StObject {
  
  /** Celivery mode when enqueuing messages. It can be any one of the AQ_MSG_DELIV constants. */
  var deliveryMode: Double
  
  /** Transformation that will take place on messages when they are enqueued. */
  var transformation: String
  
  /** Defines whether the enqueue occurs in the current transaction or as a separate transaction. It can be any one of the AQ_VISIBILITY constants. */
  var visibility: Double
}
object EnqueueOptions {
  
  inline def apply(deliveryMode: Double, transformation: String, visibility: Double): EnqueueOptions = {
    val __obj = js.Dynamic.literal(deliveryMode = deliveryMode.asInstanceOf[js.Any], transformation = transformation.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnqueueOptions]
  }
  
  extension [Self <: EnqueueOptions](x: Self) {
    
    inline def setDeliveryMode(value: Double): Self = StObject.set(x, "deliveryMode", value.asInstanceOf[js.Any])
    
    inline def setTransformation(value: String): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: Double): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
