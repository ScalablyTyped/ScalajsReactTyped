package typingsJapgolly.antDesignIconsReact.iconMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.SVGSVGElement
import typingsJapgolly.antDesignIcons.typesMod.IconDefinition
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var focusable: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: String | IconDefinition
}

object IconProps {
  @scala.inline
  def apply(
    `type`: String | IconDefinition,
    className: String = null,
    focusable: String = null,
    onClick: ReactMouseEventFrom[SVGSVGElement] => Callback = null,
    primaryColor: String = null,
    secondaryColor: String = null,
    style: CSSProperties = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGSVGElement]) => onClick(t0).runNow()))
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

