package typingsJapgolly.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grecaptcha.grecaptchaStrings.bottomright
  - typingsJapgolly.grecaptcha.grecaptchaStrings.bottomleft
  - typingsJapgolly.grecaptcha.grecaptchaStrings.`inline`
*/
trait Badge extends js.Object

object Badge {
  @scala.inline
  def bottomleft: typingsJapgolly.grecaptcha.grecaptchaStrings.bottomleft = this.cast("bottomleft")
  @scala.inline
  def bottomright: typingsJapgolly.grecaptcha.grecaptchaStrings.bottomright = this.cast("bottomright")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `inline`: typingsJapgolly.grecaptcha.grecaptchaStrings.`inline` = this.cast("inline")
}

