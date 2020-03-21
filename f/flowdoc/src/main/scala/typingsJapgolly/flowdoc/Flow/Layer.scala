package typingsJapgolly.flowdoc.Flow

import typingsJapgolly.flowdoc.Node
import typingsJapgolly.flowdoc.flowdocStrings.HOTSPOT
import typingsJapgolly.flowdoc.flowdocStrings.LAYER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends Node {
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  var position: Point
  var size: Size
  @JSName("type")
  var type_Layer: LAYER | HOTSPOT
}

object Layer {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: LAYER | HOTSPOT,
    connections: js.Array[Connection] = null
  ): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

