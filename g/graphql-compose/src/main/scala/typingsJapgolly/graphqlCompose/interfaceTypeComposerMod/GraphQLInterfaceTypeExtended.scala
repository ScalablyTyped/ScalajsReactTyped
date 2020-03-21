package typingsJapgolly.graphqlCompose.interfaceTypeComposerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLInterfaceTypeConfi
import typingsJapgolly.graphql.astMod.InterfaceTypeDefinitionNode
import typingsJapgolly.graphql.astMod.InterfaceTypeExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLFieldMap
import typingsJapgolly.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphqlCompose.definitionsMod.Extensions
import typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLInterfaceType & {  _gqcFields ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext>,   _gqcInputTypeComposer ? :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext>,   _gqcTypeResolvers ? :graphql-compose.graphql-compose/lib/InterfaceTypeComposer.InterfaceTypeResolversMap<TContext>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLInterfaceTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcTypeResolvers: js.UndefOr[InterfaceTypeResolversMap[TContext]] = js.undefined
  var astNode: js.UndefOr[Maybe[InterfaceTypeDefinitionNode]] = js.undefined
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]]
  def inspect(): String
  def toConfig(): GraphQLInterfaceTypeConfi
  def toJSON(): String
}

object GraphQLInterfaceTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    getFields: CallbackTo[GraphQLFieldMap[js.Any, js.Any, StringDictionary[js.Any]]],
    inspect: CallbackTo[String],
    name: String,
    toConfig: CallbackTo[GraphQLInterfaceTypeConfi],
    toJSON: CallbackTo[String],
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcTypeResolvers: InterfaceTypeResolversMap[TContext] = null,
    astNode: Maybe[InterfaceTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[InterfaceTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (js.Any, js.Any, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => CallbackTo[
      PromiseOrValue[Maybe[(GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | String]]
    ] = null
  ): GraphQLInterfaceTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getFields")(getFields.toJsFn)
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("toConfig")(toConfig.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, t3: /* abstractType */ typingsJapgolly.graphql.definitionMod.GraphQLAbstractType) => resolveType(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLInterfaceTypeExtended[TSource, TContext]]
  }
}

