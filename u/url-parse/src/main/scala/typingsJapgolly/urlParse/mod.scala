package typingsJapgolly.urlParse

import typingsJapgolly.std.Record
import typingsJapgolly.urlParse.anon.Parse
import typingsJapgolly.urlParse.anon.Protocol
import typingsJapgolly.urlParse.urlParseBooleans.`false`
import typingsJapgolly.urlParse.urlParseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(address: String): URLParse[String] = ^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any]).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: String): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: String, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: String, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply(address: String, location: js.Object): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: js.Object, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: js.Object, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply(address: String, location: Unit, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, location: Unit, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply(address: String, parser: `false`): URLParse[String] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[String]]
  inline def apply(address: String, parser: `true`): URLParse[Record[String, js.UndefOr[String]]] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[Record[String, js.UndefOr[String]]]]
  inline def apply[T](address: String, location: String, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  inline def apply[T](address: String, location: js.Object, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  inline def apply[T](address: String, location: Unit, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], location.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  inline def apply[T](address: String, parser: QueryParser[T]): URLParse[T] = (^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[URLParse[T]]
  
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("url-parse", JSImport.Namespace)
  @js.native
  open class Class[T] protected ()
    extends StObject
       with URLParse[T] {
    def this(address: String) = this()
    def this(address: String, parser: QueryParser[T]) = this()
    def this(address: String, location: String, parser: QueryParser[T]) = this()
    def this(address: String, location: js.Object, parser: QueryParser[T]) = this()
    def this(address: String, location: Unit, parser: QueryParser[T]) = this()
  }
  
  inline def extractProtocol(url: String): Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("extractProtocol")(url.asInstanceOf[js.Any]).asInstanceOf[Protocol]
  
  inline def location(url: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(url.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @JSImport("url-parse", "qs")
  @js.native
  def qs: Parse = js.native
  inline def qs_=(x: Parse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qs")(x.asInstanceOf[js.Any])
  
  inline def trimLeft(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimLeft")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type QueryParser[T] = js.Function1[/* query */ String, T]
  
  type StringifyQuery = js.Function1[/* query */ js.Object, String]
  
  @js.native
  trait URLParse[Query] extends StObject {
    
    val auth: String = js.native
    
    val hash: String = js.native
    
    val host: String = js.native
    
    val hostname: String = js.native
    
    val href: String = js.native
    
    val origin: String = js.native
    
    val password: String = js.native
    
    val pathname: String = js.native
    
    val port: String = js.native
    
    val protocol: String = js.native
    
    val query: Query = js.native
    
    def set[Part /* <: URLPart */](part: Part): URLParse[Query] = js.native
    def set[Part /* <: URLPart */](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<Query>[Part] */ js.Any
    ): URLParse[Query] = js.native
    def set[Part /* <: URLPart */, T](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<T>[Part] */ js.Any,
      fn: QueryParser[T]
    ): URLParse[T] = js.native
    def set[Part /* <: URLPart */, T](part: Part, value: Unit, fn: QueryParser[T]): URLParse[T] = js.native
    @JSName("set")
    def set_PartT[Part /* <: URLPart */, T](part: Part): URLParse[T] = js.native
    @JSName("set")
    def set_PartT[Part /* <: URLPart */, T](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<T>[Part] */ js.Any
    ): URLParse[T] = js.native
    @JSName("set")
    def set_false[Part /* <: URLPart */](
      part: Part,
      value: /* import warning: importer.ImportType#apply Failed type conversion: url-parse.url-parse.URLParse<Query>[Part] */ js.Any,
      fn: `false`
    ): URLParse[Query] = js.native
    @JSName("set")
    def set_false[Part /* <: URLPart */](part: Part, value: Unit, fn: `false`): URLParse[Query] = js.native
    
    val slashes: Boolean = js.native
    
    def toString(stringify: StringifyQuery): String = js.native
    
    val username: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.urlParse.urlParseStrings.auth
    - typingsJapgolly.urlParse.urlParseStrings.hash
    - typingsJapgolly.urlParse.urlParseStrings.host
    - typingsJapgolly.urlParse.urlParseStrings.hostname
    - typingsJapgolly.urlParse.urlParseStrings.href
    - typingsJapgolly.urlParse.urlParseStrings.origin
    - typingsJapgolly.urlParse.urlParseStrings.password
    - typingsJapgolly.urlParse.urlParseStrings.pathname
    - typingsJapgolly.urlParse.urlParseStrings.port
    - typingsJapgolly.urlParse.urlParseStrings.protocol
    - typingsJapgolly.urlParse.urlParseStrings.query
    - typingsJapgolly.urlParse.urlParseStrings.slashes
    - typingsJapgolly.urlParse.urlParseStrings.username
  */
  trait URLPart extends StObject
  object URLPart {
    
    inline def auth: typingsJapgolly.urlParse.urlParseStrings.auth = "auth".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.auth]
    
    inline def hash: typingsJapgolly.urlParse.urlParseStrings.hash = "hash".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.hash]
    
    inline def host: typingsJapgolly.urlParse.urlParseStrings.host = "host".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.host]
    
    inline def hostname: typingsJapgolly.urlParse.urlParseStrings.hostname = "hostname".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.hostname]
    
    inline def href: typingsJapgolly.urlParse.urlParseStrings.href = "href".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.href]
    
    inline def origin: typingsJapgolly.urlParse.urlParseStrings.origin = "origin".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.origin]
    
    inline def password: typingsJapgolly.urlParse.urlParseStrings.password = "password".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.password]
    
    inline def pathname: typingsJapgolly.urlParse.urlParseStrings.pathname = "pathname".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.pathname]
    
    inline def port: typingsJapgolly.urlParse.urlParseStrings.port = "port".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.port]
    
    inline def protocol: typingsJapgolly.urlParse.urlParseStrings.protocol = "protocol".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.protocol]
    
    inline def query: typingsJapgolly.urlParse.urlParseStrings.query = "query".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.query]
    
    inline def slashes: typingsJapgolly.urlParse.urlParseStrings.slashes = "slashes".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.slashes]
    
    inline def username: typingsJapgolly.urlParse.urlParseStrings.username = "username".asInstanceOf[typingsJapgolly.urlParse.urlParseStrings.username]
  }
}
