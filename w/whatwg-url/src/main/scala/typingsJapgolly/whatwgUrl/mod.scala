package typingsJapgolly.whatwgUrl

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.whatwgUrl.anon.BaseURL
import typingsJapgolly.whatwgUrl.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("whatwg-url", "URL")
  @js.native
  open class URL protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
    def this(url: String, base: URL) = this()
    
    def hash: String = js.native
    def hash_=(V: String): Unit = js.native
    
    def host: String = js.native
    def host_=(V: String): Unit = js.native
    
    def hostname: String = js.native
    def hostname_=(V: String): Unit = js.native
    
    def href: String = js.native
    def href_=(V: String): Unit = js.native
    
    def origin: String = js.native
    
    def password: String = js.native
    def password_=(V: String): Unit = js.native
    
    def pathname: String = js.native
    def pathname_=(V: String): Unit = js.native
    
    def port: String = js.native
    def port_=(V: String): Unit = js.native
    
    def protocol: String = js.native
    def protocol_=(V: String): Unit = js.native
    
    def search: String = js.native
    
    def searchParams: URLSearchParams = js.native
    
    def search_=(V: String): Unit = js.native
    
    def toJSON(): String = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: typingsJapgolly.whatwgUrl.whatwgUrlStrings.URL = js.native
    
    def username: String = js.native
    def username_=(V: String): Unit = js.native
  }
  
  @JSImport("whatwg-url", "URLSearchParams")
  @js.native
  open class URLSearchParams () extends StObject {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[/* name */ String, /* value */ String]]) = this()
    def this(init: js.Iterable[js.Tuple2[/* name */ String, /* value */ String]]) = this()
    def this(init: StringDictionary[String]) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[/* name */ String, /* value */ String]] = js.native
    
    def forEach[THIS_ARG](
      callback: js.ThisFunction3[
          /* this */ THIS_ARG, 
          /* value */ String, 
          /* name */ String, 
          /* searchParams */ this.type, 
          Unit
        ]
    ): Unit = js.native
    def forEach[THIS_ARG](
      callback: js.ThisFunction3[
          /* this */ THIS_ARG, 
          /* value */ String, 
          /* name */ String, 
          /* searchParams */ this.type, 
          Unit
        ],
      thisArg: THIS_ARG
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[/* name */ String, /* value */ String]]] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: typingsJapgolly.whatwgUrl.whatwgUrlStrings.URLSearchParams = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  inline def basicURLParse(input: String): URLRecord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("basicURLParse")(input.asInstanceOf[js.Any]).asInstanceOf[URLRecord | Null]
  inline def basicURLParse(input: String, options: BaseURL): URLRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("basicURLParse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URLRecord | Null]
  
  inline def cannotHaveAUsernamePasswordPort(urlRecord: URLRecord): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cannotHaveAUsernamePasswordPort")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasAnOpaquePath(urlRecord: URLRecord): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnOpaquePath")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseURL(input: String): URLRecord | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(input.asInstanceOf[js.Any]).asInstanceOf[URLRecord | Null]
  inline def parseURL(input: String, options: `0`): URLRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URLRecord | Null]
  
  inline def percentDecodeBytes(buffer: TypedArray): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("percentDecodeBytes")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def percentDecodeString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("percentDecodeString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def serializeHost(host: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHost")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeHost(host: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHost")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeHost(host: IPv6Address): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeHost")(host.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeInteger(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInteger")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializePath(urlRecord: URLRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializePath")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeURL(urlRecord: URLRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeURL")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeURL(urlRecord: URLRecord, excludeFragment: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeURL")(urlRecord.asInstanceOf[js.Any], excludeFragment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeURLOrigin(urlRecord: URLRecord): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeURLOrigin")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setThePassword(urlRecord: URLRecord, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setThePassword")(urlRecord.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTheUsername(urlRecord: URLRecord, username: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTheUsername")(urlRecord.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IPv6Address = js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`scheme start`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.scheme
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`no scheme`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special relative or authority`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`path or authority`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.relative
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`relative slash`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special authority slashes`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.authority
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.host
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.hostname
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.port
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.file
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`file slash`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`file host`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`path start`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.path
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.`opaque path`
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.query
    - typingsJapgolly.whatwgUrl.whatwgUrlStrings.fragment
  */
  trait StateOverride extends StObject
  object StateOverride {
    
    inline def authority: typingsJapgolly.whatwgUrl.whatwgUrlStrings.authority = "authority".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.authority]
    
    inline def file: typingsJapgolly.whatwgUrl.whatwgUrlStrings.file = "file".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.file]
    
    inline def `file host`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`file host` = ("file host").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`file host`]
    
    inline def `file slash`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`file slash` = ("file slash").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`file slash`]
    
    inline def fragment: typingsJapgolly.whatwgUrl.whatwgUrlStrings.fragment = "fragment".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.fragment]
    
    inline def host: typingsJapgolly.whatwgUrl.whatwgUrlStrings.host = "host".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.host]
    
    inline def hostname: typingsJapgolly.whatwgUrl.whatwgUrlStrings.hostname = "hostname".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.hostname]
    
    inline def `no scheme`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`no scheme` = ("no scheme").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`no scheme`]
    
    inline def `opaque path`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`opaque path` = ("opaque path").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`opaque path`]
    
    inline def path: typingsJapgolly.whatwgUrl.whatwgUrlStrings.path = "path".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.path]
    
    inline def `path or authority`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`path or authority` = ("path or authority").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`path or authority`]
    
    inline def `path start`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`path start` = ("path start").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`path start`]
    
    inline def port: typingsJapgolly.whatwgUrl.whatwgUrlStrings.port = "port".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.port]
    
    inline def query: typingsJapgolly.whatwgUrl.whatwgUrlStrings.query = "query".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.query]
    
    inline def relative: typingsJapgolly.whatwgUrl.whatwgUrlStrings.relative = "relative".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.relative]
    
    inline def `relative slash`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`relative slash` = ("relative slash").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`relative slash`]
    
    inline def scheme: typingsJapgolly.whatwgUrl.whatwgUrlStrings.scheme = "scheme".asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.scheme]
    
    inline def `scheme start`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`scheme start` = ("scheme start").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`scheme start`]
    
    inline def `special authority ignore slashes`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes` = ("special authority ignore slashes").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special authority ignore slashes`]
    
    inline def `special authority slashes`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special authority slashes` = ("special authority slashes").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special authority slashes`]
    
    inline def `special relative or authority`: typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special relative or authority` = ("special relative or authority").asInstanceOf[typingsJapgolly.whatwgUrl.whatwgUrlStrings.`special relative or authority`]
  }
  
  type TypedArray = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  trait URLRecord extends StObject {
    
    var fragment: String | Null
    
    var host: String | Double | IPv6Address | Null
    
    var password: String
    
    var path: String | js.Array[String]
    
    var port: Double | Null
    
    var query: String | Null
    
    var scheme: String
    
    var username: String
  }
  object URLRecord {
    
    inline def apply(password: String, path: String | js.Array[String], scheme: String, username: String): URLRecord = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], fragment = null, host = null, port = null, query = null)
      __obj.asInstanceOf[URLRecord]
    }
    
    extension [Self <: URLRecord](x: Self) {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      inline def setHost(value: String | Double | IPv6Address): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
