package typingsJapgolly.expo.linkingModuleWebMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expo.expoStrings.url
import typingsJapgolly.expo.linkingTypesMod.URLListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linking extends js.Object {
  @JSName("addEventListener")
  def addEventListener_url(`type`: url, listener: URLListener): Unit
  def canOpenURL(url: String): js.Promise[Boolean]
  def getInitialURL(): js.Promise[String]
  def openURL(url: String): js.Promise[Unit]
  @JSName("removeEventListener")
  def removeEventListener_url(`type`: url, listener: URLListener): Unit
}

object Linking {
  @scala.inline
  def apply(
    addEventListener: (url, URLListener) => Callback,
    canOpenURL: String => CallbackTo[js.Promise[Boolean]],
    getInitialURL: CallbackTo[js.Promise[String]],
    openURL: String => CallbackTo[js.Promise[Unit]],
    removeEventListener: (url, URLListener) => Callback
  ): Linking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.expo.expoStrings.url, t1: typingsJapgolly.expo.linkingTypesMod.URLListener) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("canOpenURL")(js.Any.fromFunction1((t0: java.lang.String) => canOpenURL(t0).runNow()))
    __obj.updateDynamic("getInitialURL")(getInitialURL.toJsFn)
    __obj.updateDynamic("openURL")(js.Any.fromFunction1((t0: java.lang.String) => openURL(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.expo.expoStrings.url, t1: typingsJapgolly.expo.linkingTypesMod.URLListener) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[Linking]
  }
}

