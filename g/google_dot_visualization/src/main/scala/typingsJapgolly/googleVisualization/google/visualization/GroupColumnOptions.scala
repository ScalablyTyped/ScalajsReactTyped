package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupColumnOptions extends js.Object {
  var column: Double
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var `type`: String
  def aggregation(values: js.Array[_]): js.Any
}

object GroupColumnOptions {
  @scala.inline
  def apply(
    aggregation: js.Array[js.Any] => CallbackTo[js.Any],
    column: Double,
    `type`: String,
    id: String = null,
    label: String = null
  ): GroupColumnOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.updateDynamic("aggregation")(js.Any.fromFunction1((t0: js.Array[js.Any]) => aggregation(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupColumnOptions]
  }
}

