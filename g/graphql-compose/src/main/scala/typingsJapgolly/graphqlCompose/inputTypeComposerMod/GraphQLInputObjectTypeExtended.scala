package typingsJapgolly.graphqlCompose.inputTypeComposerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.GraphQLInputObjectTypeCon
import typingsJapgolly.graphql.astMod.InputObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InputObjectTypeExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLInputFieldMap
import typingsJapgolly.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphqlCompose.definitionsMod.Extensions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLInputObjectType & {  _gqcFields ? :graphql-compose.graphql-compose/lib/InputTypeComposer.ComposeInputFieldConfigMap,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLInputObjectTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeInputFieldConfigMap] = js.undefined
  var astNode: Maybe[InputObjectTypeDefinitionNode]
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  def getFields(): GraphQLInputFieldMap
  def inspect(): String
  def toConfig(): GraphQLInputObjectTypeCon
  def toJSON(): String
}

object GraphQLInputObjectTypeExtended {
  @scala.inline
  def apply(
    getFields: CallbackTo[GraphQLInputFieldMap],
    inspect: CallbackTo[String],
    name: String,
    toConfig: CallbackTo[GraphQLInputObjectTypeCon],
    toJSON: CallbackTo[String],
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeInputFieldConfigMap = null,
    astNode: Maybe[InputObjectTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null
  ): GraphQLInputObjectTypeExtended = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getFields")(getFields.toJsFn)
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("toConfig")(toConfig.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLInputObjectTypeExtended]
  }
}

