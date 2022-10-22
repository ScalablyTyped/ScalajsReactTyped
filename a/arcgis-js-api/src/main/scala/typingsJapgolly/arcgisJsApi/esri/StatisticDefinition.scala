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

@js.native
trait StatisticDefinition
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Defines the field for which statistics will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: String = js.native
  
  /**
    * Specifies the output field name for the requested statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: String = js.native
  
  /**
    * The parameters for [percentile statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticType).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticParameters)
    */
  var statisticParameters: StatisticDefinitionStatisticParameters = js.native
  
  /**
    * Defines the type of statistic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete` | `envelope-aggregate` | `centroid-aggregate` | `convex-hull-aggregate` = js.native
}
