package typingsJapgolly.graphqlRelay.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigMap
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var connectionFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) | Null] = js.undefined
  var edgeFields: js.UndefOr[(Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]]) | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var nodeType: ConnectionConfigNodeType
  var resolveCursor: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
  var resolveNode: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    nodeType: ConnectionConfigNodeType,
    connectionFields: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]] = null,
    edgeFields: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]] = null,
    name: String = null,
    resolveCursor: (js.Any, StringDictionary[js.Any], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    resolveNode: (js.Any, StringDictionary[js.Any], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
    if (connectionFields != null) __obj.updateDynamic("connectionFields")(connectionFields.asInstanceOf[js.Any])
    if (edgeFields != null) __obj.updateDynamic("edgeFields")(edgeFields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resolveCursor != null) __obj.updateDynamic("resolveCursor")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolveCursor(t0, t1, t2, t3).runNow()))
    if (resolveNode != null) __obj.updateDynamic("resolveNode")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolveNode(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ConnectionConfig]
  }
}

