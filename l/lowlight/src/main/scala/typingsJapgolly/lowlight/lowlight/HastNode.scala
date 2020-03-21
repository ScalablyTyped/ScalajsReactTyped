package typingsJapgolly.lowlight.lowlight

import typingsJapgolly.lowlight.lowlight.AST.Properties
import typingsJapgolly.lowlight.lowlight.AST.Unist.Data
import typingsJapgolly.lowlight.lowlight.AST.Unist.Location
import typingsJapgolly.lowlight.lowlight.AST.Unist.Node
import typingsJapgolly.lowlight.lowlightStrings.comment
import typingsJapgolly.lowlight.lowlightStrings.doctype
import typingsJapgolly.lowlight.lowlightStrings.element
import typingsJapgolly.lowlight.lowlightStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lowlight.lowlight.AST.Root
  - typingsJapgolly.lowlight.lowlight.AST.Element
  - typingsJapgolly.lowlight.lowlight.AST.Doctype
  - typingsJapgolly.lowlight.lowlight.AST.Comment
  - typingsJapgolly.lowlight.lowlight.AST.Text
*/
trait HastNode extends js.Object

object HastNode {
  @scala.inline
  def Text(`type`: String, value: String, data: Data = null, position: Location = null): HastNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HastNode]
  }
  @scala.inline
  def Element(
    children: js.Array[Node],
    properties: Properties,
    tagName: String,
    `type`: element,
    data: Data = null,
    position: Location = null
  ): HastNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HastNode]
  }
  @scala.inline
  def Comment(`type`: comment, value: String, data: Data = null, position: Location = null): HastNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HastNode]
  }
  @scala.inline
  def Doctype(
    name: String,
    `type`: doctype,
    data: Data = null,
    position: Location = null,
    public: String = null,
    system: String = null
  ): HastNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[HastNode]
  }
  @scala.inline
  def Root(children: js.Array[Node], `type`: root, data: Data = null, position: Location = null): HastNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HastNode]
  }
}

