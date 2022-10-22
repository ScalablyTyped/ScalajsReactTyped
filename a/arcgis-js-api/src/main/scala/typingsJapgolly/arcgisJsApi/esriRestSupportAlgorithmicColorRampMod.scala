package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AlgorithmicColorRamp
import typingsJapgolly.arcgisJsApi.esri.AlgorithmicColorRampConstructor
import typingsJapgolly.arcgisJsApi.esri.AlgorithmicColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportAlgorithmicColorRampMod extends Shortcut {
  
  @JSImport("esri/rest/support/AlgorithmicColorRamp", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AlgorithmicColorRampConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/AlgorithmicColorRamp", JSImport.Namespace)
  @js.native
  /**
    * Creates a color ramp for use in a raster renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AlgorithmicColorRamp.html)
    */
  open class Class ()
    extends StObject
       with AlgorithmicColorRamp {
    def this(properties: AlgorithmicColorRampProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AlgorithmicColorRampConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportAlgorithmicColorRampMod.foo` */
  override def _to: js.Object & AlgorithmicColorRampConstructor = ^
}
