package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideCreateFromOptions
  extends StObject
     with Object {
  
  /**
    * Screenshot options to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#createFrom)
    */
  var screenshot: js.UndefOr[SlideCreateFromOptionsScreenshot] = js.undefined
}
object SlideCreateFromOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SlideCreateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SlideCreateFromOptions]
  }
  
  extension [Self <: SlideCreateFromOptions](x: Self) {
    
    inline def setScreenshot(value: SlideCreateFromOptionsScreenshot): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
  }
}
