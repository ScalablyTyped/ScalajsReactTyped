package typingsJapgolly.apolloServerEnv

import typingsJapgolly.apolloServerEnv.distFetchMod.BodyInit
import typingsJapgolly.apolloServerEnv.distFetchMod.HeadersInit
import typingsJapgolly.apolloServerEnv.distFetchMod.RequestInfo
import typingsJapgolly.apolloServerEnv.distFetchMod.RequestInit
import typingsJapgolly.apolloServerEnv.distFetchMod.ResponseInit
import typingsJapgolly.apolloServerEnv.distUrlMod.URLSearchParamsInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-server-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("apollo-server-env", "Body")
  @js.native
  open class Body ()
    extends typingsJapgolly.apolloServerEnv.distFetchMod.Body
  
  @JSImport("apollo-server-env", "Headers")
  @js.native
  open class Headers ()
    extends typingsJapgolly.apolloServerEnv.distFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-server-env", "Request")
  @js.native
  open class Request protected ()
    extends typingsJapgolly.apolloServerEnv.distFetchMod.Request {
    def this(input: String) = this()
    def this(input: typingsJapgolly.apolloServerEnv.distFetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typingsJapgolly.apolloServerEnv.distFetchMod.Request, init: RequestInit) = this()
  }
  
  @JSImport("apollo-server-env", "Response")
  @js.native
  open class Response ()
    extends typingsJapgolly.apolloServerEnv.distFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-server-env", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): typingsJapgolly.apolloServerEnv.distFetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typingsJapgolly.apolloServerEnv.distFetchMod.Response]
    
    inline def redirect(url: String): typingsJapgolly.apolloServerEnv.distFetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloServerEnv.distFetchMod.Response]
    inline def redirect(url: String, status: Double): typingsJapgolly.apolloServerEnv.distFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloServerEnv.distFetchMod.Response]
  }
  
  @JSImport("apollo-server-env", "URL")
  @js.native
  open class URL protected ()
    extends typingsJapgolly.apolloServerEnv.distUrlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typingsJapgolly.apolloServerEnv.distUrlMod.URL) = this()
  }
  
  @JSImport("apollo-server-env", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typingsJapgolly.apolloServerEnv.distUrlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  inline def fetch(input: RequestInfo): js.Promise[typingsJapgolly.apolloServerEnv.distFetchMod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.apolloServerEnv.distFetchMod.Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typingsJapgolly.apolloServerEnv.distFetchMod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.apolloServerEnv.distFetchMod.Response]]
}
