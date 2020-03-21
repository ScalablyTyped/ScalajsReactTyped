package typingsJapgolly.storybookReactNative.visibilityButtonMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def onPress(): Unit
}

object Props {
  @scala.inline
  def apply(onPress: Callback): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    __obj.asInstanceOf[Props]
  }
}

