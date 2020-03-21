package typingsJapgolly.ddTrace

import typingsJapgolly.ddTrace.ddTraceStrings.`agent-exporter`
import typingsJapgolly.ddTrace.ddTraceStrings.`log-exporter`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonB3 extends js.Object {
  var b3: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to write traces to log output, rather than send to an agent
    * @default false
    */
  var exporter: js.UndefOr[`log-exporter` | `agent-exporter`] = js.undefined
  var thenables: js.UndefOr[Boolean] = js.undefined
}

object AnonB3 {
  @scala.inline
  def apply(
    b3: js.UndefOr[Boolean] = js.undefined,
    exporter: `log-exporter` | `agent-exporter` = null,
    thenables: js.UndefOr[Boolean] = js.undefined
  ): AnonB3 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(b3)) __obj.updateDynamic("b3")(b3.asInstanceOf[js.Any])
    if (exporter != null) __obj.updateDynamic("exporter")(exporter.asInstanceOf[js.Any])
    if (!js.isUndefined(thenables)) __obj.updateDynamic("thenables")(thenables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonB3]
  }
}

