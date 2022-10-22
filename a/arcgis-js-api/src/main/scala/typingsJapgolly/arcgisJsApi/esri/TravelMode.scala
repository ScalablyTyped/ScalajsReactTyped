package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`allow-backtrack`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`any-hazmat-prohibited`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-and-intersections`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`at-dead-ends-only`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-carpool-roads`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-express-lanes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-ferries`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-gates`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-limited-access-roads`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-private-roads`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-roads-unsuitable-for-pedestrians`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-stairways`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-toll-roads-for-trucks`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-toll-roads`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-truck-restricted-roads`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`avoid-unpaved-roads`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`axle-count-restriction`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`decimal-degrees`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`driving-a-bus`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`driving-a-taxi`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`driving-a-truck`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`driving-an-automobile`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`driving-an-emergency-vehicle`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`height-restriction`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`kingpin-to-rear-axle-length-restriction`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`length-restriction`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`no-backtrack`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`preferred-for-pedestrians`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`riding-a-motorcycle`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`roads-under-construction-prohibited`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`semi-or-tractor-with-one-or-more-trailers-prohibited`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`single-axle-vehicles-prohibited`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`tandem-axle-vehicles-prohibited`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`through-traffic-prohibited`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`travel-time`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`truck-minutes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`truck-travel-time`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`truck-with-trailers-restriction`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`use-preferred-hazmat-routes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`use-preferred-truck-routes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`walk-time`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`weight-restriction`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.automobile
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.other
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.points
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.truck
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.unknown
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.walk
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.walking
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TravelMode
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Lists the parameterized attributes used by the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[TravelModeAttributeParameterValues] = js.native
  
  /**
    * A short text description of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#description)
    */
  var description: String = js.native
  
  /**
    * Indicates the distance-based cost attribute for reporting directions and for solving vehicle routing problems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#distanceAttributeName)
    */
  var distanceAttributeName: kilometers_ | miles_ | String = js.native
  
  /**
    * The unique identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#id)
    */
  var id: String = js.native
  
  /**
    * The network cost attribute used as impedance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#impedanceAttributeName)
    */
  var impedanceAttributeName: kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String = js.native
  
  /**
    * The unique name of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#name)
    */
  var name: String = js.native
  
  /**
    * The list of the restriction attributes used when solving network analysis problems with this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#restrictionAttributeNames)
    */
  var restrictionAttributeNames: js.Array[
    `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
  ] = js.native
  
  /**
    * Specifies whether the travel mode generalizes the geometry of analysis results and by how much.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance)
    */
  var simplificationTolerance: Double = js.native
  
  /**
    * The linear units associated with [simplificationTolerance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationToleranceUnits)
    */
  var simplificationToleranceUnits: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | unknown | yards = js.native
  
  /**
    * Indicates the time-based cost attribute for reporting directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#timeAttributeName)
    */
  var timeAttributeName: minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String = js.native
  
  /**
    * Indicates the category of travel or vehicle represented by this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#type)
    */
  var `type`: automobile | truck | walk | other = js.native
  
  /**
    * Indicates whether the travel mode uses a hierarchy attribute while performing the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#useHierarchy)
    */
  var useHierarchy: Boolean = js.native
  
  /**
    * Indicates how the U-turns at junctions that could occur during network traversal are handled by the solver.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#uturnAtJunctions)
    */
  var uturnAtJunctions: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections` = js.native
}
