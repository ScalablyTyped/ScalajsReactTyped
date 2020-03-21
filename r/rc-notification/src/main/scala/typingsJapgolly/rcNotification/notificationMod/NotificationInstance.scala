package typingsJapgolly.rcNotification.notificationMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationInstance extends js.Object {
  var component: Notification
  var notice: NoticeFunc
  def destroy(): Unit
  def removeNotice(key: Key): Unit
  def useNotification(): js.Tuple2[NoticeFunc, Element]
}

object NotificationInstance {
  @scala.inline
  def apply(
    component: Notification,
    destroy: Callback,
    notice: /* noticeProps */ NoticeContent => Callback,
    removeNotice: Key => Callback,
    useNotification: CallbackTo[js.Tuple2[NoticeFunc, Element]]
  ): NotificationInstance = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("notice")(js.Any.fromFunction1((t0: /* noticeProps */ typingsJapgolly.rcNotification.notificationMod.NoticeContent) => notice(t0).runNow()))
    __obj.updateDynamic("removeNotice")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.Key) => removeNotice(t0).runNow()))
    __obj.updateDynamic("useNotification")(useNotification.toJsFn)
    __obj.asInstanceOf[NotificationInstance]
  }
}

