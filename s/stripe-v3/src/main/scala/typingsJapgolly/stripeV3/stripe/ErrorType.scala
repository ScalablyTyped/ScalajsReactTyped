package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.api_connection_error
  - typingsJapgolly.stripeV3.stripeV3Strings.api_error
  - typingsJapgolly.stripeV3.stripeV3Strings.authentication_error
  - typingsJapgolly.stripeV3.stripeV3Strings.card_error
  - typingsJapgolly.stripeV3.stripeV3Strings.idempotency_error
  - typingsJapgolly.stripeV3.stripeV3Strings.invalid_request_error
  - typingsJapgolly.stripeV3.stripeV3Strings.rate_limit_error
*/
trait ErrorType extends js.Object

object ErrorType {
  @scala.inline
  def api_connection_error: typingsJapgolly.stripeV3.stripeV3Strings.api_connection_error = this.cast("api_connection_error")
  @scala.inline
  def api_error: typingsJapgolly.stripeV3.stripeV3Strings.api_error = this.cast("api_error")
  @scala.inline
  def authentication_error: typingsJapgolly.stripeV3.stripeV3Strings.authentication_error = this.cast("authentication_error")
  @scala.inline
  def card_error: typingsJapgolly.stripeV3.stripeV3Strings.card_error = this.cast("card_error")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idempotency_error: typingsJapgolly.stripeV3.stripeV3Strings.idempotency_error = this.cast("idempotency_error")
  @scala.inline
  def invalid_request_error: typingsJapgolly.stripeV3.stripeV3Strings.invalid_request_error = this.cast("invalid_request_error")
  @scala.inline
  def rate_limit_error: typingsJapgolly.stripeV3.stripeV3Strings.rate_limit_error = this.cast("rate_limit_error")
}

