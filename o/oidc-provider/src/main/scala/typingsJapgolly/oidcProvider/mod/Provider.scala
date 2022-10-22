package typingsJapgolly.oidcProvider.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.koa.mod.Application
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koa.mod.^
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.http2Mod.Http2ServerRequest
import typingsJapgolly.node.http2Mod.Http2ServerResponse
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.netMod.ListenOptions
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.oidcProvider.anon.Aud
import typingsJapgolly.oidcProvider.anon.AuthTime
import typingsJapgolly.oidcProvider.anon.ClientId
import typingsJapgolly.oidcProvider.anon.CodeChallenge
import typingsJapgolly.oidcProvider.anon.Ctx
import typingsJapgolly.oidcProvider.anon.DeviceInfo
import typingsJapgolly.oidcProvider.anon.ExpiresIn
import typingsJapgolly.oidcProvider.anon.FnCall
import typingsJapgolly.oidcProvider.anon.MergeWithLastSubmission
import typingsJapgolly.oidcProvider.anon.Request
import typingsJapgolly.oidcProvider.anon.TypeofAccessToken
import typingsJapgolly.oidcProvider.anon.TypeofAuthorizationCode
import typingsJapgolly.oidcProvider.anon.TypeofBackchannelAuthenti
import typingsJapgolly.oidcProvider.anon.TypeofBaseToken
import typingsJapgolly.oidcProvider.anon.TypeofClient
import typingsJapgolly.oidcProvider.anon.TypeofDeviceCode
import typingsJapgolly.oidcProvider.anon.TypeofIdToken
import typingsJapgolly.oidcProvider.anon.TypeofRefreshToken
import typingsJapgolly.oidcProvider.anon.TypeofReplayDetection
import typingsJapgolly.oidcProvider.anon.TypeofSession
import typingsJapgolly.oidcProvider.mod.errors.OIDCProviderError
import typingsJapgolly.oidcProvider.oidcProviderStrings.access_tokenDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.access_tokenDotissued
import typingsJapgolly.oidcProvider.oidcProviderStrings.access_tokenDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.authorizationDotaccepted
import typingsJapgolly.oidcProvider.oidcProviderStrings.authorizationDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.authorizationDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.authorization_codeDotconsumed
import typingsJapgolly.oidcProvider.oidcProviderStrings.authorization_codeDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.authorization_codeDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.backchannelDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.backchannelDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.backchannel_authentication_requestDotconsumed
import typingsJapgolly.oidcProvider.oidcProviderStrings.backchannel_authentication_requestDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.backchannel_authentication_requestDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.client_credentialsDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.client_credentialsDotissued
import typingsJapgolly.oidcProvider.oidcProviderStrings.client_credentialsDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.device_codeDotconsumed
import typingsJapgolly.oidcProvider.oidcProviderStrings.device_codeDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.device_codeDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.discoveryDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.end_sessionDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.end_sessionDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.grantDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.grantDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.grantDotrevoked
import typingsJapgolly.oidcProvider.oidcProviderStrings.grantDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.grantDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.interactionDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.interactionDotended
import typingsJapgolly.oidcProvider.oidcProviderStrings.interactionDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.interactionDotstarted
import typingsJapgolly.oidcProvider.oidcProviderStrings.introspectionDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.jwksDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.pushed_authorization_requestDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.pushed_authorization_requestDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.pushed_authorization_requestDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.pushed_authorization_requestDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.refresh_tokenDotconsumed
import typingsJapgolly.oidcProvider.oidcProviderStrings.refresh_tokenDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.refresh_tokenDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_access_tokenDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_access_tokenDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_createDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_createDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_deleteDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_deleteDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_readDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_updateDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.registration_updateDotsuccess
import typingsJapgolly.oidcProvider.oidcProviderStrings.replay_detectionDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.replay_detectionDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.revocationDoterror
import typingsJapgolly.oidcProvider.oidcProviderStrings.server_error
import typingsJapgolly.oidcProvider.oidcProviderStrings.sessionDotdestroyed
import typingsJapgolly.oidcProvider.oidcProviderStrings.sessionDotsaved
import typingsJapgolly.oidcProvider.oidcProviderStrings.userinfoDoterror
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oidc-provider", "Provider")
@js.native
open class Provider protected () extends EventEmitter {
  def this(issuer: String) = this()
  def this(issuer: String, configuration: Configuration) = this()
  
