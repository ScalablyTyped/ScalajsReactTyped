package typingsJapgolly.slateReact

import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.MarkJSON
import typingsJapgolly.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffsetLengthMarks extends js.Object {
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: Set_[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
}

