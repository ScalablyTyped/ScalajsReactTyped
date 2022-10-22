package typingsJapgolly.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalDataSourceSchema
  extends StObject
     with DataSourceSchemaWithOptionsModel {
  
  @JSName("model")
  var model_HierarchicalDataSourceSchema: js.UndefOr[HierarchicalDataSourceSchemaModel] = js.undefined
}
object HierarchicalDataSourceSchema {
  
  inline def apply(): HierarchicalDataSourceSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalDataSourceSchema]
  }
  
  extension [Self <: HierarchicalDataSourceSchema](x: Self) {
    
    inline def setModel(value: HierarchicalDataSourceSchemaModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
