package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.PRODUCTION
  - typingsJapgolly.googlepay.googlepayStrings.TEST
*/
trait EnvironmentType extends js.Object

object EnvironmentType {
  @scala.inline
  def PRODUCTION: typingsJapgolly.googlepay.googlepayStrings.PRODUCTION = this.cast("PRODUCTION")
  @scala.inline
  def TEST: typingsJapgolly.googlepay.googlepayStrings.TEST = this.cast("TEST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

