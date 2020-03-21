package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomTabBarSplitLine extends js.Object {
  var bottomTabBarSplitLine: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var topTabBarSplitLine: RegisteredStyle[ViewStyle]
}

object AnonBottomTabBarSplitLine {
  @scala.inline
  def apply(
    bottomTabBarSplitLine: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    topTabBarSplitLine: RegisteredStyle[ViewStyle]
  ): AnonBottomTabBarSplitLine = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottomTabBarSplitLine]
  }
}

