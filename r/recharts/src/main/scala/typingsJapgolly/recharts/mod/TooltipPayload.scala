package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPayload extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  var name: String
  var payload: js.UndefOr[js.Any] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
  var value: String | Double | (js.Array[String | Double])
}

object TooltipPayload {
  @scala.inline
  def apply(
    name: String,
    value: String | Double | (js.Array[String | Double]),
    color: String = null,
    dataKey: DataKey = null,
    fill: String = null,
    formatter: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => CallbackTo[Node] = null,
    payload: js.Any = null,
    unit: String = null
  ): TooltipPayload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction4((t0: /* value */ java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]), t1: /* name */ java.lang.String, t2: /* entry */ typingsJapgolly.recharts.mod.TooltipPayload, t3: /* index */ scala.Double) => formatter(t0, t1, t2, t3).runNow()))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPayload]
  }
}

