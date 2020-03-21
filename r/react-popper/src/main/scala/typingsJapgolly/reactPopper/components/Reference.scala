package typingsJapgolly.reactPopper.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPopper.mod.ReferenceChildrenProps
import typingsJapgolly.reactPopper.mod.ReferenceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reference {
  def apply(
    innerRef: Ref = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ReferenceChildrenProps => CallbackTo[Node]
  ): UnmountedWithRoot[ReferenceProps, typingsJapgolly.reactPopper.mod.Reference, Unit, ReferenceProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPopper.mod.ReferenceChildrenProps) => children(t0).runNow()))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPopper.mod.ReferenceProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactPopper.mod.Reference](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPopper.mod.ReferenceProps])
  }
  @JSImport("react-popper", "Reference")
  @js.native
  object componentImport extends js.Object
  
}

