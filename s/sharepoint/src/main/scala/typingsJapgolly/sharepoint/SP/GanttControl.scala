package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.JsGrid.ColumnInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttControl extends StObject {
  
  def get_Columns(): js.Array[ColumnInfo]
}
object GanttControl {
  
  inline def apply(get_Columns: CallbackTo[js.Array[ColumnInfo]]): GanttControl = {
    val __obj = js.Dynamic.literal(get_Columns = get_Columns.toJsFn)
    __obj.asInstanceOf[GanttControl]
  }
  
  extension [Self <: GanttControl](x: Self) {
    
    inline def setGet_Columns(value: CallbackTo[js.Array[ColumnInfo]]): Self = StObject.set(x, "get_Columns", value.toJsFn)
  }
}
