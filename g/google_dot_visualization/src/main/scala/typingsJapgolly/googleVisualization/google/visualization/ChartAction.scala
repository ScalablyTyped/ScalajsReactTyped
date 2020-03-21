package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAction extends js.Object {
  var id: String | Double
  var text: String
  def action(): Unit
}

object ChartAction {
  @scala.inline
  def apply(action: Callback, id: String | Double, text: String): ChartAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("action")(action.toJsFn)
    __obj.asInstanceOf[ChartAction]
  }
}

