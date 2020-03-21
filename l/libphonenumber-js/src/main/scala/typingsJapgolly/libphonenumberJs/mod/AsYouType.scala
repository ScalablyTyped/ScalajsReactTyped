package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.AnonDefaultCallingCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "AsYouType")
@js.native
class AsYouType () extends js.Object {
  def this(defaultCountryCode: AnonDefaultCallingCode) = this()
  def this(defaultCountryCode: CountryCode) = this()
  var country: js.UndefOr[CountryCode] = js.native
  def getNationalNumber(): String = js.native
  def getNumber(): js.UndefOr[typingsJapgolly.libphonenumberJs.typesMod.PhoneNumber] = js.native
  def getTemplate(): js.UndefOr[String] = js.native
  def input(text: String): String = js.native
  def reset(): Unit = js.native
}

