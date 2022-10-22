package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ClassBreakInfo
import typingsJapgolly.arcgisJsApi.esri.ClassBreakInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.ClassBreakInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersSupportClassBreakInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/ClassBreakInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClassBreakInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/ClassBreakInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines a class break for a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ClassBreakInfo.html)
    */
  open class Class ()
    extends StObject
       with ClassBreakInfo {
    def this(properties: ClassBreakInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ClassBreakInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersSupportClassBreakInfoMod.foo` */
  override def _to: js.Object & ClassBreakInfoConstructor = ^
}
