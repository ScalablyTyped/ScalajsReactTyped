package typingsJapgolly.netconf

import typingsJapgolly.netconf.netconfStrings.`override`
import typingsJapgolly.netconf.netconfStrings.merge
import typingsJapgolly.netconf.netconfStrings.replace
import typingsJapgolly.netconf.netconfStrings.set
import typingsJapgolly.netconf.netconfStrings.text
import typingsJapgolly.netconf.netconfStrings.update
import typingsJapgolly.netconf.netconfStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: js.UndefOr[merge | replace | `override` | update | set] = js.undefined
  var config: js.Any
  var format: js.UndefOr[text | xml] = js.undefined
}

object AnonAction {
  @scala.inline
  def apply(
    config: js.Any,
    action: merge | replace | `override` | update | set = null,
    format: text | xml = null
  ): AnonAction = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

