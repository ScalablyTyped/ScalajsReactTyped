package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventSubscription extends StObject {
  
  /**
    * Call this method to un-subscribe from a native-event
    */
  def remove(): Unit
}
object NativeEventSubscription {
  
  inline def apply(remove: Callback): NativeEventSubscription = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn)
    __obj.asInstanceOf[NativeEventSubscription]
  }
  
  extension [Self <: NativeEventSubscription](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
