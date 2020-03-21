package typingsJapgolly.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grecaptcha.grecaptchaStrings.normal
  - typingsJapgolly.grecaptcha.grecaptchaStrings.compact
  - typingsJapgolly.grecaptcha.grecaptchaStrings.invisible
*/
trait Size extends js.Object

object Size {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compact: typingsJapgolly.grecaptcha.grecaptchaStrings.compact = this.cast("compact")
  @scala.inline
  def invisible: typingsJapgolly.grecaptcha.grecaptchaStrings.invisible = this.cast("invisible")
  @scala.inline
  def normal: typingsJapgolly.grecaptcha.grecaptchaStrings.normal = this.cast("normal")
}

