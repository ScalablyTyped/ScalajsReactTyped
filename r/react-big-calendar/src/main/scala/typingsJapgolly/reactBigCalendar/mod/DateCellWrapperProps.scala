package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateCellWrapperProps extends StObject {
  
  var children: Element
  
  var range: js.Array[js.Date]
  
  var value: js.Date
}
object DateCellWrapperProps {
  
  inline def apply(children: VdomElement, range: js.Array[js.Date], value: js.Date): DateCellWrapperProps = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateCellWrapperProps]
  }
  
  extension [Self <: DateCellWrapperProps](x: Self) {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRange(value: js.Array[js.Date]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeVarargs(value: js.Date*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
