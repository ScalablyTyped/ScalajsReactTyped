package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.RotationVariable
import typingsJapgolly.arcgisJsApi.esri.RotationVariableConstructor
import typingsJapgolly.arcgisJsApi.esri.RotationVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersVisualVariablesRotationVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/RotationVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RotationVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/RotationVariable", JSImport.Namespace)
  @js.native
  /**
    * The rotation visual variable defines how features rendered with [marker symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html) or [text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html) in a MapView are rotated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html)
    */
  open class Class ()
    extends StObject
       with RotationVariable {
    def this(properties: RotationVariableProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RotationVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersVisualVariablesRotationVariableMod.foo` */
  override def _to: js.Object & RotationVariableConstructor = ^
}
