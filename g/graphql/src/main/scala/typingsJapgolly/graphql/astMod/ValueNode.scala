package typingsJapgolly.graphql.astMod

import typingsJapgolly.graphql.graphqlStrings.BooleanValue
import typingsJapgolly.graphql.graphqlStrings.EnumValue
import typingsJapgolly.graphql.graphqlStrings.FloatValue
import typingsJapgolly.graphql.graphqlStrings.IntValue
import typingsJapgolly.graphql.graphqlStrings.ListValue
import typingsJapgolly.graphql.graphqlStrings.NullValue
import typingsJapgolly.graphql.graphqlStrings.ObjectValue
import typingsJapgolly.graphql.graphqlStrings.StringValue
import typingsJapgolly.graphql.graphqlStrings.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphql.astMod.VariableNode
  - typingsJapgolly.graphql.astMod.IntValueNode
  - typingsJapgolly.graphql.astMod.FloatValueNode
  - typingsJapgolly.graphql.astMod.StringValueNode
  - typingsJapgolly.graphql.astMod.BooleanValueNode
  - typingsJapgolly.graphql.astMod.NullValueNode
  - typingsJapgolly.graphql.astMod.EnumValueNode
  - typingsJapgolly.graphql.astMod.ListValueNode
  - typingsJapgolly.graphql.astMod.ObjectValueNode
*/
trait ValueNode extends js.Object

object ValueNode {
  @scala.inline
  def VariableNode(kind: Variable, name: NameNode, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def StringValueNode(kind: StringValue, value: String, block: js.UndefOr[Boolean] = js.undefined, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def BooleanValueNode(kind: BooleanValue, value: Boolean, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def NullValueNode(kind: NullValue, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ObjectValueNode(fields: js.Array[ObjectFieldNode], kind: ObjectValue, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def ListValueNode(kind: ListValue, values: js.Array[ValueNode], loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def FloatValueNode(kind: FloatValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def EnumValueNode(kind: EnumValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
  @scala.inline
  def IntValueNode(kind: IntValue, value: String, loc: Location = null): ValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNode]
  }
}

