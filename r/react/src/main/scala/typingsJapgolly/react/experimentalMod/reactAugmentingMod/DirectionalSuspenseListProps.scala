package typingsJapgolly.react.experimentalMod.reactAugmentingMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionalSuspenseListProps
  extends SuspenseListCommonProps
     with typingsJapgolly.react.mod.SuspenseListProps
     with SuspenseListProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: forwards | backwards
  /**
    * Dictates how unloaded items in a SuspenseList is shown.
    *
    * - By default, `SuspenseList` will show all fallbacks in the list.
    * - `collapsed` shows only the next fallback in the list.
    * - `hidden` doesn’t show any unloaded items.
    */
  var tail: js.UndefOr[SuspenseListTailMode] = js.undefined
}

object DirectionalSuspenseListProps {
  @scala.inline
  def apply(
    children: Element | js.Iterable[Element],
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null
  ): DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalSuspenseListProps]
  }
}

