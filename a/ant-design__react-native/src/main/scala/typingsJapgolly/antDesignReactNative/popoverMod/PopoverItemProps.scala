package typingsJapgolly.antDesignReactNative.popoverMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverItemProps
  extends /* key */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var value: js.Any
}

object PopoverItemProps {
  @scala.inline
  def apply(
    value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null
  ): PopoverItemProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverItemProps]
  }
}

