package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactVirtualized.esMasonryMod.emptyObject
import typingsJapgolly.reactVirtualized.esMasonryMod.identity
import typingsJapgolly.reactVirtualized.esMasonryMod.noop
import typingsJapgolly.reactVirtualized.reactVirtualizedBooleans.`false`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`150`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`20`
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyMapper extends js.Object {
  var autoHeight: `false`
  var keyMapper: identity
  var onCellsRendered: noop
  var onScroll: noop
  var overscanByPixels: `20`
  var role: grid
  var scrollingResetTimeInterval: `150`
  var style: emptyObject
  var tabIndex: `0`
}

object AnonKeyMapper {
  @scala.inline
  def apply(
    autoHeight: `false`,
    keyMapper: /* value */ js.Any => CallbackTo[js.Any],
    onCellsRendered: Callback,
    onScroll: Callback,
    overscanByPixels: `20`,
    role: grid,
    scrollingResetTimeInterval: `150`,
    style: emptyObject,
    tabIndex: `0`
  ): AnonKeyMapper = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], overscanByPixels = overscanByPixels.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("keyMapper")(js.Any.fromFunction1((t0: /* value */ js.Any) => keyMapper(t0).runNow()))
    __obj.updateDynamic("onCellsRendered")(onCellsRendered.toJsFn)
    __obj.updateDynamic("onScroll")(onScroll.toJsFn)
    __obj.asInstanceOf[AnonKeyMapper]
  }
}

