package typingsJapgolly.reactNativeMaterialMenu.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var button: js.UndefOr[Element] = js.undefined
  var onHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleMedia_] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    button: VdomElement = null,
    onHidden: js.UndefOr[Callback] = js.undefined,
    style: StyleMedia_ = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.rawElement.asInstanceOf[js.Any])
    onHidden.foreach(p => __obj.updateDynamic("onHidden")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

