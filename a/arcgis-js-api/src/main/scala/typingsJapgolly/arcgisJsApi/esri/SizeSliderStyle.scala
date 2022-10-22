package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSliderStyle
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The background color of the slider's track.
    *
    * @default new Color([224, 224, 224])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var trackBackgroundColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * The color of the slider's track.
    *
    * @default new Color([149, 149, 149])
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    */
  var trackFillColor: js.UndefOr[Color_] = js.undefined
}
object SizeSliderStyle {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, SizeSliderStyle]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SizeSliderStyle]])
  ): SizeSliderStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSliderStyle]
  }
  
  extension [Self <: SizeSliderStyle](x: Self) {
    
    inline def setTrackBackgroundColor(value: Color_): Self = StObject.set(x, "trackBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTrackBackgroundColorUndefined: Self = StObject.set(x, "trackBackgroundColor", js.undefined)
    
    inline def setTrackFillColor(value: Color_): Self = StObject.set(x, "trackFillColor", value.asInstanceOf[js.Any])
    
    inline def setTrackFillColorUndefined: Self = StObject.set(x, "trackFillColor", js.undefined)
  }
}
