package typingsJapgolly.superagent

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import typingsJapgolly.cookiejar.mod.CookieJar
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.std.Error
import typingsJapgolly.std.Promise
import typingsJapgolly.std.Record
import typingsJapgolly.superagent.anon.ContentType
import typingsJapgolly.superagent.anon.Deadline
import typingsJapgolly.superagent.anon.Passphrase
import typingsJapgolly.superagent.anon.Type
import typingsJapgolly.superagent.anon.`0`
import typingsJapgolly.superagent.superagentBooleans.`false`
import typingsJapgolly.superagent.superagentStrings.Cookie
import typingsJapgolly.superagent.superagentStrings.`Set-Cookie`
import typingsJapgolly.superagent.superagentStrings.download
import typingsJapgolly.superagent.superagentStrings.error
import typingsJapgolly.superagent.superagentStrings.progress
import typingsJapgolly.superagent.superagentStrings.response
import typingsJapgolly.superagent.superagentStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("superagent", JSImport.Namespace)
  @js.native
  val ^ : SuperAgentStatic = js.native
  
  type BrowserParser = js.Function1[/* str */ String, Any]
  
  type CallbackHandler = js.Function2[/* err */ Any, /* res */ Response, Unit]
  
  trait HTTPError
    extends StObject
       with Error {
    
    var method: String
    
    var path: String
    
    var status: Double
    
    var text: String
  }
  object HTTPError {
    
    inline def apply(message: String, method: String, name: String, path: String, status: Double, text: String): HTTPError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPError]
    }
    
    extension [Self <: HTTPError](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type MultipartValue = MultipartValueSingle | js.Array[MultipartValueSingle]
  
  type MultipartValueSingle = Blob | Buffer | ReadStream | String | Boolean | Double
  
  type NodeParser = js.Function2[
    /* res */ Response, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* body */ Any, Unit], 
    Unit
  ]
  
  type Parser = BrowserParser | NodeParser
  
  type Plugin = js.Function1[/* req */ SuperAgentRequest, Unit]
  
  trait ProgressEvent extends StObject {
    
    var direction: download | upload
    
    var loaded: Double
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object ProgressEvent {
    
    inline def apply(direction: download | upload, loaded: Double): ProgressEvent = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressEvent]
    }
    
    extension [Self <: ProgressEvent](x: Self) {
      
      inline def setDirection(value: download | upload): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  @js.native
  trait Request
    extends StObject
       with Promise[Response] {
    
    def abort(): Unit = js.native
    
    def accept(`type`: String): this.type = js.native
    
    def attach(field: String, file: MultipartValueSingle): this.type = js.native
    def attach(field: String, file: MultipartValueSingle, options: String): this.type = js.native
    def attach(field: String, file: MultipartValueSingle, options: ContentType): this.type = js.native
    
    def auth(token: String, options: `0`): this.type = js.native
    def auth(user: String, pass: String): this.type = js.native
    def auth(user: String, pass: String, options: Type): this.type = js.native
    
    def buffer(): this.type = js.native
    def buffer(`val`: Boolean): this.type = js.native
    
    def ca(cert: String): this.type = js.native
    def ca(cert: js.Array[Buffer | String]): this.type = js.native
    def ca(cert: Buffer): this.type = js.native
    
    def cert(cert: String): this.type = js.native
    def cert(cert: js.Array[Buffer | String]): this.type = js.native
    def cert(cert: Buffer): this.type = js.native
    
    def clearTimeout(): this.type = js.native
    
    def disableTLSCerts(): this.type = js.native
    
    def end(): Unit = js.native
    def end(callback: CallbackHandler): Unit = js.native
    
    def field(fields: StringDictionary[MultipartValue]): this.type = js.native
    def field(name: String, `val`: MultipartValue): this.type = js.native
    
    def get(field: String): String = js.native
    
    def http2(): this.type = js.native
    def http2(enable: Boolean): this.type = js.native
    
    def key(cert: String): this.type = js.native
    def key(cert: js.Array[Buffer | String]): this.type = js.native
    def key(cert: Buffer): this.type = js.native
    
    def maxResponseSize(size: Double): this.type = js.native
    
    def ok(callback: js.Function1[/* res */ Response, Boolean]): this.type = js.native
    
    def on(name: String, handler: js.Function1[/* event */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(name: error, handler: js.Function1[/* err */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(name: progress, handler: js.Function1[/* event */ ProgressEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_response(name: response, handler: js.Function1[/* response */ Response, Unit]): this.type = js.native
    
    def parse(parser: Parser): this.type = js.native
    
    def part(): this.type = js.native
    
    def pfx(cert: String): this.type = js.native
    def pfx(cert: js.Array[Buffer | String]): this.type = js.native
    def pfx(cert: Buffer): this.type = js.native
    def pfx(cert: Passphrase): this.type = js.native
    
    def pipe(stream: WritableStream): Writable = js.native
    def pipe(stream: WritableStream, options: js.Object): Writable = js.native
    
    def query(`val`: String): this.type = js.native
    def query(`val`: js.Object): this.type = js.native
    
    def redirects(n: Double): this.type = js.native
    
    def responseType(`type`: String): this.type = js.native
    
    def retry(): this.type = js.native
    def retry(count: Double): this.type = js.native
    def retry(count: Double, callback: CallbackHandler): this.type = js.native
    def retry(count: Unit, callback: CallbackHandler): this.type = js.native
    
    def send(): this.type = js.native
    def send(data: String): this.type = js.native
    def send(data: js.Object): this.type = js.native
    
    def serialize(serializer: Serializer): this.type = js.native
    
    def set(field: String, `val`: String): this.type = js.native
    def set(field: js.Object): this.type = js.native
    @JSName("set")
    def set_Cookie(field: Cookie, `val`: js.Array[String]): this.type = js.native
    
    def timeout(ms: Double): this.type = js.native
    def timeout(ms: Deadline): this.type = js.native
    
    def trustLocalhost(): this.type = js.native
    def trustLocalhost(enabled: Boolean): this.type = js.native
    
    def `type`(`val`: String): this.type = js.native
    
    def unset(field: String): this.type = js.native
    
    def use(fn: Plugin): this.type = js.native
    
    def withCredentials(): this.type = js.native
    
    def write(data: String): Boolean = js.native
    def write(data: String, encoding: String): Boolean = js.native
    def write(data: Buffer): Boolean = js.native
    def write(data: Buffer, encoding: String): Boolean = js.native
  }
  
  @js.native
  trait Response
    extends StObject
       with ReadableStream {
    
    var accepted: Boolean = js.native
    
    var badRequest: Boolean = js.native
    
    var body: Any = js.native
    
    var charset: String = js.native
    
    var clientError: Boolean = js.native
    
    var error: `false` | HTTPError = js.native
    
    var files: Any = js.native
    
    var forbidden: Boolean = js.native
    
    def get(header: String): String = js.native
    @JSName("get")
    def get_SetCookie(header: `Set-Cookie`): js.Array[String] = js.native
    
    var header: Any = js.native
    
    var headers: Any = js.native
    
    var info: Boolean = js.native
    
    var links: Record[String, String] = js.native
    
    var noContent: Boolean = js.native
    
    var notAcceptable: Boolean = js.native
    
    var notFound: Boolean = js.native
    
    var ok: Boolean = js.native
    
    var redirect: Boolean = js.native
    
    var redirects: js.Array[String] = js.native
    
    var serverError: Boolean = js.native
    
    var status: Double = js.native
    
    var statusCode: Double = js.native
    
    var statusType: Double = js.native
    
    var text: String = js.native
    
    var `type`: String = js.native
    
    var unauthorized: Boolean = js.native
    
    var xhr: Any = js.native
  }
  
  trait ResponseError
    extends StObject
       with Error {
    
    var response: js.UndefOr[Response] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object ResponseError {
    
    inline def apply(message: String, name: String): ResponseError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseError]
    }
    
    extension [Self <: ResponseError](x: Self) {
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type Serializer = js.Function1[/* obj */ Any, String]
  
  @js.native
  trait SuperAgent[Req /* <: SuperAgentRequest */] extends Stream {
    
    def attachCookies(req: Req): Unit = js.native
    
    def checkout(url: String): Req = js.native
    def checkout(url: String, callback: CallbackHandler): Req = js.native
    
    def connect(url: String): Req = js.native
    def connect(url: String, callback: CallbackHandler): Req = js.native
    
    def copy(url: String): Req = js.native
    def copy(url: String, callback: CallbackHandler): Req = js.native
    
    def del(url: String): Req = js.native
    def del(url: String, callback: CallbackHandler): Req = js.native
    
    def delete(url: String): Req = js.native
    def delete(url: String, callback: CallbackHandler): Req = js.native
    
    def get(url: String): Req = js.native
    def get(url: String, callback: CallbackHandler): Req = js.native
    
    def head(url: String): Req = js.native
    def head(url: String, callback: CallbackHandler): Req = js.native
    
    var jar: CookieJar = js.native
    
    def lock(url: String): Req = js.native
    def lock(url: String, callback: CallbackHandler): Req = js.native
    
    def merge(url: String): Req = js.native
    def merge(url: String, callback: CallbackHandler): Req = js.native
    
    def mkactivity(url: String): Req = js.native
    def mkactivity(url: String, callback: CallbackHandler): Req = js.native
    
    def mkcol(url: String): Req = js.native
    def mkcol(url: String, callback: CallbackHandler): Req = js.native
    
    def move(url: String): Req = js.native
    def move(url: String, callback: CallbackHandler): Req = js.native
    
    def notify(url: String): Req = js.native
    def notify(url: String, callback: CallbackHandler): Req = js.native
    
    def options(url: String): Req = js.native
    def options(url: String, callback: CallbackHandler): Req = js.native
    
    def patch(url: String): Req = js.native
    def patch(url: String, callback: CallbackHandler): Req = js.native
    
    def post(url: String): Req = js.native
    def post(url: String, callback: CallbackHandler): Req = js.native
    
    def propfind(url: String): Req = js.native
    def propfind(url: String, callback: CallbackHandler): Req = js.native
    
    def proppatch(url: String): Req = js.native
    def proppatch(url: String, callback: CallbackHandler): Req = js.native
    
    def purge(url: String): Req = js.native
    def purge(url: String, callback: CallbackHandler): Req = js.native
    
    def put(url: String): Req = js.native
    def put(url: String, callback: CallbackHandler): Req = js.native
    
    def report(url: String): Req = js.native
    def report(url: String, callback: CallbackHandler): Req = js.native
    
    def saveCookies(res: Response): Unit = js.native
    
    def search(url: String): Req = js.native
    def search(url: String, callback: CallbackHandler): Req = js.native
    
    def subscribe(url: String): Req = js.native
    def subscribe(url: String, callback: CallbackHandler): Req = js.native
    
    def trace(url: String): Req = js.native
    def trace(url: String, callback: CallbackHandler): Req = js.native
    
    def unlock(url: String): Req = js.native
    def unlock(url: String, callback: CallbackHandler): Req = js.native
    
    def unsubscribe(url: String): Req = js.native
    def unsubscribe(url: String, callback: CallbackHandler): Req = js.native
  }
  
  @js.native
  trait SuperAgentRequest
    extends StObject
       with Request {
    
    def agent(): this.type = js.native
    def agent(agent: Agent): this.type = js.native
    
    var cookies: String = js.native
    
    var method: String = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait SuperAgentStatic extends SuperAgent[SuperAgentRequest] {
    
    // tslint:disable-next-line:unified-signatures
    def apply(method: String, url: String): SuperAgentRequest = js.native
    def apply(url: String): SuperAgentRequest = js.native
    
    def agent(): this.type & Request = js.native
    
    var parse: StringDictionary[Parser] = js.native
    
    var serialize: StringDictionary[Serializer] = js.native
  }
  
  type _To = SuperAgentStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SuperAgentStatic = ^
}
