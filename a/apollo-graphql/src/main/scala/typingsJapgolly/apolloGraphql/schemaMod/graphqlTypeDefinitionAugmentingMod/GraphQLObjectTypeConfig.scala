package typingsJapgolly.apolloGraphql.schemaMod.graphqlTypeDefinitionAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloGraphql.resolveObjectMod.GraphQLObjectResolver
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig[TSource, TContext] extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[TSource, TContext]] = js.undefined
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    resolveObject: (TSource, /* fields */ Record[String, js.Array[FieldNode]], TContext, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): GraphQLObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(js.Any.fromFunction4((t0: TSource, t1: /* fields */ typingsJapgolly.std.Record[java.lang.String, js.Array[typingsJapgolly.graphql.astMod.FieldNode]], t2: TContext, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolveObject(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLObjectTypeConfig[TSource, TContext]]
  }
}

