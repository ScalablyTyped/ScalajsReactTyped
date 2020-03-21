package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangePrefixSuffix extends js.Object {
  def apply(range: RangeTypeJSON, prefix: String): Controller = js.native
  def apply(range: RangeTypeJSON, prefix: String, suffix: String): Controller = js.native
  def apply(range: RangeTypeProperties, prefix: String): Controller = js.native
  def apply(range: RangeTypeProperties, prefix: String, suffix: String): Controller = js.native
  def apply(range: RangeType, prefix: String): Controller = js.native
  def apply(range: RangeType, prefix: String, suffix: String): Controller = js.native
}

