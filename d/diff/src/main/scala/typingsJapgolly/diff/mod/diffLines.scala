package typingsJapgolly.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "diffLines")
@js.native
object diffLines extends js.Object {
  def apply(oldStr: String, newStr: String): js.Array[Change] = js.native
  def apply(oldStr: String, newStr: String, options: LinesOptions with CallbackOptions): Unit = js.native
  def apply(oldStr: String, newStr: String, options: Callback): Unit = js.native
}

