package typingsJapgolly.expoLocation.buildLocationDottypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationSubscription extends StObject {
  
  /**
    * Call this function with no arguments to remove this subscription. The callback will no longer
    * be called for location updates.
    */
  def remove(): Unit
}
object LocationSubscription {
  
  inline def apply(remove: Callback): LocationSubscription = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn)
    __obj.asInstanceOf[LocationSubscription]
  }
  
  extension [Self <: LocationSubscription](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
