package typingsJapgolly.graphqlCompose.objectTypeComposerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.GraphQLObjectTypeConfigan
import typingsJapgolly.graphql.astMod.ObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ObjectTypeExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldMap
import typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
import typingsJapgolly.graphql.definitionMod.GraphQLIsTypeOfFn
import typingsJapgolly.graphql.definitionMod.GraphQLObjectTypeConfig
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphqlCompose.definitionsMod.Extensions
import typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceType
import typingsJapgolly.graphqlCompose.resolverMod.Resolver
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLObjectType<any, any, {[key: string] : any}> & {  _gqcInputTypeComposer ? :graphql-compose.graphql-compose/lib/InputTypeComposer.InputTypeComposer<TContext>,   _gqcResolvers ? :std.Map<string, graphql-compose.graphql-compose/lib/Resolver.Resolver<TSource, TContext, graphql-compose.graphql-compose/lib/ObjectTypeComposer.ArgsMap, any>>,   _gqcGetRecordIdFn ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.GetRecordIdFn<TSource, TContext>,   _gqcRelations ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.RelationThunkMap<TSource, TContext>,   _gqcFields ? :graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeFieldConfigMap<TSource, TContext>,   _gqcInterfaces ? :std.Array<graphql-compose.graphql-compose/lib/InterfaceTypeComposer.ComposeInterfaceType>,   _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions,   description  :string | null} */
trait GraphQLObjectTypeExtended[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcGetRecordIdFn: js.UndefOr[GetRecordIdFn[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcInterfaces: js.UndefOr[js.Array[ComposeInterfaceType]] = js.undefined
  var _gqcRelations: js.UndefOr[RelationThunkMap[TSource, TContext]] = js.undefined
  var _gqcResolvers: js.UndefOr[Map[String, Resolver[TSource, TContext, ArgsMap, _]]] = js.undefined
  var astNode: Maybe[ObjectTypeDefinitionNode]
  var description: Maybe[String] with (String | Null)
  var extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var isTypeOf: Maybe[GraphQLIsTypeOfFn[_, _]]
  var name: String
  def getFields(): GraphQLFieldMap[_, _, StringDictionary[_]]
  def getInterfaces(): js.Array[GraphQLInterfaceType]
  def inspect(): String
  def toConfig(): GraphQLObjectTypeConfigan
  def toJSON(): String
}

object GraphQLObjectTypeExtended {
  @scala.inline
  def apply[TSource, TContext](
    description: Maybe[String] with (String | Null),
    getFields: CallbackTo[GraphQLFieldMap[js.Any, js.Any, StringDictionary[js.Any]]],
    getInterfaces: CallbackTo[js.Array[GraphQLInterfaceType]],
    inspect: CallbackTo[String],
    name: String,
    toConfig: CallbackTo[GraphQLObjectTypeConfigan],
    toJSON: CallbackTo[String],
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcGetRecordIdFn: (TSource, /* args */ js.Any, TContext) => CallbackTo[String] = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcInterfaces: js.Array[ComposeInterfaceType] = null,
    _gqcRelations: RelationThunkMap[TSource, TContext] = null,
    _gqcResolvers: Map[String, Resolver[TSource, TContext, ArgsMap, _]] = null,
    astNode: Maybe[ObjectTypeDefinitionNode] = null,
    extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] = null,
    extensions: Maybe[Record[String, _]] = null,
    isTypeOf: (js.Any, js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[PromiseOrValue[Boolean]] = null
  ): GraphQLObjectTypeExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getFields")(getFields.toJsFn)
    __obj.updateDynamic("getInterfaces")(getInterfaces.toJsFn)
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.updateDynamic("toConfig")(toConfig.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (_gqcGetRecordIdFn != null) __obj.updateDynamic("_gqcGetRecordIdFn")(js.Any.fromFunction3((t0: TSource, t1: /* args */ js.Any, t2: TContext) => _gqcGetRecordIdFn(t0, t1, t2).runNow()))
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer.asInstanceOf[js.Any])
    if (_gqcInterfaces != null) __obj.updateDynamic("_gqcInterfaces")(_gqcInterfaces.asInstanceOf[js.Any])
    if (_gqcRelations != null) __obj.updateDynamic("_gqcRelations")(_gqcRelations.asInstanceOf[js.Any])
    if (_gqcResolvers != null) __obj.updateDynamic("_gqcResolvers")(_gqcResolvers.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => isTypeOf(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GraphQLObjectTypeExtended[TSource, TContext]]
  }
}

