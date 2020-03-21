package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeriesList extends js.Object {
  var chart: IChart
  var items: js.Array[ISeries]
  def anyUsesAxes(): Boolean
  def clicked(position: IPoint): Boolean
  //each(f: function): void;
  def firstVisible(): ISeries
}

object ISeriesList {
  @scala.inline
  def apply(
    anyUsesAxes: CallbackTo[Boolean],
    chart: IChart,
    clicked: IPoint => CallbackTo[Boolean],
    firstVisible: CallbackTo[ISeries],
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("anyUsesAxes")(anyUsesAxes.toJsFn)
    __obj.updateDynamic("clicked")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => clicked(t0).runNow()))
    __obj.updateDynamic("firstVisible")(firstVisible.toJsFn)
    __obj.asInstanceOf[ISeriesList]
  }
}

