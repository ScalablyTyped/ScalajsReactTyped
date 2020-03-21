package typingsJapgolly.rcNotification

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.rcNotification.notificationMod.HolderReadyCallback
import typingsJapgolly.rcNotification.notificationMod.NoticeContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHolderCallback extends js.Object {
  var holderCallback: js.UndefOr[HolderReadyCallback] = js.undefined
  var notice: NoticeContent
}

object AnonHolderCallback {
  @scala.inline
  def apply(
    notice: NoticeContent,
    holderCallback: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Callback = null
  ): AnonHolderCallback = {
    val __obj = js.Dynamic.literal(notice = notice.asInstanceOf[js.Any])
    if (holderCallback != null) __obj.updateDynamic("holderCallback")(js.Any.fromFunction2((t0: /* div */ org.scalajs.dom.raw.HTMLDivElement, t1: /* noticeProps */ typingsJapgolly.rcNotification.NoticePropskeyKey) => holderCallback(t0, t1).runNow()))
    __obj.asInstanceOf[AnonHolderCallback]
  }
}

