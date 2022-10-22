package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The React Native implementation of the IOS RCTEventEmitter which is required when creating
  * a module that communicates with IOS
  */
trait NativeModule extends StObject {
  
  /**
    * Add the provided eventType as an active listener
    * @param eventType name of the event for which we are registering listener
    */
  def addListener(eventType: String): Unit
  
  /**
    * Remove a specified number of events.  There are no eventTypes in this case, as
    * the native side doesn't remove the name, but only manages a counter of total
    * listeners
    * @param count number of listeners to remove (of any type)
    */
  def removeListeners(count: Double): Unit
}
object NativeModule {
  
  inline def apply(addListener: String => Callback, removeListeners: Double => Callback): NativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: String) => addListener(t0).runNow()), removeListeners = js.Any.fromFunction1((t0: Double) => removeListeners(t0).runNow()))
    __obj.asInstanceOf[NativeModule]
  }
  
  extension [Self <: NativeModule](x: Self) {
    
    inline def setAddListener(value: String => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveListeners(value: Double => Callback): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
