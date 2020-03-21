package typingsJapgolly.reactNativeTabView.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitterProps extends js.Object {
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
}

object EventEmitterProps {
  @scala.inline
  def apply(addListener: (enter, Listener) => Callback, removeListener: (enter, Listener) => Callback): EventEmitterProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => removeListener(t0, t1).runNow()))
    __obj.asInstanceOf[EventEmitterProps]
  }
}

