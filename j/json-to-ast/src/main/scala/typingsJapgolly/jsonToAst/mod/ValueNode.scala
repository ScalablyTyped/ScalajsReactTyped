package typingsJapgolly.jsonToAst.mod

import typingsJapgolly.jsonToAst.jsonToAstStrings.Array
import typingsJapgolly.jsonToAst.jsonToAstStrings.Literal
import typingsJapgolly.jsonToAst.jsonToAstStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonToAst.mod.ObjectNode
  - typingsJapgolly.jsonToAst.mod.ArrayNode
  - typingsJapgolly.jsonToAst.mod.LiteralNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  def ObjectNode(children: js.Array[PropertyNode], `type`: Object, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ArrayNode(children: js.Array[ValueNode], `type`: Array, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def LiteralNode(raw: String, `type`: Literal, loc: Location = null, value: String | Double | Boolean = null): ValueNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

