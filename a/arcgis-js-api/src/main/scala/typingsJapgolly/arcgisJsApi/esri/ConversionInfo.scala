package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionInfo
  extends StObject
     with Object {
  
  /**
    * A function that takes a point and returns a [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    */
  def convert(): scala.Unit
  
  /**
    * A function that takes a string and returns a Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    */
  def reverseConvert(): scala.Unit
}
object ConversionInfo {
  
  inline def apply(
    constructor: js.Function,
    convert: Callback,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    reverseConvert: Callback
  ): ConversionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], convert = convert.toJsFn, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), reverseConvert = reverseConvert.toJsFn)
    __obj.asInstanceOf[ConversionInfo]
  }
  
  extension [Self <: ConversionInfo](x: Self) {
    
    inline def setConvert(value: Callback): Self = StObject.set(x, "convert", value.toJsFn)
    
    inline def setReverseConvert(value: Callback): Self = StObject.set(x, "reverseConvert", value.toJsFn)
  }
}
