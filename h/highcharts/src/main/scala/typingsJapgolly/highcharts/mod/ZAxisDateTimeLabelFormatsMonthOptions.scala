package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisDateTimeLabelFormatsMonthOptions extends js.Object {
  var main: js.UndefOr[String] = js.undefined
}

object ZAxisDateTimeLabelFormatsMonthOptions {
  @scala.inline
  def apply(main: String = null): ZAxisDateTimeLabelFormatsMonthOptions = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAxisDateTimeLabelFormatsMonthOptions]
  }
}

