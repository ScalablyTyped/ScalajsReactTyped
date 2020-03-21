package typingsJapgolly.lightpick.mod.Options

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lightpick.PartialPluralizeFnLocale
import typingsJapgolly.lightpick.mod.Options.Locale.Buttons
import typingsJapgolly.lightpick.mod.Options.Locale.PluralizeFn
import typingsJapgolly.lightpick.mod.Options.Locale.PluralizeFnLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale_ extends js.Object {
  /**
    * Text for buttons.
    */
  var buttons: js.UndefOr[Buttons] = js.undefined
  var pluralize: js.UndefOr[PluralizeFn] = js.undefined
  /**
    * Text for tooltip.
    */
  var tooltip: js.UndefOr[PartialPluralizeFnLocale] = js.undefined
  /**
    * Show tooltip text on disabled dates. (Eg. «Already booked»)
    */
  var tooltipOnDisabled: js.UndefOr[String] = js.undefined
}

object Locale_ {
  @scala.inline
  def apply(
    buttons: Buttons = null,
    pluralize: (/* i */ String | Double, /* locale */ PluralizeFnLocale) => CallbackTo[String] = null,
    tooltip: PartialPluralizeFnLocale = null,
    tooltipOnDisabled: String = null
  ): Locale_ = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (pluralize != null) __obj.updateDynamic("pluralize")(js.Any.fromFunction2((t0: /* i */ java.lang.String | scala.Double, t1: /* locale */ typingsJapgolly.lightpick.mod.Options.Locale.PluralizeFnLocale) => pluralize(t0, t1).runNow()))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOnDisabled != null) __obj.updateDynamic("tooltipOnDisabled")(tooltipOnDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale_]
  }
}

