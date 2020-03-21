package typingsJapgolly.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.slate.slateStrings.`inline`
import typingsJapgolly.slate.slateStrings.block
import typingsJapgolly.slate.slateStrings.document
import typingsJapgolly.slate.slateStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.slate.mod.DocumentJSON
  - typingsJapgolly.slate.mod.BlockJSON
  - typingsJapgolly.slate.mod.InlineJSON
  - typingsJapgolly.slate.mod.TextJSON
*/
trait NodeJSON extends js.Object

object NodeJSON {
  @scala.inline
  def DocumentJSON(
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[NodeJSON] = null,
    `object`: document = null
  ): NodeJSON = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeJSON]
  }
  @scala.inline
  def BlockJSON(
    `type`: String,
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[typingsJapgolly.slate.mod.BlockJSON | InlineJSON | TextJSON] = null,
    `object`: block = null
  ): NodeJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeJSON]
  }
  @scala.inline
  def InlineJSON(
    `type`: String,
    data: StringDictionary[js.Any] = null,
    key: String = null,
    nodes: js.Array[typingsJapgolly.slate.mod.InlineJSON | TextJSON] = null,
    `object`: `inline` = null
  ): NodeJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeJSON]
  }
  @scala.inline
  def TextJSON(key: String = null, marks: js.Array[MarkJSON] = null, `object`: text = null, text: String = null): NodeJSON = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeJSON]
  }
}

