package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRangeValues
  extends StObject
     with Object {
  
  /**
    * The range id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#rangeValues)
    */
  var name: String
  
  /**
    * Single value or value range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#rangeValues)
    */
  var values: Double | js.Array[Double]
}
object QueryRangeValues {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: Double | js.Array[Double]
  ): QueryRangeValues = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRangeValues]
  }
  
  extension [Self <: QueryRangeValues](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Double | js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
