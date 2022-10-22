package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centuries
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.days
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decades
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hours
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.milliseconds
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.months
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.weeks
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeInterval
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Temporal units.
    *
    * @default milliseconds
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    */
  var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries = js.native
  
  /**
    * The numerical value of the time extent.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    */
  var value: Double = js.native
}
