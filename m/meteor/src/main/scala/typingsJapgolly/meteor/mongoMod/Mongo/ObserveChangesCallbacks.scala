package typingsJapgolly.meteor.mongoMod.Mongo

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveChangesCallbacks[T] extends js.Object {
  var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.undefined
  var addedBefore: js.UndefOr[
    js.Function3[/* id */ String, /* fields */ Partial[T], /* before */ T | Null, Unit]
  ] = js.undefined
  var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.undefined
  var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ T | Null, Unit]] = js.undefined
  var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
}

object ObserveChangesCallbacks {
  @scala.inline
  def apply[T](
    added: (/* id */ String, /* fields */ Partial[T]) => Callback = null,
    addedBefore: (/* id */ String, /* fields */ Partial[T], /* before */ T | Null) => Callback = null,
    changed: (/* id */ String, /* fields */ Partial[T]) => Callback = null,
    movedBefore: (/* id */ String, /* before */ T | Null) => Callback = null,
    removed: /* id */ String => Callback = null
  ): ObserveChangesCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* fields */ typingsJapgolly.std.Partial[T]) => added(t0, t1).runNow()))
    if (addedBefore != null) __obj.updateDynamic("addedBefore")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* fields */ typingsJapgolly.std.Partial[T], t2: /* before */ T | scala.Null) => addedBefore(t0, t1, t2).runNow()))
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* fields */ typingsJapgolly.std.Partial[T]) => changed(t0, t1).runNow()))
    if (movedBefore != null) __obj.updateDynamic("movedBefore")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* before */ T | scala.Null) => movedBefore(t0, t1).runNow()))
    if (removed != null) __obj.updateDynamic("removed")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => removed(t0).runNow()))
    __obj.asInstanceOf[ObserveChangesCallbacks[T]]
  }
}

