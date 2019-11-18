package typingsJapgolly.materialDashUi.internalTouchRippleMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.LegacyRef
import typingsJapgolly.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchRippleProps extends Props[TouchRipple] {
  var abortOnScroll: js.UndefOr[Boolean] = js.undefined
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TouchRippleProps {
  @scala.inline
  def apply(
    abortOnScroll: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    color: String = null,
    key: Key = null,
    opacity: Int | Double = null,
    ref: LegacyRef[TouchRipple] = null,
    style: CSSProperties = null
  ): TouchRippleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnScroll)) __obj.updateDynamic("abortOnScroll")(abortOnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchRippleProps]
  }
}

