package typingsJapgolly.brainhubeuReactCarousel.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotsProps extends js.Object {
  var number: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var thumbnails: js.UndefOr[js.Array[Element]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object DotsProps {
  @scala.inline
  def apply(
    number: Int | Double = null,
    onChange: /* value */ Double => Callback = null,
    thumbnails: js.Array[Element] = null,
    value: Int | Double = null
  ): DotsProps = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotsProps]
  }
}

