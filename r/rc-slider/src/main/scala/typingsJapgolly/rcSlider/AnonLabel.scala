package typingsJapgolly.rcSlider

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String | Element
  var style: js.Any
}

object AnonLabel {
  @scala.inline
  def apply(label: String | Element, style: js.Any): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabel]
  }
}

