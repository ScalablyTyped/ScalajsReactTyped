package typingsJapgolly.antd.esNotificationMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProps extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var placement: js.UndefOr[NotificationPlacement] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ConfigProps {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    duration: Int | Double = null,
    getContainer: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    placement: NotificationPlacement = null,
    top: Int | Double = null
  ): ConfigProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    getContainer.foreach(p => __obj.updateDynamic("getContainer")(p.toJsFn))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigProps]
  }
}

