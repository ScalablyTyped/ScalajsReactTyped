package typingsJapgolly.popcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var debug: Boolean = js.native
  var errors: js.Array[_] = js.native
  def apply(pluginName: String, info: PopcornPlugin): js.Any = js.native
  def apply(pluginName: String, info: PopcornPlugin, manifest: js.Any): js.Any = js.native
}

