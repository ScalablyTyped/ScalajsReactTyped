package typingsJapgolly.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestCallbacks extends RestBase {
  var auth: AuthCallbacks = js.native
  var channels: Channels[ChannelCallbacks] = js.native
  var push: PushCallbacks = js.native
  def request(method: String, path: String): Unit = js.native
  def request(method: String, path: String, params: js.Any): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Any): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Any, headers: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.Any,
    headers: js.Any,
    callback: js.Function2[/* error */ ErrorInfo, /* response */ HttpPaginatedResponse, Unit]
  ): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Array[_]): Unit = js.native
  def request(method: String, path: String, params: js.Any, body: js.Array[_], headers: js.Any): Unit = js.native
  def request(
    method: String,
    path: String,
    params: js.Any,
    body: js.Array[_],
    headers: js.Any,
    callback: js.Function2[/* error */ ErrorInfo, /* response */ HttpPaginatedResponse, Unit]
  ): Unit = js.native
  def stats(): Unit = js.native
  def stats(paramsOrCallback: js.Any): Unit = js.native
  def stats(paramsOrCallback: js.Any, callback: paginatedResultCallback[Stats]): Unit = js.native
  def stats(paramsOrCallback: paginatedResultCallback[Stats]): Unit = js.native
  def stats(paramsOrCallback: paginatedResultCallback[Stats], callback: paginatedResultCallback[Stats]): Unit = js.native
  def time(): Unit = js.native
  def time(callback: timeCallback): Unit = js.native
}

