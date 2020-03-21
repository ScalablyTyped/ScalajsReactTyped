package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripeV3.stripeV3Strings.`new`
  - typingsJapgolly.stripeV3.stripeV3Strings.validated
  - typingsJapgolly.stripeV3.stripeV3Strings.verified
  - typingsJapgolly.stripeV3.stripeV3Strings.verification_failed
  - typingsJapgolly.stripeV3.stripeV3Strings.errored
*/
trait statusType extends js.Object

object statusType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errored: typingsJapgolly.stripeV3.stripeV3Strings.errored = this.cast("errored")
  @scala.inline
  def `new`: typingsJapgolly.stripeV3.stripeV3Strings.`new` = this.cast("new")
  @scala.inline
  def validated: typingsJapgolly.stripeV3.stripeV3Strings.validated = this.cast("validated")
  @scala.inline
  def verification_failed: typingsJapgolly.stripeV3.stripeV3Strings.verification_failed = this.cast("verification_failed")
  @scala.inline
  def verified: typingsJapgolly.stripeV3.stripeV3Strings.verified = this.cast("verified")
}

