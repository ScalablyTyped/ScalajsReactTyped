package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadge extends js.Object {
  var badge: RegisteredStyle[ViewStyle]
  var badgeText: RegisteredStyle[TextStyle]
  var barIcon: RegisteredStyle[ImageStyle]
  var barItem: RegisteredStyle[ViewStyle]
  var barItemSelected: RegisteredStyle[ViewStyle]
  var barItemTitle: RegisteredStyle[TextStyle]
  var content: RegisteredStyle[ViewStyle]
  var contentItem: RegisteredStyle[ViewStyle]
  var contentItemSelected: RegisteredStyle[ViewStyle]
  var tabbar: RegisteredStyle[ViewStyle]
  var tabs: RegisteredStyle[ViewStyle]
}

object AnonBadge {
  @scala.inline
  def apply(
    badge: RegisteredStyle[ViewStyle],
    badgeText: RegisteredStyle[TextStyle],
    barIcon: RegisteredStyle[ImageStyle],
    barItem: RegisteredStyle[ViewStyle],
    barItemSelected: RegisteredStyle[ViewStyle],
    barItemTitle: RegisteredStyle[TextStyle],
    content: RegisteredStyle[ViewStyle],
    contentItem: RegisteredStyle[ViewStyle],
    contentItemSelected: RegisteredStyle[ViewStyle],
    tabbar: RegisteredStyle[ViewStyle],
    tabs: RegisteredStyle[ViewStyle]
  ): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], badgeText = badgeText.asInstanceOf[js.Any], barIcon = barIcon.asInstanceOf[js.Any], barItem = barItem.asInstanceOf[js.Any], barItemSelected = barItemSelected.asInstanceOf[js.Any], barItemTitle = barItemTitle.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentItem = contentItem.asInstanceOf[js.Any], contentItemSelected = contentItemSelected.asInstanceOf[js.Any], tabbar = tabbar.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBadge]
  }
}

