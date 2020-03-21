package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.Document
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeFragment extends js.Object {
  def apply(range: RangeTypeJSON, fragment: Document): Controller = js.native
  def apply(range: RangeTypeProperties, fragment: Document): Controller = js.native
  def apply(range: RangeType, fragment: Document): Controller = js.native
}

