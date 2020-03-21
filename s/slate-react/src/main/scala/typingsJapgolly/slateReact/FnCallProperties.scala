package typingsJapgolly.slateReact

import typingsJapgolly.slate.mod.Block
import typingsJapgolly.slate.mod.BlockJSON
import typingsJapgolly.slate.mod.BlockProperties
import typingsJapgolly.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallProperties extends js.Object {
  def apply(properties: String): Controller = js.native
  def apply(properties: Block): Controller = js.native
  def apply(properties: BlockJSON): Controller = js.native
  def apply(properties: BlockProperties): Controller = js.native
}

