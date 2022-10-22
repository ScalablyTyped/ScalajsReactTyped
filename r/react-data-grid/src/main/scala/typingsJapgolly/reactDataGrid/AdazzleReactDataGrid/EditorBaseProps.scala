package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorBaseProps extends StObject {
  
  var column: ExcelColumn
  
  var height: Double
  
  def onBlur(): Unit
  
  def onCommit(): Unit
  
  def onCommitCancel(): Unit
  
  var rowData: Any
  
  var rowMetaData: Any
  
  var value: Any
}
object EditorBaseProps {
  
  inline def apply(
    column: ExcelColumn,
    height: Double,
    onBlur: Callback,
    onCommit: Callback,
    onCommitCancel: Callback,
    rowData: Any,
    rowMetaData: Any,
    value: Any
  ): EditorBaseProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onCommit = onCommit.toJsFn, onCommitCancel = onCommitCancel.toJsFn, rowData = rowData.asInstanceOf[js.Any], rowMetaData = rowMetaData.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorBaseProps]
  }
  
  extension [Self <: EditorBaseProps](x: Self) {
    
    inline def setColumn(value: ExcelColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnCommit(value: Callback): Self = StObject.set(x, "onCommit", value.toJsFn)
    
    inline def setOnCommitCancel(value: Callback): Self = StObject.set(x, "onCommitCancel", value.toJsFn)
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowMetaData(value: Any): Self = StObject.set(x, "rowMetaData", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
