package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Names of the fields in the shipping or billing contact information, used to locate errors in the payment sheet.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.phoneNumber
  - typingsJapgolly.applepayjs.applepayjsStrings.emailAddress
  - typingsJapgolly.applepayjs.applepayjsStrings.name
  - typingsJapgolly.applepayjs.applepayjsStrings.phoneticName
  - typingsJapgolly.applepayjs.applepayjsStrings.postalAddress
  - typingsJapgolly.applepayjs.applepayjsStrings.addressLines
  - typingsJapgolly.applepayjs.applepayjsStrings.locality
  - typingsJapgolly.applepayjs.applepayjsStrings.subLocality
  - typingsJapgolly.applepayjs.applepayjsStrings.postalCode
  - typingsJapgolly.applepayjs.applepayjsStrings.administrativeArea
  - typingsJapgolly.applepayjs.applepayjsStrings.subAdministrativeArea
  - typingsJapgolly.applepayjs.applepayjsStrings.country
  - typingsJapgolly.applepayjs.applepayjsStrings.countryCode
*/
trait ApplePayErrorContactField extends js.Object

object ApplePayErrorContactField {
  @scala.inline
  def addressLines: typingsJapgolly.applepayjs.applepayjsStrings.addressLines = this.cast("addressLines")
  @scala.inline
  def administrativeArea: typingsJapgolly.applepayjs.applepayjsStrings.administrativeArea = this.cast("administrativeArea")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def country: typingsJapgolly.applepayjs.applepayjsStrings.country = this.cast("country")
  @scala.inline
  def countryCode: typingsJapgolly.applepayjs.applepayjsStrings.countryCode = this.cast("countryCode")
  @scala.inline
  def emailAddress: typingsJapgolly.applepayjs.applepayjsStrings.emailAddress = this.cast("emailAddress")
  @scala.inline
  def locality: typingsJapgolly.applepayjs.applepayjsStrings.locality = this.cast("locality")
  @scala.inline
  def name: typingsJapgolly.applepayjs.applepayjsStrings.name = this.cast("name")
  @scala.inline
  def phoneNumber: typingsJapgolly.applepayjs.applepayjsStrings.phoneNumber = this.cast("phoneNumber")
  @scala.inline
  def phoneticName: typingsJapgolly.applepayjs.applepayjsStrings.phoneticName = this.cast("phoneticName")
  @scala.inline
  def postalAddress: typingsJapgolly.applepayjs.applepayjsStrings.postalAddress = this.cast("postalAddress")
  @scala.inline
  def postalCode: typingsJapgolly.applepayjs.applepayjsStrings.postalCode = this.cast("postalCode")
  @scala.inline
  def subAdministrativeArea: typingsJapgolly.applepayjs.applepayjsStrings.subAdministrativeArea = this.cast("subAdministrativeArea")
  @scala.inline
  def subLocality: typingsJapgolly.applepayjs.applepayjsStrings.subLocality = this.cast("subLocality")
}

