package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.NationalNumber
import typingsJapgolly.libphonenumberJs.typesMod.NumberType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "getNumberType")
@js.native
object getNumberType extends js.Object {
  def apply(parsedNumber: ParsedNumber): NumberType = js.native
  def apply(phone: NationalNumber): NumberType = js.native
  def apply(phone: NationalNumber, country: CountryCode): NumberType = js.native
}

