package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ColormapInfo
import typingsJapgolly.arcgisJsApi.esri.ColormapInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.ColormapInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersSupportColormapInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/ColormapInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColormapInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/ColormapInfo", JSImport.Namespace)
  @js.native
  /**
    * The ColormapInfo describes pixel value, RGB colors and labels to color the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html)
    */
  open class Class ()
    extends StObject
       with ColormapInfo {
    def this(properties: ColormapInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ColormapInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersSupportColormapInfoMod.foo` */
  override def _to: js.Object & ColormapInfoConstructor = ^
}
