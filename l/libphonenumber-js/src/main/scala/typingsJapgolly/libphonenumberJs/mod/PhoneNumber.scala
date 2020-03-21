package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.typesMod.CountryCallingCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.Metadata
import typingsJapgolly.libphonenumberJs.typesMod.NationalNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "PhoneNumber")
@js.native
class PhoneNumber protected ()
  extends typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber {
  def this(
    countryCallingCodeOrCountry: CountryCallingCode,
    nationalNumber: NationalNumber,
    metadata: Metadata
  ) = this()
  def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
}

