package typingsJapgolly.ionicCore.toastInterfaceMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.ionicCoreStrings.cancel
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastButton extends js.Object {
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var handler: js.UndefOr[js.Function0[Boolean | Unit | js.Promise[Boolean]]] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[cancel | String] = js.undefined
  var side: js.UndefOr[start | end] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object ToastButton {
  @scala.inline
  def apply(
    cssClass: String | js.Array[String] = null,
    handler: js.UndefOr[CallbackTo[Boolean | Unit | js.Promise[Boolean]]] = js.undefined,
    icon: String = null,
    role: cancel | String = null,
    side: start | end = null,
    text: String = null
  ): ToastButton = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    handler.foreach(p => __obj.updateDynamic("handler")(p.toJsFn))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastButton]
  }
}

