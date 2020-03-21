package typingsJapgolly.turndown.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var filter: Filter
  var replacement: js.UndefOr[ReplacementFunction] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    filter: Filter,
    replacement: (/* content */ String, /* node */ Node, /* options */ Options) => CallbackTo[String] = null
  ): Rule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(js.Any.fromFunction3((t0: /* content */ java.lang.String, t1: /* node */ typingsJapgolly.turndown.mod.Node, t2: /* options */ typingsJapgolly.turndown.mod.Options) => replacement(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Rule]
  }
}

