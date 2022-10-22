package typingsJapgolly.undici.mod

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.node.urlMod.UrlObject
import typingsJapgolly.undici.anon.dispatcherundefinedOmitCo
import typingsJapgolly.undici.anon.dispatcherundefinedOmitPi
import typingsJapgolly.undici.anon.dispatcherundefinedOmitRe
import typingsJapgolly.undici.anon.dispatcherundefinedOmitReBody
import typingsJapgolly.undici.anon.dispatcherundefinedOmitUp
import typingsJapgolly.undici.typesAgentMod.Options
import typingsJapgolly.undici.typesConnectorMod.BuildOptions
import typingsJapgolly.undici.typesConnectorMod.connector
import typingsJapgolly.undici.typesDispatcherMod.ConnectData
import typingsJapgolly.undici.typesDispatcherMod.DispatchHandlers
import typingsJapgolly.undici.typesDispatcherMod.DispatchInterceptor
import typingsJapgolly.undici.typesDispatcherMod.DispatchOptions
import typingsJapgolly.undici.typesDispatcherMod.PipelineHandler
import typingsJapgolly.undici.typesDispatcherMod.ResponseData
import typingsJapgolly.undici.typesDispatcherMod.StreamData
import typingsJapgolly.undici.typesDispatcherMod.StreamFactory
import typingsJapgolly.undici.typesDispatcherMod.UpgradeData
import typingsJapgolly.undici.typesFetchMod.RequestInfo
import typingsJapgolly.undici.typesFetchMod.RequestInit
import typingsJapgolly.undici.typesInterceptorsMod.RedirectInterceptorOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("undici", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof imported_agent` */
  @JSImport("undici", "default.Agent")
  @js.native
  open class Agent ()
    extends typingsJapgolly.undici.typesAgentMod.^ {
    def this(opts: Options) = this()
  }
  
  /* was `typeof imported_balanced-pool` */
  @JSImport("undici", "default.BalancedPool")
  @js.native
  open class BalancedPool protected ()
    extends typingsJapgolly.undici.typesBalancedPoolMod.^ {
    def this(url: String) = this()
    def this(url: js.Array[String]) = this()
    def this(url: URL_) = this()
    def this(url: String, options: typingsJapgolly.undici.typesPoolMod.Options) = this()
    def this(url: js.Array[String], options: typingsJapgolly.undici.typesPoolMod.Options) = this()
    def this(url: URL_, options: typingsJapgolly.undici.typesPoolMod.Options) = this()
  }
  
  /** A basic HTTP/1.1 client, mapped on top a single TCP/TLS connection. Pipelining is disabled by default. */
  /* was `typeof imported_client` */
  @JSImport("undici", "default.Client")
  @js.native
  open class Client protected ()
    extends typingsJapgolly.undici.typesClientMod.^ {
    def this(url: String) = this()
    def this(url: URL_) = this()
    def this(url: String, options: typingsJapgolly.undici.typesClientMod.Options) = this()
    def this(url: URL_, options: typingsJapgolly.undici.typesClientMod.Options) = this()
  }
  
  /* was `typeof imported_handlers.DecoratorHandler` */
  @JSImport("undici", "default.DecoratorHandler")
  @js.native
  open class DecoratorHandler protected ()
    extends typingsJapgolly.undici.typesHandlersMod.DecoratorHandler {
    def this(handler: DispatchHandlers) = this()
  }
  
  /** Dispatcher is the core API used to dispatch requests. */
  /* was `typeof imported_dispatcher` */
  @JSImport("undici", "default.Dispatcher")
  @js.native
  open class Dispatcher ()
    extends typingsJapgolly.undici.typesDispatcherMod.^
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  /* was `typeof imported_mock-agent` */
  @JSImport("undici", "default.MockAgent")
  @js.native
  open class MockAgent[TMockAgentOptions /* <: typingsJapgolly.undici.typesMockAgentMod.Options */] ()
    extends typingsJapgolly.undici.typesMockAgentMod.^[TMockAgentOptions] {
    def this(options: typingsJapgolly.undici.typesMockAgentMod.Options) = this()
  }
  
  /** MockClient extends the Client API and allows one to mock requests. */
  /* was `typeof imported_mock-client` */
  @JSImport("undici", "default.MockClient")
  @js.native
  open class MockClient protected ()
    extends typingsJapgolly.undici.typesMockClientMod.^ {
    def this(origin: String, options: typingsJapgolly.undici.typesMockClientMod.Options) = this()
  }
  
  /** MockPool extends the Pool API and allows one to mock requests. */
  /* was `typeof imported_mock-pool` */
  @JSImport("undici", "default.MockPool")
  @js.native
  open class MockPool protected ()
    extends typingsJapgolly.undici.typesMockPoolMod.^ {
    def this(origin: String, options: typingsJapgolly.undici.typesMockPoolMod.Options) = this()
  }
  
  /* was `typeof imported_pool` */
  @JSImport("undici", "default.Pool")
  @js.native
  open class Pool protected ()
    extends typingsJapgolly.undici.typesPoolMod.^ {
    def this(url: String) = this()
    def this(url: URL_) = this()
    def this(url: String, options: typingsJapgolly.undici.typesPoolMod.Options) = this()
    def this(url: URL_, options: typingsJapgolly.undici.typesPoolMod.Options) = this()
  }
  
  /* was `typeof imported_handlers.RedirectHandler` */
  @JSImport("undici", "default.RedirectHandler")
  @js.native
  open class RedirectHandler protected ()
    extends typingsJapgolly.undici.typesHandlersMod.RedirectHandler {
    def this(
      dispatch: typingsJapgolly.undici.typesDispatcherMod.^,
      maxRedirections: Double,
      opts: DispatchOptions,
      handler: DispatchHandlers
    ) = this()
  }
  
  /* was `typeof imported_connector` */
  inline def buildConnector(): connector = ^.asInstanceOf[js.Dynamic].applyDynamic("buildConnector")().asInstanceOf[connector]
  inline def buildConnector(options: BuildOptions): connector = ^.asInstanceOf[js.Dynamic].applyDynamic("buildConnector")(options.asInstanceOf[js.Any]).asInstanceOf[connector]
  
  /** Starts two-way communications with the requested resource. */
  /* was `typeof imported_api.connect` */
  inline def connect(url: String): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: String, options: dispatcherundefinedOmitCo): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: URL_): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: URL_, options: dispatcherundefinedOmitCo): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: UrlObject): js.Promise[ConnectData] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ConnectData]]
  inline def connect(url: UrlObject, options: dispatcherundefinedOmitCo): js.Promise[ConnectData] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ConnectData]]
  
  /* was `typeof imported_interceptors.createRedirectInterceptor` */
  inline def createRedirectInterceptor(opts: RedirectInterceptorOpts): DispatchInterceptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectInterceptor")(opts.asInstanceOf[js.Any]).asInstanceOf[DispatchInterceptor]
  
  /* was `typeof imported_errors` */
  object errors {
    
    @JSImport("undici", "default.errors.BodyTimeoutError")
    @js.native
    open class BodyTimeoutError ()
      extends typingsJapgolly.undici.typesErrorsMod.BodyTimeoutError
    
    @JSImport("undici", "default.errors.ClientClosedError")
    @js.native
    open class ClientClosedError ()
      extends typingsJapgolly.undici.typesErrorsMod.ClientClosedError
    
    @JSImport("undici", "default.errors.ClientDestroyedError")
    @js.native
    open class ClientDestroyedError ()
      extends typingsJapgolly.undici.typesErrorsMod.ClientDestroyedError
    
    @JSImport("undici", "default.errors.HeadersTimeoutError")
    @js.native
    open class HeadersTimeoutError ()
      extends typingsJapgolly.undici.typesErrorsMod.HeadersTimeoutError
    
    @JSImport("undici", "default.errors.InformationalError")
    @js.native
    open class InformationalError ()
      extends typingsJapgolly.undici.typesErrorsMod.InformationalError
    
    @JSImport("undici", "default.errors.InvalidArgumentError")
    @js.native
    open class InvalidArgumentError ()
      extends typingsJapgolly.undici.typesErrorsMod.InvalidArgumentError
    
    @JSImport("undici", "default.errors.InvalidReturnError")
    @js.native
    open class InvalidReturnError ()
      extends typingsJapgolly.undici.typesErrorsMod.InvalidReturnError
    
    @JSImport("undici", "default.errors.NotSupportedError")
    @js.native
    open class NotSupportedError ()
      extends typingsJapgolly.undici.typesErrorsMod.NotSupportedError
    
    @JSImport("undici", "default.errors.RequestAbortedError")
    @js.native
    open class RequestAbortedError ()
      extends typingsJapgolly.undici.typesErrorsMod.RequestAbortedError
    
    @JSImport("undici", "default.errors.RequestContentLengthMismatchError")
    @js.native
    open class RequestContentLengthMismatchError ()
      extends typingsJapgolly.undici.typesErrorsMod.RequestContentLengthMismatchError
    
    @JSImport("undici", "default.errors.ResponseStatusCodeError")
    @js.native
    open class ResponseStatusCodeError ()
      extends typingsJapgolly.undici.typesErrorsMod.ResponseStatusCodeError
    
    @JSImport("undici", "default.errors.SocketError")
    @js.native
    open class SocketError ()
      extends typingsJapgolly.undici.typesErrorsMod.SocketError
    
    @JSImport("undici", "default.errors.SocketTimeoutError")
    @js.native
    open class SocketTimeoutError ()
      extends typingsJapgolly.undici.typesErrorsMod.SocketTimeoutError
    
    @JSImport("undici", "default.errors.UndiciError")
    @js.native
    open class UndiciError ()
      extends typingsJapgolly.undici.typesErrorsMod.UndiciError
  }
  
  /* was `typeof imported_fetch.fetch` */
  inline def fetch(input: RequestInfo): js.Promise[typingsJapgolly.undici.typesFetchMod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.undici.typesFetchMod.Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typingsJapgolly.undici.typesFetchMod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.undici.typesFetchMod.Response]]
  
  /* was `typeof imported_global-dispatcher.getGlobalDispatcher` */
  inline def getGlobalDispatcher(): typingsJapgolly.undici.typesDispatcherMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[typingsJapgolly.undici.typesDispatcherMod.^]
  
  /* was `typeof imported_mock-errors` */
  object mockErrors {
    
    @JSImport("undici", "default.mockErrors.MockNotMatchedError")
    @js.native
    open class MockNotMatchedError ()
      extends typingsJapgolly.undici.typesMockErrorsMod.MockNotMatchedError {
      def this(message: String) = this()
    }
  }
  
  /** For easy use with `stream.pipeline`. */
  /* was `typeof imported_api.pipeline` */
  inline def pipeline(url: String, options: dispatcherundefinedOmitPi, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def pipeline(url: URL_, options: dispatcherundefinedOmitPi, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  inline def pipeline(url: UrlObject, options: dispatcherundefinedOmitPi, handler: PipelineHandler): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Duplex]
  
  /** Performs an HTTP request. */
  /* was `typeof imported_api.request` */
  inline def request(url: String): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: String, options: dispatcherundefinedOmitRe): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: URL_): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: URL_, options: dispatcherundefinedOmitRe): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: UrlObject): js.Promise[ResponseData] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResponseData]]
  inline def request(url: UrlObject, options: dispatcherundefinedOmitRe): js.Promise[ResponseData] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseData]]
  
  /* was `typeof imported_global-dispatcher.setGlobalDispatcher` */
  inline def setGlobalDispatcher[DispatcherImplementation /* <: typingsJapgolly.undici.typesDispatcherMod.^ */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** A faster version of `request`. */
  /* was `typeof imported_api.stream` */
  inline def stream(url: String, options: dispatcherundefinedOmitReBody, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
  inline def stream(url: URL_, options: dispatcherundefinedOmitReBody, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
  inline def stream(url: UrlObject, options: dispatcherundefinedOmitReBody, factory: StreamFactory): js.Promise[StreamData] = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamData]]
  
  /** Upgrade to a different protocol. */
  /* was `typeof imported_api.upgrade` */
  inline def upgrade(url: String): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: String, options: dispatcherundefinedOmitUp): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: URL_): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: URL_, options: dispatcherundefinedOmitUp): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: UrlObject): js.Promise[UpgradeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpgradeData]]
  inline def upgrade(url: UrlObject, options: dispatcherundefinedOmitUp): js.Promise[UpgradeData] = (^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpgradeData]]
}
