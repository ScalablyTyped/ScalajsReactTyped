package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PortalUser
import typingsJapgolly.arcgisJsApi.esri.PortalUserConstructor
import typingsJapgolly.arcgisJsApi.esri.PortalUserProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalUserMod extends Shortcut {
  
  @JSImport("esri/portal/PortalUser", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalUserConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalUser", JSImport.Namespace)
  @js.native
  /**
    * Represents a registered user of the [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalUser.html)
    */
  open class Class ()
    extends StObject
       with PortalUser {
    def this(properties: PortalUserProperties) = this()
  }
  
  type _To = js.Object & PortalUserConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPortalPortalUserMod.foo` */
  override def _to: js.Object & PortalUserConstructor = ^
}
