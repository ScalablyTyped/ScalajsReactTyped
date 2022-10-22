package typingsJapgolly.muiDatatables.anon

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColIndex extends StObject {
  
  var colIndex: Double
  
  var dataIndex: Double
  
  var event: ReactMouseEventFrom[Element]
  
  var rowIndex: Double
}
object ColIndex {
  
  inline def apply(colIndex: Double, dataIndex: Double, event: ReactMouseEventFrom[Element], rowIndex: Double): ColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColIndex]
  }
  
  extension [Self <: ColIndex](x: Self) {
    
    inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ReactMouseEventFrom[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}
