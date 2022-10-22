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

trait TravelModeProperties extends StObject {
  
  /**
    * Lists the parameterized attributes used by the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#attributeParameterValues)
    */
  var attributeParameterValues: js.UndefOr[js.Array[TravelModeAttributeParameterValues]] = js.undefined
  
  /**
    * A short text description of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the distance-based cost attribute for reporting directions and for solving vehicle routing problems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#distanceAttributeName)
    */
  var distanceAttributeName: js.UndefOr[kilometers_ | miles_ | String] = js.undefined
  
  /**
    * The unique identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The network cost attribute used as impedance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#impedanceAttributeName)
    */
  var impedanceAttributeName: js.UndefOr[
    kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.undefined
  
  /**
    * The unique name of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The list of the restriction attributes used when solving network analysis problems with this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#restrictionAttributeNames)
    */
  var restrictionAttributeNames: js.UndefOr[
    js.Array[
      `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
    ]
  ] = js.undefined
  
  /**
    * Specifies whether the travel mode generalizes the geometry of analysis results and by how much.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance)
    */
  var simplificationTolerance: js.UndefOr[Double] = js.undefined
  
  /**
    * The linear units associated with [simplificationTolerance](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationTolerance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#simplificationToleranceUnits)
    */
  var simplificationToleranceUnits: js.UndefOr[
    centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | unknown | yards
  ] = js.undefined
  
  /**
    * Indicates the time-based cost attribute for reporting directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#timeAttributeName)
    */
  var timeAttributeName: js.UndefOr[
    minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
  ] = js.undefined
  
  /**
    * Indicates the category of travel or vehicle represented by this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#type)
    */
  var `type`: js.UndefOr[automobile | truck | walk | other] = js.undefined
  
  /**
    * Indicates whether the travel mode uses a hierarchy attribute while performing the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#useHierarchy)
    */
  var useHierarchy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates how the U-turns at junctions that could occur during network traversal are handled by the solver.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html#uturnAtJunctions)
    */
  var uturnAtJunctions: js.UndefOr[
    `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`
  ] = js.undefined
}
object TravelModeProperties {
  
  inline def apply(): TravelModeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TravelModeProperties]
  }
  
  extension [Self <: TravelModeProperties](x: Self) {
    
    inline def setAttributeParameterValues(value: js.Array[TravelModeAttributeParameterValues]): Self = StObject.set(x, "attributeParameterValues", value.asInstanceOf[js.Any])
    
    inline def setAttributeParameterValuesUndefined: Self = StObject.set(x, "attributeParameterValues", js.undefined)
    
    inline def setAttributeParameterValuesVarargs(value: TravelModeAttributeParameterValues*): Self = StObject.set(x, "attributeParameterValues", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistanceAttributeName(value: kilometers_ | miles_ | String): Self = StObject.set(x, "distanceAttributeName", value.asInstanceOf[js.Any])
    
    inline def setDistanceAttributeNameUndefined: Self = StObject.set(x, "distanceAttributeName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImpedanceAttributeName(
      value: kilometers_ | miles_ | minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String
    ): Self = StObject.set(x, "impedanceAttributeName", value.asInstanceOf[js.Any])
    
    inline def setImpedanceAttributeNameUndefined: Self = StObject.set(x, "impedanceAttributeName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictionAttributeNames(
      value: js.Array[
          `any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String
        ]
    ): Self = StObject.set(x, "restrictionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setRestrictionAttributeNamesUndefined: Self = StObject.set(x, "restrictionAttributeNames", js.undefined)
    
    inline def setRestrictionAttributeNamesVarargs(
      value: (`any-hazmat-prohibited` | `avoid-carpool-roads` | `avoid-express-lanes` | `avoid-ferries` | `avoid-gates` | `avoid-limited-access-roads` | `avoid-private-roads` | `avoid-roads-unsuitable-for-pedestrians` | `avoid-stairways` | `avoid-toll-roads` | `avoid-toll-roads-for-trucks` | `avoid-truck-restricted-roads` | `avoid-unpaved-roads` | `axle-count-restriction` | `driving-a-bus` | `driving-a-taxi` | `driving-a-truck` | `driving-an-automobile` | `driving-an-emergency-vehicle` | `height-restriction` | `kingpin-to-rear-axle-length-restriction` | `length-restriction` | `preferred-for-pedestrians` | `riding-a-motorcycle` | `roads-under-construction-prohibited` | `semi-or-tractor-with-one-or-more-trailers-prohibited` | `single-axle-vehicles-prohibited` | `tandem-axle-vehicles-prohibited` | `through-traffic-prohibited` | `truck-with-trailers-restriction` | `use-preferred-hazmat-routes` | `use-preferred-truck-routes` | walking | `weight-restriction` | String)*
    ): Self = StObject.set(x, "restrictionAttributeNames", js.Array(value*))
    
    inline def setSimplificationTolerance(value: Double): Self = StObject.set(x, "simplificationTolerance", value.asInstanceOf[js.Any])
    
    inline def setSimplificationToleranceUndefined: Self = StObject.set(x, "simplificationTolerance", js.undefined)
    
    inline def setSimplificationToleranceUnits(
      value: centimeters | `decimal-degrees` | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | points | unknown | yards
    ): Self = StObject.set(x, "simplificationToleranceUnits", value.asInstanceOf[js.Any])
    
    inline def setSimplificationToleranceUnitsUndefined: Self = StObject.set(x, "simplificationToleranceUnits", js.undefined)
    
    inline def setTimeAttributeName(value: minutes | `travel-time` | `truck-minutes` | `truck-travel-time` | `walk-time` | String): Self = StObject.set(x, "timeAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTimeAttributeNameUndefined: Self = StObject.set(x, "timeAttributeName", js.undefined)
    
    inline def setType(value: automobile | truck | walk | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseHierarchy(value: Boolean): Self = StObject.set(x, "useHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUseHierarchyUndefined: Self = StObject.set(x, "useHierarchy", js.undefined)
    
    inline def setUturnAtJunctions(value: `allow-backtrack` | `at-dead-ends-only` | `no-backtrack` | `at-dead-ends-and-intersections`): Self = StObject.set(x, "uturnAtJunctions", value.asInstanceOf[js.Any])
    
    inline def setUturnAtJunctionsUndefined: Self = StObject.set(x, "uturnAtJunctions", js.undefined)
  }
}
