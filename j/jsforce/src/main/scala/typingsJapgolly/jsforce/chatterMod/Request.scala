package typingsJapgolly.jsforce.chatterMod

import typingsJapgolly.jsforce.queryMod.Query
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/chatter", "Request")
@js.native
class Request[T] protected () extends PromiseLike[T] {
  def this(chatter: Chatter, params: RequestParams) = this()
  def batchParams(): BatchRequestParams = js.native
  def `finally`(): js.Promise[T] = js.native
  def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
  def promise(): js.Promise[T] = js.native
  def stream(): Stream = js.native
  def thenCall(): Query[T] = js.native
  def thenCall(callback: js.Function2[/* err */ js.Error, /* records */ T, Unit]): Query[T] = js.native
}

