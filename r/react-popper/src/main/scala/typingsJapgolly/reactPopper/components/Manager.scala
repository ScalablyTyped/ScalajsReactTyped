package typingsJapgolly.reactPopper.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPopper.mod.ManagerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Manager {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ManagerProps, typingsJapgolly.reactPopper.mod.Manager, Unit, ManagerProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPopper.mod.ManagerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPopper.mod.Manager](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPopper.mod.ManagerProps])(children: _*)
  }
  @JSImport("react-popper", "Manager")
  @js.native
  object componentImport extends js.Object
  
}

