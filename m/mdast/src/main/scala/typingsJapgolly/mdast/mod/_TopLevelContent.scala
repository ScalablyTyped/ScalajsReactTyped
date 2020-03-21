package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastNumbers.`1`
import typingsJapgolly.mdast.mdastNumbers.`2`
import typingsJapgolly.mdast.mdastNumbers.`3`
import typingsJapgolly.mdast.mdastNumbers.`4`
import typingsJapgolly.mdast.mdastNumbers.`5`
import typingsJapgolly.mdast.mdastNumbers.`6`
import typingsJapgolly.mdast.mdastStrings.blockquote
import typingsJapgolly.mdast.mdastStrings.code
import typingsJapgolly.mdast.mdastStrings.definition
import typingsJapgolly.mdast.mdastStrings.footnoteDefinition
import typingsJapgolly.mdast.mdastStrings.heading
import typingsJapgolly.mdast.mdastStrings.html
import typingsJapgolly.mdast.mdastStrings.list
import typingsJapgolly.mdast.mdastStrings.paragraph
import typingsJapgolly.mdast.mdastStrings.table
import typingsJapgolly.mdast.mdastStrings.thematicBreak
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TopLevelContent extends _Content

object _TopLevelContent {
  @scala.inline
  def FootnoteDefinition(
    children: js.Array[BlockContent],
    identifier: String,
    `type`: footnoteDefinition,
    data: Data = null,
    label: String = null,
    position: Position = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def Code(
    `type`: code,
    value: js.Any,
    data: Data = null,
    lang: String = null,
    meta: String = null,
    position: Position = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def Definition(
    identifier: String,
    `type`: definition,
    url: String,
    data: Data = null,
    label: String = null,
    position: Position = null,
    title: String = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def Table(
    children: js.Array[TableContent],
    `type`: table,
    align: js.Array[AlignType] = null,
    data: Data = null,
    position: Position = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def List(
    children: js.Array[ListContent],
    `type`: list,
    data: Data = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    position: Position = null,
    spread: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def ThematicBreak(`type`: thematicBreak, data: Data = null, position: Position = null): _TopLevelContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def HTML(`type`: html, value: js.Any, data: Data = null, position: Position = null): _TopLevelContent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def Heading(
    children: js.Array[PhrasingContent],
    depth: `1` | `2` | `3` | `4` | `5` | `6`,
    `type`: heading,
    data: Data = null,
    position: Position = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def Blockquote(children: js.Array[BlockContent], `type`: blockquote, data: Data = null, position: Position = null): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
  @scala.inline
  def Paragraph(
    children: js.Array[PhrasingContent],
    `type`: paragraph,
    data: Data = null,
    position: Position = null
  ): _TopLevelContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TopLevelContent]
  }
}

