package typingsJapgolly.reactPopper.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.popperJs.mod.ReferenceObject
import typingsJapgolly.reactPopper.mod.PopperChildrenProps
import typingsJapgolly.reactPopper.mod.PopperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popper {
  def apply(
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref = null,
    modifiers: Modifiers = null,
    placement: Placement = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    referenceElement: ReferenceObject = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: PopperChildrenProps => CallbackTo[Node]
  ): UnmountedWithRoot[PopperProps, typingsJapgolly.reactPopper.mod.Popper, Unit, PopperProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopper.mod.PopperChildrenProps) => children(t0).runNow()))
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPopper.mod.PopperProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactPopper.mod.Popper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPopper.mod.PopperProps])
  }
  @JSImport("react-popper", "Popper")
  @js.native
  object componentImport extends js.Object
  
}

