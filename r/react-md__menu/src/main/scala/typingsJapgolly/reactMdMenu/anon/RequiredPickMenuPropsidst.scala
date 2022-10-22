package typingsJapgolly.reactMdMenu.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<@react-md/menu.@react-md/menu/types/types.MenuProps, 'id' | 'style' | 'visible' | 'onClick' | 'onKeyDown'>> */
trait RequiredPickMenuPropsidst extends StObject {
  
  var id: String
  
  var onClick: MouseEventHandler[HTMLDivElement]
  
  var onKeyDown: KeyboardEventHandler[HTMLDivElement]
  
  var style: CSSProperties
  
  var visible: Boolean
}
object RequiredPickMenuPropsidst {
  
  inline def apply(
    id: String,
    onClick: ReactMouseEventFrom[HTMLDivElement & Element] => Callback,
    onKeyDown: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback,
    style: CSSProperties,
    visible: Boolean
  ): RequiredPickMenuPropsidst = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => onClick(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => onKeyDown(t0).runNow()), style = style.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMenuPropsidst]
  }
  
  extension [Self <: RequiredPickMenuPropsidst](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
