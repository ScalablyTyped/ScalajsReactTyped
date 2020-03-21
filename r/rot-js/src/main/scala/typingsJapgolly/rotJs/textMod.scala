package typingsJapgolly.rotJs

import typingsJapgolly.rotJs.rotJsNumbers.`0`
import typingsJapgolly.rotJs.rotJsNumbers.`1`
import typingsJapgolly.rotJs.rotJsNumbers.`2`
import typingsJapgolly.rotJs.rotJsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  val TYPE_BG: `3` = js.native
  val TYPE_FG: `2` = js.native
  val TYPE_NEWLINE: `1` = js.native
  val TYPE_TEXT: `0` = js.native
  def measure(str: String, maxWidth: Double): AnonHeight = js.native
  def tokenize(str: String, maxWidth: Double): js.Array[_] = js.native
}

