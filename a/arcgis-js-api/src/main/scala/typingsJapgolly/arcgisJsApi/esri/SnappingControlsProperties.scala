package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.anon.MapViewPropertiestype2d
import typingsJapgolly.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnappingControlsProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#snappingOptions)
    */
  var snappingOptions: js.UndefOr[SnappingOptionsProperties] = js.undefined
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * The view model for the SnappingControls widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#viewModel)
    */
  var viewModel: js.UndefOr[SnappingControlsViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html#visibleElements)
    */
  var visibleElements: js.UndefOr[SnappingControlsVisibleElements] = js.undefined
}
object SnappingControlsProperties {
  
  inline def apply(): SnappingControlsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnappingControlsProperties]
  }
  
  extension [Self <: SnappingControlsProperties](x: Self) {
    
    inline def setSnappingOptions(value: SnappingOptionsProperties): Self = StObject.set(x, "snappingOptions", value.asInstanceOf[js.Any])
    
    inline def setSnappingOptionsUndefined: Self = StObject.set(x, "snappingOptions", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: SnappingControlsViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: SnappingControlsVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
