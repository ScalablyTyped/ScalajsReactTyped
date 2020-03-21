package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesLabelsLevelsOptions extends js.Object {
  /**
    * (Gantt) Specify the level which the options within this object applies
    * to.
    */
  var level: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSObject] = js.undefined
}

object ChartParallelAxesLabelsLevelsOptions {
  @scala.inline
  def apply(level: Int | Double = null, style: CSSObject = null): ChartParallelAxesLabelsLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesLabelsLevelsOptions]
  }
}

