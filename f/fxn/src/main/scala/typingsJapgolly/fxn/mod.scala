package typingsJapgolly.fxn

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("fxn", "Application")
  @js.native
  open class Application protected () extends StObject {
    def this(string: String) = this()
    
    var send: js.Function = js.native
  }
  
  /* note: abstract class */ @JSImport("fxn", "Controller")
  @js.native
  open class Controller protected () extends StObject {
    def this(path: String, method: String, requestHeaders: js.Object, params: js.Object, responder: js.Function) = this()
    
    /* protected */ var _headers: js.Object = js.native
    
    /* protected */ var _method: HttpMethod = js.native
    
    /* protected */ var _path: String = js.native
    
    /* protected */ var _requestHeaders: js.Object = js.native
    
    /* protected */ var _responder: js.Function = js.native
    
    /* protected */ var _securityPolicies: js.Object = js.native
    
    /* protected */ var _status: Double = js.native
    
    def after(): Unit = js.native
    
    def allowOrigin(value: String): this.type = js.native
    
    def appendHeader(key: String, value: String): String = js.native
    
    def before(): Unit = js.native
    
    def code(code: Double): Double = js.native
    
    def convertMethod(method: HttpMethod, id: Double): String = js.native
    
    def create(): Unit = js.native
    
    def del(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def get(): Unit = js.native
    
    def getHeader(key: String, value: String): String = js.native
    
    def getStatus(): Double = js.native
    
    def index(): Unit = js.native
    
    def notImplemented(msg: String, details: js.Object): Boolean = js.native
    
    def options(): Unit = js.native
    
    /* protected */ var params: Any = js.native
    
    def post(): Unit = js.native
    
    def put(): Unit = js.native
    
    def redirect(location: String): Unit = js.native
    
    def render(data: String): Unit = js.native
    def render(data: js.Object): Unit = js.native
    def render(data: Buffer): Unit = js.native
    
    def run(): Unit = js.native
    
    def securityPolicy(directive: String, src: String): String = js.native
    
    def setHeader(key: String, value: String): String = js.native
    
    def setHeaders(): HttpHeaders = js.native
    
    def show(): Unit = js.native
    
    def status(value: Double): Boolean = js.native
    
    def update(): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("fxn", "Daemon")
  @js.native
  open class Daemon protected () extends StObject {
    def this(string: String) = this()
  }
  
  /* note: abstract class */ @JSImport("fxn", "Router")
  @js.native
  open class Router () extends StObject
  
  /* note: abstract class */ @JSImport("fxn", "Scheduler")
  @js.native
  open class Scheduler () extends StObject
  
  type HttpHeaders = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fxn.fxnStrings.GET
    - typingsJapgolly.fxn.fxnStrings.POST
    - typingsJapgolly.fxn.fxnStrings.PUT
    - typingsJapgolly.fxn.fxnStrings.DELETE
    - typingsJapgolly.fxn.fxnStrings.OPTIONS
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def DELETE: typingsJapgolly.fxn.fxnStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.fxn.fxnStrings.DELETE]
    
    inline def GET: typingsJapgolly.fxn.fxnStrings.GET = "GET".asInstanceOf[typingsJapgolly.fxn.fxnStrings.GET]
    
    inline def OPTIONS: typingsJapgolly.fxn.fxnStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.fxn.fxnStrings.OPTIONS]
    
    inline def POST: typingsJapgolly.fxn.fxnStrings.POST = "POST".asInstanceOf[typingsJapgolly.fxn.fxnStrings.POST]
    
    inline def PUT: typingsJapgolly.fxn.fxnStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.fxn.fxnStrings.PUT]
  }
}
