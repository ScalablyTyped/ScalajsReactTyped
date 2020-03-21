package typingsJapgolly.lowlight.lowlight.AST

import typingsJapgolly.lowlight.lowlight.AST.Unist.Data
import typingsJapgolly.lowlight.lowlight.AST.Unist.Location
import typingsJapgolly.lowlight.lowlight.AST.Unist.Node
import typingsJapgolly.lowlight.lowlight.AST.Unist.Parent
import typingsJapgolly.lowlight.lowlight.HastNode
import typingsJapgolly.lowlight.lowlightStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element
  extends Parent
     with HastNode {
  var properties: Properties
  var tagName: String
  @JSName("type")
  var type_Element: element
}

object Element {
  @scala.inline
  def apply(
    children: js.Array[Node],
    properties: Properties,
    tagName: String,
    `type`: element,
    data: Data = null,
    position: Location = null
  ): Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

