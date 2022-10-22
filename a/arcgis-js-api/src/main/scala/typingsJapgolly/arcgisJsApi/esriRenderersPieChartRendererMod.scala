package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PieChartRenderer
import typingsJapgolly.arcgisJsApi.esri.PieChartRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.PieChartRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersPieChartRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PieChartRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PieChartRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PieChartRenderer", JSImport.Namespace)
  @js.native
  /**
    * PieChartRenderer allows you to create a pie chart for each feature in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html)
    */
  open class Class ()
    extends StObject
       with PieChartRenderer {
    def this(properties: PieChartRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PieChartRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersPieChartRendererMod.foo` */
  override def _to: js.Object & PieChartRendererConstructor = ^
}
