package typingsJapgolly.reactSlick.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomArrowProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var currentSlide: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var slideCount: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CustomArrowProps {
  @scala.inline
  def apply(
    className: String = null,
    currentSlide: Int | Double = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null,
    slideCount: Int | Double = null,
    style: CSSProperties = null
  ): CustomArrowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentSlide != null) __obj.updateDynamic("currentSlide")(currentSlide.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArrowProps]
  }
}

