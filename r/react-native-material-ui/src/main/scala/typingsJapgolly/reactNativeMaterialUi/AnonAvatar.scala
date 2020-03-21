package typingsJapgolly.reactNativeMaterialUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvatar extends js.Object {
  var avatar: js.UndefOr[Element] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonAvatar {
  @scala.inline
  def apply(avatar: VdomElement = null, onPress: js.UndefOr[Callback] = js.undefined): AnonAvatar = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.rawElement.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    __obj.asInstanceOf[AnonAvatar]
  }
}

