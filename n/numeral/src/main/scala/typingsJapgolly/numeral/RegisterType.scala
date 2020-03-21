package typingsJapgolly.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.numeral.numeralStrings.format
  - typingsJapgolly.numeral.numeralStrings.locale
*/
trait RegisterType extends js.Object

object RegisterType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def format: typingsJapgolly.numeral.numeralStrings.format = this.cast("format")
  @scala.inline
  def locale: typingsJapgolly.numeral.numeralStrings.locale = this.cast("locale")
}

