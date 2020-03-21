package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionText extends js.Object {
  var actionText: RegisteredStyle[TextStyle]
  var dismissText: RegisteredStyle[TextStyle]
  var header: RegisteredStyle[ViewStyle]
  var headerItem: RegisteredStyle[ViewStyle]
  var modal: RegisteredStyle[ViewStyle]
  var okText: RegisteredStyle[TextStyle]
  var title: RegisteredStyle[TextStyle]
}

object AnonActionText {
  @scala.inline
  def apply(
    actionText: RegisteredStyle[TextStyle],
    dismissText: RegisteredStyle[TextStyle],
    header: RegisteredStyle[ViewStyle],
    headerItem: RegisteredStyle[ViewStyle],
    modal: RegisteredStyle[ViewStyle],
    okText: RegisteredStyle[TextStyle],
    title: RegisteredStyle[TextStyle]
  ): AnonActionText = {
    val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionText]
  }
}

