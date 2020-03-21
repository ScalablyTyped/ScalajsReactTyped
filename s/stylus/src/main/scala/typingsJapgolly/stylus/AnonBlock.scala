package typingsJapgolly.stylus

import typingsJapgolly.stylus.mod.Stylus.Nodes.Block
import typingsJapgolly.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  var __type: String
  var block: Block
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[Node]
}

object AnonBlock {
  @scala.inline
  def apply(
    __type: String,
    block: Block,
    column: Double,
    filename: String,
    lineno: Double,
    nodes: js.Array[Node]
  ): AnonBlock = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlock]
  }
}

