package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Document
import typingsJapgolly.pusherJs.anon.Instantiable
import typingsJapgolly.pusherJs.typesSrcCoreAuthAuthTransportsMod.AuthTransports
import typingsJapgolly.pusherJs.typesSrcCoreConfigMod.Config
import typingsJapgolly.pusherJs.typesSrcCoreHttpAjaxMod.Ajax
import typingsJapgolly.pusherJs.typesSrcCoreHttpHttpFactoryMod.HTTPFactory
import typingsJapgolly.pusherJs.typesSrcCoreReachabilityMod.Reachability
import typingsJapgolly.pusherJs.typesSrcCoreSocketMod.Socket
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyOptionsMod.StrategyOptions
import typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineTransportMod.TimelineTransport
import typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportsTableMod.TransportsTable
import typingsJapgolly.pusherJs.typesSrcRuntimesWebDomJsonpRequestMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcRuntimesInterfaceMod {
  
  trait Runtime extends StObject {
    
    var HTTPFactory: typingsJapgolly.pusherJs.typesSrcCoreHttpHttpFactoryMod.HTTPFactory
    
    var ScriptReceivers: js.UndefOr[Any] = js.undefined
    
    var TimelineTransport: typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineTransportMod.TimelineTransport
    
    var Transports: TransportsTable
    
    def addUnloadListener(listener: js.Function): Unit
    
    var createJSONPRequest: js.UndefOr[js.Function2[/* url */ String, /* data */ Any, default]] = js.undefined
    
    var createScriptRequest: js.UndefOr[js.Function1[/* url */ String, Any]] = js.undefined
    
    def createSocketRequest(method: String, url: String): typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
    
    def createWebSocket(url: String): Socket
    
    def createXHR(): Ajax
    
    def getAuthorizers(): AuthTransports
    
    def getDefaultStrategy(config: Config, options: StrategyOptions, defineTransport: js.Function): Strategy
    
    var getDocument: js.UndefOr[js.Function0[Document]] = js.undefined
    
    def getLocalStorage(): Any
    
    def getNetwork(): Reachability
    
    def getProtocol(): String
    
    def getWebSocketAPI(): Instantiable1[/* url */ String, Socket]
    
    def getXHRAPI(): Instantiable0[Ajax]
    
    var isXDRSupported: js.UndefOr[js.Function1[/* useTLS */ js.UndefOr[Boolean], Boolean]] = js.undefined
    
    def isXHRSupported(): Boolean
    
    def randomInt(max: Double): Double
    
    def removeUnloadListener(listener: js.Function): Unit
    
    def setup(PusherClass: Instantiable): Unit
    
    var transportConnectionInitializer: js.Function
  }
  object Runtime {
    
    inline def apply(
      HTTPFactory: HTTPFactory,
      TimelineTransport: TimelineTransport,
      Transports: TransportsTable,
      addUnloadListener: js.Function => Callback,
      createSocketRequest: (String, String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default,
      createWebSocket: String => Socket,
      createXHR: CallbackTo[Ajax],
      getAuthorizers: CallbackTo[AuthTransports],
      getDefaultStrategy: (Config, StrategyOptions, js.Function) => Strategy,
      getLocalStorage: CallbackTo[Any],
      getNetwork: CallbackTo[Reachability],
      getProtocol: CallbackTo[String],
      getWebSocketAPI: CallbackTo[Instantiable1[/* url */ String, Socket]],
      getXHRAPI: CallbackTo[Instantiable0[Ajax]],
      isXHRSupported: CallbackTo[Boolean],
      randomInt: Double => Double,
      removeUnloadListener: js.Function => Callback,
      setup: Instantiable => Callback,
      transportConnectionInitializer: js.Function
    ): Runtime = {
      val __obj = js.Dynamic.literal(HTTPFactory = HTTPFactory.asInstanceOf[js.Any], TimelineTransport = TimelineTransport.asInstanceOf[js.Any], Transports = Transports.asInstanceOf[js.Any], addUnloadListener = js.Any.fromFunction1((t0: js.Function) => addUnloadListener(t0).runNow()), createSocketRequest = js.Any.fromFunction2(createSocketRequest), createWebSocket = js.Any.fromFunction1(createWebSocket), createXHR = createXHR.toJsFn, getAuthorizers = getAuthorizers.toJsFn, getDefaultStrategy = js.Any.fromFunction3(getDefaultStrategy), getLocalStorage = getLocalStorage.toJsFn, getNetwork = getNetwork.toJsFn, getProtocol = getProtocol.toJsFn, getWebSocketAPI = getWebSocketAPI.toJsFn, getXHRAPI = getXHRAPI.toJsFn, isXHRSupported = isXHRSupported.toJsFn, randomInt = js.Any.fromFunction1(randomInt), removeUnloadListener = js.Any.fromFunction1((t0: js.Function) => removeUnloadListener(t0).runNow()), setup = js.Any.fromFunction1((t0: Instantiable) => setup(t0).runNow()), transportConnectionInitializer = transportConnectionInitializer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Runtime]
    }
    
    extension [Self <: Runtime](x: Self) {
      
      inline def setAddUnloadListener(value: js.Function => Callback): Self = StObject.set(x, "addUnloadListener", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setCreateJSONPRequest(value: (/* url */ String, /* data */ Any) => default): Self = StObject.set(x, "createJSONPRequest", js.Any.fromFunction2(value))
      
      inline def setCreateJSONPRequestUndefined: Self = StObject.set(x, "createJSONPRequest", js.undefined)
      
      inline def setCreateScriptRequest(value: /* url */ String => Any): Self = StObject.set(x, "createScriptRequest", js.Any.fromFunction1(value))
      
      inline def setCreateScriptRequestUndefined: Self = StObject.set(x, "createScriptRequest", js.undefined)
      
      inline def setCreateSocketRequest(value: (String, String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default): Self = StObject.set(x, "createSocketRequest", js.Any.fromFunction2(value))
      
      inline def setCreateWebSocket(value: String => Socket): Self = StObject.set(x, "createWebSocket", js.Any.fromFunction1(value))
      
      inline def setCreateXHR(value: CallbackTo[Ajax]): Self = StObject.set(x, "createXHR", value.toJsFn)
      
      inline def setGetAuthorizers(value: CallbackTo[AuthTransports]): Self = StObject.set(x, "getAuthorizers", value.toJsFn)
      
      inline def setGetDefaultStrategy(value: (Config, StrategyOptions, js.Function) => Strategy): Self = StObject.set(x, "getDefaultStrategy", js.Any.fromFunction3(value))
      
      inline def setGetDocument(value: CallbackTo[Document]): Self = StObject.set(x, "getDocument", value.toJsFn)
      
      inline def setGetDocumentUndefined: Self = StObject.set(x, "getDocument", js.undefined)
      
      inline def setGetLocalStorage(value: CallbackTo[Any]): Self = StObject.set(x, "getLocalStorage", value.toJsFn)
      
      inline def setGetNetwork(value: CallbackTo[Reachability]): Self = StObject.set(x, "getNetwork", value.toJsFn)
      
      inline def setGetProtocol(value: CallbackTo[String]): Self = StObject.set(x, "getProtocol", value.toJsFn)
      
      inline def setGetWebSocketAPI(value: CallbackTo[Instantiable1[/* url */ String, Socket]]): Self = StObject.set(x, "getWebSocketAPI", value.toJsFn)
      
      inline def setGetXHRAPI(value: CallbackTo[Instantiable0[Ajax]]): Self = StObject.set(x, "getXHRAPI", value.toJsFn)
      
      inline def setHTTPFactory(value: HTTPFactory): Self = StObject.set(x, "HTTPFactory", value.asInstanceOf[js.Any])
      
      inline def setIsXDRSupported(value: /* useTLS */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "isXDRSupported", js.Any.fromFunction1(value))
      
      inline def setIsXDRSupportedUndefined: Self = StObject.set(x, "isXDRSupported", js.undefined)
      
      inline def setIsXHRSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isXHRSupported", value.toJsFn)
      
      inline def setRandomInt(value: Double => Double): Self = StObject.set(x, "randomInt", js.Any.fromFunction1(value))
      
      inline def setRemoveUnloadListener(value: js.Function => Callback): Self = StObject.set(x, "removeUnloadListener", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setScriptReceivers(value: Any): Self = StObject.set(x, "ScriptReceivers", value.asInstanceOf[js.Any])
      
      inline def setScriptReceiversUndefined: Self = StObject.set(x, "ScriptReceivers", js.undefined)
      
      inline def setSetup(value: Instantiable => Callback): Self = StObject.set(x, "setup", js.Any.fromFunction1((t0: Instantiable) => value(t0).runNow()))
      
      inline def setTimelineTransport(value: TimelineTransport): Self = StObject.set(x, "TimelineTransport", value.asInstanceOf[js.Any])
      
      inline def setTransportConnectionInitializer(value: js.Function): Self = StObject.set(x, "transportConnectionInitializer", value.asInstanceOf[js.Any])
      
      inline def setTransports(value: TransportsTable): Self = StObject.set(x, "Transports", value.asInstanceOf[js.Any])
    }
  }
}
