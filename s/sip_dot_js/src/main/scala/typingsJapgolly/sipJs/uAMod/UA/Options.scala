package typingsJapgolly.sipJs.uAMod.UA

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.sipJs.AnonBuiltinEnabled
import typingsJapgolly.sipJs.coreMod.DigestAuthentication
import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.libConstantsMod.C.supported
import typingsJapgolly.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsJapgolly.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactoryOptions
import typingsJapgolly.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsJapgolly.sipJs.libSessionMod.InviteClientContext
import typingsJapgolly.sipJs.libSessionMod.InviteServerContext
import typingsJapgolly.sipJs.libTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined
  var authenticationFactory: js.UndefOr[js.Function1[/* ua */ typingsJapgolly.sipJs.uAMod.UA, DigestAuthentication | _]] = js.undefined
  var authorizationUser: js.UndefOr[String] = js.undefined
  var autostart: js.UndefOr[Boolean] = js.undefined
  var autostop: js.UndefOr[Boolean] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var dtmfType: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DtmfType */ js.Any
  ] = js.undefined
  var experimentalFeatures: js.UndefOr[Boolean] = js.undefined
  var extraSupported: js.UndefOr[js.Array[String]] = js.undefined
  var forceRport: js.UndefOr[Boolean] = js.undefined
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
  var hackIpInContact: js.UndefOr[Boolean] = js.undefined
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  var hackWssInTransport: js.UndefOr[Boolean] = js.undefined
  var hostportParams: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[AnonBuiltinEnabled] = js.undefined
  var noAnswerTimeout: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var register: js.UndefOr[Boolean] = js.undefined
  var registerOptions: js.UndefOr[RegisterOptions] = js.undefined
  var rel100: js.UndefOr[supported] = js.undefined
  var replaces: js.UndefOr[supported] = js.undefined
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[SessionDescriptionHandlerFactoryOptions] = js.undefined
  var sipjsId: js.UndefOr[String] = js.undefined
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.undefined
  var transportOptions: js.UndefOr[js.Any] = js.undefined
  var uri: js.UndefOr[String | URI] = js.undefined
  var usePreloadedRoute: js.UndefOr[Boolean] = js.undefined
  var userAgentString: js.UndefOr[String] = js.undefined
  var viaHost: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined,
    allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined,
    authenticationFactory: /* ua */ typingsJapgolly.sipJs.uAMod.UA => CallbackTo[DigestAuthentication | js.Any] = null,
    authorizationUser: String = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    autostop: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    dtmfType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DtmfType */ js.Any = null,
    experimentalFeatures: js.UndefOr[Boolean] = js.undefined,
    extraSupported: js.Array[String] = null,
    forceRport: js.UndefOr[Boolean] = js.undefined,
    hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined,
    hackIpInContact: js.UndefOr[Boolean] = js.undefined,
    hackViaTcp: js.UndefOr[Boolean] = js.undefined,
    hackWssInTransport: js.UndefOr[Boolean] = js.undefined,
    hostportParams: js.Any = null,
    log: AnonBuiltinEnabled = null,
    noAnswerTimeout: Int | Double = null,
    password: String = null,
    register: js.UndefOr[Boolean] = js.undefined,
    registerOptions: RegisterOptions = null,
    rel100: supported = null,
    replaces: supported = null,
    sessionDescriptionHandlerFactory: (/* session */ InviteClientContext | InviteServerContext, /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions]) => CallbackTo[SessionDescriptionHandler] = null,
    sessionDescriptionHandlerFactoryOptions: SessionDescriptionHandlerFactoryOptions = null,
    sipjsId: String = null,
    transportConstructor: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport] = null,
    transportOptions: js.Any = null,
    uri: String | URI = null,
    usePreloadedRoute: js.UndefOr[Boolean] = js.undefined,
    userAgentString: String = null,
    viaHost: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacyNotifications)) __obj.updateDynamic("allowLegacyNotifications")(allowLegacyNotifications.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOutOfDialogRefers)) __obj.updateDynamic("allowOutOfDialogRefers")(allowOutOfDialogRefers.asInstanceOf[js.Any])
    if (authenticationFactory != null) __obj.updateDynamic("authenticationFactory")(js.Any.fromFunction1((t0: /* ua */ typingsJapgolly.sipJs.uAMod.UA) => authenticationFactory(t0).runNow()))
    if (authorizationUser != null) __obj.updateDynamic("authorizationUser")(authorizationUser.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (!js.isUndefined(autostop)) __obj.updateDynamic("autostop")(autostop.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (dtmfType != null) __obj.updateDynamic("dtmfType")(dtmfType.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalFeatures)) __obj.updateDynamic("experimentalFeatures")(experimentalFeatures.asInstanceOf[js.Any])
    if (extraSupported != null) __obj.updateDynamic("extraSupported")(extraSupported.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRport)) __obj.updateDynamic("forceRport")(forceRport.asInstanceOf[js.Any])
    if (!js.isUndefined(hackAllowUnregisteredOptionTags)) __obj.updateDynamic("hackAllowUnregisteredOptionTags")(hackAllowUnregisteredOptionTags.asInstanceOf[js.Any])
    if (!js.isUndefined(hackIpInContact)) __obj.updateDynamic("hackIpInContact")(hackIpInContact.asInstanceOf[js.Any])
    if (!js.isUndefined(hackViaTcp)) __obj.updateDynamic("hackViaTcp")(hackViaTcp.asInstanceOf[js.Any])
    if (!js.isUndefined(hackWssInTransport)) __obj.updateDynamic("hackWssInTransport")(hackWssInTransport.asInstanceOf[js.Any])
    if (hostportParams != null) __obj.updateDynamic("hostportParams")(hostportParams.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (noAnswerTimeout != null) __obj.updateDynamic("noAnswerTimeout")(noAnswerTimeout.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(register)) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    if (registerOptions != null) __obj.updateDynamic("registerOptions")(registerOptions.asInstanceOf[js.Any])
    if (rel100 != null) __obj.updateDynamic("rel100")(rel100.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerFactory != null) __obj.updateDynamic("sessionDescriptionHandlerFactory")(js.Any.fromFunction2((t0: /* session */ typingsJapgolly.sipJs.libSessionMod.InviteClientContext | typingsJapgolly.sipJs.libSessionMod.InviteServerContext, t1: /* options */ js.UndefOr[
  typingsJapgolly.sipJs.libSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactoryOptions]) => sessionDescriptionHandlerFactory(t0, t1).runNow()))
    if (sessionDescriptionHandlerFactoryOptions != null) __obj.updateDynamic("sessionDescriptionHandlerFactoryOptions")(sessionDescriptionHandlerFactoryOptions.asInstanceOf[js.Any])
    if (sipjsId != null) __obj.updateDynamic("sipjsId")(sipjsId.asInstanceOf[js.Any])
    if (transportConstructor != null) __obj.updateDynamic("transportConstructor")(transportConstructor.asInstanceOf[js.Any])
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (!js.isUndefined(usePreloadedRoute)) __obj.updateDynamic("usePreloadedRoute")(usePreloadedRoute.asInstanceOf[js.Any])
    if (userAgentString != null) __obj.updateDynamic("userAgentString")(userAgentString.asInstanceOf[js.Any])
    if (viaHost != null) __obj.updateDynamic("viaHost")(viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

