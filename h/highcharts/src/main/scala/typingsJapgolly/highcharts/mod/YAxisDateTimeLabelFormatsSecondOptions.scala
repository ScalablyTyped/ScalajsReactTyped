package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisDateTimeLabelFormatsSecondOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
}

object YAxisDateTimeLabelFormatsSecondOptions {
  @scala.inline
  def apply(main: String = null, range: js.UndefOr[Boolean] = js.undefined): YAxisDateTimeLabelFormatsSecondOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisDateTimeLabelFormatsSecondOptions]
  }
}

