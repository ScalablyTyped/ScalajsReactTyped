package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartMouseMoveEventArgs extends js.Object {
  /** Set this option to true to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** location - X and Y co-ordinate of the points with respect to chart area.id - ID of the target element.    size - Width and height of the chart.    pageX - x-coordinate of the
    * pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the chart model object
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChartMouseMoveEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): ChartMouseMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMouseMoveEventArgs]
  }
}

