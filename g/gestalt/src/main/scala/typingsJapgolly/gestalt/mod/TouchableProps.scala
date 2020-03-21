package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.Anon1
import typingsJapgolly.gestalt.AnonEventSyntheticEvent
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.copy
import typingsJapgolly.gestalt.gestaltStrings.grab
import typingsJapgolly.gestalt.gestaltStrings.grabbing
import typingsJapgolly.gestalt.gestaltStrings.move
import typingsJapgolly.gestalt.gestaltStrings.noDrop
import typingsJapgolly.gestalt.gestaltStrings.pill
import typingsJapgolly.gestalt.gestaltStrings.pointer
import typingsJapgolly.gestalt.gestaltStrings.rounded
import typingsJapgolly.gestalt.gestaltStrings.roundedBottom
import typingsJapgolly.gestalt.gestaltStrings.roundedLeft
import typingsJapgolly.gestalt.gestaltStrings.roundedRight
import typingsJapgolly.gestalt.gestaltStrings.roundedTop
import typingsJapgolly.gestalt.gestaltStrings.square
import typingsJapgolly.gestalt.gestaltStrings.zoomIn
import typingsJapgolly.gestalt.gestaltStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var fullHeight: js.UndefOr[Boolean] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
  var shape: js.UndefOr[
    square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight
  ] = js.undefined
  def onTouch(args: Anon1): Unit
}

object TouchableProps {
  @scala.inline
  def apply(
    onTouch: Anon1 => Callback,
    children: VdomNode = null,
    fullHeight: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mouseCursor: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Callback = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Callback = null,
    shape: square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onTouch")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.Anon1) => onTouch(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseLeave(t0).runNow()))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchableProps]
  }
}

