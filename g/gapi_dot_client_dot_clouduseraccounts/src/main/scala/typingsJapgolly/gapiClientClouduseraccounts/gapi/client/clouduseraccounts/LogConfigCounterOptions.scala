package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfigCounterOptions extends js.Object {
  /** The field value to attribute. */
  var field: js.UndefOr[String] = js.undefined
  /** The metric to update. */
  var metric: js.UndefOr[String] = js.undefined
}

object LogConfigCounterOptions {
  @scala.inline
  def apply(field: String = null, metric: String = null): LogConfigCounterOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfigCounterOptions]
  }
}

