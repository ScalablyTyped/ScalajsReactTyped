package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`centroid-aggregate`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`convex-hull-aggregate`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`envelope-aggregate`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`percentile-continuous`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`percentile-discrete`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`var`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.avg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.count
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.stddev
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatisticDefinitionProperties extends StObject {
  
  /**
    * Defines the field for which statistics will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the output field name for the requested statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters for [percentile statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticType).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticParameters)
    */
  var statisticParameters: js.UndefOr[StatisticDefinitionStatisticParameters] = js.undefined
  
  /**
    * Defines the type of statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: js.UndefOr[
    count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete` | `envelope-aggregate` | `centroid-aggregate` | `convex-hull-aggregate`
  ] = js.undefined
}
object StatisticDefinitionProperties {
  
  inline def apply(): StatisticDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticDefinitionProperties]
  }
  
  extension [Self <: StatisticDefinitionProperties](x: Self) {
    
    inline def setOnStatisticField(value: String): Self = StObject.set(x, "onStatisticField", value.asInstanceOf[js.Any])
    
    inline def setOnStatisticFieldUndefined: Self = StObject.set(x, "onStatisticField", js.undefined)
    
    inline def setOutStatisticFieldName(value: String): Self = StObject.set(x, "outStatisticFieldName", value.asInstanceOf[js.Any])
    
    inline def setOutStatisticFieldNameUndefined: Self = StObject.set(x, "outStatisticFieldName", js.undefined)
    
    inline def setStatisticParameters(value: StatisticDefinitionStatisticParameters): Self = StObject.set(x, "statisticParameters", value.asInstanceOf[js.Any])
    
    inline def setStatisticParametersUndefined: Self = StObject.set(x, "statisticParameters", js.undefined)
    
    inline def setStatisticType(
      value: count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete` | `envelope-aggregate` | `centroid-aggregate` | `convex-hull-aggregate`
    ): Self = StObject.set(x, "statisticType", value.asInstanceOf[js.Any])
    
    inline def setStatisticTypeUndefined: Self = StObject.set(x, "statisticType", js.undefined)
  }
}
