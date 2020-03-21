package typingsJapgolly.reactHotLoader.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppChildren extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
}

object AppChildren {
  @scala.inline
  def apply(children: VdomElement = null): AppChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppChildren]
  }
}

