package typingsJapgolly.materialUi.circleRippleMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleRippleProps extends Props[CircleRipple] {
  var aborted: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CircleRippleProps {
  @scala.inline
  def apply(
    aborted: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    color: String = null,
    key: Key = null,
    opacity: Int | Double = null,
    ref: LegacyRef[CircleRipple] = null,
    style: CSSProperties = null
  ): CircleRippleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aborted)) __obj.updateDynamic("aborted")(aborted.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleRippleProps]
  }
}

