package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PointCloudStretchRenderer
import typingsJapgolly.arcgisJsApi.esri.PointCloudStretchRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.PointCloudStretchRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersPointCloudStretchRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudStretchRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudStretchRenderer", JSImport.Namespace)
  @js.native
  /**
    * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
    */
  open class Class ()
    extends StObject
       with PointCloudStretchRenderer {
    def this(properties: PointCloudStretchRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudStretchRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersPointCloudStretchRendererMod.foo` */
  override def _to: js.Object & PointCloudStretchRendererConstructor = ^
}
