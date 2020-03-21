package typingsJapgolly.apolloServerEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/global", JSImport.Namespace)
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
  type Body = typingsJapgolly.apolloServerEnv.fetchMod.Body
  type BodyInit = typingsJapgolly.apolloServerEnv.fetchMod.BodyInit
  type Headers = typingsJapgolly.apolloServerEnv.fetchMod.Headers
  type HeadersInit = typingsJapgolly.apolloServerEnv.fetchMod.HeadersInit
  type ReferrerPolicy = typingsJapgolly.apolloServerEnv.fetchMod.ReferrerPolicy
  type Request = typingsJapgolly.apolloServerEnv.fetchMod.Request
  type RequestAgent = typingsJapgolly.apolloServerEnv.fetchMod.RequestAgent
  type RequestCache = typingsJapgolly.apolloServerEnv.fetchMod.RequestCache
  type RequestCredentials = typingsJapgolly.apolloServerEnv.fetchMod.RequestCredentials
  type RequestInfo = typingsJapgolly.apolloServerEnv.fetchMod.RequestInfo
  type RequestInit = typingsJapgolly.apolloServerEnv.fetchMod.RequestInit
  type RequestMode = typingsJapgolly.apolloServerEnv.fetchMod.RequestMode
  type RequestRedirect = typingsJapgolly.apolloServerEnv.fetchMod.RequestRedirect
  type Response = typingsJapgolly.apolloServerEnv.fetchMod.Response
  type ResponseInit = typingsJapgolly.apolloServerEnv.fetchMod.ResponseInit
  type URLSearchParams = typingsJapgolly.apolloServerEnv.urlMod.URLSearchParams
  type URLSearchParamsInit = typingsJapgolly.apolloServerEnv.urlMod.URLSearchParamsInit
}

