package typingsJapgolly.reactcss.mod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverProps[T] extends Props[T] {
  var hover: js.UndefOr[Boolean] = js.undefined
}

object HoverProps {
  @scala.inline
  def apply[T](
    children: VdomNode = null,
    hover: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: LegacyRef[T] = null
  ): HoverProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hover)) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverProps[T]]
  }
}

