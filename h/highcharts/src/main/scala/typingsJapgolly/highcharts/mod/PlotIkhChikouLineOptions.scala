package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhChikouLineOptions extends js.Object {
  var styles: js.UndefOr[PlotIkhChikouLineStylesOptions] = js.undefined
}

object PlotIkhChikouLineOptions {
  @scala.inline
  def apply(styles: PlotIkhChikouLineStylesOptions = null): PlotIkhChikouLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhChikouLineOptions]
  }
}

