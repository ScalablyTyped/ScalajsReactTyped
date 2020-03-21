package typingsJapgolly.urllib.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "HttpClient")
@js.native
class HttpClient[O /* <: RequestOptions */] () extends EventEmitter {
  def curl[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: String, callback: Callback[T]): Unit = js.native
  def curl[T](url: String, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: String, options: O, callback: Callback[T]): Unit = js.native
  def curl[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: URL_, callback: Callback[T]): Unit = js.native
  def curl[T](url: URL_, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def curl[T](url: URL_, options: O, callback: Callback[T]): Unit = js.native
  def request[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: String, callback: Callback[T]): Unit = js.native
  def request[T](url: String, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: String, options: O, callback: Callback[T]): Unit = js.native
  def request[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: URL_, callback: Callback[T]): Unit = js.native
  def request[T](url: URL_, options: O): js.Promise[HttpClientResponse[T]] = js.native
  def request[T](url: URL_, options: O, callback: Callback[T]): Unit = js.native
  def requestThunk(url: String): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def requestThunk(url: String, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def requestThunk(url: URL_): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
  def requestThunk(url: URL_, options: O): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
}

