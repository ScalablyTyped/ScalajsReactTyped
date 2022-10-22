package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationCallback
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationHandler
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.ChannelAuthorizationRequestParams
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.UserAuthenticationCallback
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.UserAuthenticationHandler
import typingsJapgolly.pusherJs.typesSrcCoreAuthOptionsMod.UserAuthenticationRequestParams
import typingsJapgolly.pusherJs.typesSrcCoreOptionsMod.Options
import typingsJapgolly.tweetnacl.mod.nacl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConfigMod {
  
  @JSImport("pusher-js/types/src/core/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfig(opts: Options, pusher: Any): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(opts.asInstanceOf[js.Any], pusher.asInstanceOf[js.Any])).asInstanceOf[Config]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pusherJs.pusherJsStrings.ajax
    - typingsJapgolly.pusherJs.pusherJsStrings.jsonp
  */
  trait AuthTransport extends StObject
  object AuthTransport {
    
    inline def ajax: typingsJapgolly.pusherJs.pusherJsStrings.ajax = "ajax".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.ajax]
    
    inline def jsonp: typingsJapgolly.pusherJs.pusherJsStrings.jsonp = "jsonp".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.jsonp]
  }
  
  trait Config extends StObject {
    
    var activityTimeout: Double
    
    def channelAuthorizer(params: ChannelAuthorizationRequestParams, callback: ChannelAuthorizationCallback): Unit
    @JSName("channelAuthorizer")
    var channelAuthorizer_Original: ChannelAuthorizationHandler
    
    var cluster: js.UndefOr[String] = js.undefined
    
    var disabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    var enableStats: Boolean
    
    var enabledTransports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    var forceTLS: js.UndefOr[Boolean] = js.undefined
    
    var httpHost: String
    
    var httpPath: String
    
    var httpPort: Double
    
    var httpsPort: Double
    
    var ignoreNullOrigin: js.UndefOr[Boolean] = js.undefined
    
    var nacl: js.UndefOr[typingsJapgolly.tweetnacl.mod.nacl] = js.undefined
    
    var pongTimeout: Double
    
    var statsHost: String
    
    var timelineParams: js.UndefOr[Any] = js.undefined
    
    var unavailableTimeout: Double
    
    var useTLS: Boolean
    
    def userAuthenticator(params: UserAuthenticationRequestParams, callback: UserAuthenticationCallback): Unit
    @JSName("userAuthenticator")
    var userAuthenticator_Original: UserAuthenticationHandler
    
    var wsHost: String
    
    var wsPath: String
    
    var wsPort: Double
    
    var wssPort: Double
  }
  object Config {
    
    inline def apply(
      activityTimeout: Double,
      channelAuthorizer: (/* params */ ChannelAuthorizationRequestParams, /* callback */ ChannelAuthorizationCallback) => Callback,
      enableStats: Boolean,
      httpHost: String,
      httpPath: String,
      httpPort: Double,
      httpsPort: Double,
      pongTimeout: Double,
      statsHost: String,
      unavailableTimeout: Double,
      useTLS: Boolean,
      userAuthenticator: (/* params */ UserAuthenticationRequestParams, /* callback */ UserAuthenticationCallback) => Callback,
      wsHost: String,
      wsPath: String,
      wsPort: Double,
      wssPort: Double
    ): Config = {
      val __obj = js.Dynamic.literal(activityTimeout = activityTimeout.asInstanceOf[js.Any], channelAuthorizer = js.Any.fromFunction2((t0: /* params */ ChannelAuthorizationRequestParams, t1: /* callback */ ChannelAuthorizationCallback) => (channelAuthorizer(t0, t1)).runNow()), enableStats = enableStats.asInstanceOf[js.Any], httpHost = httpHost.asInstanceOf[js.Any], httpPath = httpPath.asInstanceOf[js.Any], httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], pongTimeout = pongTimeout.asInstanceOf[js.Any], statsHost = statsHost.asInstanceOf[js.Any], unavailableTimeout = unavailableTimeout.asInstanceOf[js.Any], useTLS = useTLS.asInstanceOf[js.Any], userAuthenticator = js.Any.fromFunction2((t0: /* params */ UserAuthenticationRequestParams, t1: /* callback */ UserAuthenticationCallback) => (userAuthenticator(t0, t1)).runNow()), wsHost = wsHost.asInstanceOf[js.Any], wsPath = wsPath.asInstanceOf[js.Any], wsPort = wsPort.asInstanceOf[js.Any], wssPort = wssPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setActivityTimeout(value: Double): Self = StObject.set(x, "activityTimeout", value.asInstanceOf[js.Any])
      
      inline def setChannelAuthorizer(
        value: (/* params */ ChannelAuthorizationRequestParams, /* callback */ ChannelAuthorizationCallback) => Callback
      ): Self = StObject.set(x, "channelAuthorizer", js.Any.fromFunction2((t0: /* params */ ChannelAuthorizationRequestParams, t1: /* callback */ ChannelAuthorizationCallback) => (value(t0, t1)).runNow()))
      
      inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setDisabledTransports(value: js.Array[Transport]): Self = StObject.set(x, "disabledTransports", value.asInstanceOf[js.Any])
      
      inline def setDisabledTransportsUndefined: Self = StObject.set(x, "disabledTransports", js.undefined)
      
      inline def setDisabledTransportsVarargs(value: Transport*): Self = StObject.set(x, "disabledTransports", js.Array(value*))
      
      inline def setEnableStats(value: Boolean): Self = StObject.set(x, "enableStats", value.asInstanceOf[js.Any])
      
      inline def setEnabledTransports(value: js.Array[Transport]): Self = StObject.set(x, "enabledTransports", value.asInstanceOf[js.Any])
      
      inline def setEnabledTransportsUndefined: Self = StObject.set(x, "enabledTransports", js.undefined)
      
      inline def setEnabledTransportsVarargs(value: Transport*): Self = StObject.set(x, "enabledTransports", js.Array(value*))
      
      inline def setForceTLS(value: Boolean): Self = StObject.set(x, "forceTLS", value.asInstanceOf[js.Any])
      
      inline def setForceTLSUndefined: Self = StObject.set(x, "forceTLS", js.undefined)
      
      inline def setHttpHost(value: String): Self = StObject.set(x, "httpHost", value.asInstanceOf[js.Any])
      
      inline def setHttpPath(value: String): Self = StObject.set(x, "httpPath", value.asInstanceOf[js.Any])
      
      inline def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
      
      inline def setHttpsPort(value: Double): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNullOrigin(value: Boolean): Self = StObject.set(x, "ignoreNullOrigin", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNullOriginUndefined: Self = StObject.set(x, "ignoreNullOrigin", js.undefined)
      
      inline def setNacl(value: nacl): Self = StObject.set(x, "nacl", value.asInstanceOf[js.Any])
      
      inline def setNaclUndefined: Self = StObject.set(x, "nacl", js.undefined)
      
      inline def setPongTimeout(value: Double): Self = StObject.set(x, "pongTimeout", value.asInstanceOf[js.Any])
      
      inline def setStatsHost(value: String): Self = StObject.set(x, "statsHost", value.asInstanceOf[js.Any])
      
      inline def setTimelineParams(value: Any): Self = StObject.set(x, "timelineParams", value.asInstanceOf[js.Any])
      
      inline def setTimelineParamsUndefined: Self = StObject.set(x, "timelineParams", js.undefined)
      
      inline def setUnavailableTimeout(value: Double): Self = StObject.set(x, "unavailableTimeout", value.asInstanceOf[js.Any])
      
      inline def setUseTLS(value: Boolean): Self = StObject.set(x, "useTLS", value.asInstanceOf[js.Any])
      
      inline def setUserAuthenticator(
        value: (/* params */ UserAuthenticationRequestParams, /* callback */ UserAuthenticationCallback) => Callback
      ): Self = StObject.set(x, "userAuthenticator", js.Any.fromFunction2((t0: /* params */ UserAuthenticationRequestParams, t1: /* callback */ UserAuthenticationCallback) => (value(t0, t1)).runNow()))
      
      inline def setWsHost(value: String): Self = StObject.set(x, "wsHost", value.asInstanceOf[js.Any])
      
      inline def setWsPath(value: String): Self = StObject.set(x, "wsPath", value.asInstanceOf[js.Any])
      
      inline def setWsPort(value: Double): Self = StObject.set(x, "wsPort", value.asInstanceOf[js.Any])
      
      inline def setWssPort(value: Double): Self = StObject.set(x, "wssPort", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pusherJs.pusherJsStrings.ws
    - typingsJapgolly.pusherJs.pusherJsStrings.wss
    - typingsJapgolly.pusherJs.pusherJsStrings.xhr_streaming
    - typingsJapgolly.pusherJs.pusherJsStrings.xhr_polling
    - typingsJapgolly.pusherJs.pusherJsStrings.sockjs
  */
  trait Transport extends StObject
  object Transport {
    
    inline def sockjs: typingsJapgolly.pusherJs.pusherJsStrings.sockjs = "sockjs".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.sockjs]
    
    inline def ws: typingsJapgolly.pusherJs.pusherJsStrings.ws = "ws".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.ws]
    
    inline def wss: typingsJapgolly.pusherJs.pusherJsStrings.wss = "wss".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.wss]
    
    inline def xhr_polling: typingsJapgolly.pusherJs.pusherJsStrings.xhr_polling = "xhr_polling".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.xhr_polling]
    
    inline def xhr_streaming: typingsJapgolly.pusherJs.pusherJsStrings.xhr_streaming = "xhr_streaming".asInstanceOf[typingsJapgolly.pusherJs.pusherJsStrings.xhr_streaming]
  }
}
