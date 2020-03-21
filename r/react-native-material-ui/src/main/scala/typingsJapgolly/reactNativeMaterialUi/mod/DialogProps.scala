package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNativeMaterialUi.AnonContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var children: Element | js.Array[Element]
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonContainerViewStyle] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    children: Element | js.Array[Element],
    onPress: js.UndefOr[Callback] = js.undefined,
    style: AnonContainerViewStyle = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

