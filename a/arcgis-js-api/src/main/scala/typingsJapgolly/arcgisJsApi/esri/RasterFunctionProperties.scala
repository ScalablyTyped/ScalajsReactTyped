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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterFunctionProperties extends StObject {
  
  /**
    * The arguments for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments)
    */
  var functionArguments: js.UndefOr[Any] = js.undefined
  
  /**
    * The raster function name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionName)
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the pixel type of the output image.
    *
    * @default unknown
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#outputPixelType)
    */
  var outputPixelType: js.UndefOr[
    c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown
  ] = js.undefined
  
  var rasterFunctionDefinition: js.UndefOr[Any] = js.undefined
  
  /**
    * The variable name for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.undefined
}
object RasterFunctionProperties {
  
  inline def apply(): RasterFunctionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterFunctionProperties]
  }
  
  extension [Self <: RasterFunctionProperties](x: Self) {
    
    inline def setFunctionArguments(value: Any): Self = StObject.set(x, "functionArguments", value.asInstanceOf[js.Any])
    
    inline def setFunctionArgumentsUndefined: Self = StObject.set(x, "functionArguments", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setOutputPixelType(value: c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown): Self = StObject.set(x, "outputPixelType", value.asInstanceOf[js.Any])
    
    inline def setOutputPixelTypeUndefined: Self = StObject.set(x, "outputPixelType", js.undefined)
    
    inline def setRasterFunctionDefinition(value: Any): Self = StObject.set(x, "rasterFunctionDefinition", value.asInstanceOf[js.Any])
    
    inline def setRasterFunctionDefinitionUndefined: Self = StObject.set(x, "rasterFunctionDefinition", js.undefined)
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableNameUndefined: Self = StObject.set(x, "variableName", js.undefined)
  }
}
