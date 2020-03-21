package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelTextContainer extends js.Object {
  var cancelText: RegisteredStyle[TextStyle]
  var cancelTextContainer: RegisteredStyle[ViewStyle]
  var input: RegisteredStyle[TextStyle]
  var inputWrapper: RegisteredStyle[ViewStyle]
  var search: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object AnonCancelTextContainer {
  @scala.inline
  def apply(
    cancelText: RegisteredStyle[TextStyle],
    cancelTextContainer: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    search: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): AnonCancelTextContainer = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelTextContainer]
  }
}

