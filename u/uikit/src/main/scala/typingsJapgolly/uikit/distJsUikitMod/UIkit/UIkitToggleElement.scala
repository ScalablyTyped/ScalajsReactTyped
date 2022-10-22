package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitToggleElement extends StObject {
  
  def toggle(): Unit
}
object UIkitToggleElement {
  
  inline def apply(toggle: Callback): UIkitToggleElement = {
    val __obj = js.Dynamic.literal(toggle = toggle.toJsFn)
    __obj.asInstanceOf[UIkitToggleElement]
  }
  
  extension [Self <: UIkitToggleElement](x: Self) {
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
