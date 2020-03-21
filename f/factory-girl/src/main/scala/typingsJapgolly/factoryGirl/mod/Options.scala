package typingsJapgolly.factoryGirl.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var afterBuild: js.UndefOr[Hook[T]] = js.undefined
  var afterCreate: js.UndefOr[Hook[T]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    afterBuild: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Callback = null,
    afterCreate: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Callback = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (afterBuild != null) __obj.updateDynamic("afterBuild")(js.Any.fromFunction3((t0: /* model */ js.Any, t1: /* attrs */ js.Array[T], t2: /* options */ js.Any) => afterBuild(t0, t1, t2).runNow()))
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction3((t0: /* model */ js.Any, t1: /* attrs */ js.Array[T], t2: /* options */ js.Any) => afterCreate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options[T]]
  }
}

