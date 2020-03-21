package typingsJapgolly.apolloServerEnv

import typingsJapgolly.apolloServerEnv.fetchMod.BodyInit
import typingsJapgolly.apolloServerEnv.fetchMod.HeadersInit
import typingsJapgolly.apolloServerEnv.fetchMod.RequestInfo
import typingsJapgolly.apolloServerEnv.fetchMod.RequestInit
import typingsJapgolly.apolloServerEnv.fetchMod.ResponseInit
import typingsJapgolly.apolloServerEnv.urlMod.URLSearchParamsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Body ()
    extends typingsJapgolly.apolloServerEnv.fetchMod.Body
  
  @js.native
  class Headers ()
    extends typingsJapgolly.apolloServerEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsJapgolly.apolloServerEnv.fetchMod.Request {
    def this(input: String) = this()
    def this(input: typingsJapgolly.apolloServerEnv.fetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typingsJapgolly.apolloServerEnv.fetchMod.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typingsJapgolly.apolloServerEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typingsJapgolly.apolloServerEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typingsJapgolly.apolloServerEnv.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typingsJapgolly.apolloServerEnv.urlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  def fetch(): js.Promise[typingsJapgolly.apolloServerEnv.fetchMod.Response] = js.native
  def fetch(input: RequestInfo): js.Promise[typingsJapgolly.apolloServerEnv.fetchMod.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typingsJapgolly.apolloServerEnv.fetchMod.Response] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typingsJapgolly.apolloServerEnv.fetchMod.Response = js.native
    def redirect(url: String): typingsJapgolly.apolloServerEnv.fetchMod.Response = js.native
    def redirect(url: String, status: Double): typingsJapgolly.apolloServerEnv.fetchMod.Response = js.native
  }
  
}

