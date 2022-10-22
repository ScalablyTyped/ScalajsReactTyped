package typingsJapgolly.apicalypse

import typingsJapgolly.axios.mod.AxiosRequestConfig
import typingsJapgolly.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apicalypse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Apicalypse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Apicalypse]
  inline def default(options: ApicalypseConfig): Apicalypse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Apicalypse]
  inline def default(rawQueryString: String): Apicalypse = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawQueryString.asInstanceOf[js.Any]).asInstanceOf[Apicalypse]
  inline def default(rawQueryString: String, options: ApicalypseConfig): Apicalypse = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawQueryString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Apicalypse]
  
  @js.native
  trait Apicalypse extends StObject {
    
    def fields(fields: String): Apicalypse = js.native
    def fields(fields: js.Array[String]): Apicalypse = js.native
    
    def limit(limit: Double): Apicalypse = js.native
    
    def multi(queries: js.Array[Apicalypse]): Apicalypse = js.native
    
    def offset(offset: Double): Apicalypse = js.native
    
    def query(endpoint: String, name: String): Apicalypse = js.native
    
    def request(url: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def requestAll(url: String): js.Promise[js.Array[Any]] = js.native
    def requestAll(url: String, options: RequestAllConfig): js.Promise[js.Array[Any]] = js.native
    
    def search(search: String): Apicalypse = js.native
    
    def sort(field: String): Apicalypse = js.native
    def sort(field: String, direction: SortDirection): Apicalypse = js.native
    
    def where(filters: String): Apicalypse = js.native
    def where(filters: js.Array[String]): Apicalypse = js.native
  }
  
  trait ApicalypseConfig
    extends StObject
       with AxiosRequestConfig[Any] {
    
    var queryMethod: js.UndefOr[QueryMethod] = js.undefined
  }
  object ApicalypseConfig {
    
    inline def apply(): ApicalypseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApicalypseConfig]
    }
    
    extension [Self <: ApicalypseConfig](x: Self) {
      
      inline def setQueryMethod(value: QueryMethod): Self = StObject.set(x, "queryMethod", value.asInstanceOf[js.Any])
      
      inline def setQueryMethodUndefined: Self = StObject.set(x, "queryMethod", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apicalypse.apicalypseStrings.body
    - typingsJapgolly.apicalypse.apicalypseStrings.url
  */
  trait QueryMethod extends StObject
  object QueryMethod {
    
    inline def body: typingsJapgolly.apicalypse.apicalypseStrings.body = "body".asInstanceOf[typingsJapgolly.apicalypse.apicalypseStrings.body]
    
    inline def url: typingsJapgolly.apicalypse.apicalypseStrings.url = "url".asInstanceOf[typingsJapgolly.apicalypse.apicalypseStrings.url]
  }
  
  trait RequestAllConfig extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
  }
  object RequestAllConfig {
    
    inline def apply(): RequestAllConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestAllConfig]
    }
    
    extension [Self <: RequestAllConfig](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apicalypse.apicalypseStrings.asc
    - typingsJapgolly.apicalypse.apicalypseStrings.desc
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    inline def asc: typingsJapgolly.apicalypse.apicalypseStrings.asc = "asc".asInstanceOf[typingsJapgolly.apicalypse.apicalypseStrings.asc]
    
    inline def desc: typingsJapgolly.apicalypse.apicalypseStrings.desc = "desc".asInstanceOf[typingsJapgolly.apicalypse.apicalypseStrings.desc]
  }
}
