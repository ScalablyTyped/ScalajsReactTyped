package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SizeVariable
import typingsJapgolly.arcgisJsApi.esri.SizeVariableConstructor
import typingsJapgolly.arcgisJsApi.esri.SizeVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersVisualVariablesSizeVariableMod extends Shortcut {
  
  @JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SizeVariableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/visualVariables/SizeVariable", JSImport.Namespace)
  @js.native
  /**
    * The size visual variable defines the size of individual features in a layer based on a numeric (often thematic) value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html)
    */
  open class Class ()
    extends StObject
       with SizeVariable {
    def this(properties: SizeVariableProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SizeVariableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersVisualVariablesSizeVariableMod.foo` */
  override def _to: js.Object & SizeVariableConstructor = ^
}
