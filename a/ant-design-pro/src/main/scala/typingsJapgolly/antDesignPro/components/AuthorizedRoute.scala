package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignPro.libAuthorizedAuthorizedRouteMod.IAuthorizedRouteProps
import typingsJapgolly.antDesignPro.libAuthorizedAuthorizedRouteMod.authority
import typingsJapgolly.antDesignPro.libAuthorizedAuthorizedRouteMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthorizedRoute {
  
  inline def apply(authority: authority): Default[default] = {
    val __props = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[IAuthorizedRouteProps]))
  }
  
  @JSImport("ant-design-pro/lib/Authorized/AuthorizedRoute", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IAuthorizedRouteProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
