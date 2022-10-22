package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.RasterStretchRenderer
import typingsJapgolly.arcgisJsApi.esri.RasterStretchRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.RasterStretchRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersRasterStretchRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/RasterStretchRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RasterStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/RasterStretchRenderer", JSImport.Namespace)
  @js.native
  /**
    * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), and [WCSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html) based on the pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
    */
  open class Class ()
    extends StObject
       with RasterStretchRenderer {
    def this(properties: RasterStretchRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RasterStretchRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersRasterStretchRendererMod.foo` */
  override def _to: js.Object & RasterStretchRendererConstructor = ^
}
