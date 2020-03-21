package typingsJapgolly.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.immutable.Immutable.List
import typingsJapgolly.immutable.Immutable.Set_
import typingsJapgolly.slate.slateStrings.`inline`
import typingsJapgolly.slate.slateStrings.block
import typingsJapgolly.slate.slateStrings.document
import typingsJapgolly.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.slate.mod.DocumentProperties
  - typingsJapgolly.slate.mod.BlockProperties
  - typingsJapgolly.slate.mod.InlineProperties
  - typingsJapgolly.slate.mod.TextProperties
*/
trait NodeProperties extends js.Object

object NodeProperties {
  @scala.inline
  def DocumentProperties(
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: List[Node] | js.Array[Node] = null,
    `object`: document = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def BlockProperties(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Block | Text | Inline]) | (js.Array[Block | Text | Inline]) = null,
    `object`: block = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def InlineProperties(
    `type`: String,
    data: Data | StringDictionary[js.Any] = null,
    key: String = null,
    nodes: (List[Inline | Text]) | (js.Array[Inline | Text]) = null,
    `object`: `inline` = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
  @scala.inline
  def TextProperties(
    key: String = null,
    marks: Set_[Mark] | js.Array[Mark] = null,
    `object`: text = null,
    text: String = null
  ): NodeProperties = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProperties]
  }
}

