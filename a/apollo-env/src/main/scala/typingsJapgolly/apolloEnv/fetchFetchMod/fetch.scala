package typingsJapgolly.apolloEnv.fetchFetchMod

import typingsJapgolly.nodeFetch.mod.RequestInfo
import typingsJapgolly.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "fetch")
@js.native
object fetch extends js.Object {
  def apply(url: RequestInfo): js.Promise[typingsJapgolly.nodeFetch.mod.Response] = js.native
  def apply(url: RequestInfo, init: RequestInit): js.Promise[typingsJapgolly.nodeFetch.mod.Response] = js.native
  def isRedirect(code: Double): Boolean = js.native
}

