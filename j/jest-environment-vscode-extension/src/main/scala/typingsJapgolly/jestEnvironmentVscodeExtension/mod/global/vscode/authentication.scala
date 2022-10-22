package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.anon.AuthenticationGetSessionO
import typingsJapgolly.vscode.anon.AuthenticationGetSessionOClearSessionPreference
import typingsJapgolly.vscode.mod.AuthenticationGetSessionOptions
import typingsJapgolly.vscode.mod.AuthenticationProvider
import typingsJapgolly.vscode.mod.AuthenticationProviderOptions
import typingsJapgolly.vscode.mod.AuthenticationSession
import typingsJapgolly.vscode.mod.AuthenticationSessionsChangeEvent
import typingsJapgolly.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  @JSGlobal("vscode.authentication")
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
  
  @JSGlobal("vscode.authentication.onDidChangeSessions")
  @js.native
  val onDidChangeSessions: Event[AuthenticationSessionsChangeEvent] = js.native
  
  inline def registerAuthenticationProvider(id: String, label: String, provider: AuthenticationProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationProvider")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerAuthenticationProvider(
    id: String,
    label: String,
    provider: AuthenticationProvider,
    options: AuthenticationProviderOptions
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAuthenticationProvider")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
}
