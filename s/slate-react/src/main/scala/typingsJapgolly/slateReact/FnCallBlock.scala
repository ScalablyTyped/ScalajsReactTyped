package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Block
import typingsJapgolly.slate.mod.BlockJSON
import typingsJapgolly.slate.mod.BlockProperties
import typingsJapgolly.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallBlock extends js.Object {
  def apply(block: String): Controller = js.native
  def apply(block: Block): Controller = js.native
  def apply(block: BlockJSON): Controller = js.native
  def apply(block: BlockProperties): Controller = js.native
}

