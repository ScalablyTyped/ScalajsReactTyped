package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcBottomLineOptions extends js.Object {
  var styles: js.UndefOr[PlotPcBottomLineStylesOptions] = js.undefined
}

object PlotPcBottomLineOptions {
  @scala.inline
  def apply(styles: PlotPcBottomLineStylesOptions = null): PlotPcBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPcBottomLineOptions]
  }
}

