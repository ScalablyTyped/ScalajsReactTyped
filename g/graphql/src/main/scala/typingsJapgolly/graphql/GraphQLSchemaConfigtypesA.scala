package typingsJapgolly.graphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.SchemaDefinitionNode
import typingsJapgolly.graphql.astMod.SchemaExtensionNode
import typingsJapgolly.graphql.definitionMod.GraphQLNamedType
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.directivesMod.GraphQLDirective
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/schema.GraphQLSchemaConfig & {  types  :std.Array<graphql.graphql/type/definition.GraphQLNamedType>,   directives  :std.Array<graphql.graphql/type/directives.GraphQLDirective>,   extensions  :graphql.graphql/tsutils/Maybe.default<std.Readonly<std.Record<string, any>>>,   extensionASTNodes  :std.ReadonlyArray<graphql.graphql/language/ast.SchemaExtensionNode>,   assumeValid  :boolean,   allowedLegacyNames  :std.ReadonlyArray<string>} */
trait GraphQLSchemaConfigtypesA extends js.Object {
  /**
    * If provided, the schema will consider fields or types with names included
    * in this list valid, even if they do not adhere to the specification's
    * schema validation rules.
    *
    * This option is provided to ease adoption and will be removed in v15.
    */
  var allowedLegacyNames: js.UndefOr[Maybe[js.Array[String]] with js.Array[String]] = js.undefined
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[Boolean] = js.undefined
  var astNode: js.UndefOr[Maybe[SchemaDefinitionNode]] = js.undefined
  var directives: js.UndefOr[Maybe[js.Array[GraphQLDirective]] with js.Array[GraphQLDirective]] = js.undefined
  var extensionASTNodes: js.UndefOr[Maybe[js.Array[SchemaExtensionNode]] with js.Array[SchemaExtensionNode]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var mutation: js.UndefOr[Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]] = js.undefined
  var query: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]
  var subscription: js.UndefOr[Maybe[GraphQLObjectType[_, _, StringDictionary[_]]]] = js.undefined
  var types: js.UndefOr[Maybe[js.Array[GraphQLNamedType]] with js.Array[GraphQLNamedType]] = js.undefined
}

object GraphQLSchemaConfigtypesA {
  @scala.inline
  def apply(
    allowedLegacyNames: Maybe[js.Array[String]] with js.Array[String] = null,
    assumeValid: js.UndefOr[Boolean] = js.undefined,
    astNode: Maybe[SchemaDefinitionNode] = null,
    directives: Maybe[js.Array[GraphQLDirective]] with js.Array[GraphQLDirective] = null,
    extensionASTNodes: Maybe[js.Array[SchemaExtensionNode]] with js.Array[SchemaExtensionNode] = null,
    extensions: Maybe[Record[String, _]] = null,
    mutation: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = null,
    query: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = null,
    subscription: Maybe[GraphQLObjectType[_, _, StringDictionary[_]]] = null,
    types: Maybe[js.Array[GraphQLNamedType]] with js.Array[GraphQLNamedType] = null
  ): GraphQLSchemaConfigtypesA = {
    val __obj = js.Dynamic.literal()
    if (allowedLegacyNames != null) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (extensionASTNodes != null) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (mutation != null) __obj.updateDynamic("mutation")(mutation.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLSchemaConfigtypesA]
  }
}

