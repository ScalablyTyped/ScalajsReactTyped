package typingsJapgolly.peerDial.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delegate extends js.Object {
  def getApp(appName: String): App
  def launchApp(appName: String, launchData: String, callback: js.Function1[/* data */ String, Unit]): Unit
  def stopApp(appName: String, pid: String, callback: js.Function1[/* data */ Boolean, Unit]): Unit
}

object Delegate {
  @scala.inline
  def apply(
    getApp: String => CallbackTo[App],
    launchApp: (String, String, js.Function1[/* data */ String, Unit]) => Callback,
    stopApp: (String, String, js.Function1[/* data */ Boolean, Unit]) => Callback
  ): Delegate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getApp")(js.Any.fromFunction1((t0: java.lang.String) => getApp(t0).runNow()))
    __obj.updateDynamic("launchApp")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function1[/* data */ java.lang.String, scala.Unit]) => launchApp(t0, t1, t2).runNow()))
    __obj.updateDynamic("stopApp")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function1[/* data */ scala.Boolean, scala.Unit]) => stopApp(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Delegate]
  }
}

