package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastViewModelDiscreteOptionsProperties
  extends StObject
     with Object {
  
  /**
    * Color of the shadow visualization.
    *
    * @default [50, 50, 50, 0.7]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * Individual shadows are displayed at this time interval, starting with the [startTimeOfDay](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#startTimeOfDay).
    *
    * @default 15 * 60 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Values (in milliseconds) selectable in the UI for the interval used to display shadows.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
    */
  var intervalOptions: js.UndefOr[CollectionProperties[Double]] = js.undefined
}
object ShadowCastViewModelDiscreteOptionsProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ShadowCastViewModelDiscreteOptionsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ShadowCastViewModelDiscreteOptionsProperties]
  }
  
  extension [Self <: ShadowCastViewModelDiscreteOptionsProperties](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalOptions(value: CollectionProperties[Double]): Self = StObject.set(x, "intervalOptions", value.asInstanceOf[js.Any])
    
    inline def setIntervalOptionsUndefined: Self = StObject.set(x, "intervalOptions", js.undefined)
    
    inline def setIntervalOptionsVarargs(value: Double*): Self = StObject.set(x, "intervalOptions", js.Array(value*))
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
