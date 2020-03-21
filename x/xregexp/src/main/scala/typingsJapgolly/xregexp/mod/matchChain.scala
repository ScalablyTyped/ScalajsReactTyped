package typingsJapgolly.xregexp.mod

import typingsJapgolly.xregexp.AnonBackref
import typingsJapgolly.xregexp.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "matchChain")
@js.native
object matchChain extends js.Object {
  def apply(str: String, chain: js.Array[AnonBackref | AnonRegex | js.RegExp]): js.Array[String] = js.native
}

