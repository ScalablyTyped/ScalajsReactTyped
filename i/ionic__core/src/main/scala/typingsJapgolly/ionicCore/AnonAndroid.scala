package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroid extends js.Object {
  def android(win: Window_): Boolean
  def capacitor(win: js.Any): Boolean
  def cordova(win: js.Any): Boolean
  def desktop(win: Window_): Boolean
  def electron(win: Window_): Boolean
  def hybrid(win: Window_): Boolean
  def ios(win: Window_): Boolean
  def ipad(win: Window_): Boolean
  def iphone(win: Window_): Boolean
  def mobile(win: Window_): Boolean
  def mobileweb(win: Window_): Boolean
  def phablet(win: Window_): Boolean
  def pwa(win: Window_): Boolean
  def tablet(win: Window_): Boolean
}

object AnonAndroid {
  @scala.inline
  def apply(
    android: Window_ => CallbackTo[Boolean],
    capacitor: js.Any => CallbackTo[Boolean],
    cordova: js.Any => CallbackTo[Boolean],
    desktop: Window_ => CallbackTo[Boolean],
    electron: Window_ => CallbackTo[Boolean],
    hybrid: Window_ => CallbackTo[Boolean],
    ios: Window_ => CallbackTo[Boolean],
    ipad: Window_ => CallbackTo[Boolean],
    iphone: Window_ => CallbackTo[Boolean],
    mobile: Window_ => CallbackTo[Boolean],
    mobileweb: Window_ => CallbackTo[Boolean],
    phablet: Window_ => CallbackTo[Boolean],
    pwa: Window_ => CallbackTo[Boolean],
    tablet: Window_ => CallbackTo[Boolean]
  ): AnonAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("android")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => android(t0).runNow()))
    __obj.updateDynamic("capacitor")(js.Any.fromFunction1((t0: js.Any) => capacitor(t0).runNow()))
    __obj.updateDynamic("cordova")(js.Any.fromFunction1((t0: js.Any) => cordova(t0).runNow()))
    __obj.updateDynamic("desktop")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => desktop(t0).runNow()))
    __obj.updateDynamic("electron")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => electron(t0).runNow()))
    __obj.updateDynamic("hybrid")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => hybrid(t0).runNow()))
    __obj.updateDynamic("ios")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => ios(t0).runNow()))
    __obj.updateDynamic("ipad")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => ipad(t0).runNow()))
    __obj.updateDynamic("iphone")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => iphone(t0).runNow()))
    __obj.updateDynamic("mobile")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => mobile(t0).runNow()))
    __obj.updateDynamic("mobileweb")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => mobileweb(t0).runNow()))
    __obj.updateDynamic("phablet")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => phablet(t0).runNow()))
    __obj.updateDynamic("pwa")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => pwa(t0).runNow()))
    __obj.updateDynamic("tablet")(js.Any.fromFunction1((t0: typingsJapgolly.std.Window_) => tablet(t0).runNow()))
    __obj.asInstanceOf[AnonAndroid]
  }
}

