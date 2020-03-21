package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Field names used for requesting contact information in a payment request.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.email
  - typingsJapgolly.applepayjs.applepayjsStrings.name
  - typingsJapgolly.applepayjs.applepayjsStrings.phone
  - typingsJapgolly.applepayjs.applepayjsStrings.postalAddress
  - typingsJapgolly.applepayjs.applepayjsStrings.phoneticName
*/
trait ApplePayContactField extends js.Object

object ApplePayContactField {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsJapgolly.applepayjs.applepayjsStrings.email = this.cast("email")
  @scala.inline
  def name: typingsJapgolly.applepayjs.applepayjsStrings.name = this.cast("name")
  @scala.inline
  def phone: typingsJapgolly.applepayjs.applepayjsStrings.phone = this.cast("phone")
  @scala.inline
  def phoneticName: typingsJapgolly.applepayjs.applepayjsStrings.phoneticName = this.cast("phoneticName")
  @scala.inline
  def postalAddress: typingsJapgolly.applepayjs.applepayjsStrings.postalAddress = this.cast("postalAddress")
}

