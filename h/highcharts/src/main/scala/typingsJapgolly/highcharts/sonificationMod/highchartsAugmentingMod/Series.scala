package typingsJapgolly.highcharts.sonificationMod.highchartsAugmentingMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Series extends js.Object {
  /**
    * Sonify a series.
    *
    * @param options
    *        The options for sonifying this series.
    */
  def sonify(options: SonifySeriesOptionsObject): Unit
}

object Series {
  @scala.inline
  def apply(sonify: SonifySeriesOptionsObject => Callback): Series = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sonify")(js.Any.fromFunction1((t0: typingsJapgolly.highcharts.sonificationMod.highchartsAugmentingMod.SonifySeriesOptionsObject) => sonify(t0).runNow()))
    __obj.asInstanceOf[Series]
  }
}

