package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  /**
    * The channel used for grouping and filters.
    */
  var Channel: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.Channel] = js.undefined
  
  /**
    * Information about the queue for which metrics are returned.
    */
  var Queue: js.UndefOr[QueueReference] = js.undefined
}
object Dimensions {
  
  inline def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
    
    inline def setQueue(value: QueueReference): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
