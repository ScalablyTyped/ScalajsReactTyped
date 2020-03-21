package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/LineNumber.LineNumberProps> */
trait PartialLineNumberProps extends js.Object {
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialLineNumberProps {
  @scala.inline
  def apply(
    highlight: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    onClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    style: CSSProperties = null
  ): PartialLineNumberProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLineNumberProps]
  }
}

