package typingsJapgolly.plottable

import typingsJapgolly.plottable.plottableStrings.animationFrame
import typingsJapgolly.plottable.plottableStrings.immediate
import typingsJapgolly.plottable.plottableStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationFrame extends js.Object {
  var animationFrame: typingsJapgolly.plottable.plottableStrings.animationFrame
  var immediate: typingsJapgolly.plottable.plottableStrings.immediate
  var timeout: typingsJapgolly.plottable.plottableStrings.timeout
}

object AnonAnimationFrame {
  @scala.inline
  def apply(animationFrame: animationFrame, immediate: immediate, timeout: timeout): AnonAnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = animationFrame.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationFrame]
  }
}

