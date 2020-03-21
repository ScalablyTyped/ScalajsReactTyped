package typingsJapgolly.reactJsonschemaForm

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: Element
  var disabled: Boolean
  var name: String
  var readonly: Boolean
}

object AnonContent {
  @scala.inline
  def apply(content: VdomElement, disabled: Boolean, name: String, readonly: Boolean): AnonContent = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

