package typingsJapgolly.baseui.layerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.baseuiStrings.auto
import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.leftBottom
import typingsJapgolly.baseui.baseuiStrings.leftTop
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.baseuiStrings.rightBottom
import typingsJapgolly.baseui.baseuiStrings.rightTop
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherProps extends js.Object {
  var anchorRef: js.UndefOr[Ref] = js.undefined
  var arrowRef: js.UndefOr[Ref] = js.undefined
  var children: Node
  var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.undefined
  var placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.undefined
  var popperOptions: js.UndefOr[js.Any] = js.undefined
  var popperRef: js.UndefOr[Ref] = js.undefined
}

object TetherProps {
  @scala.inline
  def apply(
    anchorRef: Ref = null,
    arrowRef: Ref = null,
    children: VdomNode = null,
    onPopperUpdate: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => CallbackTo[js.Any] = null,
    placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top = null,
    popperOptions: js.Any = null,
    popperRef: Ref = null
  ): TetherProps = {
    val __obj = js.Dynamic.literal()
    if (anchorRef != null) __obj.updateDynamic("anchorRef")(anchorRef.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (onPopperUpdate != null) __obj.updateDynamic("onPopperUpdate")(js.Any.fromFunction2((t0: /* offsets */ typingsJapgolly.baseui.layerMod.NormalizedOffsets, t1: /* popper */ typingsJapgolly.baseui.layerMod.PopperDataObject) => onPopperUpdate(t0, t1).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popperOptions != null) __obj.updateDynamic("popperOptions")(popperOptions.asInstanceOf[js.Any])
    if (popperRef != null) __obj.updateDynamic("popperRef")(popperRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherProps]
  }
}

