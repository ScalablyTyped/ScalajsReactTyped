package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.IdentifyResult
import typingsJapgolly.arcgisJsApi.esri.IdentifyResultConstructor
import typingsJapgolly.arcgisJsApi.esri.IdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportIdentifyResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/IdentifyResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & IdentifyResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/IdentifyResult", JSImport.Namespace)
  @js.native
  /**
    * The result from [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyResult.html)
    */
  open class Class ()
    extends StObject
       with IdentifyResult {
    def this(properties: IdentifyResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & IdentifyResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportIdentifyResultMod.foo` */
  override def _to: js.Object & IdentifyResultConstructor = ^
}
