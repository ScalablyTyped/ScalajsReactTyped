package typingsJapgolly.stylus

import typingsJapgolly.stylus.mod.Stylus.Nodes.Block
import typingsJapgolly.stylus.mod.Stylus.Nodes.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinenoSegments extends js.Object {
  var __type: String
  var block: js.UndefOr[Block] = js.undefined
  var column: Double
  var filename: String
  var lineno: Double
  var segments: js.Array[Node]
  var `type`: String
}

object AnonLinenoSegments {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    segments: js.Array[Node],
    `type`: String,
    block: Block = null
  ): AnonLinenoSegments = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinenoSegments]
  }
}

