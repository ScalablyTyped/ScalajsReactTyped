package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Mark
import typingsJapgolly.slate.mod.MarkProperties
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeMark extends js.Object {
  def apply(range: RangeTypeJSON, mark: String): Controller = js.native
  def apply(range: RangeTypeJSON, mark: Mark): Controller = js.native
  def apply(range: RangeTypeJSON, mark: MarkProperties): Controller = js.native
  def apply(range: RangeTypeProperties, mark: String): Controller = js.native
  def apply(range: RangeTypeProperties, mark: Mark): Controller = js.native
  def apply(range: RangeTypeProperties, mark: MarkProperties): Controller = js.native
  def apply(range: RangeType, mark: String): Controller = js.native
  def apply(range: RangeType, mark: Mark): Controller = js.native
  def apply(range: RangeType, mark: MarkProperties): Controller = js.native
}

