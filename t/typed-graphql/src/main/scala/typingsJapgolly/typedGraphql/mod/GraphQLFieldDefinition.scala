package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFieldDefinition extends js.Object {
  var args: js.Array[GraphQLArgument]
  var deprecationReason: js.UndefOr[String] = js.undefined
  var description: String
  var name: String
  var resolve: js.UndefOr[GraphQLFieldResolveFn] = js.undefined
  var `type`: GraphQLOutputType
}

object GraphQLFieldDefinition {
  @scala.inline
  def apply(
    args: js.Array[GraphQLArgument],
    description: String,
    name: String,
    `type`: GraphQLOutputType,
    deprecationReason: String = null,
    resolve: (/* source */ js.Any, /* args */ StringDictionary[js.Any], /* context */ js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null
  ): GraphQLFieldDefinition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction4((t0: /* source */ js.Any, t1: /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], t2: /* context */ js.Any, t3: /* info */ typingsJapgolly.typedGraphql.mod.GraphQLResolveInfo) => resolve(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[GraphQLFieldDefinition]
  }
}

