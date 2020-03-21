package typingsJapgolly.axios.mod

import typingsJapgolly.axios.AnonRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosInstance extends js.Object {
  var defaults: AxiosRequestConfig = js.native
  var interceptors: AnonRequest = js.native
  def apply(config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def apply(url: String): AxiosPromise[_] = js.native
  def apply(url: String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def delete[T, R](url: String): js.Promise[R] = js.native
  def delete[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def get[T, R](url: String): js.Promise[R] = js.native
  def get[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def getUri(): String = js.native
  def getUri(config: AxiosRequestConfig): String = js.native
  def head[T, R](url: String): js.Promise[R] = js.native
  def head[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def options[T, R](url: String): js.Promise[R] = js.native
  def options[T, R](url: String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def patch[T, R](url: String): js.Promise[R] = js.native
  def patch[T, R](url: String, data: js.Any): js.Promise[R] = js.native
  def patch[T, R](url: String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
  def post[T, R](url: String): js.Promise[R] = js.native
  def post[T, R](url: String, data: js.Any): js.Promise[R] = js.native
  def post[T, R](url: String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
  def put[T, R](url: String): js.Promise[R] = js.native
  def put[T, R](url: String, data: js.Any): js.Promise[R] = js.native
  def put[T, R](url: String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
  def request[T, R](config: AxiosRequestConfig): js.Promise[R] = js.native
}

