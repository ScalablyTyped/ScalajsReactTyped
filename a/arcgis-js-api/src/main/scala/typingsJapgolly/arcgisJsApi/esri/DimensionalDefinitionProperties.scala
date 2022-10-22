package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionalDefinitionProperties extends StObject {
  
  /**
    * The dimension associated with the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
    */
  var dimensionName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the values indicate slices (rather than ranges).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
    */
  var isSlice: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
    */
  var values: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  
  /**
    * The required variable name by which to filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.undefined
}
object DimensionalDefinitionProperties {
  
  inline def apply(): DimensionalDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionalDefinitionProperties]
  }
  
  extension [Self <: DimensionalDefinitionProperties](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setIsSlice(value: Boolean): Self = StObject.set(x, "isSlice", value.asInstanceOf[js.Any])
    
    inline def setIsSliceUndefined: Self = StObject.set(x, "isSlice", js.undefined)
    
    inline def setValues(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
