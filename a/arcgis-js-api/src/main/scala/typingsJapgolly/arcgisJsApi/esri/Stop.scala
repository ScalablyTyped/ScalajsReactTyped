package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`either-side-of-vehicle`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`element-not-traversable`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`invalid-field-values`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-side-of-vehicle`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`network-element-not-located`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-u-turn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-located-on-closest`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-located`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-reached`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-side-of-vehicle`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`time-window-violation`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.break
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ok
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.stop
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.waypoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stop
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The date and time value indicating the arrival time at the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#arriveTime)
    */
  var arriveTime: js.Date = js.native
  
  /**
    * The local time offset (in minutes) for the arrival time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#arriveTimeOffset)
    */
  var arriveTimeOffset: Double = js.native
  
  /**
    * Specify the direction a vehicle may arrive at and depart from the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#curbApproach)
    */
  var curbApproach: `either-side-of-vehicle` | `right-side-of-vehicle` | `left-side-of-vehicle` | `no-u-turn` = js.native
  
  /**
    * The date and time value indicating the departure time from the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#departTime)
    */
  var departTime: js.Date = js.native
  
  /**
    * The local time offset in minutes for the departure time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#departTimeOffset)
    */
  var departTimeOffset: Double = js.native
  
  /**
    * The point location of the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#geometry)
    */
  var geometry: Point = js.native
  
  var locationType: stop | waypoint | break = js.native
  
  /**
    * The name of the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#name)
    */
  var name: String = js.native
  
  /**
    * If the findBestSequence parameter is set to false, the output routes will visit the stops in the order you specify with this attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#sequence)
    */
  var sequence: Double = js.native
  
  /**
    * Indicates the status of the point with respect to its location on the network and the outcome of the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#status)
    */
  var status: ok | `not-located` | `network-element-not-located` | `element-not-traversable` | `invalid-field-values` | `not-reached` | `time-window-violation` | `not-located-on-closest` = js.native
  
  /**
    * The latest time the route can visit the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#timeWindowEnd)
    */
  var timeWindowEnd: js.Date = js.native
  
  /**
    * The earliest time the route can visit the stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#timeWindowStart)
    */
  var timeWindowStart: js.Date = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [Stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  val `type`: stop = js.native
}
