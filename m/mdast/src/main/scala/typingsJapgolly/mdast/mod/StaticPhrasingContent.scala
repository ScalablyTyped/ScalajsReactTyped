package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.break
import typingsJapgolly.mdast.mdastStrings.delete
import typingsJapgolly.mdast.mdastStrings.emphasis
import typingsJapgolly.mdast.mdastStrings.footnote
import typingsJapgolly.mdast.mdastStrings.footnoteReference
import typingsJapgolly.mdast.mdastStrings.html
import typingsJapgolly.mdast.mdastStrings.image
import typingsJapgolly.mdast.mdastStrings.imageReference
import typingsJapgolly.mdast.mdastStrings.inlineCode
import typingsJapgolly.mdast.mdastStrings.strong
import typingsJapgolly.mdast.mdastStrings.text
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mdast.mod.Text
  - typingsJapgolly.mdast.mod.Emphasis
  - typingsJapgolly.mdast.mod.Strong
  - typingsJapgolly.mdast.mod.Delete
  - typingsJapgolly.mdast.mod.HTML
  - typingsJapgolly.mdast.mod.InlineCode
  - typingsJapgolly.mdast.mod.Break
  - typingsJapgolly.mdast.mod.Image
  - typingsJapgolly.mdast.mod.ImageReference
  - typingsJapgolly.mdast.mod.Footnote
  - typingsJapgolly.mdast.mod.FootnoteReference
*/
trait StaticPhrasingContent extends PhrasingContent

object StaticPhrasingContent {
  @scala.inline
  def Delete(children: js.Array[PhrasingContent], `type`: delete, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Break(`type`: break, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Emphasis(
    children: js.Array[PhrasingContent],
    `type`: emphasis,
    data: Data = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def InlineCode(`type`: inlineCode, value: js.Any, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def ImageReference(
    identifier: String,
    referenceType: ReferenceType,
    `type`: imageReference,
    alt: String = null,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Footnote(
    children: js.Array[PhrasingContent],
    `type`: footnote,
    data: Data = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Strong(children: js.Array[PhrasingContent], `type`: strong, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def FootnoteReference(
    identifier: String,
    `type`: footnoteReference,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Image(
    `type`: image,
    url: String,
    alt: String = null,
    data: Data = null,
    position: Position = null,
    title: String = null
  ): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
  @scala.inline
  def Text(`type`: text, value: js.Any, data: Data = null, position: Position = null): StaticPhrasingContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPhrasingContent]
  }
}

