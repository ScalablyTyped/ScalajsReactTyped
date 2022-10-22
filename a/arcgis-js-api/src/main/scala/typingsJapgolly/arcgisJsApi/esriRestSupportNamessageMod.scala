package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.NAMessage
import typingsJapgolly.arcgisJsApi.esri.NAMessageConstructor
import typingsJapgolly.arcgisJsApi.esri.NAMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportNamessageMod extends Shortcut {
  
  @JSImport("esri/rest/support/NAMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NAMessageConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/NAMessage", JSImport.Namespace)
  @js.native
  /**
    * Represents a message generated during the execution of a network analyst task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html)
    */
  open class Class ()
    extends StObject
       with NAMessage {
    def this(properties: NAMessageProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & NAMessageConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportNamessageMod.foo` */
  override def _to: js.Object & NAMessageConstructor = ^
}
