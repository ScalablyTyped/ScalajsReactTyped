package typingsJapgolly.apolloEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type Body = typingsJapgolly.apolloEnv.fetchFetchMod.Body
  type BodyInit = typingsJapgolly.nodeFetch.mod.BodyInit
  type Headers = typingsJapgolly.apolloEnv.fetchFetchMod.Headers
  type HeadersInit = typingsJapgolly.nodeFetch.mod.HeadersInit
  type ReferrerPolicy = typingsJapgolly.apolloEnv.fetchFetchMod.ReferrerPolicy
  type Request = typingsJapgolly.apolloEnv.fetchFetchMod.Request
  type RequestAgent = typingsJapgolly.apolloEnv.fetchFetchMod.RequestAgent
  type RequestCache = typingsJapgolly.nodeFetch.mod.RequestCache
  type RequestCredentials = typingsJapgolly.nodeFetch.mod.RequestCredentials
  type RequestInfo = typingsJapgolly.nodeFetch.mod.RequestInfo
  type RequestInit = typingsJapgolly.nodeFetch.mod.RequestInit
  type RequestMode = typingsJapgolly.nodeFetch.mod.RequestMode
  type RequestRedirect = typingsJapgolly.nodeFetch.mod.RequestRedirect
  type Response = typingsJapgolly.apolloEnv.fetchFetchMod.Response
  type ResponseInit = typingsJapgolly.nodeFetch.mod.ResponseInit
  type URLSearchParams = typingsJapgolly.apolloEnv.urlMod.URLSearchParams
  type URLSearchParamsInit = typingsJapgolly.apolloEnv.urlMod.URLSearchParamsInit
}

