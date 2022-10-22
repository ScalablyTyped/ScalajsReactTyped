package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.InternalAuthOptions
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.UserAuthenticationHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreAuthUserAuthenticatorMod {
  
  @JSImport("pusher-js/types/src/core/auth/user_authenticator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(authOptions: InternalAuthOptions): UserAuthenticationHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(authOptions.asInstanceOf[js.Any]).asInstanceOf[UserAuthenticationHandler]
}
