package typingsJapgolly.react.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDirectionalSuspenseListProps
  extends typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.undefined
}

object NonDirectionalSuspenseListProps {
  @scala.inline
  def apply(
    children: Element | js.Iterable[Element],
    revealOrder: Exclude[
      typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ] = null
  ): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
}

