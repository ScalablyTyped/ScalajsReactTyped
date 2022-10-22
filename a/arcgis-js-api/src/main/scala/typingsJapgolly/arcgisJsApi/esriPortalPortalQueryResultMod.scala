package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PortalQueryResult
import typingsJapgolly.arcgisJsApi.esri.PortalQueryResultConstructor
import typingsJapgolly.arcgisJsApi.esri.PortalQueryResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalQueryResultMod extends Shortcut {
  
  @JSImport("esri/portal/PortalQueryResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalQueryResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalQueryResult", JSImport.Namespace)
  @js.native
  /**
    * Represents the result object returned from a portal query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalQueryResult.html)
    */
  open class Class ()
    extends StObject
       with PortalQueryResult {
    def this(properties: PortalQueryResultProperties) = this()
  }
  
  type _To = js.Object & PortalQueryResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPortalPortalQueryResultMod.foo` */
  override def _to: js.Object & PortalQueryResultConstructor = ^
}
