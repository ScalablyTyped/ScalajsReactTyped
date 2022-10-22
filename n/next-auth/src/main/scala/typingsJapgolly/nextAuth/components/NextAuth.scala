package typingsJapgolly.nextAuth.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextAuth.adaptersMod.Adapter
import typingsJapgolly.nextAuth.anon.PartialCallbacksOptionsPr
import typingsJapgolly.nextAuth.anon.PartialCookiesOptions
import typingsJapgolly.nextAuth.anon.PartialEventCallbacks
import typingsJapgolly.nextAuth.anon.PartialJWTOptions
import typingsJapgolly.nextAuth.anon.PartialPagesOptions
import typingsJapgolly.nextAuth.anon.PartialSessionOptions
import typingsJapgolly.nextAuth.coreTypesMod.NextAuthOptions
import typingsJapgolly.nextAuth.coreTypesMod.Theme
import typingsJapgolly.nextAuth.providersMod.Provider
import typingsJapgolly.nextAuth.utilsLoggerMod.LoggerInstance
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NextAuth {
  
  inline def apply(providers: js.Array[Provider]): Builder = {
    val __props = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NextAuthOptions]))
  }
  
  @JSImport("next-auth", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def adapter(value: Adapter[Boolean]): this.type = set("adapter", value.asInstanceOf[js.Any])
    
    inline def callbacks(value: PartialCallbacksOptionsPr): this.type = set("callbacks", value.asInstanceOf[js.Any])
    
    inline def cookies(value: PartialCookiesOptions): this.type = set("cookies", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def events(value: PartialEventCallbacks): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def jwt(value: PartialJWTOptions): this.type = set("jwt", value.asInstanceOf[js.Any])
    
    inline def logger(value: Partial[LoggerInstance]): this.type = set("logger", value.asInstanceOf[js.Any])
    
    inline def pages(value: PartialPagesOptions): this.type = set("pages", value.asInstanceOf[js.Any])
    
    inline def secret(value: String): this.type = set("secret", value.asInstanceOf[js.Any])
    
    inline def session(value: PartialSessionOptions): this.type = set("session", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useSecureCookies(value: Boolean): this.type = set("useSecureCookies", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NextAuthOptions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
