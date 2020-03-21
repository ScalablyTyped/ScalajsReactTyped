package typingsJapgolly.reactIntl.relativeMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formatjsIntlRelativetimeformat.mod.Unit
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactIntl.typesMod.CustomFormatConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.IntlRelativeTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.IntlRelativeTimeFormatOptions */ trait Props extends CustomFormatConfig {
  var children: js.UndefOr[js.Function1[/* value */ String, ReactChild]] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var updateIntervalInSeconds: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: /* value */ String => CallbackTo[ReactChild] = null,
    format: String = null,
    unit: Unit = null,
    updateIntervalInSeconds: Int | Double = null,
    value: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => children(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (updateIntervalInSeconds != null) __obj.updateDynamic("updateIntervalInSeconds")(updateIntervalInSeconds.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

