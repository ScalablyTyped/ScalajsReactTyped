package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`geo-ref`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dd
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ddm
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dms
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.gars
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mgrs
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.usng
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.utm
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait geometryServiceToGeoCoordinateStringParams
  extends StObject
     with Object {
  
  /**
    * If `true`, then spaces are added between components of the string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var addSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Conversion options for mgrs and utm conversion types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.undefined
  
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd
  
  /**
    * An array of XY-coordinates (in JSON format) to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var coordinates: js.Array[js.Array[Double]]
  
  /**
    * The number of digits to output for each of the numerical portions in the string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var numOfDigits: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var rounding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The spatial reference (or WKID of the spatial reference) of the XY-coordinates to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double
}
object geometryServiceToGeoCoordinateStringParams {
  
  inline def apply(
    constructor: js.Function,
    conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd,
    coordinates: js.Array[js.Array[Double]],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    sr: SpatialReference | String | Double
  ): geometryServiceToGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], conversionType = conversionType.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), sr = sr.asInstanceOf[js.Any])
    __obj.asInstanceOf[geometryServiceToGeoCoordinateStringParams]
  }
  
  extension [Self <: geometryServiceToGeoCoordinateStringParams](x: Self) {
    
    inline def setAddSpaces(value: Boolean): Self = StObject.set(x, "addSpaces", value.asInstanceOf[js.Any])
    
    inline def setAddSpacesUndefined: Self = StObject.set(x, "addSpaces", js.undefined)
    
    inline def setConversionMode(value: String): Self = StObject.set(x, "conversionMode", value.asInstanceOf[js.Any])
    
    inline def setConversionModeUndefined: Self = StObject.set(x, "conversionMode", js.undefined)
    
    inline def setConversionType(value: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd): Self = StObject.set(x, "conversionType", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setNumOfDigits(value: Double): Self = StObject.set(x, "numOfDigits", value.asInstanceOf[js.Any])
    
    inline def setNumOfDigitsUndefined: Self = StObject.set(x, "numOfDigits", js.undefined)
    
    inline def setRounding(value: Boolean): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setSr(value: SpatialReference | String | Double): Self = StObject.set(x, "sr", value.asInstanceOf[js.Any])
  }
}
