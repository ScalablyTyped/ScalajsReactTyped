package typingsJapgolly.electronNotify.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotification extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var onClickFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.undefined
  var onCloseFunc: js.UndefOr[js.Function1[/* event */ ICloseNotificationEvent, Unit]] = js.undefined
  var onShowFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: String
  var url: js.UndefOr[String] = js.undefined
}

object INotification {
  @scala.inline
  def apply(
    title: String,
    image: String = null,
    onClickFunc: /* event */ INotificationEvent => Callback = null,
    onCloseFunc: /* event */ ICloseNotificationEvent => Callback = null,
    onShowFunc: /* event */ INotificationEvent => Callback = null,
    sound: String = null,
    text: String = null,
    url: String = null
  ): INotification = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClickFunc != null) __obj.updateDynamic("onClickFunc")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.electronNotify.mod.INotificationEvent) => onClickFunc(t0).runNow()))
    if (onCloseFunc != null) __obj.updateDynamic("onCloseFunc")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.electronNotify.mod.ICloseNotificationEvent) => onCloseFunc(t0).runNow()))
    if (onShowFunc != null) __obj.updateDynamic("onShowFunc")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.electronNotify.mod.INotificationEvent) => onShowFunc(t0).runNow()))
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotification]
  }
}

