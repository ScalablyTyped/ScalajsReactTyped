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
trait FnCallRangeProperties extends js.Object {
  def apply(range: RangeTypeJSON, properties: String): Controller = js.native
  def apply(range: RangeTypeJSON, properties: Block): Controller = js.native
  def apply(range: RangeTypeJSON, properties: BlockJSON): Controller = js.native
  def apply(range: RangeTypeJSON, properties: BlockProperties): Controller = js.native
  def apply(range: RangeTypeProperties, properties: String): Controller = js.native
  def apply(range: RangeTypeProperties, properties: Block): Controller = js.native
  def apply(range: RangeTypeProperties, properties: BlockJSON): Controller = js.native
  def apply(range: RangeTypeProperties, properties: BlockProperties): Controller = js.native
  def apply(range: RangeType, properties: String): Controller = js.native
  def apply(range: RangeType, properties: Block): Controller = js.native
  def apply(range: RangeType, properties: BlockJSON): Controller = js.native
  def apply(range: RangeType, properties: BlockProperties): Controller = js.native
}

