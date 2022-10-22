package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedFilters extends StObject {
  
  /**
    * A list of filters. Each filter acts on a property. Filters must contain at least one Filters value. For example, a NestedFilters call might include a filter on the PropertyName parameter of the InputDataConfig property: InputDataConfig.DataSource.S3DataSource.S3Uri.
    */
  var Filters: FilterList
  
  /**
    * The name of the property to use in the nested filters. The value must match a listed property name, such as InputDataConfig.
    */
  var NestedPropertyName: ResourcePropertyName
}
object NestedFilters {
  
  inline def apply(Filters: FilterList, NestedPropertyName: ResourcePropertyName): NestedFilters = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], NestedPropertyName = NestedPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedFilters]
  }
  
  extension [Self <: NestedFilters](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setNestedPropertyName(value: ResourcePropertyName): Self = StObject.set(x, "NestedPropertyName", value.asInstanceOf[js.Any])
  }
}
