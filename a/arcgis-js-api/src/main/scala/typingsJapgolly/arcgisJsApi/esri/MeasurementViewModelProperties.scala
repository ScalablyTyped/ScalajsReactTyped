package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.MapViewPropertiestype2d
import typingsJapgolly.arcgisJsApi.anon.SceneViewPropertiestype3d
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`direct-line`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-centimeters`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-decimeters`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-millimeters`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.acres
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.area
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ares
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.centimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.decimeters
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.distance
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hectares
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

trait MeasurementViewModelProperties extends StObject {
  
  /**
    * Specifies the current measurement tool to display.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeTool)
    */
  var activeTool: js.UndefOr[area | distance | `direct-line`] = js.undefined
  
  /**
    * View model of the active measurement widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#activeViewModel)
    */
  var activeViewModel: js.UndefOr[
    AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModelProperties
  ] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
  ] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#linearUnit)
    */
  var linearUnit: js.UndefOr[
    imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object MeasurementViewModelProperties {
  
  inline def apply(): MeasurementViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementViewModelProperties]
  }
  
  extension [Self <: MeasurementViewModelProperties](x: Self) {
    
    inline def setActiveTool(value: area | distance | `direct-line`): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    inline def setActiveToolUndefined: Self = StObject.set(x, "activeTool", js.undefined)
    
    inline def setActiveViewModel(
      value: AreaMeasurement2DViewModel | AreaMeasurement3DViewModelProperties | DirectLineMeasurement3DViewModelProperties | DistanceMeasurement2DViewModelProperties
    ): Self = StObject.set(x, "activeViewModel", value.asInstanceOf[js.Any])
    
    inline def setActiveViewModelUndefined: Self = StObject.set(x, "activeViewModel", js.undefined)
    
    inline def setAreaUnit(
      value: imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
    ): Self = StObject.set(x, "areaUnit", value.asInstanceOf[js.Any])
    
    inline def setAreaUnitUndefined: Self = StObject.set(x, "areaUnit", js.undefined)
    
    inline def setLinearUnit(
      value: imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "linearUnit", value.asInstanceOf[js.Any])
    
    inline def setLinearUnitUndefined: Self = StObject.set(x, "linearUnit", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
