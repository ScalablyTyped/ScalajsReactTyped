package typingsJapgolly.hast.mod

import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent
  extends typingsJapgolly.unist.mod.Parent

object Parent {
  @scala.inline
  def apply(children: js.Array[Node], `type`: String, data: Data = null, position: Position = null): Parent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

