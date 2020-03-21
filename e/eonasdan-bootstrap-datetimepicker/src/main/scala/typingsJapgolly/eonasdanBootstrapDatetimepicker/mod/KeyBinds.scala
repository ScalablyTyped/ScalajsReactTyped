package typingsJapgolly.eonasdanBootstrapDatetimepicker.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinds extends js.Object {
  var `control down`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var `control space`: js.UndefOr[js.Function1[/* widget */ JQuery, _]] = js.undefined
  var `control up`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var delete: js.UndefOr[js.Function0[_]] = js.undefined
  var down: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var enter: js.UndefOr[js.Function0[_]] = js.undefined
  var escape: js.UndefOr[js.Function0[_]] = js.undefined
  var left: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var pageDown: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var pageUp: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var right: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var t: js.UndefOr[js.Function0[_]] = js.undefined
  var up: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
}

object KeyBinds {
  @scala.inline
  def apply(
    `control down`: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    `control space`: /* widget */ JQuery => CallbackTo[js.Any] = null,
    `control up`: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    delete: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    down: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    enter: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    escape: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    left: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    pageDown: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    pageUp: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    right: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null,
    t: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    up: /* widget */ JQuery | Boolean => CallbackTo[js.Any] = null
  ): KeyBinds = {
    val __obj = js.Dynamic.literal()
    if (`control down` != null) __obj.updateDynamic("control down")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => `control down`(t0).runNow()))
    if (`control space` != null) __obj.updateDynamic("control space")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery) => `control space`(t0).runNow()))
    if (`control up` != null) __obj.updateDynamic("control up")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => `control up`(t0).runNow()))
    delete.foreach(p => __obj.updateDynamic("delete")(p.toJsFn))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => down(t0).runNow()))
    enter.foreach(p => __obj.updateDynamic("enter")(p.toJsFn))
    escape.foreach(p => __obj.updateDynamic("escape")(p.toJsFn))
    if (left != null) __obj.updateDynamic("left")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => left(t0).runNow()))
    if (pageDown != null) __obj.updateDynamic("pageDown")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => pageDown(t0).runNow()))
    if (pageUp != null) __obj.updateDynamic("pageUp")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => pageUp(t0).runNow()))
    if (right != null) __obj.updateDynamic("right")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => right(t0).runNow()))
    t.foreach(p => __obj.updateDynamic("t")(p.toJsFn))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1((t0: /* widget */ typingsJapgolly.eonasdanBootstrapDatetimepicker.mod._Global_.JQuery | scala.Boolean) => up(t0).runNow()))
    __obj.asInstanceOf[KeyBinds]
  }
}

