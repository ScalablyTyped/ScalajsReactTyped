package typingsJapgolly.apolloEnv

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.nodeFetch.AnonSize
import typingsJapgolly.nodeFetch.mod.BodyInit
import typingsJapgolly.nodeFetch.mod.HeadersInit
import typingsJapgolly.nodeFetch.mod.RequestInfo
import typingsJapgolly.nodeFetch.mod.RequestInit
import typingsJapgolly.nodeFetch.mod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch", JSImport.Namespace)
@js.native
object fetchMod extends js.Object {
  @js.native
  class Body ()
    extends typingsJapgolly.apolloEnv.fetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: AnonSize) = this()
  }
  
  @js.native
  class Headers ()
    extends typingsJapgolly.apolloEnv.fetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsJapgolly.apolloEnv.fetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typingsJapgolly.apolloEnv.fetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typingsJapgolly.apolloEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsJapgolly.apolloEnv.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typingsJapgolly.node.urlMod.URLSearchParams) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typingsJapgolly.nodeFetch.mod.Response = js.native
    def redirect(url: String, status: Double): typingsJapgolly.nodeFetch.mod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typingsJapgolly.nodeFetch.mod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typingsJapgolly.nodeFetch.mod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

