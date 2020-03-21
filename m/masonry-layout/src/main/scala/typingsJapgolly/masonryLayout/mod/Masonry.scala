package typingsJapgolly.masonryLayout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Masonry extends js.Object {
  var addItems: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  // add and remove items
  var appended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  var data: js.UndefOr[js.Function1[/* element */ Element, this.type]] = js.undefined
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getItemElements: js.UndefOr[js.Function0[js.Array[_]]] = js.undefined
  // layout
  var layout: js.UndefOr[js.Function0[Unit]] = js.undefined
  var layoutItems: js.UndefOr[js.Function2[/* items */ js.Array[_], /* isStill */ js.UndefOr[Boolean], Unit]] = js.undefined
  var masonry: js.UndefOr[
    js.Function0[Unit] with (js.Function2[/* eventName */ String, /* listener */ js.Any, Unit])
  ] = js.undefined
  var off: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
  // events
  var on: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
  var once: js.UndefOr[js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]] = js.undefined
  var prepended: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  // utilities
  var reloadItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  var stamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
  var unstamp: js.UndefOr[js.Function1[/* elements */ js.Array[_], Unit]] = js.undefined
}

object Masonry {
  @scala.inline
  def apply(
    addItems: /* elements */ js.Array[js.Any] => Callback = null,
    appended: /* elements */ js.Array[js.Any] => Callback = null,
    data: /* element */ Element => CallbackTo[Masonry] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    getItemElements: js.UndefOr[CallbackTo[js.Array[js.Any]]] = js.undefined,
    layout: js.UndefOr[Callback] = js.undefined,
    layoutItems: (/* items */ js.Array[js.Any], /* isStill */ js.UndefOr[Boolean]) => Callback = null,
    masonry: js.Function0[Unit] with (js.Function2[/* eventName */ String, /* listener */ js.Any, Unit]) = null,
    off: (/* eventName */ String, /* listener */ js.Any) => Callback = null,
    on: (/* eventName */ String, /* listener */ js.Any) => Callback = null,
    once: (/* eventName */ String, /* listener */ js.Any) => Callback = null,
    prepended: /* elements */ js.Array[js.Any] => Callback = null,
    reloadItems: js.UndefOr[Callback] = js.undefined,
    remove: /* elements */ js.Array[js.Any] => Callback = null,
    stamp: /* elements */ js.Array[js.Any] => Callback = null,
    unstamp: /* elements */ js.Array[js.Any] => Callback = null
  ): Masonry = {
    val __obj = js.Dynamic.literal()
    if (addItems != null) __obj.updateDynamic("addItems")(js.Any.fromFunction1((t0: /* elements */ js.Array[js.Any]) => addItems(t0).runNow()))
    if (appended != null) __obj.updateDynamic("appended")(js.Any.fromFunction1((t0: /* elements */ js.Array[js.Any]) => appended(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => data(t0).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    getItemElements.foreach(p => __obj.updateDynamic("getItemElements")(p.toJsFn))
    layout.foreach(p => __obj.updateDynamic("layout")(p.toJsFn))
    if (layoutItems != null) __obj.updateDynamic("layoutItems")(js.Any.fromFunction2((t0: /* items */ js.Array[js.Any], t1: /* isStill */ js.UndefOr[scala.Boolean]) => layoutItems(t0, t1).runNow()))
    if (masonry != null) __obj.updateDynamic("masonry")(masonry.asInstanceOf[js.Any])
    if (off != null) __obj.updateDynamic("off")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* listener */ js.Any) => off(t0, t1).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* listener */ js.Any) => on(t0, t1).runNow()))
    if (once != null) __obj.updateDynamic("once")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* listener */ js.Any) => once(t0, t1).runNow()))
    if (prepended != null) __obj.updateDynamic("prepended")(js.Any.fromFunction1((t0: /* elements */ js.Array[js.Any]) => prepended(t0).runNow()))
    reloadItems.foreach(p => __obj.updateDynamic("reloadItems")(p.toJsFn))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* elements */ js.Array[js.Any]) => remove(t0).runNow()))
    if (stamp != null) __obj.updateDynamic("stamp")(js.Any.fromFunction1((t0: /* elements */ js.Array[js.Any]) => stamp(t0).runNow()))
    if (unstamp != null) __obj.updateDynamic("unstamp")(js.Any.fromFunction1((t0: /* elements */ js.Array[js.Any]) => unstamp(t0).runNow()))
    __obj.asInstanceOf[Masonry]
  }
}

