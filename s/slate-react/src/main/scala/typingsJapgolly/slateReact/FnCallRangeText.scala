package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeText extends js.Object {
  def apply(range: RangeTypeJSON, text: String): Controller = js.native
  def apply(range: RangeTypeProperties, text: String): Controller = js.native
  def apply(range: RangeType, text: String): Controller = js.native
}

