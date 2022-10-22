package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DotDensityRenderer
import typingsJapgolly.arcgisJsApi.esri.DotDensityRendererConstructor
import typingsJapgolly.arcgisJsApi.esri.DotDensityRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersDotDensityRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DotDensityRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
  @js.native
  /**
    * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
    */
  open class Class ()
    extends StObject
       with DotDensityRenderer {
    def this(properties: DotDensityRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DotDensityRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersDotDensityRendererMod.foo` */
  override def _to: js.Object & DotDensityRendererConstructor = ^
}
