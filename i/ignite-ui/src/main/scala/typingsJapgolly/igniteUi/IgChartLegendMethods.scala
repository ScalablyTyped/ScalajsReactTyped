package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgChartLegendMethods extends js.Object {
  def destroy(): Unit
  def getLegend(): Unit
  /**
  	 * Returns the ID of the parent div element bounding the ruler and the tooltip container
  	 */
  def id(): String
}

object IgChartLegendMethods {
  @scala.inline
  def apply(destroy: Callback, getLegend: Callback, id: CallbackTo[String]): IgChartLegendMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getLegend")(getLegend.toJsFn)
    __obj.updateDynamic("id")(id.toJsFn)
    __obj.asInstanceOf[IgChartLegendMethods]
  }
}

