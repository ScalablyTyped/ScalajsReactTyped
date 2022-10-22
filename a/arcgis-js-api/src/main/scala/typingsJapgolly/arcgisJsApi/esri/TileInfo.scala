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

@js.native
trait TileInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The dots per inch (DPI) of the tiling scheme.
    *
    * @default 96
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#dpi)
    */
  var dpi: Double = js.native
  
  /**
    * Image format of the cached tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#format)
    */
  var format: png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc | pbf = js.native
  
  /**
    * Indicates if the tiling scheme supports wrap around.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#isWrappable)
    */
  var isWrappable: Boolean = js.native
  
  /**
    * An array of levels of detail that define the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods)
    */
  var lods: js.Array[LOD] = js.native
  
  /**
    * The tiling scheme origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#origin)
    */
  var origin: Point = js.native
  
  /**
    * Utility method used to convert a scale value to its corresponding zoom value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#scaleToZoom)
    */
  def scaleToZoom(scale: Double): Double = js.native
  
  /**
    * Size of tiles in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#size)
    */
  var size: js.Array[Double] = js.native
  
  /**
    * The spatial reference of the tiling schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * Utility method used to convert a zoom value to its corresponding scale value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#zoomToScale)
    */
  def zoomToScale(zoom: Double): Double = js.native
}
