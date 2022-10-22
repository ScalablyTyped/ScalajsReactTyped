package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.add
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.count
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.max
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.min
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.subtract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The aggregate function type used in the supplied trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html#functionType)
    */
  val functionType: add | subtract | average | count | min | max = js.native
  
  /**
    * The name of the function result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html#networkAttributeName)
    */
  val networkAttributeName: String = js.native
  
  /**
    * Actual result of the aggregate function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html#result)
    */
  val result: Double = js.native
}
