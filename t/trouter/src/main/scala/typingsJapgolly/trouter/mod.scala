package typingsJapgolly.trouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trouter", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with Trouter[T]
  
  trait FindResult[T] extends StObject {
    
    var handlers: js.Array[T]
    
    var params: StringDictionary[String]
  }
  object FindResult {
    
    inline def apply[T](handlers: js.Array[T], params: StringDictionary[String]): FindResult[T] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult[T]]
    }
    
    extension [Self <: FindResult[?], T](x: Self & FindResult[T]) {
      
      inline def setHandlers(value: js.Array[T]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersVarargs(value: T*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.trouter.trouterStrings.ACL
    - typingsJapgolly.trouter.trouterStrings.BIND
    - typingsJapgolly.trouter.trouterStrings.CHECKOUT
    - typingsJapgolly.trouter.trouterStrings.CONNECT
    - typingsJapgolly.trouter.trouterStrings.COPY
    - typingsJapgolly.trouter.trouterStrings.DELETE
    - typingsJapgolly.trouter.trouterStrings.GET
    - typingsJapgolly.trouter.trouterStrings.HEAD
    - typingsJapgolly.trouter.trouterStrings.LINK
    - typingsJapgolly.trouter.trouterStrings.LOCK
    - typingsJapgolly.trouter.trouterStrings.`M-SEARCH`
    - typingsJapgolly.trouter.trouterStrings.MERGE
    - typingsJapgolly.trouter.trouterStrings.MKACTIVITY
    - typingsJapgolly.trouter.trouterStrings.MKCALENDAR
    - typingsJapgolly.trouter.trouterStrings.MKCOL
    - typingsJapgolly.trouter.trouterStrings.MOVE
    - typingsJapgolly.trouter.trouterStrings.NOTIFY
    - typingsJapgolly.trouter.trouterStrings.OPTIONS
    - typingsJapgolly.trouter.trouterStrings.PATCH
    - typingsJapgolly.trouter.trouterStrings.POST
    - typingsJapgolly.trouter.trouterStrings.PROPFIND
    - typingsJapgolly.trouter.trouterStrings.PROPPATCH
    - typingsJapgolly.trouter.trouterStrings.PURGE
    - typingsJapgolly.trouter.trouterStrings.PUT
    - typingsJapgolly.trouter.trouterStrings.REBIND
    - typingsJapgolly.trouter.trouterStrings.REPORT
    - typingsJapgolly.trouter.trouterStrings.SEARCH
    - typingsJapgolly.trouter.trouterStrings.SOURCE
    - typingsJapgolly.trouter.trouterStrings.SUBSCRIBE
    - typingsJapgolly.trouter.trouterStrings.TRACE
    - typingsJapgolly.trouter.trouterStrings.UNBIND
    - typingsJapgolly.trouter.trouterStrings.UNLINK
    - typingsJapgolly.trouter.trouterStrings.UNLOCK
    - typingsJapgolly.trouter.trouterStrings.UNSUBSCRIBE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def ACL: typingsJapgolly.trouter.trouterStrings.ACL = "ACL".asInstanceOf[typingsJapgolly.trouter.trouterStrings.ACL]
    
    inline def BIND: typingsJapgolly.trouter.trouterStrings.BIND = "BIND".asInstanceOf[typingsJapgolly.trouter.trouterStrings.BIND]
    
    inline def CHECKOUT: typingsJapgolly.trouter.trouterStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typingsJapgolly.trouter.trouterStrings.CHECKOUT]
    
    inline def CONNECT: typingsJapgolly.trouter.trouterStrings.CONNECT = "CONNECT".asInstanceOf[typingsJapgolly.trouter.trouterStrings.CONNECT]
    
    inline def COPY: typingsJapgolly.trouter.trouterStrings.COPY = "COPY".asInstanceOf[typingsJapgolly.trouter.trouterStrings.COPY]
    
    inline def DELETE: typingsJapgolly.trouter.trouterStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.DELETE]
    
    inline def GET: typingsJapgolly.trouter.trouterStrings.GET = "GET".asInstanceOf[typingsJapgolly.trouter.trouterStrings.GET]
    
    inline def HEAD: typingsJapgolly.trouter.trouterStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.trouter.trouterStrings.HEAD]
    
    inline def LINK: typingsJapgolly.trouter.trouterStrings.LINK = "LINK".asInstanceOf[typingsJapgolly.trouter.trouterStrings.LINK]
    
    inline def LOCK: typingsJapgolly.trouter.trouterStrings.LOCK = "LOCK".asInstanceOf[typingsJapgolly.trouter.trouterStrings.LOCK]
    
    inline def `M-SEARCH`: typingsJapgolly.trouter.trouterStrings.`M-SEARCH` = "M-SEARCH".asInstanceOf[typingsJapgolly.trouter.trouterStrings.`M-SEARCH`]
    
    inline def MERGE: typingsJapgolly.trouter.trouterStrings.MERGE = "MERGE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.MERGE]
    
    inline def MKACTIVITY: typingsJapgolly.trouter.trouterStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typingsJapgolly.trouter.trouterStrings.MKACTIVITY]
    
    inline def MKCALENDAR: typingsJapgolly.trouter.trouterStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typingsJapgolly.trouter.trouterStrings.MKCALENDAR]
    
    inline def MKCOL: typingsJapgolly.trouter.trouterStrings.MKCOL = "MKCOL".asInstanceOf[typingsJapgolly.trouter.trouterStrings.MKCOL]
    
    inline def MOVE: typingsJapgolly.trouter.trouterStrings.MOVE = "MOVE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.MOVE]
    
    inline def NOTIFY: typingsJapgolly.trouter.trouterStrings.NOTIFY = "NOTIFY".asInstanceOf[typingsJapgolly.trouter.trouterStrings.NOTIFY]
    
    inline def OPTIONS: typingsJapgolly.trouter.trouterStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.trouter.trouterStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.trouter.trouterStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.trouter.trouterStrings.PATCH]
    
    inline def POST: typingsJapgolly.trouter.trouterStrings.POST = "POST".asInstanceOf[typingsJapgolly.trouter.trouterStrings.POST]
    
    inline def PROPFIND: typingsJapgolly.trouter.trouterStrings.PROPFIND = "PROPFIND".asInstanceOf[typingsJapgolly.trouter.trouterStrings.PROPFIND]
    
    inline def PROPPATCH: typingsJapgolly.trouter.trouterStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typingsJapgolly.trouter.trouterStrings.PROPPATCH]
    
    inline def PURGE: typingsJapgolly.trouter.trouterStrings.PURGE = "PURGE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.PURGE]
    
    inline def PUT: typingsJapgolly.trouter.trouterStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.trouter.trouterStrings.PUT]
    
    inline def REBIND: typingsJapgolly.trouter.trouterStrings.REBIND = "REBIND".asInstanceOf[typingsJapgolly.trouter.trouterStrings.REBIND]
    
    inline def REPORT: typingsJapgolly.trouter.trouterStrings.REPORT = "REPORT".asInstanceOf[typingsJapgolly.trouter.trouterStrings.REPORT]
    
    inline def SEARCH: typingsJapgolly.trouter.trouterStrings.SEARCH = "SEARCH".asInstanceOf[typingsJapgolly.trouter.trouterStrings.SEARCH]
    
    inline def SOURCE: typingsJapgolly.trouter.trouterStrings.SOURCE = "SOURCE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.SOURCE]
    
    inline def SUBSCRIBE: typingsJapgolly.trouter.trouterStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.SUBSCRIBE]
    
    inline def TRACE: typingsJapgolly.trouter.trouterStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.TRACE]
    
    inline def UNBIND: typingsJapgolly.trouter.trouterStrings.UNBIND = "UNBIND".asInstanceOf[typingsJapgolly.trouter.trouterStrings.UNBIND]
    
    inline def UNLINK: typingsJapgolly.trouter.trouterStrings.UNLINK = "UNLINK".asInstanceOf[typingsJapgolly.trouter.trouterStrings.UNLINK]
    
    inline def UNLOCK: typingsJapgolly.trouter.trouterStrings.UNLOCK = "UNLOCK".asInstanceOf[typingsJapgolly.trouter.trouterStrings.UNLOCK]
    
    inline def UNSUBSCRIBE: typingsJapgolly.trouter.trouterStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typingsJapgolly.trouter.trouterStrings.UNSUBSCRIBE]
  }
  
  @js.native
  trait Trouter[T] extends StObject {
    
    def add(method: HTTPMethod, pattern: String, handlers: T*): this.type = js.native
    def add(method: HTTPMethod, pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def all(pattern: String, handlers: T*): this.type = js.native
    def all(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def connect(pattern: String, handlers: T*): this.type = js.native
    def connect(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def delete(pattern: String, handlers: T*): this.type = js.native
    def delete(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def find(method: HTTPMethod, url: String): FindResult[T] = js.native
    
    def get(pattern: String, handlers: T*): this.type = js.native
    def get(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def head(pattern: String, handlers: T*): this.type = js.native
    def head(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def options(pattern: String, handlers: T*): this.type = js.native
    def options(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def patch(pattern: String, handlers: T*): this.type = js.native
    def patch(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def post(pattern: String, handlers: T*): this.type = js.native
    def post(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def put(pattern: String, handlers: T*): this.type = js.native
    def put(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def trace(pattern: String, handlers: T*): this.type = js.native
    def trace(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def use(pattern: String, handlers: T*): this.type = js.native
    def use(pattern: js.RegExp, handlers: T*): this.type = js.native
  }
}
