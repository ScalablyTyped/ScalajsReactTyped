package typingsJapgolly.reactGoogleRecaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light
  - typingsJapgolly.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsJapgolly.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.dark = this.cast("dark")
  @scala.inline
  def light: typingsJapgolly.reactGoogleRecaptcha.reactGoogleRecaptchaStrings.light = this.cast("light")
}

