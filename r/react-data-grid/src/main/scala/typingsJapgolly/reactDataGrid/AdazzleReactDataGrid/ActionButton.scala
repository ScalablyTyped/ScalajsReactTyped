package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionButton extends StObject {
  
  def callback(): Unit
  
  var icon: String
}
object ActionButton {
  
  inline def apply(callback: Callback, icon: String): ActionButton = {
    val __obj = js.Dynamic.literal(callback = callback.toJsFn, icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButton]
  }
  
  extension [Self <: ActionButton](x: Self) {
    
    inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
