package typingsJapgolly.rcDialog.lazyRenderBoxMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILazyRenderBoxPropTypes extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var hiddenClassName: js.UndefOr[String] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ILazyRenderBoxPropTypes {
  @scala.inline
  def apply(
    className: String = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    hiddenClassName: String = null,
    onMouseDown: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    role: String = null,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ILazyRenderBoxPropTypes = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (hiddenClassName != null) __obj.updateDynamic("hiddenClassName")(hiddenClassName.asInstanceOf[js.Any])
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMouseDown(t0).runNow()))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILazyRenderBoxPropTypes]
  }
}

