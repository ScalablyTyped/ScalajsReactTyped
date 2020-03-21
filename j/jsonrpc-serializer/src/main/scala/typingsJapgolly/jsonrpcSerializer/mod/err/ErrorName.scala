package typingsJapgolly.jsonrpcSerializer.mod.err

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError
  - typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError
*/
trait ErrorName extends js.Object

object ErrorName {
  @scala.inline
  def InvalidParamsError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError = this.cast("InvalidParamsError")
  @scala.inline
  def InvalidRequestError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError = this.cast("InvalidRequestError")
  @scala.inline
  def JsonRpcError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError = this.cast("JsonRpcError")
  @scala.inline
  def MethodNotFoundError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError = this.cast("MethodNotFoundError")
  @scala.inline
  def ParseError: typingsJapgolly.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError = this.cast("ParseError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

