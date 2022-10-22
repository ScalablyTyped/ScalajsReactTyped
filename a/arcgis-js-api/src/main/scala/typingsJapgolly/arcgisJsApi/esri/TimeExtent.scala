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
trait TimeExtent
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The end time of the time extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    */
  var end: js.Date = js.native
  
  /**
    * Expands the TimeExtent so that the start and end dates are rounded down and up, respectively, to the parsed time unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#expandTo)
    */
  def expandTo(
    unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
  ): TimeExtent = js.native
  
  /**
    * Returns the time extent resulting from the intersection of a given time extent and parsed time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#intersection)
    */
  def intersection(timeExtent: TimeExtent): TimeExtent = js.native
  
  /**
    * The start time of the time extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    */
  var start: js.Date = js.native
  
  /**
    * Returns the time extent resulting from the union of the current time extent and a given time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#union)
    */
  def union(timeExtent: TimeExtent): TimeExtent = js.native
}
