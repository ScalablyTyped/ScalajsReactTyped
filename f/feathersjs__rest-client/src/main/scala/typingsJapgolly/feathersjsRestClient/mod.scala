package typingsJapgolly.feathersjsRestClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@feathersjs/rest-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Transport]
  inline def default(base: String): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(base.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  type Handler = js.Function2[/* connection */ Any, /* options */ js.UndefOr[Any], js.Function0[HandlerResult]]
  
  @js.native
  trait HandlerResult
    extends js.Function {
    
    /**
      * initialize service
      */
    def apply(): Unit = js.native
    
    /**
      * Transport Service
      */
    var Service: Any = js.native
    
    /**
      * default Service
      */
    var service: Any = js.native
  }
  
  trait Transport extends StObject {
    
    def angular(connection: Any): js.Function0[HandlerResult]
    def angular(connection: Any, options: Any): js.Function0[HandlerResult]
    
    def angularHttpClient(connection: Any): js.Function0[HandlerResult]
    def angularHttpClient(connection: Any, options: Any): js.Function0[HandlerResult]
    @JSName("angularHttpClient")
    var angularHttpClient_Original: Handler
    
    @JSName("angular")
    var angular_Original: Handler
    
    def axios(connection: Any): js.Function0[HandlerResult]
    def axios(connection: Any, options: Any): js.Function0[HandlerResult]
    @JSName("axios")
    var axios_Original: Handler
    
    def fetch(connection: Any): js.Function0[HandlerResult]
    def fetch(connection: Any, options: Any): js.Function0[HandlerResult]
    @JSName("fetch")
    var fetch_Original: Handler
    
    def jquery(connection: Any): js.Function0[HandlerResult]
    def jquery(connection: Any, options: Any): js.Function0[HandlerResult]
    @JSName("jquery")
    var jquery_Original: Handler
    
    def request(connection: Any): js.Function0[HandlerResult]
    def request(connection: Any, options: Any): js.Function0[HandlerResult]
    @JSName("request")
    var request_Original: Handler
    
    def superagent(connection: Any): js.Function0[HandlerResult]
    def superagent(connection: Any, options: Any): js.Function0[HandlerResult]
    @JSName("superagent")
    var superagent_Original: Handler
  }
  object Transport {
    
    inline def apply(
      angular: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult],
      angularHttpClient: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult],
      axios: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult],
      fetch: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult],
      jquery: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult],
      request: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult],
      superagent: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]
    ): Transport = {
      val __obj = js.Dynamic.literal(angular = js.Any.fromFunction2(angular), angularHttpClient = js.Any.fromFunction2(angularHttpClient), axios = js.Any.fromFunction2(axios), fetch = js.Any.fromFunction2(fetch), jquery = js.Any.fromFunction2(jquery), request = js.Any.fromFunction2(request), superagent = js.Any.fromFunction2(superagent))
      __obj.asInstanceOf[Transport]
    }
    
    extension [Self <: Transport](x: Self) {
      
      inline def setAngular(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "angular", js.Any.fromFunction2(value))
      
      inline def setAngularHttpClient(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "angularHttpClient", js.Any.fromFunction2(value))
      
      inline def setAxios(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "axios", js.Any.fromFunction2(value))
      
      inline def setFetch(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setJquery(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "jquery", js.Any.fromFunction2(value))
      
      inline def setRequest(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
      
      inline def setSuperagent(value: (/* connection */ Any, /* options */ js.UndefOr[Any]) => js.Function0[HandlerResult]): Self = StObject.set(x, "superagent", js.Any.fromFunction2(value))
    }
  }
}
