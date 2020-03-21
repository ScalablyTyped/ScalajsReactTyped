package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsJapgolly.sipJs.coreMod.URI
import typingsJapgolly.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsJapgolly.sipJs.sessionMod.Session
import typingsJapgolly.sipJs.transportMod.Transport
import typingsJapgolly.sipJs.userAgentDelegateMod.UserAgentDelegate
import typingsJapgolly.sipJs.userAgentOptionsMod.LogConnector
import typingsJapgolly.sipJs.userAgentOptionsMod.LogLevel
import typingsJapgolly.sipJs.userAgentOptionsMod.SIPExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
trait PartialUserAgentOptions extends js.Object {
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined
  var authorizationPassword: js.UndefOr[String] = js.undefined
  var authorizationUsername: js.UndefOr[String] = js.undefined
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var autoStop: js.UndefOr[Boolean] = js.undefined
  var delegate: js.UndefOr[UserAgentDelegate] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var forceRport: js.UndefOr[Boolean] = js.undefined
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
  var hackIpInContact: js.UndefOr[Boolean | String] = js.undefined
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  var hackWssInTransport: js.UndefOr[Boolean] = js.undefined
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined
  var logConfiguration: js.UndefOr[Boolean] = js.undefined
  var logConnector: js.UndefOr[LogConnector] = js.undefined
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var noAnswerTimeout: js.UndefOr[Double] = js.undefined
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.undefined
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  var reconnectionDelay: js.UndefOr[Double] = js.undefined
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.undefined
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.undefined
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.undefined
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.undefined
  var sipjsId: js.UndefOr[String] = js.undefined
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.undefined
  var transportOptions: js.UndefOr[js.Any] = js.undefined
  var uri: js.UndefOr[URI] = js.undefined
  var userAgentString: js.UndefOr[String] = js.undefined
  var viaHost: js.UndefOr[String] = js.undefined
}

object PartialUserAgentOptions {
  @scala.inline
  def apply(
    allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined,
    allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined,
    authorizationPassword: String = null,
    authorizationUsername: String = null,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    autoStop: js.UndefOr[Boolean] = js.undefined,
    delegate: UserAgentDelegate = null,
    displayName: String = null,
    forceRport: js.UndefOr[Boolean] = js.undefined,
    hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined,
    hackIpInContact: Boolean | String = null,
    hackViaTcp: js.UndefOr[Boolean] = js.undefined,
    hackWssInTransport: js.UndefOr[Boolean] = js.undefined,
    logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined,
    logConfiguration: js.UndefOr[Boolean] = js.undefined,
    logConnector: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Callback = null,
    logLevel: LogLevel = null,
    noAnswerTimeout: Int | Double = null,
    preloadedRouteSet: js.Array[String] = null,
    reconnectionAttempts: Int | Double = null,
    reconnectionDelay: Int | Double = null,
    sessionDescriptionHandlerFactory: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => CallbackTo[SessionDescriptionHandler] = null,
    sessionDescriptionHandlerFactoryOptions: js.Object = null,
    sipExtension100rel: SIPExtension = null,
    sipExtensionExtraSupported: js.Array[String] = null,
    sipExtensionReplaces: SIPExtension = null,
    sipjsId: String = null,
    transportConstructor: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport] = null,
    transportOptions: js.Any = null,
    uri: URI = null,
    userAgentString: String = null,
    viaHost: String = null
  ): PartialUserAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacyNotifications)) __obj.updateDynamic("allowLegacyNotifications")(allowLegacyNotifications.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOutOfDialogRefers)) __obj.updateDynamic("allowOutOfDialogRefers")(allowOutOfDialogRefers.asInstanceOf[js.Any])
    if (authorizationPassword != null) __obj.updateDynamic("authorizationPassword")(authorizationPassword.asInstanceOf[js.Any])
    if (authorizationUsername != null) __obj.updateDynamic("authorizationUsername")(authorizationUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStop)) __obj.updateDynamic("autoStop")(autoStop.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRport)) __obj.updateDynamic("forceRport")(forceRport.asInstanceOf[js.Any])
    if (!js.isUndefined(hackAllowUnregisteredOptionTags)) __obj.updateDynamic("hackAllowUnregisteredOptionTags")(hackAllowUnregisteredOptionTags.asInstanceOf[js.Any])
    if (hackIpInContact != null) __obj.updateDynamic("hackIpInContact")(hackIpInContact.asInstanceOf[js.Any])
    if (!js.isUndefined(hackViaTcp)) __obj.updateDynamic("hackViaTcp")(hackViaTcp.asInstanceOf[js.Any])
    if (!js.isUndefined(hackWssInTransport)) __obj.updateDynamic("hackWssInTransport")(hackWssInTransport.asInstanceOf[js.Any])
    if (!js.isUndefined(logBuiltinEnabled)) __obj.updateDynamic("logBuiltinEnabled")(logBuiltinEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(logConfiguration)) __obj.updateDynamic("logConfiguration")(logConfiguration.asInstanceOf[js.Any])
    if (logConnector != null) __obj.updateDynamic("logConnector")(js.Any.fromFunction4((t0: /* level */ typingsJapgolly.sipJs.userAgentOptionsMod.LogLevel, t1: /* category */ java.lang.String, t2: /* label */ js.UndefOr[java.lang.String], t3: /* content */ java.lang.String) => logConnector(t0, t1, t2, t3).runNow()))
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (noAnswerTimeout != null) __obj.updateDynamic("noAnswerTimeout")(noAnswerTimeout.asInstanceOf[js.Any])
    if (preloadedRouteSet != null) __obj.updateDynamic("preloadedRouteSet")(preloadedRouteSet.asInstanceOf[js.Any])
    if (reconnectionAttempts != null) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.asInstanceOf[js.Any])
    if (reconnectionDelay != null) __obj.updateDynamic("reconnectionDelay")(reconnectionDelay.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerFactory != null) __obj.updateDynamic("sessionDescriptionHandlerFactory")(js.Any.fromFunction2((t0: /* session */ typingsJapgolly.sipJs.sessionMod.Session, t1: /* options */ js.UndefOr[js.Object]) => sessionDescriptionHandlerFactory(t0, t1).runNow()))
    if (sessionDescriptionHandlerFactoryOptions != null) __obj.updateDynamic("sessionDescriptionHandlerFactoryOptions")(sessionDescriptionHandlerFactoryOptions.asInstanceOf[js.Any])
    if (sipExtension100rel != null) __obj.updateDynamic("sipExtension100rel")(sipExtension100rel.asInstanceOf[js.Any])
    if (sipExtensionExtraSupported != null) __obj.updateDynamic("sipExtensionExtraSupported")(sipExtensionExtraSupported.asInstanceOf[js.Any])
    if (sipExtensionReplaces != null) __obj.updateDynamic("sipExtensionReplaces")(sipExtensionReplaces.asInstanceOf[js.Any])
    if (sipjsId != null) __obj.updateDynamic("sipjsId")(sipjsId.asInstanceOf[js.Any])
    if (transportConstructor != null) __obj.updateDynamic("transportConstructor")(transportConstructor.asInstanceOf[js.Any])
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (userAgentString != null) __obj.updateDynamic("userAgentString")(userAgentString.asInstanceOf[js.Any])
    if (viaHost != null) __obj.updateDynamic("viaHost")(viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUserAgentOptions]
  }
}

