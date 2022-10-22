package typingsJapgolly.reactAuthKit.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactAuthKit.distPrivateRouteMod.RequireAuthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RequireAuth {
  
  inline def apply(loginPath: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(loginPath = loginPath.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[RequireAuthProps]))
  }
  
  @JSImport("react-auth-kit", "RequireAuth")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RequireAuthProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
