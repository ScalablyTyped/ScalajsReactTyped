package typingsJapgolly.d3.d3Mod

import typingsJapgolly.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "json")
@js.native
object json extends js.Object {
  def apply[ParsedJSONObject /* <: js.Any */](url: String): js.Promise[ParsedJSONObject] = js.native
  def apply[ParsedJSONObject /* <: js.Any */](url: String, init: RequestInit): js.Promise[ParsedJSONObject] = js.native
}

