package typingsJapgolly.centra

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.URL
import typingsJapgolly.centra.centraStrings._defaultAgent
import typingsJapgolly.centra.centraStrings.agent
import typingsJapgolly.centra.centraStrings.auth
import typingsJapgolly.centra.centraStrings.buffer
import typingsJapgolly.centra.centraStrings.createConnection
import typingsJapgolly.centra.centraStrings.defaultPort
import typingsJapgolly.centra.centraStrings.family
import typingsJapgolly.centra.centraStrings.form
import typingsJapgolly.centra.centraStrings.headers
import typingsJapgolly.centra.centraStrings.host
import typingsJapgolly.centra.centraStrings.hostname
import typingsJapgolly.centra.centraStrings.json
import typingsJapgolly.centra.centraStrings.localAddress
import typingsJapgolly.centra.centraStrings.lookup
import typingsJapgolly.centra.centraStrings.maxHeaderSize
import typingsJapgolly.centra.centraStrings.method
import typingsJapgolly.centra.centraStrings.path
import typingsJapgolly.centra.centraStrings.port
import typingsJapgolly.centra.centraStrings.protocol
import typingsJapgolly.centra.centraStrings.setHost
import typingsJapgolly.centra.centraStrings.signal
import typingsJapgolly.centra.centraStrings.socketPath
import typingsJapgolly.centra.centraStrings.timeout
import typingsJapgolly.node.AbortSignal
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.netMod.LookupFunction
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("centra", JSImport.Namespace)
  @js.native
  val ^ : CentraFactory = js.native
  
  type CentraFactory = js.Function2[/* url */ URL | String, /* method */ js.UndefOr[String], Request]
  
  @js.native
  trait Request extends StObject {
    
    def body(data: Any): this.type = js.native
    def body(data: Any, sendAs: json | buffer | form): this.type = js.native
    
    def compress(): this.type = js.native
    
    var compressionEnabled: Boolean = js.native
    
    var coreOptions: RequestOptions = js.native
    
    var data: String | Buffer | Null = js.native
    
    def header(headers: StringDictionary[String]): this.type = js.native
    def header(key: String, value: String): this.type = js.native
    
    var method: String = js.native
    
    @JSName("option")
    def option_agent(key: agent): this.type = js.native
    @JSName("option")
    def option_agent(key: agent, value: Boolean): this.type = js.native
    @JSName("option")
    def option_agent(key: agent, value: Agent): this.type = js.native
    @JSName("option")
    def option_auth(key: auth): this.type = js.native
    @JSName("option")
    def option_auth(key: auth, value: String): this.type = js.native
    @JSName("option")
    def option_createConnection(key: createConnection): this.type = js.native
    @JSName("option")
    def option_createConnection(
      key: createConnection,
      value: js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
          Socket
        ]
    ): this.type = js.native
    @JSName("option")
    def option_defaultAgent(key: _defaultAgent): this.type = js.native
    @JSName("option")
    def option_defaultAgent(key: _defaultAgent, value: Agent): this.type = js.native
    @JSName("option")
    def option_defaultPort(key: defaultPort): this.type = js.native
    @JSName("option")
    def option_defaultPort(key: defaultPort, value: String): this.type = js.native
    @JSName("option")
    def option_defaultPort(key: defaultPort, value: Double): this.type = js.native
    @JSName("option")
    def option_family(key: family): this.type = js.native
    @JSName("option")
    def option_family(key: family, value: Double): this.type = js.native
    @JSName("option")
    def option_headers(key: headers): this.type = js.native
    @JSName("option")
    def option_headers(key: headers, value: OutgoingHttpHeaders): this.type = js.native
    @JSName("option")
    def option_host(key: host): this.type = js.native
    @JSName("option")
    def option_host(key: host, value: String): this.type = js.native
    @JSName("option")
    def option_hostname(key: hostname): this.type = js.native
    @JSName("option")
    def option_hostname(key: hostname, value: String): this.type = js.native
    @JSName("option")
    def option_localAddress(key: localAddress): this.type = js.native
    @JSName("option")
    def option_localAddress(key: localAddress, value: String): this.type = js.native
    @JSName("option")
    def option_lookup(key: lookup): this.type = js.native
    @JSName("option")
    def option_lookup(key: lookup, value: LookupFunction): this.type = js.native
    @JSName("option")
    def option_maxHeaderSize(key: maxHeaderSize): this.type = js.native
    @JSName("option")
    def option_maxHeaderSize(key: maxHeaderSize, value: Double): this.type = js.native
    @JSName("option")
    def option_method(key: method): this.type = js.native
    @JSName("option")
    def option_method(key: method, value: String): this.type = js.native
    @JSName("option")
    def option_path(key: path): this.type = js.native
    @JSName("option")
    def option_path(key: path, value: String): this.type = js.native
    @JSName("option")
    def option_port(key: port): this.type = js.native
    @JSName("option")
    def option_port(key: port, value: String): this.type = js.native
    @JSName("option")
    def option_port(key: port, value: Double): this.type = js.native
    @JSName("option")
    def option_protocol(key: protocol): this.type = js.native
    @JSName("option")
    def option_protocol(key: protocol, value: String): this.type = js.native
    @JSName("option")
    def option_setHost(key: setHost): this.type = js.native
    @JSName("option")
    def option_setHost(key: setHost, value: Boolean): this.type = js.native
    @JSName("option")
    def option_signal(key: signal): this.type = js.native
    @JSName("option")
    def option_signal(key: signal, value: AbortSignal): this.type = js.native
    @JSName("option")
    def option_socketPath(key: socketPath): this.type = js.native
    @JSName("option")
    def option_socketPath(key: socketPath, value: String): this.type = js.native
    @JSName("option")
    def option_timeout(key: timeout): this.type = js.native
    @JSName("option")
    def option_timeout(key: timeout, value: Double): this.type = js.native
    
    def path(relativePath: String): this.type = js.native
    
    def query(key: String, value: Any): this.type = js.native
    def query(params: StringDictionary[Any]): this.type = js.native
    
    var reqHeaders: StringDictionary[String] = js.native
    
    def send(): js.Promise[Response] = js.native
    
    var sendDataAs: form | json | buffer | Null = js.native
    
    def stream(): this.type = js.native
    
    var streamEnabled: Boolean = js.native
    
    def timeout(timeMs: Double): this.type = js.native
    
    var timeoutTime: Double | Null = js.native
    
    var url: URL_ = js.native
  }
  
  trait Response extends StObject {
    
    var body: Buffer
    
    var coreRes: IncomingMessage
    
    var headers: IncomingHttpHeaders
    
    def json(): js.Promise[Any]
    
    var statusCode: js.UndefOr[Double] = js.undefined
    
    def text(): js.Promise[String]
  }
  object Response {
    
    inline def apply(
      body: Buffer,
      coreRes: IncomingMessage,
      headers: IncomingHttpHeaders,
      json: CallbackTo[js.Promise[Any]],
      text: CallbackTo[js.Promise[String]]
    ): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], coreRes = coreRes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCoreRes(value: IncomingMessage): Self = StObject.set(x, "coreRes", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  type _To = CentraFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CentraFactory = ^
}
