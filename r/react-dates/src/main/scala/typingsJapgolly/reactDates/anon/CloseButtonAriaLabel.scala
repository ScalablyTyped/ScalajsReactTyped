package typingsJapgolly.reactDates.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButtonAriaLabel extends StObject {
  
  var closeButtonAriaLabel: String
  
  var keyboardShortcuts: js.Array[Recordunicodelabelactions]
  
  var onCloseButtonClick: MouseEventHandler[Element]
  
  var onKeyDown: KeyboardEventHandler[Element]
  
  var title: String
}
object CloseButtonAriaLabel {
  
  inline def apply(
    closeButtonAriaLabel: String,
    keyboardShortcuts: js.Array[Recordunicodelabelactions],
    onCloseButtonClick: ReactMouseEventFrom[Element & Element] => Callback,
    onKeyDown: ReactKeyboardEventFrom[Element & Element] => Callback,
    title: String
  ): CloseButtonAriaLabel = {
    val __obj = js.Dynamic.literal(closeButtonAriaLabel = closeButtonAriaLabel.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], onCloseButtonClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onCloseButtonClick(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyDown(t0).runNow()), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseButtonAriaLabel]
  }
  
  extension [Self <: CloseButtonAriaLabel](x: Self) {
    
    inline def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcuts(value: js.Array[Recordunicodelabelactions]): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShortcutsVarargs(value: Recordunicodelabelactions*): Self = StObject.set(x, "keyboardShortcuts", js.Array(value*))
    
    inline def setOnCloseButtonClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
