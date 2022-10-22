package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geodesic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.planar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthsParametersProperties extends StObject {
  
  /**
    * Defines the type of calculation for the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#calculationType)
    */
  var calculationType: js.UndefOr[planar | geodesic | `preserve-shape`] = js.undefined
  
  /**
    * If polylines are in a geographic coordinate system, then geodesic needs to be set to `true` in order to calculate the ellipsoidal shortest path distance between each pair of the vertices in the polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The length unit in which perimeters of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The array of polylines whose lengths are to be computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
}
object LengthsParametersProperties {
  
  inline def apply(): LengthsParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthsParametersProperties]
  }
  
  extension [Self <: LengthsParametersProperties](x: Self) {
    
    inline def setCalculationType(value: planar | geodesic | `preserve-shape`): Self = StObject.set(x, "calculationType", value.asInstanceOf[js.Any])
    
    inline def setCalculationTypeUndefined: Self = StObject.set(x, "calculationType", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setLengthUnit(value: Double | String): Self = StObject.set(x, "lengthUnit", value.asInstanceOf[js.Any])
    
    inline def setLengthUnitUndefined: Self = StObject.set(x, "lengthUnit", js.undefined)
    
    inline def setPolylines(value: js.Array[PolylineProperties]): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    inline def setPolylinesVarargs(value: PolylineProperties*): Self = StObject.set(x, "polylines", js.Array(value*))
  }
}
