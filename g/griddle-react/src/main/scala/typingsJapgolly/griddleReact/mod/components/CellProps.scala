package typingsJapgolly.griddleReact.mod.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var columnId: js.UndefOr[String] = js.undefined
  
  var griddleKey: js.UndefOr[Double] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object CellProps {
  
  inline def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  
  extension [Self <: CellProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    inline def setGriddleKey(value: Double): Self = StObject.set(x, "griddleKey", value.asInstanceOf[js.Any])
    
    inline def setGriddleKeyUndefined: Self = StObject.set(x, "griddleKey", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
