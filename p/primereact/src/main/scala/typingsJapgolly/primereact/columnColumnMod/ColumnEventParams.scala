package typingsJapgolly.primereact.columnColumnMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnEventParams extends StObject {
  
  var columnProps: ColumnProps
  
  var originalEvent: ReactEventFrom[Element]
}
object ColumnEventParams {
  
  inline def apply(columnProps: ColumnProps, originalEvent: ReactEventFrom[Element]): ColumnEventParams = {
    val __obj = js.Dynamic.literal(columnProps = columnProps.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEventParams]
  }
  
  extension [Self <: ColumnEventParams](x: Self) {
    
    inline def setColumnProps(value: ColumnProps): Self = StObject.set(x, "columnProps", value.asInstanceOf[js.Any])
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
