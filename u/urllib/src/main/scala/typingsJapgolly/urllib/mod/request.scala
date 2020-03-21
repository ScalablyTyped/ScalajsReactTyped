package typingsJapgolly.urllib.mod

import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "request")
@js.native
object request extends js.Object {
  def apply[T](url: String): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, callback: Callback[T]): Unit = js.native
  def apply[T](url: String, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: String, options: RequestOptions, callback: Callback[T]): Unit = js.native
  def apply[T](url: URL_): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL_, callback: Callback[T]): Unit = js.native
  def apply[T](url: URL_, options: RequestOptions): js.Promise[HttpClientResponse[T]] = js.native
  def apply[T](url: URL_, options: RequestOptions, callback: Callback[T]): Unit = js.native
}

