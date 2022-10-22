package typingsJapgolly.primereact.columnColumnMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterClearTemplateOptions extends StObject {
  
  var field: String
  
  def filterClearCallback(): Unit
  
  var filterModel: ColumnFilterModelOptions
}
object ColumnFilterClearTemplateOptions {
  
  inline def apply(field: String, filterClearCallback: Callback, filterModel: ColumnFilterModelOptions): ColumnFilterClearTemplateOptions = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], filterClearCallback = filterClearCallback.toJsFn, filterModel = filterModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterClearTemplateOptions]
  }
  
  extension [Self <: ColumnFilterClearTemplateOptions](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFilterClearCallback(value: Callback): Self = StObject.set(x, "filterClearCallback", value.toJsFn)
    
    inline def setFilterModel(value: ColumnFilterModelOptions): Self = StObject.set(x, "filterModel", value.asInstanceOf[js.Any])
  }
}
