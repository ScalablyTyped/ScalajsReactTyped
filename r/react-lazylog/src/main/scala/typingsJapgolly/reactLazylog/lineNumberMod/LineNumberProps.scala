package typingsJapgolly.reactLazylog.lineNumberMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineNumberProps extends js.Object {
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: Double
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineNumberProps {
  @scala.inline
  def apply(
    number: Double,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    style: CSSProperties = null
  ): LineNumberProps = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumberProps]
  }
}

