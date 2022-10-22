package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AuthoringInfo
import typingsJapgolly.arcgisJsApi.esri.AuthoringInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.AuthoringInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersSupportAuthoringInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/AuthoringInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AuthoringInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/AuthoringInfo", JSImport.Namespace)
  @js.native
  /**
    * Authoring information related to generating renderers and visual variables with the Smart Mapping methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html)
    */
  open class Class ()
    extends StObject
       with AuthoringInfo {
    def this(properties: AuthoringInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AuthoringInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersSupportAuthoringInfoMod.foo` */
  override def _to: js.Object & AuthoringInfoConstructor = ^
}
