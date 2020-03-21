package typingsJapgolly.winjs

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyCode extends js.Object {
  var keyCode: Double
  var nextFocusElement: HTMLElement
  var previousFocusElement: HTMLElement
}

object AnonKeyCode {
  @scala.inline
  def apply(keyCode: Double, nextFocusElement: HTMLElement, previousFocusElement: HTMLElement): AnonKeyCode = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], nextFocusElement = nextFocusElement.asInstanceOf[js.Any], previousFocusElement = previousFocusElement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyCode]
  }
}

