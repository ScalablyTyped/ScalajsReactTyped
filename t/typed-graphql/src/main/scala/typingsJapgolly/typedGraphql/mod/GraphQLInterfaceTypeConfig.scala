package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLInterfaceTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  var name: String
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
}

object GraphQLInterfaceTypeConfig {
  @scala.inline
  def apply(
    fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap,
    name: String,
    description: String = null,
    resolveType: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[GraphQLObjectType] = null
  ): GraphQLInterfaceTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* context */ js.Any, t2: /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo) => resolveType(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GraphQLInterfaceTypeConfig]
  }
}

