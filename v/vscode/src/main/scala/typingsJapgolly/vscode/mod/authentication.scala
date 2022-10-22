package typingsJapgolly.vscode.mod

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.anon.AuthenticationGetSessionO
import typingsJapgolly.vscode.anon.AuthenticationGetSessionOClearSessionPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  @JSImport("vscode", "authentication")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSession(providerId: String, scopes: js.Array[String]): Thenable[js.UndefOr[AuthenticationSession]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[AuthenticationSession]]]
  inline def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionO): Thenable[AuthenticationSession] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[AuthenticationSession]]
  inline def getSession(
    providerId: String,
    scopes: js.Array[String],
    options: AuthenticationGetSessionOClearSessionPreference
  ): Thenable[AuthenticationSession] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[AuthenticationSession]]
  inline def getSession(providerId: String, scopes: js.Array[String], options: AuthenticationGetSessionOptions): Thenable[js.UndefOr[AuthenticationSession]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(providerId.asInstanceOf[js.Any], scopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[AuthenticationSession]]]
  
  @JSImport("vscode", "authentication.onDidChangeSessions")
  @js.native
  val onDidChangeSessions: Event[AuthenticationSessionsChangeEvent] = js.native
  
  inline def registerAuthenticationProvider(id: String, label: String, provider: AuthenticationProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationProvider")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  inline def registerAuthenticationProvider(
    id: String,
    label: String,
    provider: AuthenticationProvider,
    options: AuthenticationProviderOptions
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationProvider")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
