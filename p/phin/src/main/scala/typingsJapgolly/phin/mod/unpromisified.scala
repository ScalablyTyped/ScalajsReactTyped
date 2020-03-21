package typingsJapgolly.phin.mod

import typingsJapgolly.phin.IWithDataIJSONResponseOpt
import typingsJapgolly.phin.IWithDataIOptions
import typingsJapgolly.phin.IWithDataIStreamResponseO
import typingsJapgolly.phin.IWithFormIJSONResponseOpt
import typingsJapgolly.phin.IWithFormIOptions
import typingsJapgolly.phin.IWithFormIStreamResponseO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phin", "unpromisified")
@js.native
object unpromisified extends js.Object {
  def apply(options: String, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithDataIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithDataIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithFormIOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IWithFormIStreamResponseO, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = js.native
  def apply(options: IOptions, callback: ICallback[IResponse] | IErrorCallback): Unit = js.native
  def apply(options: IStreamResponseOptions, callback: ICallback[IStreamResponse] | IErrorCallback): Unit = js.native
  def apply[T](options: IWithDataIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = js.native
  def apply[T](options: IWithFormIJSONResponseOpt, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = js.native
  def apply[T](options: IJSONResponseOptions, callback: ICallback[IJSONResponse[T]] | IErrorCallback): Unit = js.native
}

