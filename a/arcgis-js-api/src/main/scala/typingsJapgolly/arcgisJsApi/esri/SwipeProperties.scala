package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The direction the Swipe widget moves across the view.
    *
    * @default "horizontal"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#direction)
    */
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text that shows in a tooltip when hovering over the handle of the Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#dragLabel)
    */
  var dragLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of the Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#leadingLayers)
    */
  var leadingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  
  /**
    * The position of the Swipe widget.
    *
    * @default 25
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#position)
    */
  var position: js.UndefOr[Double] = js.undefined
  
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of the Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#trailingLayers)
    */
  var trailingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#viewModel)
    */
  var viewModel: js.UndefOr[SwipeViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#visibleElements)
    */
  var visibleElements: js.UndefOr[widgetsSwipeVisibleElements] = js.undefined
}
object SwipeProperties {
  
  inline def apply(): SwipeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeProperties]
  }
  
  extension [Self <: SwipeProperties](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDragLabel(value: String): Self = StObject.set(x, "dragLabel", value.asInstanceOf[js.Any])
    
    inline def setDragLabelUndefined: Self = StObject.set(x, "dragLabel", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLeadingLayers(value: CollectionProperties[LayerProperties]): Self = StObject.set(x, "leadingLayers", value.asInstanceOf[js.Any])
    
    inline def setLeadingLayersUndefined: Self = StObject.set(x, "leadingLayers", js.undefined)
    
    inline def setLeadingLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "leadingLayers", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTrailingLayers(value: CollectionProperties[LayerProperties]): Self = StObject.set(x, "trailingLayers", value.asInstanceOf[js.Any])
    
    inline def setTrailingLayersUndefined: Self = StObject.set(x, "trailingLayers", js.undefined)
    
    inline def setTrailingLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "trailingLayers", js.Array(value*))
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: SwipeViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: widgetsSwipeVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
