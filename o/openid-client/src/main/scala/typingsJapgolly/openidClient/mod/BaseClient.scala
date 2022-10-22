package typingsJapgolly.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.http2Mod.Http2ServerRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.openidClient.anon.Body
import typingsJapgolly.openidClient.anon.DPoP
import typingsJapgolly.openidClient.anon.Dictkey
import typingsJapgolly.openidClient.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseClient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  def authorizationUrl(): String = js.native
  def authorizationUrl(parameters: AuthorizationParameters): String = js.native
  
  def callback(redirectUri: String, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def callback(redirectUri: String, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def callback(redirectUri: String, parameters: CallbackParamsType, checks: OpenIDCallbackChecks): js.Promise[TokenSet] = js.native
  def callback(
    redirectUri: String,
    parameters: CallbackParamsType,
    checks: OpenIDCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  def callback(redirectUri: Unit, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def callback(redirectUri: Unit, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def callback(redirectUri: Unit, parameters: CallbackParamsType, checks: OpenIDCallbackChecks): js.Promise[TokenSet] = js.native
  def callback(
    redirectUri: Unit,
    parameters: CallbackParamsType,
    checks: OpenIDCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  
  def callbackParams(input: String): CallbackParamsType = js.native
  def callbackParams(input: Http2ServerRequest): CallbackParamsType = js.native
  def callbackParams(input: IncomingMessage): CallbackParamsType = js.native
  
  def deviceAuthorization(): js.Promise[DeviceFlowHandle[BaseClient]] = js.native
  def deviceAuthorization(parameters: Unit, extras: DeviceAuthorizationExtras): js.Promise[DeviceFlowHandle[BaseClient]] = js.native
  def deviceAuthorization(parameters: DeviceAuthorizationParameters): js.Promise[DeviceFlowHandle[BaseClient]] = js.native
  def deviceAuthorization(parameters: DeviceAuthorizationParameters, extras: DeviceAuthorizationExtras): js.Promise[DeviceFlowHandle[BaseClient]] = js.native
  
  def endSessionUrl(): String = js.native
  def endSessionUrl(parameters: EndSessionParameters): String = js.native
  
  def grant(body: GrantBody): js.Promise[TokenSet] = js.native
  def grant(body: GrantBody, extras: GrantExtras): js.Promise[TokenSet] = js.native
  
  def introspect(token: String): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: Unit, extras: IntrospectExtras): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: TokenTypeHint): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: TokenTypeHint, extras: IntrospectExtras): js.Promise[IntrospectionResponse] = js.native
  
  var issuer: Issuer[this.type] = js.native
  
  var metadata: ClientMetadata = js.native
  
  def oauthCallback(redirectUri: String, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: String, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: String, parameters: CallbackParamsType, checks: OAuthCallbackChecks): js.Promise[TokenSet] = js.native
  def oauthCallback(
    redirectUri: String,
    parameters: CallbackParamsType,
    checks: OAuthCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: Unit, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: Unit, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: Unit, parameters: CallbackParamsType, checks: OAuthCallbackChecks): js.Promise[TokenSet] = js.native
  def oauthCallback(
    redirectUri: Unit,
    parameters: CallbackParamsType,
    checks: OAuthCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  
  def pushedAuthorizationRequest(): js.Promise[Dictkey] = js.native
  def pushedAuthorizationRequest(parameters: Unit, extras: PushedAuthorizationRequestExtras): js.Promise[Dictkey] = js.native
  def pushedAuthorizationRequest(parameters: AuthorizationParameters): js.Promise[Dictkey] = js.native
  def pushedAuthorizationRequest(parameters: AuthorizationParameters, extras: PushedAuthorizationRequestExtras): js.Promise[Dictkey] = js.native
  
  def refresh(refreshToken: String): js.Promise[TokenSet] = js.native
  def refresh(refreshToken: String, extras: RefreshExtras): js.Promise[TokenSet] = js.native
  def refresh(refreshToken: TokenSet): js.Promise[TokenSet] = js.native
  def refresh(refreshToken: TokenSet, extras: RefreshExtras): js.Promise[TokenSet] = js.native
  
  def requestObject(payload: RequestObjectPayload): js.Promise[String] = js.native
  
  def requestResource(resourceUrl: String, accessToken: String): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: String, accessToken: String, options: Body): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: String, accessToken: TokenSet): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: String, accessToken: TokenSet, options: Body): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: URL_, accessToken: String): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: URL_, accessToken: String, options: Body): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: URL_, accessToken: TokenSet): `0` & IncomingMessage = js.native
  def requestResource(resourceUrl: URL_, accessToken: TokenSet, options: Body): `0` & IncomingMessage = js.native
  
  def revoke(token: String): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: Unit, extras: RevokeExtras): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: TokenTypeHint): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: TokenTypeHint, extras: RevokeExtras): js.Promise[Unit] = js.native
  
  var static: Any = js.native
  
  def userinfo[TUserInfo /* <: js.Object */, TAddress /* <: js.Object */](accessToken: String): js.Promise[UserinfoResponse[TUserInfo, TAddress]] = js.native
  def userinfo[TUserInfo /* <: js.Object */, TAddress /* <: js.Object */](accessToken: String, options: DPoP): js.Promise[UserinfoResponse[TUserInfo, TAddress]] = js.native
  def userinfo[TUserInfo /* <: js.Object */, TAddress /* <: js.Object */](accessToken: TokenSet): js.Promise[UserinfoResponse[TUserInfo, TAddress]] = js.native
  def userinfo[TUserInfo /* <: js.Object */, TAddress /* <: js.Object */](accessToken: TokenSet, options: DPoP): js.Promise[UserinfoResponse[TUserInfo, TAddress]] = js.native
}
