package typingsJapgolly.angularHttpi.Httpi

import typingsJapgolly.angular.mod.IHttpPromise
import typingsJapgolly.angular.mod.IHttpService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Httpi.HttpiResource")
@js.native
class HttpiResource protected () extends js.Object {
  def this(http: IHttpService, url: String) = this()
  def delete[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def get[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def head[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def jsonp[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def post[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def put[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): HttpiResource = js.native
}

