package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sipJs.libApiSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typingsJapgolly.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typingsJapgolly.sipJs.libApiSessionMod.Session
import typingsJapgolly.sipJs.libApiTransportMod.Transport
import typingsJapgolly.sipJs.libApiUserAgentDelegateMod.UserAgentDelegate
import typingsJapgolly.sipJs.libCoreMod.Logger
import typingsJapgolly.sipJs.libCoreMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiUserAgentOptionsMod {
  
  @js.native
  sealed trait SIPExtension extends StObject
  @JSImport("sip.js/lib/api/user-agent-options", "SIPExtension")
  @js.native
  object SIPExtension extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SIPExtension & String] = js.native
    
    @js.native
    sealed trait Required
      extends StObject
         with SIPExtension
    /* "Required" */ val Required: typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension.Required & String = js.native
    
    @js.native
    sealed trait Supported
      extends StObject
         with SIPExtension
    /* "Supported" */ val Supported: typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension.Supported & String = js.native
    
    @js.native
    sealed trait Unsupported
      extends StObject
         with SIPExtension
    /* "Unsupported" */ val Unsupported: typingsJapgolly.sipJs.libApiUserAgentOptionsMod.SIPExtension.Unsupported & String = js.native
  }
  
  type LogConnector = js.Function4[
    /* level */ LogLevel, 
    /* category */ String, 
    /* label */ js.UndefOr[String], 
    /* content */ String, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sipJs.sipJsStrings.debug
    - typingsJapgolly.sipJs.sipJsStrings.log
    - typingsJapgolly.sipJs.sipJsStrings.warn
    - typingsJapgolly.sipJs.sipJsStrings.error
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typingsJapgolly.sipJs.sipJsStrings.debug = "debug".asInstanceOf[typingsJapgolly.sipJs.sipJsStrings.debug]
    
    inline def error: typingsJapgolly.sipJs.sipJsStrings.error = "error".asInstanceOf[typingsJapgolly.sipJs.sipJsStrings.error]
    
    inline def log: typingsJapgolly.sipJs.sipJsStrings.log = "log".asInstanceOf[typingsJapgolly.sipJs.sipJsStrings.log]
    
    inline def warn: typingsJapgolly.sipJs.sipJsStrings.warn = "warn".asInstanceOf[typingsJapgolly.sipJs.sipJsStrings.warn]
  }
  
  trait UserAgentOptions extends StObject {
    
    /**
      * If `true`, the user agent will accept out of dialog NOTIFY.
      * @remarks
      * RFC 6665 obsoletes the use of out of dialog NOTIFY from RFC 3265.
      * @defaultValue `false`
      */
    var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Authorization ha1.
      * @defaultValue `""`
      */
    var authorizationHa1: js.UndefOr[String] = js.undefined
    
    /**
      * Authorization password.
      * @defaultValue `""`
      */
    var authorizationPassword: js.UndefOr[String] = js.undefined
    
    /**
      * Authorization username.
      * @defaultValue `""`
      */
    var authorizationUsername: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated
      * If `true`, the user agent calls the `start()` method in the constructor.
      * @defaultValue `false`
      * @remarks
      * The call to start() resolves when the user agent connects, so if this
      * option is set to `true` an alternative method of connection detection
      * must be used.
      */
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the user agent calls the `stop()` method on unload (if running in browser window).
      * @defaultValue `true`
      */
    var autoStop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The user portion of user agent's contact URI.
      * @remarks
      * If not specifed a random string will be generated and utilized as the user portion of the contact URI.
      * @defaultValue `""`
      */
    var contactName: js.UndefOr[String] = js.undefined
    
    /**
      * The URI parameters of the user agent's contact URI.
      * @defaultValue `{ transport: "ws" }`
      */
    var contactParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Delegate for {@link UserAgent}.
      * @defaultValue `{}`
      */
    var delegate: js.UndefOr[UserAgentDelegate] = js.undefined
    
    /**
      * The display name associated with the user agent.
      * @remarks
      * Descriptive name to be shown to the called party when calling or sending IM messages
      * (the display name portion of the From header).
      * It must NOT be enclosed between double quotes even if the given name contains multi-byte symbols
      * (SIPjs will always enclose the `displayName` value between double quotes).
      * @defaultValue `""`
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Force adding rport to Via header.
      * @defaultValue `false`
      */
    var forceRport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hack
      * @deprecated TBD
      */
    var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hack
      * @deprecated TBD
      */
    var hackIpInContact: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Hack
      * @deprecated TBD
      */
    var hackViaTcp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether log messages should be written to the browser console.
      * @defaultValue `true`
      */
    var logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, constructor logs the user agent configuration.
      * @defaultValue `true`
      */
    var logConfiguration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function which will be called every time a log is generated.
      * @defaultValue A noop
      */
    var logConnector: js.UndefOr[LogConnector] = js.undefined
    
    /**
      * Indicates the verbosity level of the log messages.
      * @defaultValue `"log"`
      */
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    /**
      * Number of seconds after which an incoming call is rejected if not answered.
      * @defaultValue 60
      */
    var noAnswerTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Adds a Route header(s) to outgoing requests.
      * @defaultValue `[]`
      */
    var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @deprecated
      * Maximum number of times to attempt to reconnect when the transport connection drops.
      * @defaultValue 0
      */
    var reconnectionAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * @deprecated
      * Seconds to wait between reconnection attempts when the transport connection drops.
      * @defaultValue 4
      */
    var reconnectionDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, a first provisional response after the 100 Trying will be sent automatically if UAC does not
      * require reliable provisional responses.
      * @defaultValue `true`
      */
    var sendInitialProvisionalResponse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A factory for generating `SessionDescriptionHandler` instances.
      * @remarks
      * The factory will be passed a `Session` object for the current session
      * and the `sessionDescriptionHandlerFactoryOptions` object.
      * @defaultValue `Web.SessionDescriptionHandler.defaultFactory`
      */
    var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
    
    /**
      * Options to passed to `sessionDescriptionHandlerFactory`.
      * @remarks
      * See `Web.SessionDescriptionHandlerOptions` for details.
      * @defaultValue `{}`
      */
    var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Reliable provisional responses.
      * https://tools.ietf.org/html/rfc3262
      * @defaultValue `SIPExtension.Unsupported`
      */
    var sipExtension100rel: js.UndefOr[SIPExtension] = js.undefined
    
    /**
      * Extra option tags to claim support for.
      * @remarks
      * Setting an extra option tag does not enable support for the associated extension
      * it simply adds the tag to the list of supported options.
      * See {@link UserAgentRegisteredOptionTags} for valid option tags.
      * @defaultValue `[]`
      */
    var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Replaces header.
      * https://tools.ietf.org/html/rfc3891
      * @defaultValue `SIPExtension.Unsupported`
      */
    var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.undefined
    
    /**
      * An id uniquely identify this user agent instance.
      * @defaultValue
      * A random id generated by default.
      */
    var sipjsId: js.UndefOr[String] = js.undefined
    
    /**
      * A constructor function for the user agent's `Transport`.
      * @remarks
      * For more information about creating your own transport see `Transport`.
      * @defaultValue `WebSocketTransport`
      */
    var transportConstructor: js.UndefOr[Instantiable2[/* logger */ Logger, /* options */ Any, Transport]] = js.undefined
    
    /**
      * An options bucket object passed to `transportConstructor` when instantiated.
      * @remarks
      * See WebSocket Transport Configuration Parameters for the full list of options for the default transport.
      * @defaultValue `{}`
      */
    var transportOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * SIP Addresses-of-Record URI associated with the user agent.
      * @remarks
      * This is a SIP address given to you by your provider.
      * If the user agent registers, it is the address-of-record which the user agent registers a contact for.
      * An address-of-record represents an identity of the user, generally a long-term identity,
      * and it does not have a dependency on any device; users can move between devices or even
      * be associated with multiple devices at one time while retaining the same address-of-record.
      * A simple URI, generally of the form `sip:egdar@example.com`, is used for an address-of-record.
      * @defaultValue
      * By default, URI is set to `sip:anonymous.X@anonymous.invalid`, where X is a random token generated for each UA.
      */
    var uri: js.UndefOr[URI] = js.undefined
    
    /**
      * User agent string used in the UserAgent header.
      * @defaultValue
      * A reasonable value is utilized.
      */
    var userAgentString: js.UndefOr[String] = js.undefined
    
    /**
      * Hostname to use in Via header.
      * @defaultValue
      * A random hostname in the .invalid domain.
      */
    var viaHost: js.UndefOr[String] = js.undefined
  }
  object UserAgentOptions {
    
    inline def apply(): UserAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentOptions]
    }
    
    extension [Self <: UserAgentOptions](x: Self) {
      
      inline def setAllowLegacyNotifications(value: Boolean): Self = StObject.set(x, "allowLegacyNotifications", value.asInstanceOf[js.Any])
      
      inline def setAllowLegacyNotificationsUndefined: Self = StObject.set(x, "allowLegacyNotifications", js.undefined)
      
      inline def setAuthorizationHa1(value: String): Self = StObject.set(x, "authorizationHa1", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationHa1Undefined: Self = StObject.set(x, "authorizationHa1", js.undefined)
      
      inline def setAuthorizationPassword(value: String): Self = StObject.set(x, "authorizationPassword", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationPasswordUndefined: Self = StObject.set(x, "authorizationPassword", js.undefined)
      
      inline def setAuthorizationUsername(value: String): Self = StObject.set(x, "authorizationUsername", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUsernameUndefined: Self = StObject.set(x, "authorizationUsername", js.undefined)
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setAutoStop(value: Boolean): Self = StObject.set(x, "autoStop", value.asInstanceOf[js.Any])
      
      inline def setAutoStopUndefined: Self = StObject.set(x, "autoStop", js.undefined)
      
      inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
      
      inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
      
      inline def setContactParams(value: StringDictionary[String]): Self = StObject.set(x, "contactParams", value.asInstanceOf[js.Any])
      
      inline def setContactParamsUndefined: Self = StObject.set(x, "contactParams", js.undefined)
      
      inline def setDelegate(value: UserAgentDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setForceRport(value: Boolean): Self = StObject.set(x, "forceRport", value.asInstanceOf[js.Any])
      
      inline def setForceRportUndefined: Self = StObject.set(x, "forceRport", js.undefined)
      
      inline def setHackAllowUnregisteredOptionTags(value: Boolean): Self = StObject.set(x, "hackAllowUnregisteredOptionTags", value.asInstanceOf[js.Any])
      
      inline def setHackAllowUnregisteredOptionTagsUndefined: Self = StObject.set(x, "hackAllowUnregisteredOptionTags", js.undefined)
      
      inline def setHackIpInContact(value: Boolean | String): Self = StObject.set(x, "hackIpInContact", value.asInstanceOf[js.Any])
      
      inline def setHackIpInContactUndefined: Self = StObject.set(x, "hackIpInContact", js.undefined)
      
      inline def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
      
      inline def setHackViaTcpUndefined: Self = StObject.set(x, "hackViaTcp", js.undefined)
      
      inline def setLogBuiltinEnabled(value: Boolean): Self = StObject.set(x, "logBuiltinEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogBuiltinEnabledUndefined: Self = StObject.set(x, "logBuiltinEnabled", js.undefined)
      
      inline def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
      
      inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
      
      inline def setLogConnector(
        value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Callback
      ): Self = StObject.set(x, "logConnector", js.Any.fromFunction4((t0: /* level */ LogLevel, t1: /* category */ String, t2: /* label */ js.UndefOr[String], t3: /* content */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setLogConnectorUndefined: Self = StObject.set(x, "logConnector", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setNoAnswerTimeout(value: Double): Self = StObject.set(x, "noAnswerTimeout", value.asInstanceOf[js.Any])
      
      inline def setNoAnswerTimeoutUndefined: Self = StObject.set(x, "noAnswerTimeout", js.undefined)
      
      inline def setPreloadedRouteSet(value: js.Array[String]): Self = StObject.set(x, "preloadedRouteSet", value.asInstanceOf[js.Any])
      
      inline def setPreloadedRouteSetUndefined: Self = StObject.set(x, "preloadedRouteSet", js.undefined)
      
      inline def setPreloadedRouteSetVarargs(value: String*): Self = StObject.set(x, "preloadedRouteSet", js.Array(value*))
      
      inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
      
      inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
      
      inline def setSendInitialProvisionalResponse(value: Boolean): Self = StObject.set(x, "sendInitialProvisionalResponse", value.asInstanceOf[js.Any])
      
      inline def setSendInitialProvisionalResponseUndefined: Self = StObject.set(x, "sendInitialProvisionalResponse", js.undefined)
      
      inline def setSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.Any.fromFunction2(value))
      
      inline def setSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", value.asInstanceOf[js.Any])
      
      inline def setSessionDescriptionHandlerFactoryOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", js.undefined)
      
      inline def setSessionDescriptionHandlerFactoryUndefined: Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.undefined)
      
      inline def setSipExtension100rel(value: SIPExtension): Self = StObject.set(x, "sipExtension100rel", value.asInstanceOf[js.Any])
      
      inline def setSipExtension100relUndefined: Self = StObject.set(x, "sipExtension100rel", js.undefined)
      
      inline def setSipExtensionExtraSupported(value: js.Array[String]): Self = StObject.set(x, "sipExtensionExtraSupported", value.asInstanceOf[js.Any])
      
      inline def setSipExtensionExtraSupportedUndefined: Self = StObject.set(x, "sipExtensionExtraSupported", js.undefined)
      
      inline def setSipExtensionExtraSupportedVarargs(value: String*): Self = StObject.set(x, "sipExtensionExtraSupported", js.Array(value*))
      
      inline def setSipExtensionReplaces(value: SIPExtension): Self = StObject.set(x, "sipExtensionReplaces", value.asInstanceOf[js.Any])
      
      inline def setSipExtensionReplacesUndefined: Self = StObject.set(x, "sipExtensionReplaces", js.undefined)
      
      inline def setSipjsId(value: String): Self = StObject.set(x, "sipjsId", value.asInstanceOf[js.Any])
      
      inline def setSipjsIdUndefined: Self = StObject.set(x, "sipjsId", js.undefined)
      
      inline def setTransportConstructor(value: Instantiable2[/* logger */ Logger, /* options */ Any, Transport]): Self = StObject.set(x, "transportConstructor", value.asInstanceOf[js.Any])
      
      inline def setTransportConstructorUndefined: Self = StObject.set(x, "transportConstructor", js.undefined)
      
      inline def setTransportOptions(value: Any): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      inline def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
      
      inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUserAgentString(value: String): Self = StObject.set(x, "userAgentString", value.asInstanceOf[js.Any])
      
      inline def setUserAgentStringUndefined: Self = StObject.set(x, "userAgentString", js.undefined)
      
      inline def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
      
      inline def setViaHostUndefined: Self = StObject.set(x, "viaHost", js.undefined)
    }
  }
}
