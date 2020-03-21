package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLUnionTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  /**
    * Optionally provide a custom type resolver function. If one is not provided,
    * the default implementation will call `isTypeOf` on each implementing
    * Object type.
    */
  var resolveType: js.UndefOr[GraphQLTypeResolveFn] = js.undefined
  var types: js.Array[GraphQLObjectType]
}

object GraphQLUnionTypeConfig {
  @scala.inline
  def apply(
    name: String,
    types: js.Array[GraphQLObjectType],
    description: String = null,
    resolveType: (/* value */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[GraphQLObjectType] = null
  ): GraphQLUnionTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* context */ js.Any, t2: /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo) => resolveType(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GraphQLUnionTypeConfig]
  }
}

