package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.continuous
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hourly
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastViewModelDurationOptionsProperties
  extends StObject
     with Object {
  
  /**
    * Color of the shadow cast.
    *
    * @default [50, 50, 50, 0.7]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#durationOptions)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * Mode in which the cumulative shadow duration should be displayed: as a continuous surface or as an hourly aggregation of values.
    *
    * @default "continuous"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#durationOptions)
    */
  var mode: js.UndefOr[continuous | hourly] = js.undefined
}
object ShadowCastViewModelDurationOptionsProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ShadowCastViewModelDurationOptionsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ShadowCastViewModelDurationOptionsProperties]
  }
  
  extension [Self <: ShadowCastViewModelDurationOptionsProperties](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMode(value: continuous | hourly): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
