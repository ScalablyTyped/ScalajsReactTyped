package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFilter extends StObject {
  
  /**
    * The result attribute to which the filter values are applied. Valid values vary by API action.
    */
  var Attribute: js.UndefOr[SearchFilterAttribute] = js.undefined
  
  /**
    * The operator to apply to the Attribute with each of the Values. Valid values vary by Attribute.
    */
  var Operator: js.UndefOr[SearchFilterOperator] = js.undefined
  
  /**
    * The list of values applied to the Attribute and Operator attributes. Number of values and valid values vary by Attribute.
    */
  var Values: js.UndefOr[SearchFilterValues] = js.undefined
}
object SearchFilter {
  
  inline def apply(): SearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFilter]
  }
  
  extension [Self <: SearchFilter](x: Self) {
    
    inline def setAttribute(value: SearchFilterAttribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setOperator(value: SearchFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setValues(value: SearchFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: SearchFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
