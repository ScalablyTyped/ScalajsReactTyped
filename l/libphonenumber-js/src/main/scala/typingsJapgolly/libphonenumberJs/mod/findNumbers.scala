package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.AnonDefaultCountry
import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import typingsJapgolly.libphonenumberJs.typesMod.NumberFound
import typingsJapgolly.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "findNumbers")
@js.native
object findNumbers extends js.Object {
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: AnonDefaultCountry): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}

