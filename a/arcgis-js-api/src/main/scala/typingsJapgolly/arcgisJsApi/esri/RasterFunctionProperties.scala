package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.c128
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.c64
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.f32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.f64
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.s16
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.s32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.s8
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.u1
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.u16
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.u2
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.u32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.u4
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.u8
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterFunctionProperties extends js.Object {
  /**
    * The arguments for the raster function. The structure depends on the function specified. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their arguments. Also parses the arguments of RFT format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments)
    */
  var functionArguments: js.UndefOr[js.Any] = js.undefined
  /**
    * The raster function name. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their arguments. The name in the raster function in RFT JSON format is also parsed to functionName.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionName)
    */
  var functionName: js.UndefOr[String] = js.undefined
  /**
    * Defines the pixel type of the output image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#outputPixelType)
    *
    * @default unknown
    */
  var outputPixelType: js.UndefOr[
    c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown
  ] = js.undefined
  /**
    * The variable name for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.undefined
}

object RasterFunctionProperties {
  @scala.inline
  def apply(
    functionArguments: js.Any = null,
    functionName: String = null,
    outputPixelType: c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown = null,
    variableName: String = null
  ): RasterFunctionProperties = {
    val __obj = js.Dynamic.literal()
    if (functionArguments != null) __obj.updateDynamic("functionArguments")(functionArguments.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (outputPixelType != null) __obj.updateDynamic("outputPixelType")(outputPixelType.asInstanceOf[js.Any])
    if (variableName != null) __obj.updateDynamic("variableName")(variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterFunctionProperties]
  }
}

