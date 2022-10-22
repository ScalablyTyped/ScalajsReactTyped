package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineGroun
import typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineViewP
import typingsJapgolly.arcgisJsApi.anon.MapViewPropertiestype2d
import typingsJapgolly.arcgisJsApi.anon.SceneViewPropertiestype3d
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

trait ElevationProfileProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * When the spatial reference is projected (other than web mercator) and the path is shorter than this threshold, distances will be computed planimetrically.
    *
    * @default 100000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#geodesicDistanceThreshold)
    */
  var geodesicDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * The input line graphic along which elevation will be queried in order to generate an elevation profile.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#input)
    */
  var input: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * Collection of elevation profile lines which are to be generated and displayed in the widget's chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#profiles)
    */
  var profiles: js.UndefOr[
    CollectionProperties[
      ElevationProfileLineGroun | typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineInput | typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineQuery | ElevationProfileLineViewP
    ]
  ] = js.undefined
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the elevation and distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#unit)
    */
  var unit: js.UndefOr[
    imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
    * List of available units and unit systems (imperial, metric) for displaying the elevation and distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#unitOptions)
    */
  var unitOptions: js.UndefOr[
    js.Array[
      imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ]
  ] = js.undefined
  
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#view)
    */
  var view: js.UndefOr[SceneViewPropertiestype3d | MapViewPropertiestype2d] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#viewModel)
    */
  var viewModel: js.UndefOr[ElevationProfileViewModelProperties] = js.undefined
  
  /**
    * This property provides the ability to display or hide the individual elements of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#visibleElements)
    */
  var visibleElements: js.UndefOr[ElevationProfileVisibleElements] = js.undefined
}
object ElevationProfileProperties {
  
  inline def apply(): ElevationProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationProfileProperties]
  }
  
  extension [Self <: ElevationProfileProperties](x: Self) {
    
    inline def setGeodesicDistanceThreshold(value: Double): Self = StObject.set(x, "geodesicDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setGeodesicDistanceThresholdUndefined: Self = StObject.set(x, "geodesicDistanceThreshold", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setInput(value: GraphicProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setProfiles(
      value: CollectionProperties[
          ElevationProfileLineGroun | typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineInput | typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineQuery | ElevationProfileLineViewP
        ]
    ): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(
      value: (ElevationProfileLineGroun | typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineInput | typingsJapgolly.arcgisJsApi.anon.ElevationProfileLineQuery | ElevationProfileLineViewP)*
    ): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setUnit(
      value: imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitOptions(
      value: js.Array[
          imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
        ]
    ): Self = StObject.set(x, "unitOptions", value.asInstanceOf[js.Any])
    
    inline def setUnitOptionsUndefined: Self = StObject.set(x, "unitOptions", js.undefined)
    
    inline def setUnitOptionsVarargs(
      value: (imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`)*
    ): Self = StObject.set(x, "unitOptions", js.Array(value*))
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setView(value: SceneViewPropertiestype3d | MapViewPropertiestype2d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: ElevationProfileViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: ElevationProfileVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
