package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleDataTable extends StObject {
  
  def get_rows(): js.Array[Any]
}
object SimpleDataTable {
  
  inline def apply(get_rows: CallbackTo[js.Array[Any]]): SimpleDataTable = {
    val __obj = js.Dynamic.literal(get_rows = get_rows.toJsFn)
    __obj.asInstanceOf[SimpleDataTable]
  }
  
  extension [Self <: SimpleDataTable](x: Self) {
    
    inline def setGet_rows(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "get_rows", value.toJsFn)
  }
}
