package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.EmitterSubscription
import typingsJapgolly.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  def addEventListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): NativeEventSubscription | EmitterSubscription
  
  def removeEventListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit
}
object AddEventListener {
  
  inline def apply(
    addEventListener: Any => NativeEventSubscription | EmitterSubscription,
    removeEventListener: Any => Callback
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction1(addEventListener), removeEventListener = js.Any.fromFunction1((t0: Any) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[AddEventListener]
  }
  
  extension [Self <: AddEventListener](x: Self) {
    
    inline def setAddEventListener(value: Any => NativeEventSubscription | EmitterSubscription): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: Any => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
