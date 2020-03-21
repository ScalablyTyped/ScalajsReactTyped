package typingsJapgolly.zchatBrowser.mod.ChatEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panel extends js.Object {
  var action: Action
  var heading: String
  var image_url: String
  var paragraph: js.UndefOr[String] = js.undefined
}

object Panel {
  @scala.inline
  def apply(action: Action, heading: String, image_url: String, paragraph: String = null): Panel = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any])
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panel]
  }
}

