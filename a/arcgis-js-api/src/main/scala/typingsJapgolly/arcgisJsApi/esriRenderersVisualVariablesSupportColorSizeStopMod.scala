package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ColorSizeStop
import typingsJapgolly.arcgisJsApi.esri.ColorSizeStopConstructor
import typingsJapgolly.arcgisJsApi.esri.ColorSizeStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersVisualVariablesSupportColorSizeStopMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/support/ColorSizeStop", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorSizeStopConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/support/ColorSizeStop", JSImport.Namespace)
  @js.native
  /**
    * Defines how to data values should be represented in the [ColorSizeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html) with an associated color and size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorSizeStop.html)
    */
  open class Class ()
    extends StObject
       with ColorSizeStop {
    def this(properties: ColorSizeStopProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ColorSizeStopConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersVisualVariablesSupportColorSizeStopMod.foo` */
  override def _to: js.Object & ColorSizeStopConstructor = ^
}
