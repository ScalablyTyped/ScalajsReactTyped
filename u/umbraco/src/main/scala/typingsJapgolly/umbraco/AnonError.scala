package typingsJapgolly.umbraco

import typingsJapgolly.angular.mod.IHttpHeadersGetter
import typingsJapgolly.angular.mod.IHttpPromiseCallback
import typingsJapgolly.angular.mod.IRequestConfig
import typingsJapgolly.umbraco.mod.resources.IResourcePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonError[T] extends js.Object {
  @JSName("error")
  var error_Original: IHttpPromiseCallback[IResourcePromise] = js.native
  @JSName("success")
  var success_Original: IHttpPromiseCallback[T] = js.native
  def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
  def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
}

