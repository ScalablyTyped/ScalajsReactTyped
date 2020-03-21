package typingsJapgolly.antdMobile.whiteSpaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antdMobile.antdMobileStrings.lg
import typingsJapgolly.antdMobile.antdMobileStrings.md
import typingsJapgolly.antdMobile.antdMobileStrings.sm
import typingsJapgolly.antdMobile.antdMobileStrings.xl
import typingsJapgolly.antdMobile.antdMobileStrings.xs
import typingsJapgolly.antdMobile.whiteSpacePropsTypeMod.WhiteSpacePropsType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    prefixCls: String = null,
    size: xs | sm | md | lg | xl = null,
    style: CSSProperties = null
  ): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

