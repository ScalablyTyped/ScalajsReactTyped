package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddButtonProps extends StObject {
  
  var className: String
  
  var disabled: Boolean
  
  def onClick(e: ReactMouseEventFrom[HTMLButtonElement]): Unit
}
object AddButtonProps {
  
  inline def apply(className: String, disabled: Boolean, onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback): AddButtonProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => onClick(t0).runNow()))
    __obj.asInstanceOf[AddButtonProps]
  }
  
  extension [Self <: AddButtonProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
  }
}
