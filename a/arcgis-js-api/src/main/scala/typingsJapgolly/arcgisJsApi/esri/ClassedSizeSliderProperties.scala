package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassedSizeSliderProperties
  extends StObject
     with SmartMappingSliderBaseProperties {
  
  /**
    * An array of class breaks with associated sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var breaks: js.UndefOr[js.Array[ClassedSizeSliderBreaks]] = js.undefined
  
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var style: js.UndefOr[ClassedSizeSliderStyleProperties] = js.undefined
  
  /**
    * The view model for the ClassedSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[ClassedSizeSliderViewModelProperties] = js.undefined
}
object ClassedSizeSliderProperties {
  
  inline def apply(): ClassedSizeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassedSizeSliderProperties]
  }
  
  extension [Self <: ClassedSizeSliderProperties](x: Self) {
    
    inline def setBreaks(value: js.Array[ClassedSizeSliderBreaks]): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setBreaksVarargs(value: ClassedSizeSliderBreaks*): Self = StObject.set(x, "breaks", js.Array(value*))
    
    inline def setStyle(value: ClassedSizeSliderStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setViewModel(value: ClassedSizeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
