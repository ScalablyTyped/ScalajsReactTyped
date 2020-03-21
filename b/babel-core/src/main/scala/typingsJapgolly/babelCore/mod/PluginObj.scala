package typingsJapgolly.babelCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTraverse.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginObj[S] extends js.Object {
  var inherits: js.UndefOr[js.Any] = js.undefined
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.undefined
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.undefined
  var visitor: Visitor[S]
}

object PluginObj {
  @scala.inline
  def apply[S](
    visitor: Visitor[S],
    inherits: js.Any = null,
    manipulateOptions: (/* opts */ js.Any, /* parserOpts */ js.Any) => Callback = null,
    name: String = null,
    post: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit] = null,
    pre: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit] = null
  ): PluginObj[S] = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    if (manipulateOptions != null) __obj.updateDynamic("manipulateOptions")(js.Any.fromFunction2((t0: /* opts */ js.Any, t1: /* parserOpts */ js.Any) => manipulateOptions(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginObj[S]]
  }
}

