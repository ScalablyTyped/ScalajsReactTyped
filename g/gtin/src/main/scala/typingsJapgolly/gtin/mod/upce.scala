package typingsJapgolly.gtin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gtin", "upce")
@js.native
object upce extends js.Object {
  def compress(gtin: String): String | Null = js.native
  def expand(gtin: String): String = js.native
}

