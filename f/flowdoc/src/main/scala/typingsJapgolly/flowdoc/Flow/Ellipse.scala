package typingsJapgolly.flowdoc.Flow

import typingsJapgolly.flowdoc.Shape
import typingsJapgolly.flowdoc.flowdocStrings.ELLIPSE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ellipse extends Shape {
  @JSName("type")
  var type_Ellipse: ELLIPSE
}

object Ellipse {
  @scala.inline
  def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    `type`: ELLIPSE,
    connections: js.Array[Connection] = null
  ): Ellipse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipse]
  }
}

