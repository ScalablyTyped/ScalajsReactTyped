package typingsJapgolly.graphqlCompose.enumTypeComposerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLEnumTypeConfigexte
import typingsJapgolly.graphql.astMod.EnumTypeDefinitionNode
import typingsJapgolly.graphql.astMod.EnumTypeExtensionNode
import typingsJapgolly.graphql.astMod.ValueNode
import typingsJapgolly.graphql.definitionMod.GraphQLEnumTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLEnumValue
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphqlCompose.definitionsMod.Extensions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLEnumType & {  _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLEnumTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var astNode: Maybe[EnumTypeDefinitionNode]
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  def getValue(name: String): Maybe[GraphQLEnumValue]
  def getValues(): js.Array[GraphQLEnumValue]
  def inspect(): String
  def parseLiteral(valueNode: ValueNode, _variables: Maybe[StringDictionary[_]]): Maybe[_]
  def parseValue(value: js.Any): Maybe[_]
  def serialize(value: js.Any): Maybe[String]
  def toConfig(): GraphQLEnumTypeConfigexte
  def toJSON(): String
}

object GraphQLEnumTypeExtended {
  @scala.inline
  def apply(
    getValue: String => CallbackTo[Maybe[GraphQLEnumValue]],
    getValues: CallbackTo[js.Array[GraphQLEnumValue]],
    inspect: CallbackTo[String],
    name: String,
    parseLiteral: (ValueNode, Maybe[StringDictionary[js.Any]]) => CallbackTo[Maybe[js.Any]],
    parseValue: js.Any => CallbackTo[Maybe[js.Any]],
    serialize: js.Any => CallbackTo[Maybe[String]],
    toConfig: CallbackTo[GraphQLEnumTypeConfigexte],
    toJSON: CallbackTo[String],
    _gqcExtensions: Extensions = null,
    astNode: Maybe[EnumTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLEnumTypeExtended = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: java.lang.String) => getValue(t0).runNow()))
    __obj.updateDynamic("getValues")(getValues.toJsFn)
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("parseLiteral")(js.Any.fromFunction2((t0: typingsJapgolly.graphql.astMod.ValueNode, t1: typingsJapgolly.graphql.maybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]]) => parseLiteral(t0, t1).runNow()))
    __obj.updateDynamic("parseValue")(js.Any.fromFunction1((t0: js.Any) => parseValue(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: js.Any) => serialize(t0).runNow()))
    __obj.updateDynamic("toConfig")(toConfig.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeExtended]
  }
}

