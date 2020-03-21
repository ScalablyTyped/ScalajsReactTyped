package typingsJapgolly.cssSelectorTokenizer.mod

import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.`nested-item`
import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.comment
import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.invalid
import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.string
import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssSelectorTokenizer.mod.ItemNode
  - typingsJapgolly.cssSelectorTokenizer.mod.NestedItemNode
  - typingsJapgolly.cssSelectorTokenizer.mod.StringNode
  - typingsJapgolly.cssSelectorTokenizer.mod.CommentNode
  - typingsJapgolly.cssSelectorTokenizer.mod.UrlNode
  - typingsJapgolly.cssSelectorTokenizer.mod.InvalidNode
*/
trait ValueNodeType extends AnyValueNode

object ValueNodeType {
  @scala.inline
  def InvalidNode(`type`: invalid, value: String, after: String = null, before: String = null, name: String = null): ValueNodeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def NestedItemNode(
    name: String,
    nodes: js.Array[ValueNode],
    `type`: `nested-item`,
    after: String = null,
    before: String = null
  ): ValueNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def ItemNode(name: String, `type`: item, after: String = null, before: String = null): ValueNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def StringNode(
    stringType: String,
    `type`: string,
    value: String,
    after: String = null,
    before: String = null,
    name: String = null
  ): ValueNodeType = {
    val __obj = js.Dynamic.literal(stringType = stringType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def UrlNode(
    `type`: url,
    url: String,
    after: String = null,
    before: String = null,
    innerSpacingAfter: String = null,
    innerSpacingBefore: String = null,
    name: String = null,
    stringType: String = null
  ): ValueNodeType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (innerSpacingAfter != null) __obj.updateDynamic("innerSpacingAfter")(innerSpacingAfter.asInstanceOf[js.Any])
    if (innerSpacingBefore != null) __obj.updateDynamic("innerSpacingBefore")(innerSpacingBefore.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringType != null) __obj.updateDynamic("stringType")(stringType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
  @scala.inline
  def CommentNode(content: String, `type`: comment, after: String = null, before: String = null, name: String = null): ValueNodeType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNodeType]
  }
}

