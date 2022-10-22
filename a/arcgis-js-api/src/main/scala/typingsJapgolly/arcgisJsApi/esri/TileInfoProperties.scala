package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dib
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.emf
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.gif
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lerc
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mixed
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.pbf
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.pdf
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png24
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png32
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ps
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.svgz
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tiff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileInfoProperties extends StObject {
  
  /**
    * The dots per inch (DPI) of the tiling scheme.
    *
    * @default 96
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /**
    * Image format of the cached tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#format)
    */
  var format: js.UndefOr[
    png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc | pbf
  ] = js.undefined
  
  /**
    * Indicates if the tiling scheme supports wrap around.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#isWrappable)
    */
  var isWrappable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of levels of detail that define the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods)
    */
  var lods: js.UndefOr[js.Array[LODProperties]] = js.undefined
  
  /**
    * The tiling scheme origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#origin)
    */
  var origin: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Size of tiles in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#size)
    */
  var size: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The spatial reference of the tiling schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}
object TileInfoProperties {
  
  inline def apply(): TileInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileInfoProperties]
  }
  
  extension [Self <: TileInfoProperties](x: Self) {
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setFormat(
      value: png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc | pbf
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIsWrappable(value: Boolean): Self = StObject.set(x, "isWrappable", value.asInstanceOf[js.Any])
    
    inline def setIsWrappableUndefined: Self = StObject.set(x, "isWrappable", js.undefined)
    
    inline def setLods(value: js.Array[LODProperties]): Self = StObject.set(x, "lods", value.asInstanceOf[js.Any])
    
    inline def setLodsUndefined: Self = StObject.set(x, "lods", js.undefined)
    
    inline def setLodsVarargs(value: LODProperties*): Self = StObject.set(x, "lods", js.Array(value*))
    
    inline def setOrigin(value: PointProperties): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
