package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLObjectTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap
  var interfaces: js.UndefOr[GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType]] = js.undefined
  var isTypeOf: js.UndefOr[GraphQLIsTypeOfFn] = js.undefined
  var name: String
}

object GraphQLObjectTypeConfig {
  @scala.inline
  def apply(
    fields: GraphQLFieldConfigMapThunk | GraphQLFieldConfigMap,
    name: String,
    description: String = null,
    interfaces: GraphQLInterfacesThunk | js.Array[GraphQLInterfaceType] = null,
    isTypeOf: (/* source */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[Boolean] = null
  ): GraphQLObjectTypeConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces.asInstanceOf[js.Any])
    if (isTypeOf != null) __obj.updateDynamic("isTypeOf")(js.Any.fromFunction3((t0: /* source */ js.Any, t1: /* context */ js.Any, t2: /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo) => isTypeOf(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GraphQLObjectTypeConfig]
  }
}

