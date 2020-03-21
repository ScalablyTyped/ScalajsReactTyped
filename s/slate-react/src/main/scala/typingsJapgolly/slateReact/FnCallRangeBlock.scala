package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Block
import typingsJapgolly.slate.mod.BlockJSON
import typingsJapgolly.slate.mod.BlockProperties
import typingsJapgolly.slate.mod.Controller
import typingsJapgolly.slate.mod.RangeType
import typingsJapgolly.slate.mod.RangeTypeJSON
import typingsJapgolly.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeBlock extends js.Object {
  def apply(range: RangeTypeJSON, block: String): Controller = js.native
  def apply(range: RangeTypeJSON, block: Block): Controller = js.native
  def apply(range: RangeTypeJSON, block: BlockJSON): Controller = js.native
  def apply(range: RangeTypeJSON, block: BlockProperties): Controller = js.native
  def apply(range: RangeTypeProperties, block: String): Controller = js.native
  def apply(range: RangeTypeProperties, block: Block): Controller = js.native
  def apply(range: RangeTypeProperties, block: BlockJSON): Controller = js.native
  def apply(range: RangeTypeProperties, block: BlockProperties): Controller = js.native
  def apply(range: RangeType, block: String): Controller = js.native
  def apply(range: RangeType, block: Block): Controller = js.native
  def apply(range: RangeType, block: BlockJSON): Controller = js.native
  def apply(range: RangeType, block: BlockProperties): Controller = js.native
}

