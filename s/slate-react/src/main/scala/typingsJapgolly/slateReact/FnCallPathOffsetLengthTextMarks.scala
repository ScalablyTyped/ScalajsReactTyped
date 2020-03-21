package typingsJapgolly.slateReact

import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffsetLengthTextMarks extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, text: String): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: js.Array[Mark]): Controller = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: Set_[Mark]): Controller = js.native
}

