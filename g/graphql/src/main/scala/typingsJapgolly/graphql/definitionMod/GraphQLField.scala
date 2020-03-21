package typingsJapgolly.graphql.definitionMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.astMod.FieldDefinitionNode
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLField[TSource, TContext, TArgs] extends js.Object {
  var args: js.Array[GraphQLArgument]
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: Maybe[String]
  var extensions: Maybe[Record[String, _]]
  var isDeprecated: js.UndefOr[Boolean] = js.undefined
  var name: String
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, TArgs]] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLField {
  @scala.inline
  def apply[TSource, TContext, TArgs](
    args: js.Array[GraphQLArgument],
    name: String,
    `type`: GraphQLOutputType,
    astNode: Maybe[FieldDefinitionNode] = null,
    deprecationReason: Maybe[String] = null,
    description: Maybe[String] = null,
    extensions: Maybe[Record[String, _]] = null,
    isDeprecated: js.UndefOr[Boolean] = js.undefined,
    resolve: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    subscribe: (TSource, TArgs, TContext, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): GraphQLField[TSource, TContext, TArgs] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeprecated)) __obj.updateDynamic("isDeprecated")(isDeprecated.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4((t0: TSource, t1: TArgs, t2: TContext, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolve(t0, t1, t2, t3).runNow()))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4((t0: TSource, t1: TArgs, t2: TContext, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => subscribe(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLField[TSource, TContext, TArgs]]
  }
}

