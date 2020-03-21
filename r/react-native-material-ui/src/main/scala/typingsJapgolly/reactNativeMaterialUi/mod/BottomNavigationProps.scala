package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNativeMaterialUi.AnonContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationProps extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var children: Element | js.Array[Element]
  var hidden: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[AnonContainerViewStyle] = js.undefined
}

object BottomNavigationProps {
  @scala.inline
  def apply(
    children: Element | js.Array[Element],
    active: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    style: AnonContainerViewStyle = null
  ): BottomNavigationProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomNavigationProps]
  }
}

