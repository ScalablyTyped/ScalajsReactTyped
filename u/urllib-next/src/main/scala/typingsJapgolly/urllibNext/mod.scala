package typingsJapgolly.urllibNext

import typingsJapgolly.undici.typesAgentMod.Options
import typingsJapgolly.urllibNext.srcEsmHttpClientMod.ClientOptions
import typingsJapgolly.urllibNext.srcEsmRequestMod.RequestOptions
import typingsJapgolly.urllibNext.srcEsmRequestMod.RequestURL
import typingsJapgolly.urllibNext.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("urllib-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("urllib-next", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("urllib-next", "default.USER_AGENT")
    @js.native
    def USER_AGENT: String = js.native
    inline def USER_AGENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_AGENT")(x.asInstanceOf[js.Any])
    
    @JSImport("urllib-next", "default.request")
    @js.native
    def request: js.Function2[
        /* url */ RequestURL, 
        /* options */ js.UndefOr[RequestOptions], 
        js.Promise[HttpClientResponse]
      ] = js.native
    inline def request(url: RequestURL): js.Promise[HttpClientResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse]]
    inline def request(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse]]
    inline def request_=(
      x: js.Function2[
          /* url */ RequestURL, 
          /* options */ js.UndefOr[RequestOptions], 
          js.Promise[HttpClientResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("urllib-next", "Agent")
  @js.native
  open class Agent ()
    extends typingsJapgolly.undici.mod.Agent {
    def this(opts: Options) = this()
  }
  
  /** Dispatcher is the core API used to dispatch requests. */
  @JSImport("urllib-next", "Dispatcher")
  @js.native
  open class Dispatcher ()
    extends typingsJapgolly.undici.mod.Dispatcher
  
  @JSImport("urllib-next", "HttpClient")
  @js.native
  open class HttpClient ()
    extends typingsJapgolly.urllibNext.srcEsmHttpClientMod.HttpClient {
    def this(clientOptions: ClientOptions) = this()
  }
  
  /** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
  @JSImport("urllib-next", "MockAgent")
  @js.native
  open class MockAgent[TMockAgentOptions /* <: typingsJapgolly.undici.typesMockAgentMod.Options */] ()
    extends typingsJapgolly.undici.mod.MockAgent[TMockAgentOptions] {
    def this(options: typingsJapgolly.undici.typesMockAgentMod.Options) = this()
  }
  
  @JSImport("urllib-next", "ProxyAgent")
  @js.native
  open class ProxyAgent protected ()
    extends typingsJapgolly.undici.mod.ProxyAgent {
    def this(options: String) = this()
    def this(options: typingsJapgolly.undici.typesProxyAgentMod.Options) = this()
  }
  
  @JSImport("urllib-next", "USER_AGENT")
  @js.native
  val USER_AGENT: String = js.native
  
  inline def getGlobalDispatcher(): typingsJapgolly.undici.typesDispatcherMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDispatcher")().asInstanceOf[typingsJapgolly.undici.typesDispatcherMod.^]
  
  inline def request(url: RequestURL): js.Promise[HttpClientResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpClientResponse]]
  inline def request(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpClientResponse]]
  
  inline def setGlobalDispatcher[DispatcherImplementation /* <: typingsJapgolly.undici.typesDispatcherMod.^ */](dispatcher: DispatcherImplementation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalDispatcher")(dispatcher.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
