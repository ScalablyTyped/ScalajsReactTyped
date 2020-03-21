package typingsJapgolly.antDesignReactNative

import typingsJapgolly.reactNative.mod.RegisteredStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledStepTextColor extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var disabledStepTextColor: RegisteredStyle[TextStyle]
  var highlightStepBorderColor: RegisteredStyle[ViewStyle]
  var highlightStepTextColor: RegisteredStyle[TextStyle]
  var input: RegisteredStyle[TextStyle]
  var stepDisabled: RegisteredStyle[ViewStyle]
  var stepText: RegisteredStyle[TextStyle]
  var stepWrap: RegisteredStyle[ViewStyle]
}

object AnonDisabledStepTextColor {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    disabledStepTextColor: RegisteredStyle[TextStyle],
    highlightStepBorderColor: RegisteredStyle[ViewStyle],
    highlightStepTextColor: RegisteredStyle[TextStyle],
    input: RegisteredStyle[TextStyle],
    stepDisabled: RegisteredStyle[ViewStyle],
    stepText: RegisteredStyle[TextStyle],
    stepWrap: RegisteredStyle[ViewStyle]
  ): AnonDisabledStepTextColor = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], disabledStepTextColor = disabledStepTextColor.asInstanceOf[js.Any], highlightStepBorderColor = highlightStepBorderColor.asInstanceOf[js.Any], highlightStepTextColor = highlightStepTextColor.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], stepDisabled = stepDisabled.asInstanceOf[js.Any], stepText = stepText.asInstanceOf[js.Any], stepWrap = stepWrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledStepTextColor]
  }
}

