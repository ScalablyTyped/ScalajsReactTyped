package typingsJapgolly.protractorHttpMock

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.protractorHttpMock.anon.Data
import typingsJapgolly.protractorHttpMock.anon.DataMethod
import typingsJapgolly.protractorHttpMock.anon.Delay
import typingsJapgolly.protractorHttpMock.anon.MethodPath
import typingsJapgolly.protractorHttpMock.anon.MethodPathRegex
import typingsJapgolly.protractorHttpMock.anon.Mocks
import typingsJapgolly.protractorHttpMock.anon.Path
import typingsJapgolly.protractorHttpMock.anon.PathRegex
import typingsJapgolly.protractorHttpMock.anon.PathString
import typingsJapgolly.protractorHttpMock.anon.Regex
import typingsJapgolly.protractorHttpMock.mod.requests.AllRequests
import typingsJapgolly.protractorHttpMock.mod.requests.Get
import typingsJapgolly.protractorHttpMock.mod.requests.Method
import typingsJapgolly.protractorHttpMock.mod.requests.PostData
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("protractor-http-mock", JSImport.Namespace)
  @js.native
  val ^ : ProtractorHttpMock = js.native
  
  /**
    * Plugin for custom matching logic with 1 generic type.
    */
  @js.native
  trait Plugin1[T1] extends StObject {
    
    /**
      * Match function.
      * Return a truthy value to indicate successfull match.
      *
      * @param mockRequest The mock to compare request with.
      * @param requestConfig The request object to compare mock with.
      */
    def `match`[O /* <: Get[T1] */](mockRequest: O, requestConfig: O): Boolean = js.native
  }
  
  /**
    * Plugin for custom matching logic with 2 generic types.
    */
  @js.native
  trait Plugin2[T1, T2] extends StObject {
    
    /**
      * Match function.
      * Return a truthy value to indicate successfull match.
      *
      * @param mockRequest The mock to compare request with.
      * @param requestConfig The request object to compare mock with.
      */
    def `match`[O /* <: PostData[T1, T2] */](mockRequest: O, requestConfig: O): Boolean = js.native
  }
  
  @js.native
  trait ProtractorHttpMock extends StObject {
    
    /**
      * Instantiate mock module. This must be done before the browser connects.
      *
      * @param mocks An array of either mock modules or module names relative to the rootDirectory configuration to load into the application.
      * @param plugins An array of either Plugin objects or NPM modules as strings.
      * @param skipDefaults Set true to skip loading of default mocks.
      */
    def apply(): ProtractorHttpMock = js.native
    def apply(mocks: js.Array[AllRequests | String]): ProtractorHttpMock = js.native
    def apply(
      mocks: js.Array[AllRequests | String],
      plugins: js.Array[Plugin1[Any] | (Plugin2[Any, Any]) | String]
    ): ProtractorHttpMock = js.native
    def apply(
      mocks: js.Array[AllRequests | String],
      plugins: js.Array[Plugin1[Any] | (Plugin2[Any, Any]) | String],
      skipDefaults: Boolean
    ): ProtractorHttpMock = js.native
    def apply(mocks: js.Array[AllRequests | String], plugins: Unit, skipDefaults: Boolean): ProtractorHttpMock = js.native
    def apply(mocks: Unit, plugins: js.Array[Plugin1[Any] | (Plugin2[Any, Any]) | String]): ProtractorHttpMock = js.native
    def apply(mocks: Unit, plugins: js.Array[Plugin1[Any] | (Plugin2[Any, Any]) | String], skipDefaults: Boolean): ProtractorHttpMock = js.native
    def apply(mocks: Unit, plugins: Unit, skipDefaults: Boolean): ProtractorHttpMock = js.native
    
    /**
      * Add mocks during test execution.
      * Returns a promise that will be resolved with a true boolean
      * when mocks are added.
      *
      * @param mocks An array of mock modules to load into the application.
      */
    def add(mocks: js.Array[AllRequests]): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise that will be resolved with a true boolean
      * when all matched HTTP requests are cleared.
      */
    def clearRequests(): js.Promise[Boolean] = js.native
    
    /**
      * Module configuration to setup
      */
    var config: Mocks = js.native
    
    /**
      * Remove mocks during test execution.
      * Returns a promise that will be resolved with a true boolean
      * when the supplied mocks are removed.
      *
      * @param mocks An array of mock modules to remove from the application.
      */
    def remove(mocks: js.Array[AllRequests]): js.Promise[Boolean] = js.native
    
    /**
      * Returns a promise that will be resolved with an array of
      * all matched HTTP requests.
      */
    def requestsMade(): js.Promise[js.Array[ReceivedRequest]] = js.native
    
    /**
      * Clean up.
      * Typically done in the afterEach call to ensure the teardown
      * is executed regardless of what happens in the test execution.
      */
    def teardown(): Unit = js.native
  }
  
  /**
    * Matched request.
    */
  trait ReceivedRequest extends StObject {
    
    var method: Method
    
    var url: String
  }
  object ReceivedRequest {
    
    inline def apply(method: Method, url: String): ReceivedRequest = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceivedRequest]
    }
    
    extension [Self <: ReceivedRequest](x: Self) {
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ProtractorHttpMock
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ProtractorHttpMock = ^
  
  object requests {
    
    /**
      * All available request types.
      */
    type AllRequests = Get[Any] | (PostData[Any, Any]) | Post[Any] | Head[Any] | Delete[Any] | (PutData[Any, Any]) | Put[Any] | Patch[Any] | Jsonp[Any]
    
    /**
      * HTTP Delete request mock.
      */
    trait Delete[TResponse] extends StObject {
      
      var request: MethodPath
      
      var response: Delay[TResponse]
    }
    object Delete {
      
      inline def apply[TResponse](request: MethodPath, response: Delay[TResponse]): Delete[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Delete[TResponse]]
      }
      
      extension [Self <: Delete[?], TResponse](x: Self & Delete[TResponse]) {
        
        inline def setRequest(value: MethodPath): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * GET request mock.
      */
    trait Get[TResponse] extends StObject {
      
      var request: typingsJapgolly.protractorHttpMock.anon.Headers
      
      var response: Data[TResponse]
    }
    object Get {
      
      inline def apply[TResponse](request: typingsJapgolly.protractorHttpMock.anon.Headers, response: Data[TResponse]): Get[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Get[TResponse]]
      }
      
      extension [Self <: Get[?], TResponse](x: Self & Get[TResponse]) {
        
        inline def setRequest(value: typingsJapgolly.protractorHttpMock.anon.Headers): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Data[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * HEAD request mock.
      */
    trait Head[TResponse] extends StObject {
      
      var request: Regex
      
      var response: Delay[TResponse]
    }
    object Head {
      
      inline def apply[TResponse](request: Regex, response: Delay[TResponse]): Head[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Head[TResponse]]
      }
      
      extension [Self <: Head[?], TResponse](x: Self & Head[TResponse]) {
        
        inline def setRequest(value: Regex): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    type Headers = Record[String, String]
    
    /**
      * JSONP request mock.
      */
    trait Jsonp[TResponse] extends StObject {
      
      var request: PathString
      
      var response: Delay[TResponse]
    }
    object Jsonp {
      
      inline def apply[TResponse](request: PathString, response: Delay[TResponse]): Jsonp[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Jsonp[TResponse]]
      }
      
      extension [Self <: Jsonp[?], TResponse](x: Self & Jsonp[TResponse]) {
        
        inline def setRequest(value: PathString): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Request methods type
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.GET
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.POST
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.DELETE
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PUT
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.HEAD
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PATCH
      - typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.JSONP
    */
    trait Method extends StObject
    object Method {
      
      inline def DELETE: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.DELETE]
      
      inline def GET: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.GET = "GET".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.GET]
      
      inline def HEAD: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.HEAD]
      
      inline def JSONP: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.JSONP = "JSONP".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.JSONP]
      
      inline def PATCH: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PATCH]
      
      inline def POST: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.POST = "POST".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.POST]
      
      inline def PUT: typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.PUT]
    }
    
    /**
      * PATCH request mock.
      */
    trait Patch[TResponse] extends StObject {
      
      var request: MethodPathRegex
      
      var response: Delay[TResponse]
    }
    object Patch {
      
      inline def apply[TResponse](request: MethodPathRegex, response: Delay[TResponse]): Patch[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Patch[TResponse]]
      }
      
      extension [Self <: Patch[?], TResponse](x: Self & Patch[TResponse]) {
        
        inline def setRequest(value: MethodPathRegex): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * POST request mock.
      */
    trait Post[TResponse] extends StObject {
      
      var request: Path
      
      var response: Delay[TResponse]
    }
    object Post {
      
      inline def apply[TResponse](request: Path, response: Delay[TResponse]): Post[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Post[TResponse]]
      }
      
      extension [Self <: Post[?], TResponse](x: Self & Post[TResponse]) {
        
        inline def setRequest(value: Path): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * POST request mock with payload.
      */
    trait PostData[TResponse, TPayload] extends StObject {
      
      var request: typingsJapgolly.protractorHttpMock.anon.Method[TPayload]
      
      var response: Delay[TResponse]
    }
    object PostData {
      
      inline def apply[TResponse, TPayload](request: typingsJapgolly.protractorHttpMock.anon.Method[TPayload], response: Delay[TResponse]): PostData[TResponse, TPayload] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[PostData[TResponse, TPayload]]
      }
      
      extension [Self <: PostData[?, ?], TResponse, TPayload](x: Self & (PostData[TResponse, TPayload])) {
        
        inline def setRequest(value: typingsJapgolly.protractorHttpMock.anon.Method[TPayload]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * PUT request mock.
      */
    trait Put[TResponse] extends StObject {
      
      var request: PathRegex
      
      var response: Delay[TResponse]
    }
    object Put {
      
      inline def apply[TResponse](request: PathRegex, response: Delay[TResponse]): Put[TResponse] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[Put[TResponse]]
      }
      
      extension [Self <: Put[?], TResponse](x: Self & Put[TResponse]) {
        
        inline def setRequest(value: PathRegex): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * PUT request mock with payload.
      */
    trait PutData[TResponse, TPayload] extends StObject {
      
      var request: DataMethod[TPayload]
      
      var response: Delay[TResponse]
    }
    object PutData {
      
      inline def apply[TResponse, TPayload](request: DataMethod[TPayload], response: Delay[TResponse]): PutData[TResponse, TPayload] = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[PutData[TResponse, TPayload]]
      }
      
      extension [Self <: PutData[?, ?], TResponse, TPayload](x: Self & (PutData[TResponse, TPayload])) {
        
        inline def setRequest(value: DataMethod[TPayload]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Delay[TResponse]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      }
    }
  }
}
