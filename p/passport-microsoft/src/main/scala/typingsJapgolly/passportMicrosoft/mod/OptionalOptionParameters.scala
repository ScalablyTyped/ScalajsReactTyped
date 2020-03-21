package typingsJapgolly.passportMicrosoft.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The passport-microsoft library provides defaults for these fields, so they become optional
// when calling the constructor. (No need to export this).
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.authorizationURL
  - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.tokenURL
  - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.scopeSeparator
  - typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.customHeaders
*/
trait OptionalOptionParameters extends js.Object

object OptionalOptionParameters {
  @scala.inline
  def authorizationURL: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.authorizationURL = this.cast("authorizationURL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def customHeaders: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.customHeaders = this.cast("customHeaders")
  @scala.inline
  def scopeSeparator: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.scopeSeparator = this.cast("scopeSeparator")
  @scala.inline
  def tokenURL: typingsJapgolly.passportMicrosoft.passportMicrosoftStrings.tokenURL = this.cast("tokenURL")
}

