package typingsJapgolly.materialDashUi.internalFocusRippleMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.LegacyRef
import typingsJapgolly.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusRippleProps extends Props[FocusRipple] {
  var color: js.UndefOr[String] = js.undefined
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FocusRippleProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    color: String = null,
    innerStyle: CSSProperties = null,
    key: Key = null,
    opacity: Int | Double = null,
    ref: LegacyRef[FocusRipple] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): FocusRippleProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusRippleProps]
  }
}

