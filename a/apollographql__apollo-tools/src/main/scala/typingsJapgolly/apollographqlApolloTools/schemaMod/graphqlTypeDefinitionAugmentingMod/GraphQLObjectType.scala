package typingsJapgolly.apollographqlApolloTools.schemaMod.graphqlTypeDefinitionAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apollographqlApolloTools.resolveObjectMod.GraphQLObjectResolver
import typingsJapgolly.graphql.astMod.FieldNode
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectType extends js.Object {
  var resolveObject: js.UndefOr[GraphQLObjectResolver[_, _]] = js.undefined
}

object GraphQLObjectType {
  @scala.inline
  def apply(
    resolveObject: (js.Any, /* fields */ Record[String, js.Array[FieldNode]], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): GraphQLObjectType = {
    val __obj = js.Dynamic.literal()
    if (resolveObject != null) __obj.updateDynamic("resolveObject")(js.Any.fromFunction4((t0: js.Any, t1: /* fields */ typingsJapgolly.std.Record[java.lang.String, js.Array[typingsJapgolly.graphql.astMod.FieldNode]], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolveObject(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLObjectType]
  }
}

