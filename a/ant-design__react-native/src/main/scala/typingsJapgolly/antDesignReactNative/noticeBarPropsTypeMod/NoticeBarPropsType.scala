package typingsJapgolly.antDesignReactNative.noticeBarPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeBarPropsType extends js.Object {
  var action: js.UndefOr[Element] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var mode: js.UndefOr[closable | link] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NoticeBarPropsType {
  @scala.inline
  def apply(
    action: VdomElement = null,
    icon: VdomElement = null,
    mode: closable | link = null,
    onPress: js.UndefOr[Callback] = js.undefined
  ): NoticeBarPropsType = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.rawElement.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    __obj.asInstanceOf[NoticeBarPropsType]
  }
}

