package typingsJapgolly.graphql

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.ObjectTypeDefinitionNode
import typingsJapgolly.graphql.astMod.ObjectTypeExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigMap
import typingsJapgolly.graphql.definitionMod.GraphQLInterfaceType
import typingsJapgolly.graphql.definitionMod.GraphQLIsTypeOfFn
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.Thunk
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLObjectTypeConfig<any, any, {[key: string] : any}> & {  interfaces  :std.Array<graphql.graphql/type/definition.GraphQLInterfaceType>,   fields  :graphql.graphql/type/definition.GraphQLFieldConfigMap<any, any, {[key: string] : any}>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.ObjectTypeExtensionNode>} */
trait GraphQLObjectTypeConfigan extends js.Object {
  var astNode: js.UndefOr[Maybe[ObjectTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[ObjectTypeExtensionNode]] with js.Array[ObjectTypeExtensionNode]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]])
  var interfaces: js.UndefOr[Thunk[Maybe[js.Array[GraphQLInterfaceType]]] with js.Array[GraphQLInterfaceType]] = js.undefined
  var isTypeOf: js.UndefOr[Maybe[GraphQLIsTypeOfFn[_, _]]] = js.undefined
  var name: String
}

object GraphQLObjectTypeConfigan {
  @scala.inline
  def apply(
    fields: (Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) with (GraphQLFieldConfigMap[_, _, StringDictionary[_]]),
    name: String,
    astNode: Maybe[ObjectTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[ObjectTypeExtensionNode]] with js.Array[ObjectTypeExtensionNode] = null,
    extensions: Maybe[Record[String, _]] = null,
    interfaces: Thunk[Maybe[js.Array[GraphQLInterfaceType]]] with js.Array[GraphQLInterfaceType] = null,
    isTypeOf: (js.Any, js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[PromiseOrValue[Boolean]] = null
  ): GraphQLObjectTypeConfigan = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => isTypeOf(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GraphQLObjectTypeConfigan]
  }
}

