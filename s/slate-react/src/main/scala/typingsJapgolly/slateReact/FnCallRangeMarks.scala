package typingsJapgolly.slateReact

import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.MarkJSON
import typingsJapgolly.slate.mod.MarkProperties
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeMarks extends js.Object {
  def apply(range: RangeTypeJSON, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeTypeJSON, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeTypeProperties, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeTypeProperties, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeType, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def apply(range: RangeType, marks: Set_[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
}

