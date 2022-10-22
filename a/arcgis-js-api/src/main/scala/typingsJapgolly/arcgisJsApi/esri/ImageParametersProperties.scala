package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bmp
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.exclude
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.gif
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hide
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.include
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png24
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png8
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.show
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageParametersProperties extends StObject {
  
  /**
    * Dots per inch setting for an [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /**
    * Extent of map to be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Map image format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#format)
    */
  var format: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg] = js.undefined
  
  /**
    * Requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Spatial reference of exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#imageSpatialReference)
    */
  var imageSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Array of layer definition expressions that allows you to filter the features of individual layers in the exported map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerDefinitions)
    */
  var layerDefinitions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of layer IDs, that represent which layers to include in the exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The option for displaying or hiding the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption)
    */
  var layerOption: js.UndefOr[show | hide | include | exclude] = js.undefined
  
  /**
    * Indicates whether or not the background of the dynamic image is transparent.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#transparent)
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageParametersProperties {
  
  inline def apply(): ImageParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageParametersProperties]
  }
  
  extension [Self <: ImageParametersProperties](x: Self) {
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFormat(value: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImageSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "imageSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setImageSpatialReferenceUndefined: Self = StObject.set(x, "imageSpatialReference", js.undefined)
    
    inline def setLayerDefinitions(value: js.Array[String]): Self = StObject.set(x, "layerDefinitions", value.asInstanceOf[js.Any])
    
    inline def setLayerDefinitionsUndefined: Self = StObject.set(x, "layerDefinitions", js.undefined)
    
    inline def setLayerDefinitionsVarargs(value: String*): Self = StObject.set(x, "layerDefinitions", js.Array(value*))
    
    inline def setLayerIds(value: js.Array[Double]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: Double*): Self = StObject.set(x, "layerIds", js.Array(value*))
    
    inline def setLayerOption(value: show | hide | include | exclude): Self = StObject.set(x, "layerOption", value.asInstanceOf[js.Any])
    
    inline def setLayerOptionUndefined: Self = StObject.set(x, "layerOption", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
