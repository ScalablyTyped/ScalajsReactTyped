package typingsJapgolly.materialIconButton

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/icon-button.@material/icon-button/adapter.MDCIconButtonToggleAdapter> */
trait PartialMDCIconButtonToggl extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCIconButtonToggleEventDetail, Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* attrValue */ String, Unit]] = js.undefined
}

object PartialMDCIconButtonToggl {
  @scala.inline
  def apply(
    addClass: /* className */ String => Callback = null,
    hasClass: /* className */ String => CallbackTo[Boolean] = null,
    notifyChange: /* evtData */ MDCIconButtonToggleEventDetail => Callback = null,
    removeClass: /* className */ String => Callback = null,
    setAttr: (/* attrName */ String, /* attrValue */ String) => Callback = null
  ): PartialMDCIconButtonToggl = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => addClass(t0).runNow()))
    if (hasClass != null) __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => hasClass(t0).runNow()))
    if (notifyChange != null) __obj.updateDynamic("notifyChange")(js.Any.fromFunction1((t0: /* evtData */ typingsJapgolly.materialIconButton.typesMod.MDCIconButtonToggleEventDetail) => notifyChange(t0).runNow()))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => removeClass(t0).runNow()))
    if (setAttr != null) __obj.updateDynamic("setAttr")(js.Any.fromFunction2((t0: /* attrName */ java.lang.String, t1: /* attrValue */ java.lang.String) => setAttr(t0, t1).runNow()))
    __obj.asInstanceOf[PartialMDCIconButtonToggl]
  }
}

