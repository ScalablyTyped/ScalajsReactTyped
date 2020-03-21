package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInput extends js.Object {
  var input: RegisteredStyle[TextStyle]
  var inputFirst: RegisteredStyle[ViewStyle]
  var inputGroup: RegisteredStyle[ViewStyle]
  var inputLast: RegisteredStyle[ViewStyle]
  var inputWrapper: RegisteredStyle[ViewStyle]
  var message: RegisteredStyle[TextStyle]
}

object AnonInput {
  @scala.inline
  def apply(
    input: RegisteredStyle[TextStyle],
    inputFirst: RegisteredStyle[ViewStyle],
    inputGroup: RegisteredStyle[ViewStyle],
    inputLast: RegisteredStyle[ViewStyle],
    inputWrapper: RegisteredStyle[ViewStyle],
    message: RegisteredStyle[TextStyle]
  ): AnonInput = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInput]
  }
}

