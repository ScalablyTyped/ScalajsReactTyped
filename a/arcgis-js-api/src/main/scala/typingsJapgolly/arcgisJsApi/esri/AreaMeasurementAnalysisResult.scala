package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.euclidean
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geodesic
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurementAnalysisResult
  extends StObject
     with Object {
  
  /**
    * Measured area quantity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#AreaMeasurementAnalysisResult)
    */
  var area: Area
  
  /**
    * Describes the mode in which the measurement was taken.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#AreaMeasurementAnalysisResult)
    */
  var mode: euclidean | geodesic
  
  /**
    * Measured circumference of the measured area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-AreaMeasurementAnalysisView3D.html#AreaMeasurementAnalysisResult)
    */
  var pathLength: Length
}
object AreaMeasurementAnalysisResult {
  
  inline def apply(
    area: Area,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: euclidean | geodesic,
    pathLength: Length,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurementAnalysisResult = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurementAnalysisResult]
  }
  
  extension [Self <: AreaMeasurementAnalysisResult](x: Self) {
    
    inline def setArea(value: Area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setMode(value: euclidean | geodesic): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPathLength(value: Length): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
  }
}
