package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PortalGroup
import typingsJapgolly.arcgisJsApi.esri.PortalGroupConstructor
import typingsJapgolly.arcgisJsApi.esri.PortalGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPortalPortalGroupMod extends Shortcut {
  
  @JSImport("esri/portal/PortalGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PortalGroupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/PortalGroup", JSImport.Namespace)
  @js.native
  /**
    * The group resource represents a group within the [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalGroup.html)
    */
  open class Class ()
    extends StObject
       with PortalGroup {
    def this(properties: PortalGroupProperties) = this()
  }
  
  type _To = js.Object & PortalGroupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPortalPortalGroupMod.foo` */
  override def _to: js.Object & PortalGroupConstructor = ^
}
