package typingsJapgolly.rcSelect.mod.RcSelect

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupProps extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | Element] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OptGroupProps {
  @scala.inline
  def apply(key: String = null, label: String | Element = null, value: String = null): OptGroupProps = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroupProps]
  }
}

