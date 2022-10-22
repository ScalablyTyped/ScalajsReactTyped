package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`non-metric`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dual
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.line
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.metric
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ruler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleBarProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The style for the scale bar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#style)
    */
  var style: js.UndefOr[ruler | line] = js.undefined
  
  /**
    * Units to use for the scale bar.
    *
    * @default non-metric
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#unit)
    */
  var unit: js.UndefOr[`non-metric` | metric | dual] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html#viewModel)
    */
  var viewModel: js.UndefOr[ScaleBarViewModelProperties] = js.undefined
}
object ScaleBarProperties {
  
  inline def apply(): ScaleBarProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleBarProperties]
  }
  
  extension [Self <: ScaleBarProperties](x: Self) {
    
    inline def setStyle(value: ruler | line): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnit(value: `non-metric` | metric | dual): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: ScaleBarViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
