package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AuthoringInfoVisualVariable
import typingsJapgolly.arcgisJsApi.esri.AuthoringInfoVisualVariableConstructor
import typingsJapgolly.arcgisJsApi.esri.AuthoringInfoVisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersSupportAuthoringInfoVisualVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/support/AuthoringInfoVisualVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AuthoringInfoVisualVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/AuthoringInfoVisualVariable", JSImport.Namespace)
  @js.native
  /**
    * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html)
    */
  open class Class ()
    extends StObject
       with AuthoringInfoVisualVariable {
    def this(properties: AuthoringInfoVisualVariableProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AuthoringInfoVisualVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersSupportAuthoringInfoVisualVariableMod.foo` */
  override def _to: js.Object & AuthoringInfoVisualVariableConstructor = ^
}
