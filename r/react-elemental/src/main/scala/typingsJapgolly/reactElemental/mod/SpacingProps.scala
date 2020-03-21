package typingsJapgolly.reactElemental.mod

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpacingProps extends js.Object {
  val bottom: js.UndefOr[Boolean] = js.undefined
  val children: js.UndefOr[js.Any] = js.undefined
  val `inline`: js.UndefOr[Boolean] = js.undefined
  val left: js.UndefOr[Boolean] = js.undefined
  val padding: js.UndefOr[Boolean] = js.undefined
  val right: js.UndefOr[Boolean] = js.undefined
  val size: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val top: js.UndefOr[Boolean] = js.undefined
}

object SpacingProps {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    children: js.Any = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Boolean] = js.undefined,
    right: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    style: CSSProperties = null,
    top: js.UndefOr[Boolean] = js.undefined
  ): SpacingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingProps]
  }
}

