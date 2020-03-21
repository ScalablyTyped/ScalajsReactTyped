package typingsJapgolly.hast.mod

import typingsJapgolly.hast.hastStrings.element
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends Parent {
  /**
    * List representing the children of a node.
    */
  @JSName("children")
  var children_Element: js.Array[Element | Comment | Text]
  /**
    * If the tagName field is 'template', a content field can be present.
    */
  var content: js.UndefOr[Root] = js.undefined
  /**
    * Represents information associated with the element.
    */
  var properties: js.UndefOr[Properties] = js.undefined
  /**
    * Represents the element’s local name.
    */
  var tagName: String
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_Element: element
}

object Element {
  @scala.inline
  def apply(
    children: js.Array[Element | Comment | Text],
    tagName: String,
    `type`: element,
    content: Root = null,
    data: Data = null,
    position: Position = null,
    properties: Properties = null
  ): Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

