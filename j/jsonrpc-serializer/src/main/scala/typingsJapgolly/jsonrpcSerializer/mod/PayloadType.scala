package typingsJapgolly.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.request
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.notification
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.success
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.error
*/
trait PayloadType extends js.Object

object PayloadType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.error = this.cast("error")
  @scala.inline
  def notification: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.notification = this.cast("notification")
  @scala.inline
  def request: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.request = this.cast("request")
  @scala.inline
  def success: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.success = this.cast("success")
}

