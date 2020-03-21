package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  @JSName("onClick")
  var onClick_ChipProps: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
  var onClose: js.UndefOr[MouseEventHandler[Chip]] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    onClick: ReactMouseEventFrom[Chip with Element] => Callback = null,
    onClose: ReactMouseEventFrom[Chip with Element] => Callback = null
  ): ChipProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.Chip with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[typingsJapgolly.reactMdl.mod.Chip with org.scalajs.dom.raw.Element]) => onClose(t0).runNow()))
    __obj.asInstanceOf[ChipProps]
  }
}

