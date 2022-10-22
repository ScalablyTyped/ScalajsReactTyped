package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitAlertElement extends StObject {
  
  def close(): Unit
}
object UIkitAlertElement {
  
  inline def apply(close: Callback): UIkitAlertElement = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[UIkitAlertElement]
  }
  
  extension [Self <: UIkitAlertElement](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
