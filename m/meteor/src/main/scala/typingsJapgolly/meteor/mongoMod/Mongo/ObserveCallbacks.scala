package typingsJapgolly.meteor.mongoMod.Mongo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveCallbacks[T] extends js.Object {
  var added: js.UndefOr[js.Function1[/* document */ T, Unit]] = js.undefined
  var addedAt: js.UndefOr[
    js.Function3[/* document */ T, /* atIndex */ Double, /* before */ T | Null, Unit]
  ] = js.undefined
  var changed: js.UndefOr[js.Function2[/* newDocument */ T, /* oldDocument */ T, Unit]] = js.undefined
  var changedAt: js.UndefOr[
    js.Function3[/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double, Unit]
  ] = js.undefined
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ T, 
      /* fromIndex */ Double, 
      /* toIndex */ Double, 
      /* before */ T | Null, 
      Unit
    ]
  ] = js.undefined
  var removed: js.UndefOr[js.Function1[/* oldDocument */ T, Unit]] = js.undefined
  var removedAt: js.UndefOr[js.Function2[/* oldDocument */ T, /* atIndex */ Double, Unit]] = js.undefined
}

object ObserveCallbacks {
  @scala.inline
  def apply[T](
    added: /* document */ T => Callback = null,
    addedAt: (/* document */ T, /* atIndex */ Double, /* before */ T | Null) => Callback = null,
    changed: (/* newDocument */ T, /* oldDocument */ T) => Callback = null,
    changedAt: (/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double) => Callback = null,
    movedTo: (/* document */ T, /* fromIndex */ Double, /* toIndex */ Double, /* before */ T | Null) => Callback = null,
    removed: /* oldDocument */ T => Callback = null,
    removedAt: (/* oldDocument */ T, /* atIndex */ Double) => Callback = null
  ): ObserveCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(js.Any.fromFunction1((t0: /* document */ T) => added(t0).runNow()))
    if (addedAt != null) __obj.updateDynamic("addedAt")(js.Any.fromFunction3((t0: /* document */ T, t1: /* atIndex */ scala.Double, t2: /* before */ T | scala.Null) => addedAt(t0, t1, t2).runNow()))
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction2((t0: /* newDocument */ T, t1: /* oldDocument */ T) => changed(t0, t1).runNow()))
    if (changedAt != null) __obj.updateDynamic("changedAt")(js.Any.fromFunction3((t0: /* newDocument */ T, t1: /* oldDocument */ T, t2: /* indexAt */ scala.Double) => changedAt(t0, t1, t2).runNow()))
    if (movedTo != null) __obj.updateDynamic("movedTo")(js.Any.fromFunction4((t0: /* document */ T, t1: /* fromIndex */ scala.Double, t2: /* toIndex */ scala.Double, t3: /* before */ T | scala.Null) => movedTo(t0, t1, t2, t3).runNow()))
    if (removed != null) __obj.updateDynamic("removed")(js.Any.fromFunction1((t0: /* oldDocument */ T) => removed(t0).runNow()))
    if (removedAt != null) __obj.updateDynamic("removedAt")(js.Any.fromFunction2((t0: /* oldDocument */ T, t1: /* atIndex */ scala.Double) => removedAt(t0, t1).runNow()))
    __obj.asInstanceOf[ObserveCallbacks[T]]
  }
}

