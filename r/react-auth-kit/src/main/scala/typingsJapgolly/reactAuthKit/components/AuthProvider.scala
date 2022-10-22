package typingsJapgolly.reactAuthKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAuthKit.distTypesMod.AuthProviderProps
import typingsJapgolly.reactAuthKit.distTypesMod.createRefreshParamInterface
import typingsJapgolly.reactAuthKit.reactAuthKitStrings.cookie
import typingsJapgolly.reactAuthKit.reactAuthKitStrings.localstorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthProvider {
  
  inline def apply(authName: String, authType: cookie | localstorage): Builder = {
    val __props = js.Dynamic.literal(authName = authName.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AuthProviderProps]))
  }
  
  @JSImport("react-auth-kit", "AuthProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cookieDomain(value: String): this.type = set("cookieDomain", value.asInstanceOf[js.Any])
    
    inline def cookieSecure(value: Boolean): this.type = set("cookieSecure", value.asInstanceOf[js.Any])
    
    inline def refresh(value: createRefreshParamInterface): this.type = set("refresh", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AuthProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
