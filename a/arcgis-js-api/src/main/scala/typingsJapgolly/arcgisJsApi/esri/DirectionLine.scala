package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`direction-line`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`heavy-traffic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`maneuver-segment`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`moderate-traffic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`restriction-violation`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`scaled-cost-barrier`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`slow-traffic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.segment
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionLine
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The type of line which is defined by esriDirectionLineType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#directionLineType)
    */
  var directionLineType: unknown | segment | `maneuver-segment` | `restriction-violation` | `scaled-cost-barrier` | `heavy-traffic` | `slow-traffic` | `moderate-traffic` = js.native
  
  /**
    * Length of the line measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#distance)
    */
  var distance: Double = js.native
  
  /**
    * Time of the line measured in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#duration)
    */
  var duration: Double = js.native
  
  /**
    * Polyline representing the direction's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#geometry)
    */
  var geometry: Polyline = js.native
  
  /**
    * Creates a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) from the [DirectionLine](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#toGraphic)
    */
  def toGraphic(): Graphic = js.native
  
  val `type`: `direction-line` = js.native
}
