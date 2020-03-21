package typingsJapgolly.reactNotificationSystem.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.bc
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.bl
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.br
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.error
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.info
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.success
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.tc
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.tl
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.tr
import typingsJapgolly.reactNotificationSystem.reactNotificationSystemStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var action: js.UndefOr[ActionObject] = js.undefined
  var autoDismiss: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[error | warning | info | success] = js.undefined
  var message: js.UndefOr[String | Element] = js.undefined
  var onAdd: js.UndefOr[CallBackFunction] = js.undefined
  var onRemove: js.UndefOr[CallBackFunction] = js.undefined
  var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.undefined
  var title: js.UndefOr[String | Element] = js.undefined
  var uid: js.UndefOr[Double | String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    action: ActionObject = null,
    autoDismiss: Int | Double = null,
    children: VdomNode = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    level: error | warning | info | success = null,
    message: String | Element = null,
    onAdd: /* notification */ Notification => Callback = null,
    onRemove: /* notification */ Notification => Callback = null,
    position: tr | tl | tc | br | bl | bc = null,
    title: String | Element = null,
    uid: Double | String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.reactNotificationSystem.mod.Notification) => onAdd(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.reactNotificationSystem.mod.Notification) => onRemove(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

