package typingsJapgolly.antDesignPro.avatarListMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignPro.avatarItemMod.SizeType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarListProps extends js.Object {
  var Item: js.UndefOr[Element] = js.undefined
  var children: Element | js.Array[Element]
  var excessItemsStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AvatarListProps {
  @scala.inline
  def apply(
    children: Element | js.Array[Element],
    Item: VdomElement = null,
    excessItemsStyle: CSSProperties = null,
    maxLength: Int | Double = null,
    size: SizeType = null,
    style: CSSProperties = null
  ): AvatarListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.rawElement.asInstanceOf[js.Any])
    if (excessItemsStyle != null) __obj.updateDynamic("excessItemsStyle")(excessItemsStyle.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarListProps]
  }
}

