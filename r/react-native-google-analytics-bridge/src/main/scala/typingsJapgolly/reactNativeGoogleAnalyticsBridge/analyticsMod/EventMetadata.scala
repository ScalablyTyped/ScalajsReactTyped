package typingsJapgolly.reactNativeGoogleAnalyticsBridge.analyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMetadata extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object EventMetadata {
  @scala.inline
  def apply(label: String = null, value: Int | Double = null): EventMetadata = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMetadata]
  }
}

