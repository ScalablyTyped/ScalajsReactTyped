package typingsJapgolly.graphql

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.UnionTypeDefinitionNode
import typingsJapgolly.graphql.astMod.UnionTypeExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.definitionMod.Thunk
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/definition.GraphQLUnionTypeConfig<any, any> & {  types  :std.Array<graphql.graphql/type/definition.GraphQLObjectType<any, any, {[key: string] : any}>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.UnionTypeExtensionNode>} */
trait GraphQLUnionTypeConfigany extends js.Object {
  var astNode: js.UndefOr[Maybe[UnionTypeDefinitionNode]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[UnionTypeExtensionNode]] with js.Array[UnionTypeExtensionNode]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var name: String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]] = js.undefined
  var types: (Thunk[js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]]) with (js.Array[GraphQLObjectType[_, _, StringDictionary[_]]])
}

object GraphQLUnionTypeConfigany {
  @scala.inline
  def apply(
    name: String,
    types: (Thunk[js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]]) with (js.Array[GraphQLObjectType[_, _, StringDictionary[_]]]),
    astNode: Maybe[UnionTypeDefinitionNode] = null,
    description: Maybe[String] = null,
    extensionASTNodes: Maybe[js.Array[UnionTypeExtensionNode]] with js.Array[UnionTypeExtensionNode] = null,
    extensions: Maybe[Record[String, _]] = null,
    resolveType: (js.Any, js.Any, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => CallbackTo[
      PromiseOrValue[Maybe[(GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | String]]
    ] = null
  ): GraphQLUnionTypeConfigany = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, t3: /* abstractType */ typingsJapgolly.graphql.definitionMod.GraphQLAbstractType) => resolveType(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLUnionTypeConfigany]
  }
}

