package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitNotificationElement extends StObject {
  
  def close(immediate: Boolean): Unit
}
object UIkitNotificationElement {
  
  inline def apply(close: Boolean => Callback): UIkitNotificationElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: Boolean) => close(t0).runNow()))
    __obj.asInstanceOf[UIkitNotificationElement]
  }
  
  extension [Self <: UIkitNotificationElement](x: Self) {
    
    inline def setClose(value: Boolean => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
