package typingsJapgolly.blueprintjsCore.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextState extends js.Object {
  var isContentOverflowing: Boolean
  var textContent: String
}

object ITextState {
  @scala.inline
  def apply(isContentOverflowing: Boolean, textContent: String): ITextState = {
    val __obj = js.Dynamic.literal(isContentOverflowing = isContentOverflowing.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITextState]
  }
}

