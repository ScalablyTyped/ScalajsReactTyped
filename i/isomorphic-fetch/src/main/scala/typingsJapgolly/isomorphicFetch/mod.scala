package typingsJapgolly.isomorphicFetch

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsJapgolly.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isomorphic-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}

