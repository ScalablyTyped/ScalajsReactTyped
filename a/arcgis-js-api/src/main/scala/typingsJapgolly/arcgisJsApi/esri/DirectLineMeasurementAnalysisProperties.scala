package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.imperial
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.metric
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.millimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectLineMeasurementAnalysisProperties extends StObject {
  
  /**
    * Ending point for the measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html#endPoint)
    */
  var endPoint: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Starting point for the measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html#startPoint)
    */
  var startPoint: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for computing the distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DirectLineMeasurementAnalysis.html#unit)
    */
  var unit: js.UndefOr[
    imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}
object DirectLineMeasurementAnalysisProperties {
  
  inline def apply(): DirectLineMeasurementAnalysisProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectLineMeasurementAnalysisProperties]
  }
  
  extension [Self <: DirectLineMeasurementAnalysisProperties](x: Self) {
    
    inline def setEndPoint(value: PointProperties): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
    
    inline def setEndPointUndefined: Self = StObject.set(x, "endPoint", js.undefined)
    
    inline def setStartPoint(value: PointProperties): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
    
    inline def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
    
    inline def setUnit(
      value: imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
