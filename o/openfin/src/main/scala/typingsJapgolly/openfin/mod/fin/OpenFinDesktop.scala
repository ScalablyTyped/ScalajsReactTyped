package typingsJapgolly.openfin.mod.fin

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinDesktop extends js.Object {
  var Application: OpenFinApplicationStatic
  var ExternalApp: OpenFinExternalApplicationStatic
  var ExternalWin: OpenFinExternalWindowStatic
  var Frame: OpenFinFrameStatic
  var GlobalHotkey: OpenFinGlobalHotkey
  var InterApplicationBus: OpenFinInterApplicationBus
  var Notification: OpenFinNotificationStatic
  var Platform: OpenFinPlatformStatic
  var System: OpenFinSystem
  var View: OpenFinViewStatic
  var Window: OpenFinWindowStatic
  def main(f: js.Function0[_]): Unit
}

object OpenFinDesktop {
  @scala.inline
  def apply(
    Application: OpenFinApplicationStatic,
    ExternalApp: OpenFinExternalApplicationStatic,
    ExternalWin: OpenFinExternalWindowStatic,
    Frame: OpenFinFrameStatic,
    GlobalHotkey: OpenFinGlobalHotkey,
    InterApplicationBus: OpenFinInterApplicationBus,
    Notification: OpenFinNotificationStatic,
    Platform: OpenFinPlatformStatic,
    System: OpenFinSystem,
    View: OpenFinViewStatic,
    Window: OpenFinWindowStatic,
    main: js.Function0[js.Any] => Callback
  ): OpenFinDesktop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ExternalApp = ExternalApp.asInstanceOf[js.Any], ExternalWin = ExternalWin.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], GlobalHotkey = GlobalHotkey.asInstanceOf[js.Any], InterApplicationBus = InterApplicationBus.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], System = System.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any])
    __obj.updateDynamic("main")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => main(t0).runNow()))
    __obj.asInstanceOf[OpenFinDesktop]
  }
}

