package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeN extends js.Object {
  def apply(range: RangeType): Controller = js.native
  def apply(range: RangeTypeJSON): Controller = js.native
  def apply(range: RangeTypeJSON, n: Double): Controller = js.native
  def apply(range: RangeTypeProperties): Controller = js.native
  def apply(range: RangeTypeProperties, n: Double): Controller = js.native
  def apply(range: RangeType, n: Double): Controller = js.native
}

