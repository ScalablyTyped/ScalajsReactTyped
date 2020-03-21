package typingsJapgolly.highcharts.accessibilityMod.highchartsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.highcharts.mod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Apply context to a format string from lang options of the chart.
    *
    * @param langKey
    *        Key (using dot notation) into lang option structure.
    *
    * @param context
    *        Context to apply to the format string.
    *
    * @return The formatted string.
    */
  def langFormat(langKey: String, context: Dictionary[_]): String
}

object Chart {
  @scala.inline
  def apply(langFormat: (String, Dictionary[js.Any]) => CallbackTo[String]): Chart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("langFormat")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.highcharts.mod.Dictionary[js.Any]) => langFormat(t0, t1).runNow()))
    __obj.asInstanceOf[Chart]
  }
}

