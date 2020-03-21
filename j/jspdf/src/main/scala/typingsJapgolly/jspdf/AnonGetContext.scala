package typingsJapgolly.jspdf

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetContext extends js.Object {
  var style: js.Any
  def getContext(): js.Any
}

object AnonGetContext {
  @scala.inline
  def apply(getContext: CallbackTo[js.Any], style: js.Any): AnonGetContext = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("getContext")(getContext.toJsFn)
    __obj.asInstanceOf[AnonGetContext]
  }
}

