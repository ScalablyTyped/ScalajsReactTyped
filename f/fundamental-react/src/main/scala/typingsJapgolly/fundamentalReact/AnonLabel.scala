package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var noNotificationsBody: js.UndefOr[Node] = js.undefined
  var notificationCount: Double
  var notificationsBody: js.UndefOr[Node] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(
    notificationCount: Double,
    callback: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    label: String = null,
    noNotificationsBody: VdomNode = null,
    notificationsBody: VdomNode = null
  ): AnonLabel = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => callback(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (noNotificationsBody != null) __obj.updateDynamic("noNotificationsBody")(noNotificationsBody.rawNode.asInstanceOf[js.Any])
    if (notificationsBody != null) __obj.updateDynamic("notificationsBody")(notificationsBody.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

