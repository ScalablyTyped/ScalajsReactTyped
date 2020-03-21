package typingsJapgolly.apolloEnv.fetchFetchMod

import typingsJapgolly.nodeFetch.mod.BodyInit
import typingsJapgolly.nodeFetch.mod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
class Response ()
  extends typingsJapgolly.nodeFetch.mod.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

/* static members */
@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): typingsJapgolly.nodeFetch.mod.Response = js.native
  def redirect(url: String, status: Double): typingsJapgolly.nodeFetch.mod.Response = js.native
}

