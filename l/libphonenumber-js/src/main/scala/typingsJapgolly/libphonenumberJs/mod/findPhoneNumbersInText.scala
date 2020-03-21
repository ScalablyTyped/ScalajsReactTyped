package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.AnonDefaultCallingCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.NumberFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findPhoneNumbersInText")
@js.native
object findPhoneNumbersInText extends js.Object {
  def apply(text: String): js.Array[NumberFound] = js.native
  def apply(text: String, options: AnonDefaultCallingCode): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFound] = js.native
}

