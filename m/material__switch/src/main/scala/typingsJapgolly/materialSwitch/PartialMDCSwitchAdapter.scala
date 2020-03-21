package typingsJapgolly.materialSwitch

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/switch.@material/switch/adapter.MDCSwitchAdapter> */
trait PartialMDCSwitchAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.undefined
}

object PartialMDCSwitchAdapter {
  @scala.inline
  def apply(
    addClass: /* className */ String => Callback = null,
    removeClass: /* className */ String => Callback = null,
    setNativeControlChecked: /* checked */ Boolean => Callback = null,
    setNativeControlDisabled: /* disabled */ Boolean => Callback = null
  ): PartialMDCSwitchAdapter = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => addClass(t0).runNow()))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => removeClass(t0).runNow()))
    if (setNativeControlChecked != null) __obj.updateDynamic("setNativeControlChecked")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => setNativeControlChecked(t0).runNow()))
    if (setNativeControlDisabled != null) __obj.updateDynamic("setNativeControlDisabled")(js.Any.fromFunction1((t0: /* disabled */ scala.Boolean) => setNativeControlDisabled(t0).runNow()))
    __obj.asInstanceOf[PartialMDCSwitchAdapter]
  }
}

