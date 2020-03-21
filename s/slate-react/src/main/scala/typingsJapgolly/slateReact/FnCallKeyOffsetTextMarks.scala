package typingsJapgolly.slateReact

import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.MarkJSON
import typingsJapgolly.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallKeyOffsetTextMarks extends js.Object {
  def apply(key: String, offset: Double, text: String): Controller = js.native
  def apply(
    key: String,
    offset: Double,
    text: String,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def apply(key: String, offset: Double, text: String, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
}

