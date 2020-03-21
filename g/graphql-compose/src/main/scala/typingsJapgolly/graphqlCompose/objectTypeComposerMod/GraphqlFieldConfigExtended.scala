package typingsJapgolly.graphqlCompose.objectTypeComposerMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.FieldDefinitionNode
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLOutputType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLFieldConfig<TSource, TContext, {[argName: string] : any}> & {  projection ? :any} */
trait GraphqlFieldConfigExtended[TSource, TContext] extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  var astNode: js.UndefOr[Maybe[FieldDefinitionNode]] = js.undefined
  var deprecationReason: js.UndefOr[Maybe[String]] = js.undefined
  var description: js.UndefOr[Maybe[String]] = js.undefined
  var extensions: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
  var projection: js.UndefOr[js.Any] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.undefined
  var subscribe: js.UndefOr[GraphQLFieldResolver[TSource, TContext, StringDictionary[_]]] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphqlFieldConfigExtended {
  @scala.inline
  def apply[TSource, TContext](
    `type`: GraphQLOutputType,
    args: GraphQLFieldConfigArgumentMap = null,
    astNode: Maybe[FieldDefinitionNode] = null,
    deprecationReason: Maybe[String] = null,
    description: Maybe[String] = null,
    extensions: Maybe[Record[String, _]] = null,
    projection: js.Any = null,
    resolve: (TSource, StringDictionary[js.Any], TContext, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    subscribe: (TSource, StringDictionary[js.Any], TContext, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): GraphqlFieldConfigExtended[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (astNode != null) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4((t0: TSource, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: TContext, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolve(t0, t1, t2, t3).runNow()))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction4((t0: TSource, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: TContext, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => subscribe(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphqlFieldConfigExtended[TSource, TContext]]
  }
}

