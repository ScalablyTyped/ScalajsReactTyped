package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.AnonDefaultCountryCountryCode
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.NumberFoundLegacy
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "searchParsedNumbers")
@js.native
object searchParsedNumbers extends js.Object {
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: AnonDefaultCountryCountryCode): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}

