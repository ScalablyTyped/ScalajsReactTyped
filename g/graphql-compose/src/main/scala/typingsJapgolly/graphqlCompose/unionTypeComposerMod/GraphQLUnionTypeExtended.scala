package typingsJapgolly.graphqlCompose.unionTypeComposerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLUnionTypeConfigany
import typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode
import typingsJapgolly.graphql.astMod.UnionTypeExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.definitionMod.GraphQLUnionTypeConfig
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphqlCompose.definitionsMod.Extensions
import typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLUnionType & {  _gqcTypeMap  :std.Map<string, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeObjectType>,   _gqcTypeResolvers ? :graphql-compose.graphql-compose/lib/UnionTypeComposer.UnionTypeResolversMap<TSource, TContext>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLUnionTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcTypeMap: Map[String, ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.undefined
  var astNode: Maybe[UnionTypeDefinitionNode]
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  var resolveType: Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]
  def getTypes(): js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]
  def inspect(): String
  def toConfig(): GraphQLUnionTypeConfigany
  def toJSON(): String
}

object GraphQLUnionTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    getTypes: CallbackTo[js.Array[GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]]],
    inspect: CallbackTo[String],
    name: String,
    toConfig: CallbackTo[GraphQLUnionTypeConfigany],
    toJSON: CallbackTo[String],
    _gqcExtensions: Extensions = null,
    _gqcTypeResolvers: UnionTypeResolversMap[TSource, TContext] = null,
    astNode: Maybe[UnionTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (js.Any, js.Any, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => CallbackTo[
      PromiseOrValue[Maybe[(GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | String]]
    ] = null
  ): GraphQLUnionTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getTypes")(getTypes.toJsFn)
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("toConfig")(toConfig.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, t3: /* abstractType */ typingsJapgolly.graphql.definitionMod.GraphQLAbstractType) => resolveType(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLUnionTypeExtended[TSource, TContext]]
  }
}

