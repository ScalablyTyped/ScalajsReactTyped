package typingsJapgolly.reactPopper.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.popperJs.mod.ReferenceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperProps extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  var referenceElement: js.UndefOr[ReferenceObject] = js.undefined
  def children(props: PopperChildrenProps): Node
}

object PopperProps {
  @scala.inline
  def apply(
    children: PopperChildrenProps => CallbackTo[Node],
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref = null,
    modifiers: Modifiers = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    referenceElement: ReferenceObject = null
  ): PopperProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopper.mod.PopperChildrenProps) => children(t0).runNow()))
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperProps]
  }
}

