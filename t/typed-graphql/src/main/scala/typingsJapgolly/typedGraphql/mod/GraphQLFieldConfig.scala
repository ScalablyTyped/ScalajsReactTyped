package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldConfig extends js.Object {
  var args: js.UndefOr[GraphQLFieldConfigArgumentMap] = js.undefined
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldConfig {
  @scala.inline
  def apply(
    `type`: GraphQLOutputType,
    args: GraphQLFieldConfigArgumentMap = null,
    deprecationReason: String = null,
    description: String = null,
    resolve: (/* source */ js.Any, /* args */ StringDictionary[js.Any], /* context */ js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): GraphQLFieldConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4((t0: /* source */ js.Any, t1: /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], t2: /* context */ js.Any, t3: /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo) => resolve(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLFieldConfig]
  }
}

