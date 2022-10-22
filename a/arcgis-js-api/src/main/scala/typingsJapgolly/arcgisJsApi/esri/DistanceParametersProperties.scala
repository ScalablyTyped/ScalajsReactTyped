package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceParametersProperties extends StObject {
  
  /**
    * Specifies the units for measuring distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry2).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#distanceUnit)
    */
  var distanceUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.undefined
  
  /**
    * When `true`, the geodesic distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry2) is measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The geometry from which the distance is to be measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry1)
    */
  var geometry1: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
    * The geometry to which the distance is to be measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry2)
    */
  var geometry2: js.UndefOr[GeometryProperties] = js.undefined
}
object DistanceParametersProperties {
  
  inline def apply(): DistanceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceParametersProperties]
  }
  
  extension [Self <: DistanceParametersProperties](x: Self) {
    
    inline def setDistanceUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "distanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitUndefined: Self = StObject.set(x, "distanceUnit", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setGeometry1(value: GeometryProperties): Self = StObject.set(x, "geometry1", value.asInstanceOf[js.Any])
    
    inline def setGeometry1Undefined: Self = StObject.set(x, "geometry1", js.undefined)
    
    inline def setGeometry2(value: GeometryProperties): Self = StObject.set(x, "geometry2", value.asInstanceOf[js.Any])
    
    inline def setGeometry2Undefined: Self = StObject.set(x, "geometry2", js.undefined)
  }
}
