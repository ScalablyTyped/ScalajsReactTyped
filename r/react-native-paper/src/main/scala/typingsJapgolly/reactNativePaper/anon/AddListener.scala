package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.EmitterSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddListener extends StObject {
  
  def addListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): EmitterSubscription
  
  def removeEventListener(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit
}
object AddListener {
  
  inline def apply(addListener: Any => EmitterSubscription, removeEventListener: Any => Callback): AddListener = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeEventListener = js.Any.fromFunction1((t0: Any) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[AddListener]
  }
  
  extension [Self <: AddListener](x: Self) {
    
    inline def setAddListener(value: Any => EmitterSubscription): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: Any => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
