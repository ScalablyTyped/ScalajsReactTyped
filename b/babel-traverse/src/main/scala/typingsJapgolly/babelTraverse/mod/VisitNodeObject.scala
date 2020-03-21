package typingsJapgolly.babelTraverse.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitNodeObject[T] extends js.Object {
  var enter: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.undefined
  var exit: js.UndefOr[js.Function2[/* path */ NodePath[T], /* state */ js.Any, Unit]] = js.undefined
}

object VisitNodeObject {
  @scala.inline
  def apply[T](
    enter: (/* path */ NodePath[T], /* state */ js.Any) => Callback = null,
    exit: (/* path */ NodePath[T], /* state */ js.Any) => Callback = null
  ): VisitNodeObject[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2((t0: /* path */ typingsJapgolly.babelTraverse.mod.NodePath[T], t1: /* state */ js.Any) => enter(t0, t1).runNow()))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction2((t0: /* path */ typingsJapgolly.babelTraverse.mod.NodePath[T], t1: /* state */ js.Any) => exit(t0, t1).runNow()))
    __obj.asInstanceOf[VisitNodeObject[T]]
  }
}

