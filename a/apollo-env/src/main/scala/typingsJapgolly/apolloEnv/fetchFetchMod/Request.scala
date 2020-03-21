package typingsJapgolly.apolloEnv.fetchFetchMod

import typingsJapgolly.nodeFetch.mod.RequestInfo
import typingsJapgolly.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Request")
@js.native
class Request protected ()
  extends typingsJapgolly.nodeFetch.mod.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}

