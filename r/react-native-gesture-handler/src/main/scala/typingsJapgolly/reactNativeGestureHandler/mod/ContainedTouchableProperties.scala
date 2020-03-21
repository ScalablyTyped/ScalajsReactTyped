package typingsJapgolly.reactNativeGestureHandler.mod

import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainedTouchableProperties extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ContainedTouchableProperties {
  @scala.inline
  def apply(containerStyle: StyleProp[ViewStyle] = null): ContainedTouchableProperties = {
    val __obj = js.Dynamic.literal()
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainedTouchableProperties]
  }
}

