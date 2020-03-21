package typingsJapgolly.baseui.ratingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baseui.AnonValueNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmoticonRatingProps extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* args */ AnonValueNumber, _]] = js.undefined
  var overrides: js.UndefOr[RatingOverrides] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object EmoticonRatingProps {
  @scala.inline
  def apply(
    onChange: /* args */ AnonValueNumber => CallbackTo[js.Any] = null,
    overrides: RatingOverrides = null,
    value: Int | Double = null
  ): EmoticonRatingProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonValueNumber) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmoticonRatingProps]
  }
}

