package typingsJapgolly.wouter.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.Array[Element]
  var location: js.UndefOr[String] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: js.Array[Element], location: String = null): SwitchProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

