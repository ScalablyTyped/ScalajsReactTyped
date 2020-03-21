package typingsJapgolly.react.experimentalMod.reactAugmentingMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends js.Object

object SuspenseListProps {
  @scala.inline
  def DirectionalSuspenseListProps(
    children: Element | js.Iterable[Element],
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
  @scala.inline
  def NonDirectionalSuspenseListProps(
    children: Element | js.Iterable[Element],
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null
  ): SuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListProps]
  }
}

