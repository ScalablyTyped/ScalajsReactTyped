package typingsJapgolly.griddleReact.mod.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowProps extends StObject {
  
  var Cell: js.UndefOr[Any] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var columnIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var griddleKey: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object RowProps {
  
  inline def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  extension [Self <: RowProps](x: Self) {
    
    inline def setCell(value: Any): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnIds(value: js.Array[Double]): Self = StObject.set(x, "columnIds", value.asInstanceOf[js.Any])
    
    inline def setColumnIdsUndefined: Self = StObject.set(x, "columnIds", js.undefined)
    
    inline def setColumnIdsVarargs(value: Double*): Self = StObject.set(x, "columnIds", js.Array(value*))
    
    inline def setGriddleKey(value: String): Self = StObject.set(x, "griddleKey", value.asInstanceOf[js.Any])
    
    inline def setGriddleKeyUndefined: Self = StObject.set(x, "griddleKey", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
