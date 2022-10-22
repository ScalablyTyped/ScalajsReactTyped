package typingsJapgolly.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceAggregateItem extends StObject {
  
  var aggregate: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
}
object DataSourceAggregateItem {
  
  inline def apply(): DataSourceAggregateItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceAggregateItem]
  }
  
  extension [Self <: DataSourceAggregateItem](x: Self) {
    
    inline def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
