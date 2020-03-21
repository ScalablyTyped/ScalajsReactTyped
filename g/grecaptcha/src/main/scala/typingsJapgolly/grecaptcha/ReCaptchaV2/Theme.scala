package typingsJapgolly.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grecaptcha.grecaptchaStrings.light
  - typingsJapgolly.grecaptcha.grecaptchaStrings.dark
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsJapgolly.grecaptcha.grecaptchaStrings.dark = this.cast("dark")
  @scala.inline
  def light: typingsJapgolly.grecaptcha.grecaptchaStrings.light = this.cast("light")
}