  val AccessToken: TypeofAccessToken & (Instantiable1[/* properties */ Aud, typingsJapgolly.oidcProvider.mod.AccessToken]) = js.native
  
  val Account: typingsJapgolly.oidcProvider.anon.FindAccount = js.native
  
  val AuthorizationCode: TypeofAuthorizationCode & (Instantiable1[/* properties */ CodeChallenge, typingsJapgolly.oidcProvider.mod.AuthorizationCode]) = js.native
  
  val BackchannelAuthenticationRequest: TypeofBackchannelAuthenti & (Instantiable1[
    /* properties */ js.UndefOr[ClientId], 
    typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest
  ]) = js.native
  
  val BaseToken: TypeofBaseToken & Instantiable0[typingsJapgolly.oidcProvider.mod.BaseToken] = js.native
  
  val Client: TypeofClient & Instantiable0[typingsJapgolly.oidcProvider.mod.Client] = js.native
  
  val ClientCredentials: Instantiable1[
    /* properties */ typingsJapgolly.oidcProvider.anon.ResourceServer, 
    typingsJapgolly.oidcProvider.mod.ClientCredentials
  ] = js.native
  
  val DeviceCode: TypeofDeviceCode & (Instantiable1[/* properties */ DeviceInfo, typingsJapgolly.oidcProvider.mod.DeviceCode]) = js.native
  
  // tslint:enable:unified-signatures
  val Grant: Instantiable1[/* properties */ js.UndefOr[ClientId], typingsJapgolly.oidcProvider.mod.Grant] = js.native
  
  val IdToken: TypeofIdToken & (Instantiable2[
    /* claims */ UnknownObject, 
    /* context */ js.UndefOr[Ctx], 
    typingsJapgolly.oidcProvider.mod.IdToken
  ]) = js.native
  
  val InitialAccessToken: Instantiable1[
    /* properties */ js.UndefOr[ExpiresIn], 
    typingsJapgolly.oidcProvider.mod.InitialAccessToken
  ] = js.native
  
  val Interaction: Instantiable0[typingsJapgolly.oidcProvider.mod.Interaction] = js.native
  
  val OIDCContext: Instantiable1[/* ctx */ Context, typingsJapgolly.oidcProvider.mod.OIDCContext] = js.native
  
  val PushedAuthorizationRequest: Instantiable1[
    /* properties */ Request, 
    typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest
  ] = js.native
  
  val RefreshToken: TypeofRefreshToken & (Instantiable1[
    /* properties */ typingsJapgolly.oidcProvider.anon.Client, 
    typingsJapgolly.oidcProvider.mod.RefreshToken
  ]) = js.native
  
  val RegistrationAccessToken: Instantiable0[typingsJapgolly.oidcProvider.mod.RegistrationAccessToken] = js.native
  
  val ReplayDetection: TypeofReplayDetection & Instantiable0[typingsJapgolly.oidcProvider.mod.ReplayDetection] = js.native
  
  val Session: TypeofSession & Instantiable0[typingsJapgolly.oidcProvider.mod.Session] = js.native
  
