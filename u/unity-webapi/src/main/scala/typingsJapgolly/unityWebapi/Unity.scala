package typingsJapgolly.unityWebapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unity extends js.Object {
  var Launcher: UnityLauncher
  var MediaPlayer: UnityMediaPlayer
  var MessagingIndicator: UnityMessagingIndicator
  var Notification: UnityNotification
  def addAction(name: String, callback: js.Function): js.Any
  def init(settings: UnitySettings): js.Any
  def removeAction(actionName: String): js.Any
  def removeActions(): js.Any
}

object Unity {
  @scala.inline
  def apply(
    Launcher: UnityLauncher,
    MediaPlayer: UnityMediaPlayer,
    MessagingIndicator: UnityMessagingIndicator,
    Notification: UnityNotification,
    addAction: (String, js.Function) => CallbackTo[js.Any],
    init: UnitySettings => CallbackTo[js.Any],
    removeAction: String => CallbackTo[js.Any],
    removeActions: CallbackTo[js.Any]
  ): Unity = {
    val __obj = js.Dynamic.literal(Launcher = Launcher.asInstanceOf[js.Any], MediaPlayer = MediaPlayer.asInstanceOf[js.Any], MessagingIndicator = MessagingIndicator.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.updateDynamic("addAction")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => addAction(t0, t1).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.unityWebapi.UnitySettings) => init(t0).runNow()))
    __obj.updateDynamic("removeAction")(js.Any.fromFunction1((t0: java.lang.String) => removeAction(t0).runNow()))
    __obj.updateDynamic("removeActions")(removeActions.toJsFn)
    __obj.asInstanceOf[Unity]
  }
}

