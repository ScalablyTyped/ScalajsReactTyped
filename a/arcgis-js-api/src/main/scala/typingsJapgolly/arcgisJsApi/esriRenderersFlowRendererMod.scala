package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FlowRenderer
import typingsJapgolly.arcgisJsApi.esri.FlowRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.FlowRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersFlowRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/FlowRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FlowRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/FlowRenderer", JSImport.Namespace)
  @js.native
  /**
    * The FlowRenderer allows you to visualize your raster data with animated streamlines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html)
    */
  open class Class ()
    extends StObject
       with FlowRenderer {
    def this(properties: FlowRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FlowRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersFlowRendererMod.foo` */
  override def _to: js.Object & FlowRendererConstructor = ^
}
