package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.emphasis
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emphasis
  extends Parent
     with StaticPhrasingContent {
  @JSName("children")
  var children_Emphasis: js.Array[PhrasingContent]
  @JSName("type")
  var type_Emphasis: emphasis
}

object Emphasis {
  @scala.inline
  def apply(
    children: js.Array[PhrasingContent],
    `type`: emphasis,
    data: Data = null,
    position: Position = null
  ): Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emphasis]
  }
}