  @JSName("addListener")
  def addListener_accesstokendestroyed(
    event: access_tokenDotdestroyed,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_accesstokenissued(
    event: access_tokenDotissued,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_accesstokensaved(
    event: access_tokenDotsaved,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_authorizationaccepted(event: authorizationDotaccepted, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_authorizationcodeconsumed(
    event: authorization_codeDotconsumed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_authorizationcodedestroyed(
    event: authorization_codeDotdestroyed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_authorizationcodesaved(
    event: authorization_codeDotsaved,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_authorizationerror(
    event: authorizationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_authorizationsuccess(event: authorizationDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_backchannelauthenticationrequestconsumed(
    event: backchannel_authentication_requestDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_backchannelauthenticationrequestdestroyed(
    event: backchannel_authentication_requestDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_backchannelauthenticationrequestsaved(
    event: backchannel_authentication_requestDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_backchannelerror(
    event: backchannelDoterror,
    listener: js.Function5[
      /* ctx */ KoaContextWithOIDC, 
      /* err */ js.Error, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_backchannelsuccess(
    event: backchannelDotsuccess,
    listener: js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_clientcredentialsdestroyed(
    event: client_credentialsDotdestroyed,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_clientcredentialsissued(
    event: client_credentialsDotissued,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_clientcredentialssaved(
    event: client_credentialsDotsaved,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_devicecodeconsumed(
    event: device_codeDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_devicecodedestroyed(
    event: device_codeDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_devicecodesaved(
    event: device_codeDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_discoveryerror(
    event: discoveryDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_endsessionerror(
    event: end_sessionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_endsessionsuccess(event: end_sessionDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_grantdestroyed(
    event: grantDotdestroyed,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_granterror(
    event: grantDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_grantrevoked(
    event: grantDotrevoked,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* grantId */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_grantsaved(
    event: grantDotsaved,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_grantsuccess(event: grantDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_interactiondestroyed(
    event: interactionDotdestroyed,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_interactionended(event: interactionDotended, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_interactionsaved(
    event: interactionDotsaved,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_interactionstarted(
    event: interactionDotstarted,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* interaction */ PromptDetail, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_introspectionerror(
    event: introspectionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_jwkserror(
    event: jwksDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pushedauthorizationrequestdestroyed(
    event: pushed_authorization_requestDotdestroyed,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pushedauthorizationrequesterror(
    event: pushed_authorization_requestDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pushedauthorizationrequestsaved(
    event: pushed_authorization_requestDotsaved,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pushedauthorizationrequestsuccess(
    event: pushed_authorization_requestDotsuccess,
    listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_refreshtokenconsumed(
    event: refresh_tokenDotconsumed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_refreshtokendestroyed(
    event: refresh_tokenDotdestroyed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_refreshtokensaved(
    event: refresh_tokenDotsaved,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationaccesstokendestroyed(
    event: registration_access_tokenDotdestroyed,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationaccesstokensaved(
    event: registration_access_tokenDotsaved,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationcreateerror(
    event: registration_createDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationcreatesuccess(
    event: registration_createDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationdeleteerror(
    event: registration_deleteDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationdeletesuccess(
    event: registration_deleteDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationreaderror(
    event: registration_readDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationupdateerror(
    event: registration_updateDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationupdatesuccess(
    event: registration_updateDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_replaydetectiondestroyed(
    event: replay_detectionDotdestroyed,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_replaydetectionsaved(
    event: replay_detectionDotsaved,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_revocationerror(
    event: revocationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_servererror(
    event: server_error,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ js.Error, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_sessiondestroyed(
    event: sessionDotdestroyed,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_sessionsaved(
    event: sessionDotsaved,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_userinfoerror(
    event: userinfoDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  
  val app: ^[DefaultState, DefaultContext] = js.native
  
  def backchannelResult(request: String, result: String): js.Promise[Unit] = js.native
  def backchannelResult(request: String, result: String, opts: AuthTime): js.Promise[Unit] = js.native
  def backchannelResult(request: String, result: typingsJapgolly.oidcProvider.mod.Grant): js.Promise[Unit] = js.native
  def backchannelResult(request: String, result: typingsJapgolly.oidcProvider.mod.Grant, opts: AuthTime): js.Promise[Unit] = js.native
  def backchannelResult(request: String, result: OIDCProviderError): js.Promise[Unit] = js.native
  def backchannelResult(request: String, result: OIDCProviderError, opts: AuthTime): js.Promise[Unit] = js.native
  def backchannelResult(request: typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest, result: String): js.Promise[Unit] = js.native
  def backchannelResult(
    request: typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest,
    result: String,
    opts: AuthTime
  ): js.Promise[Unit] = js.native
  def backchannelResult(
    request: typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest,
    result: typingsJapgolly.oidcProvider.mod.Grant
  ): js.Promise[Unit] = js.native
  def backchannelResult(
    request: typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest,
    result: typingsJapgolly.oidcProvider.mod.Grant,
    opts: AuthTime
  ): js.Promise[Unit] = js.native
  def backchannelResult(
    request: typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest,
    result: OIDCProviderError
  ): js.Promise[Unit] = js.native
  def backchannelResult(
    request: typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest,
    result: OIDCProviderError,
    opts: AuthTime
  ): js.Promise[Unit] = js.native
  
  def callback(): js.Function2[
    /* req */ IncomingMessage | Http2ServerRequest, 
    /* res */ ServerResponse[IncomingMessage] | Http2ServerResponse, 
    Unit
  ] = js.native
  @JSName("callback")
  var callback_Original: js.Function0[
    js.Function2[
      /* req */ IncomingMessage | Http2ServerRequest, 
      /* res */ ServerResponse[IncomingMessage] | Http2ServerResponse, 
      Unit
    ]
  ] = js.native
  
  def interactionDetails(req: Http2ServerRequest, res: Http2ServerResponse): js.Promise[typingsJapgolly.oidcProvider.mod.Interaction] = js.native
  def interactionDetails(req: Http2ServerRequest, res: ServerResponse[IncomingMessage]): js.Promise[typingsJapgolly.oidcProvider.mod.Interaction] = js.native
  def interactionDetails(req: IncomingMessage, res: Http2ServerResponse): js.Promise[typingsJapgolly.oidcProvider.mod.Interaction] = js.native
  def interactionDetails(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[typingsJapgolly.oidcProvider.mod.Interaction] = js.native
  
  def interactionFinished(req: Http2ServerRequest, res: Http2ServerResponse, result: InteractionResults): js.Promise[Unit] = js.native
  def interactionFinished(
    req: Http2ServerRequest,
    res: Http2ServerResponse,
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[Unit] = js.native
  def interactionFinished(req: Http2ServerRequest, res: ServerResponse[IncomingMessage], result: InteractionResults): js.Promise[Unit] = js.native
  def interactionFinished(
    req: Http2ServerRequest,
    res: ServerResponse[IncomingMessage],
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[Unit] = js.native
  def interactionFinished(req: IncomingMessage, res: Http2ServerResponse, result: InteractionResults): js.Promise[Unit] = js.native
  def interactionFinished(
    req: IncomingMessage,
    res: Http2ServerResponse,
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[Unit] = js.native
  def interactionFinished(req: IncomingMessage, res: ServerResponse[IncomingMessage], result: InteractionResults): js.Promise[Unit] = js.native
  def interactionFinished(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[Unit] = js.native
  
  def interactionResult(req: Http2ServerRequest, res: Http2ServerResponse, result: InteractionResults): js.Promise[String] = js.native
  def interactionResult(
    req: Http2ServerRequest,
    res: Http2ServerResponse,
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[String] = js.native
  def interactionResult(req: Http2ServerRequest, res: ServerResponse[IncomingMessage], result: InteractionResults): js.Promise[String] = js.native
  def interactionResult(
    req: Http2ServerRequest,
    res: ServerResponse[IncomingMessage],
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[String] = js.native
  def interactionResult(req: IncomingMessage, res: Http2ServerResponse, result: InteractionResults): js.Promise[String] = js.native
  def interactionResult(
    req: IncomingMessage,
    res: Http2ServerResponse,
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[String] = js.native
  def interactionResult(req: IncomingMessage, res: ServerResponse[IncomingMessage], result: InteractionResults): js.Promise[String] = js.native
  def interactionResult(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    result: InteractionResults,
    options: MergeWithLastSubmission
  ): js.Promise[String] = js.native
  
  val issuer: String = js.native
  
  def listen(): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(handle: Any): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(handle: Any, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(handle: Any, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(handle: Any, backlog: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(handle: Any, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(options: ListenOptions): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(path: String): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(path: String, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(path: String, backlog: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(path: String, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: String): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: String, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: String, backlog: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: Unit, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, hostname: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: String): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: String, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: String, backlog: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: Unit, backlog: Double): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  def listen(port: Unit, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ] = js.native
  @JSName("listen")
  var listen_Original: FnCall = js.native
  
  @JSName("on")
  def on_accesstokendestroyed(
    event: access_tokenDotdestroyed,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_accesstokenissued(
    event: access_tokenDotissued,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_accesstokensaved(
    event: access_tokenDotsaved,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authorizationaccepted(event: authorizationDotaccepted, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("on")
  def on_authorizationcodeconsumed(
    event: authorization_codeDotconsumed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authorizationcodedestroyed(
    event: authorization_codeDotdestroyed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authorizationcodesaved(
    event: authorization_codeDotsaved,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authorizationerror(
    event: authorizationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authorizationsuccess(event: authorizationDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("on")
  def on_backchannelauthenticationrequestconsumed(
    event: backchannel_authentication_requestDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_backchannelauthenticationrequestdestroyed(
    event: backchannel_authentication_requestDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_backchannelauthenticationrequestsaved(
    event: backchannel_authentication_requestDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_backchannelerror(
    event: backchannelDoterror,
    listener: js.Function5[
      /* ctx */ KoaContextWithOIDC, 
      /* err */ js.Error, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_backchannelsuccess(
    event: backchannelDotsuccess,
    listener: js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_clientcredentialsdestroyed(
    event: client_credentialsDotdestroyed,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_clientcredentialsissued(
    event: client_credentialsDotissued,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_clientcredentialssaved(
    event: client_credentialsDotsaved,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_devicecodeconsumed(
    event: device_codeDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_devicecodedestroyed(
    event: device_codeDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_devicecodesaved(
    event: device_codeDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_discoveryerror(
    event: discoveryDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endsessionerror(
    event: end_sessionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endsessionsuccess(event: end_sessionDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("on")
  def on_grantdestroyed(
    event: grantDotdestroyed,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_granterror(
    event: grantDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_grantrevoked(
    event: grantDotrevoked,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* grantId */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_grantsaved(
    event: grantDotsaved,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_grantsuccess(event: grantDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("on")
  def on_interactiondestroyed(
    event: interactionDotdestroyed,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_interactionended(event: interactionDotended, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("on")
  def on_interactionsaved(
    event: interactionDotsaved,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_interactionstarted(
    event: interactionDotstarted,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* interaction */ PromptDetail, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_introspectionerror(
    event: introspectionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_jwkserror(
    event: jwksDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pushedauthorizationrequestdestroyed(
    event: pushed_authorization_requestDotdestroyed,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pushedauthorizationrequesterror(
    event: pushed_authorization_requestDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pushedauthorizationrequestsaved(
    event: pushed_authorization_requestDotsaved,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pushedauthorizationrequestsuccess(
    event: pushed_authorization_requestDotsuccess,
    listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_refreshtokenconsumed(
    event: refresh_tokenDotconsumed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_refreshtokendestroyed(
    event: refresh_tokenDotdestroyed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_refreshtokensaved(
    event: refresh_tokenDotsaved,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registrationaccesstokendestroyed(
    event: registration_access_tokenDotdestroyed,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_registrationaccesstokensaved(
    event: registration_access_tokenDotsaved,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_registrationcreateerror(
    event: registration_createDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registrationcreatesuccess(
    event: registration_createDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_registrationdeleteerror(
    event: registration_deleteDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registrationdeletesuccess(
    event: registration_deleteDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_registrationreaderror(
    event: registration_readDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registrationupdateerror(
    event: registration_updateDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registrationupdatesuccess(
    event: registration_updateDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_replaydetectiondestroyed(
    event: replay_detectionDotdestroyed,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_replaydetectionsaved(
    event: replay_detectionDotsaved,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_revocationerror(
    event: revocationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_servererror(
    event: server_error,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ js.Error, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sessiondestroyed(
    event: sessionDotdestroyed,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sessionsaved(
    event: sessionDotsaved,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userinfoerror(
    event: userinfoDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_accesstokendestroyed(
    event: access_tokenDotdestroyed,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_accesstokenissued(
    event: access_tokenDotissued,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_accesstokensaved(
    event: access_tokenDotsaved,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authorizationaccepted(event: authorizationDotaccepted, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("once")
  def once_authorizationcodeconsumed(
    event: authorization_codeDotconsumed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authorizationcodedestroyed(
    event: authorization_codeDotdestroyed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authorizationcodesaved(
    event: authorization_codeDotsaved,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authorizationerror(
    event: authorizationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authorizationsuccess(event: authorizationDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("once")
  def once_backchannelauthenticationrequestconsumed(
    event: backchannel_authentication_requestDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_backchannelauthenticationrequestdestroyed(
    event: backchannel_authentication_requestDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_backchannelauthenticationrequestsaved(
    event: backchannel_authentication_requestDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_backchannelerror(
    event: backchannelDoterror,
    listener: js.Function5[
      /* ctx */ KoaContextWithOIDC, 
      /* err */ js.Error, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_backchannelsuccess(
    event: backchannelDotsuccess,
    listener: js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_clientcredentialsdestroyed(
    event: client_credentialsDotdestroyed,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_clientcredentialsissued(
    event: client_credentialsDotissued,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_clientcredentialssaved(
    event: client_credentialsDotsaved,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_devicecodeconsumed(
    event: device_codeDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_devicecodedestroyed(
    event: device_codeDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_devicecodesaved(
    event: device_codeDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_discoveryerror(
    event: discoveryDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endsessionerror(
    event: end_sessionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endsessionsuccess(event: end_sessionDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("once")
  def once_grantdestroyed(
    event: grantDotdestroyed,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_granterror(
    event: grantDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_grantrevoked(
    event: grantDotrevoked,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* grantId */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_grantsaved(
    event: grantDotsaved,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_grantsuccess(event: grantDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("once")
  def once_interactiondestroyed(
    event: interactionDotdestroyed,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_interactionended(event: interactionDotended, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("once")
  def once_interactionsaved(
    event: interactionDotsaved,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_interactionstarted(
    event: interactionDotstarted,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* interaction */ PromptDetail, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_introspectionerror(
    event: introspectionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_jwkserror(
    event: jwksDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pushedauthorizationrequestdestroyed(
    event: pushed_authorization_requestDotdestroyed,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pushedauthorizationrequesterror(
    event: pushed_authorization_requestDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pushedauthorizationrequestsaved(
    event: pushed_authorization_requestDotsaved,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pushedauthorizationrequestsuccess(
    event: pushed_authorization_requestDotsuccess,
    listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_refreshtokenconsumed(
    event: refresh_tokenDotconsumed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_refreshtokendestroyed(
    event: refresh_tokenDotdestroyed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_refreshtokensaved(
    event: refresh_tokenDotsaved,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationaccesstokendestroyed(
    event: registration_access_tokenDotdestroyed,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_registrationaccesstokensaved(
    event: registration_access_tokenDotsaved,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_registrationcreateerror(
    event: registration_createDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationcreatesuccess(
    event: registration_createDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_registrationdeleteerror(
    event: registration_deleteDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationdeletesuccess(
    event: registration_deleteDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_registrationreaderror(
    event: registration_readDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationupdateerror(
    event: registration_updateDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationupdatesuccess(
    event: registration_updateDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_replaydetectiondestroyed(
    event: replay_detectionDotdestroyed,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_replaydetectionsaved(
    event: replay_detectionDotsaved,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_revocationerror(
    event: revocationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_servererror(
    event: server_error,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ js.Error, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sessiondestroyed(
    event: sessionDotdestroyed,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sessionsaved(
    event: sessionDotsaved,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_userinfoerror(
    event: userinfoDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_accesstokendestroyed(
    event: access_tokenDotdestroyed,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_accesstokenissued(
    event: access_tokenDotissued,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_accesstokensaved(
    event: access_tokenDotsaved,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_authorizationaccepted(event: authorizationDotaccepted, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_authorizationcodeconsumed(
    event: authorization_codeDotconsumed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_authorizationcodedestroyed(
    event: authorization_codeDotdestroyed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_authorizationcodesaved(
    event: authorization_codeDotsaved,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_authorizationerror(
    event: authorizationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_authorizationsuccess(event: authorizationDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_backchannelauthenticationrequestconsumed(
    event: backchannel_authentication_requestDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_backchannelauthenticationrequestdestroyed(
    event: backchannel_authentication_requestDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_backchannelauthenticationrequestsaved(
    event: backchannel_authentication_requestDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_backchannelerror(
    event: backchannelDoterror,
    listener: js.Function5[
      /* ctx */ KoaContextWithOIDC, 
      /* err */ js.Error, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_backchannelsuccess(
    event: backchannelDotsuccess,
    listener: js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_clientcredentialsdestroyed(
    event: client_credentialsDotdestroyed,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_clientcredentialsissued(
    event: client_credentialsDotissued,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_clientcredentialssaved(
    event: client_credentialsDotsaved,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_devicecodeconsumed(
    event: device_codeDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_devicecodedestroyed(
    event: device_codeDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_devicecodesaved(
    event: device_codeDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_discoveryerror(
    event: discoveryDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_endsessionerror(
    event: end_sessionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_endsessionsuccess(event: end_sessionDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_grantdestroyed(
    event: grantDotdestroyed,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_granterror(
    event: grantDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_grantrevoked(
    event: grantDotrevoked,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* grantId */ String, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_grantsaved(
    event: grantDotsaved,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_grantsuccess(event: grantDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_interactiondestroyed(
    event: interactionDotdestroyed,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_interactionended(event: interactionDotended, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_interactionsaved(
    event: interactionDotsaved,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_interactionstarted(
    event: interactionDotstarted,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* interaction */ PromptDetail, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_introspectionerror(
    event: introspectionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_jwkserror(
    event: jwksDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pushedauthorizationrequestdestroyed(
    event: pushed_authorization_requestDotdestroyed,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pushedauthorizationrequesterror(
    event: pushed_authorization_requestDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pushedauthorizationrequestsaved(
    event: pushed_authorization_requestDotsaved,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pushedauthorizationrequestsuccess(
    event: pushed_authorization_requestDotsuccess,
    listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_refreshtokenconsumed(
    event: refresh_tokenDotconsumed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_refreshtokendestroyed(
    event: refresh_tokenDotdestroyed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_refreshtokensaved(
    event: refresh_tokenDotsaved,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationaccesstokendestroyed(
    event: registration_access_tokenDotdestroyed,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationaccesstokensaved(
    event: registration_access_tokenDotsaved,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationcreateerror(
    event: registration_createDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationcreatesuccess(
    event: registration_createDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationdeleteerror(
    event: registration_deleteDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationdeletesuccess(
    event: registration_deleteDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationreaderror(
    event: registration_readDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationupdateerror(
    event: registration_updateDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_registrationupdatesuccess(
    event: registration_updateDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_replaydetectiondestroyed(
    event: replay_detectionDotdestroyed,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_replaydetectionsaved(
    event: replay_detectionDotsaved,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_revocationerror(
    event: revocationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_servererror(
    event: server_error,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ js.Error, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_sessiondestroyed(
    event: sessionDotdestroyed,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_sessionsaved(
    event: sessionDotsaved,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_userinfoerror(
    event: userinfoDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_accesstokendestroyed(
    event: access_tokenDotdestroyed,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_accesstokenissued(
    event: access_tokenDotissued,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_accesstokensaved(
    event: access_tokenDotsaved,
    listener: js.Function1[/* accessToken */ typingsJapgolly.oidcProvider.mod.AccessToken, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_authorizationaccepted(event: authorizationDotaccepted, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_authorizationcodeconsumed(
    event: authorization_codeDotconsumed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_authorizationcodedestroyed(
    event: authorization_codeDotdestroyed,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_authorizationcodesaved(
    event: authorization_codeDotsaved,
    listener: js.Function1[/* authorizationCode */ typingsJapgolly.oidcProvider.mod.AuthorizationCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_authorizationerror(
    event: authorizationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_authorizationsuccess(event: authorizationDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backchannelauthenticationrequestconsumed(
    event: backchannel_authentication_requestDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backchannelauthenticationrequestdestroyed(
    event: backchannel_authentication_requestDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backchannelauthenticationrequestsaved(
    event: backchannel_authentication_requestDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backchannelerror(
    event: backchannelDoterror,
    listener: js.Function5[
      /* ctx */ KoaContextWithOIDC, 
      /* err */ js.Error, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_backchannelsuccess(
    event: backchannelDotsuccess,
    listener: js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      /* accountId */ String, 
      /* sid */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_clientcredentialsdestroyed(
    event: client_credentialsDotdestroyed,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_clientcredentialsissued(
    event: client_credentialsDotissued,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_clientcredentialssaved(
    event: client_credentialsDotsaved,
    listener: js.Function1[/* clientCredentials */ typingsJapgolly.oidcProvider.mod.ClientCredentials, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_devicecodeconsumed(
    event: device_codeDotconsumed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_devicecodedestroyed(
    event: device_codeDotdestroyed,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_devicecodesaved(
    event: device_codeDotsaved,
    listener: js.Function1[/* deviceCode */ typingsJapgolly.oidcProvider.mod.DeviceCode, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_discoveryerror(
    event: discoveryDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_endsessionerror(
    event: end_sessionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_endsessionsuccess(event: end_sessionDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_grantdestroyed(
    event: grantDotdestroyed,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_granterror(
    event: grantDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_grantrevoked(
    event: grantDotrevoked,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* grantId */ String, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_grantsaved(
    event: grantDotsaved,
    listener: js.Function1[/* grant */ typingsJapgolly.oidcProvider.mod.Grant, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_grantsuccess(event: grantDotsuccess, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_interactiondestroyed(
    event: interactionDotdestroyed,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_interactionended(event: interactionDotended, listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_interactionsaved(
    event: interactionDotsaved,
    listener: js.Function1[/* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_interactionstarted(
    event: interactionDotstarted,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* interaction */ PromptDetail, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_introspectionerror(
    event: introspectionDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_jwkserror(
    event: jwksDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pushedauthorizationrequestdestroyed(
    event: pushed_authorization_requestDotdestroyed,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pushedauthorizationrequesterror(
    event: pushed_authorization_requestDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pushedauthorizationrequestsaved(
    event: pushed_authorization_requestDotsaved,
    listener: js.Function1[
      /* pushedAuthorizationRequest */ typingsJapgolly.oidcProvider.mod.PushedAuthorizationRequest, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pushedauthorizationrequestsuccess(
    event: pushed_authorization_requestDotsuccess,
    listener: js.Function1[/* ctx */ KoaContextWithOIDC, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_refreshtokenconsumed(
    event: refresh_tokenDotconsumed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_refreshtokendestroyed(
    event: refresh_tokenDotdestroyed,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_refreshtokensaved(
    event: refresh_tokenDotsaved,
    listener: js.Function1[/* refreshToken */ typingsJapgolly.oidcProvider.mod.RefreshToken, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationaccesstokendestroyed(
    event: registration_access_tokenDotdestroyed,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationaccesstokensaved(
    event: registration_access_tokenDotsaved,
    listener: js.Function1[
      /* registrationAccessToken */ typingsJapgolly.oidcProvider.mod.RegistrationAccessToken, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationcreateerror(
    event: registration_createDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationcreatesuccess(
    event: registration_createDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationdeleteerror(
    event: registration_deleteDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationdeletesuccess(
    event: registration_deleteDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationreaderror(
    event: registration_readDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationupdateerror(
    event: registration_updateDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_registrationupdatesuccess(
    event: registration_updateDotsuccess,
    listener: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ typingsJapgolly.oidcProvider.mod.Client, 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_replaydetectiondestroyed(
    event: replay_detectionDotdestroyed,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_replaydetectionsaved(
    event: replay_detectionDotsaved,
    listener: js.Function1[/* replayDetection */ typingsJapgolly.oidcProvider.mod.ReplayDetection, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_revocationerror(
    event: revocationDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_servererror(
    event: server_error,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ js.Error, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_sessiondestroyed(
    event: sessionDotdestroyed,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_sessionsaved(
    event: sessionDotsaved,
    listener: js.Function1[/* session */ typingsJapgolly.oidcProvider.mod.Session, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_userinfoerror(
    event: userinfoDoterror,
    listener: js.Function2[/* ctx */ KoaContextWithOIDC, /* err */ OIDCProviderError, Unit]
  ): this.type = js.native
  
  var proxy: js.UndefOr[Boolean] = js.native
  
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: String
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: String,
    duplicates: String
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: String,
    duplicates: js.Array[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: String,
    duplicates: Set[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: js.Array[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: js.Array[String],
    duplicates: String
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: js.Array[String],
    duplicates: js.Array[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: js.Array[String],
    duplicates: Set[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Unit,
    duplicates: String
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Unit,
    duplicates: js.Array[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Unit,
    duplicates: Set[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Set[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Set[String],
    duplicates: String
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Set[String],
    duplicates: js.Array[String]
  ): Unit = js.native
  def registerGrantType(
    name: String,
    handler: js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* next */ js.Function0[js.Promise[Unit]], 
      CanBePromise[Unit]
    ],
    params: Set[String],
    duplicates: Set[String]
  ): Unit = js.native
  
  def use[NewStateT, NewContextT](middleware: Middleware[DefaultState & NewStateT, DefaultContext & NewContextT, Any]): Application[DefaultState & NewStateT, DefaultContext & NewContextT] = js.native
  @JSName("use")
  var use_Original: js.Function1[
    /* middleware */ Middleware[DefaultState & js.Object, DefaultContext & js.Object, Any], 
    Application[DefaultState & js.Object, DefaultContext & js.Object]
  ] = js.native
}
