package typingsJapgolly.libphonenumberJs.mod

import typingsJapgolly.libphonenumberJs.typesMod.CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "parseNumber")
@js.native
object parseNumber extends js.Object {
  def apply(text: String): ParsedNumber | js.Object = js.native
  def apply(text: String, options: ParseNumberOptions): ParsedNumber | js.Object = js.native
  def apply(text: String, options: CountryCode): ParsedNumber | js.Object = js.native
}

