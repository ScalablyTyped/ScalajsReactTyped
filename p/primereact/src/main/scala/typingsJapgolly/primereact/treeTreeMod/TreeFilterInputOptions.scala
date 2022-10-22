package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeFilterInputOptions extends StObject {
  
  var className: String
  
  def onChange(event: ReactKeyboardEventFrom[HTMLInputElement]): Unit
  
  def onKeyDown(event: ReactKeyboardEventFrom[HTMLInputElement]): Unit
}
object TreeFilterInputOptions {
  
  inline def apply(
    className: String,
    onChange: ReactKeyboardEventFrom[HTMLInputElement] => Callback,
    onKeyDown: ReactKeyboardEventFrom[HTMLInputElement] => Callback
  ): TreeFilterInputOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement]) => onChange(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement]) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[TreeFilterInputOptions]
  }
  
  extension [Self <: TreeFilterInputOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: ReactKeyboardEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement]) => value(t0).runNow()))
  }
}
