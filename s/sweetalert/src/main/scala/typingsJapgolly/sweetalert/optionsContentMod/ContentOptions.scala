package typingsJapgolly.sweetalert.optionsContentMod

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var element: String | Node
}

object ContentOptions {
  @scala.inline
  def apply(element: String | Node, attributes: js.Object = null): ContentOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOptions]
  }
}

