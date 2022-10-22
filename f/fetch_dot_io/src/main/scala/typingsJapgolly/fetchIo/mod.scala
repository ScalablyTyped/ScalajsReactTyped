package typingsJapgolly.fetchIo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Response
import typingsJapgolly.fetchIo.fetchIoStrings.form
import typingsJapgolly.fetchIo.fetchIoStrings.json
import typingsJapgolly.fetchIo.fetchIoStrings.urlencoded
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fetch.io", JSImport.Default)
  @js.native
  open class default () extends Request {
    def this(options: Options) = this()
  }
  
  @JSImport("fetch.io", "Request")
  @js.native
  open class Request protected () extends StObject {
    def this(method: TMethod, url: TUrl, options: Options) = this()
    
    /**
      * append formData
      */
    def append(key: String, value: Any): this.type = js.native
    def append(`object`: StringDictionary[Any]): this.type = js.native
    
    /**
      * Set Options
      */
    def config(key: String, value: Any): this.type = js.native
    def config(opts: StringDictionary[Any]): this.type = js.native
    
    /**
      * HTTP delete method
      */
    def delete(url: TUrl): this.type = js.native
    
    /**
      * HTTP get method
      */
    def get(url: TUrl): this.type = js.native
    
    /**
      * HTTP head method
      */
    def head(url: TUrl): this.type = js.native
    
    /**
      * Make Response to JSON
      */
    def json(): js.Promise[Any] = js.native
    def json(strict: Boolean): js.Promise[Any] = js.native
    
    /**
      * HTTP options method
      */
    def options(url: TUrl): this.type = js.native
    
    /**
      * HTTP patch method
      */
    def patch(url: TUrl): this.type = js.native
    
    /**
      * HTTP post method
      */
    def post(url: TUrl): this.type = js.native
    
    /**
      * HTTP put method
      */
    def put(url: TUrl): this.type = js.native
    
    /**
      * Add query string
      */
    def query(`object`: StringDictionary[Any]): this.type = js.native
    
    /**
      * Send data
      */
    def send(data: StringDictionary[Any]): this.type = js.native
    
    /**
      * Set Header
      */
    def set(key: String, value: Any): this.type = js.native
    def set(opts: StringDictionary[Any]): this.type = js.native
    
    /**
      * Make Response to string
      */
    def text(): js.Promise[String] = js.native
    
    /**
      * Get Response directly
      */
    def `then`(resolve: js.Function1[/* value */ js.UndefOr[Response], Unit]): js.Promise[Any] = js.native
    def `then`(
      resolve: js.Function1[/* value */ js.UndefOr[Response], Unit],
      reject: js.Function1[/* reason */ js.UndefOr[Any], Unit]
    ): js.Promise[Any] = js.native
    
    /**
      * Set Content-Type
      */
    def `type`(`type`: json | form | urlencoded): this.type = js.native
  }
  
  type Fetch = Request
  
  type Header = StringDictionary[String]
  
  trait Options
    extends StObject
       with RequestInit {
    
    var afterJSON: js.UndefOr[js.Function1[/* body */ Any, Unit]] = js.undefined
    
    var afterResponse: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.undefined
    
    var beforeRequest: js.UndefOr[js.Function2[/* url */ TUrl, /* body */ BodyInit, Boolean | Unit]] = js.undefined
    
    var header: js.UndefOr[Header] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[Query] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfterJSON(value: /* body */ Any => Callback): Self = StObject.set(x, "afterJSON", js.Any.fromFunction1((t0: /* body */ Any) => value(t0).runNow()))
      
      inline def setAfterJSONUndefined: Self = StObject.set(x, "afterJSON", js.undefined)
      
      inline def setAfterResponse(value: /* res */ Response => Callback): Self = StObject.set(x, "afterResponse", js.Any.fromFunction1((t0: /* res */ Response) => value(t0).runNow()))
      
      inline def setAfterResponseUndefined: Self = StObject.set(x, "afterResponse", js.undefined)
      
      inline def setBeforeRequest(value: (/* url */ TUrl, /* body */ BodyInit) => Boolean | Unit): Self = StObject.set(x, "beforeRequest", js.Any.fromFunction2(value))
      
      inline def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type Query = StringDictionary[Double | Boolean | String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fetchIo.fetchIoStrings.delete
    - typingsJapgolly.fetchIo.fetchIoStrings.get
    - typingsJapgolly.fetchIo.fetchIoStrings.head
    - typingsJapgolly.fetchIo.fetchIoStrings.options
    - typingsJapgolly.fetchIo.fetchIoStrings.post
    - typingsJapgolly.fetchIo.fetchIoStrings.put
  */
  trait TMethod extends StObject
  object TMethod {
    
    inline def delete: typingsJapgolly.fetchIo.fetchIoStrings.delete = "delete".asInstanceOf[typingsJapgolly.fetchIo.fetchIoStrings.delete]
    
    inline def get: typingsJapgolly.fetchIo.fetchIoStrings.get = "get".asInstanceOf[typingsJapgolly.fetchIo.fetchIoStrings.get]
    
    inline def head: typingsJapgolly.fetchIo.fetchIoStrings.head = "head".asInstanceOf[typingsJapgolly.fetchIo.fetchIoStrings.head]
    
    inline def options: typingsJapgolly.fetchIo.fetchIoStrings.options = "options".asInstanceOf[typingsJapgolly.fetchIo.fetchIoStrings.options]
    
    inline def post: typingsJapgolly.fetchIo.fetchIoStrings.post = "post".asInstanceOf[typingsJapgolly.fetchIo.fetchIoStrings.post]
    
    inline def put: typingsJapgolly.fetchIo.fetchIoStrings.put = "put".asInstanceOf[typingsJapgolly.fetchIo.fetchIoStrings.put]
  }
  
  type TUrl = String
}
