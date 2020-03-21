package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryServiceToGeoCoordinateStringParams extends Object {
  /**
    * If `true`, then spaces are added between components of the string. The `addSpaces` parameter applies only to conversion types `mgrs`, `usng` and `utm`. The default value for `mgrs` is `false` , while the default value for both `usng` and `utm` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var addSpaces: js.UndefOr[Boolean] = js.undefined
  /**
    * Conversion options for mgrs and utm conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/to-geocoordinatestring.htm) for valid conversion modes and their descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionMode: js.UndefOr[String] = js.undefined
  /**
    * The conversion type of the input strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd
  /**
    * An array of XY-coordinates (in JSON format) to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var coordinates: js.Array[js.Array[Double]]
  /**
    * The number of digits to output for each of the numerical portions in the string. The default value depends of `conversionType`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for default values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var numOfDigits: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`. Otherwise, numeric portions of the string are truncated. The rounding parameter applies only to conversion types `mgrs`, `usng` and `geo-ref`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    *
    * @default true
    */
  var rounding: js.UndefOr[Boolean] = js.undefined
  /**
    * The spatial reference (or WKID of the spatial reference) of the XY-coordinates to be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  var sr: SpatialReference | String | Double
}

object GeometryServiceToGeoCoordinateStringParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    conversionType: mgrs | usng | utm | `geo-ref` | gars | dms | ddm | dd,
    coordinates: js.Array[js.Array[Double]],
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    sr: SpatialReference | String | Double,
    addSpaces: js.UndefOr[Boolean] = js.undefined,
    conversionMode: String = null,
    numOfDigits: Int | Double = null,
    rounding: js.UndefOr[Boolean] = js.undefined
  ): GeometryServiceToGeoCoordinateStringParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], conversionType = conversionType.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], sr = sr.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(addSpaces)) __obj.updateDynamic("addSpaces")(addSpaces.asInstanceOf[js.Any])
    if (conversionMode != null) __obj.updateDynamic("conversionMode")(conversionMode.asInstanceOf[js.Any])
    if (numOfDigits != null) __obj.updateDynamic("numOfDigits")(numOfDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(rounding)) __obj.updateDynamic("rounding")(rounding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryServiceToGeoCoordinateStringParams]
  }
}

