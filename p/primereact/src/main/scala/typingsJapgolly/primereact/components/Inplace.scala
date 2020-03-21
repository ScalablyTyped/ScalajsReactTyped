package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValueBoolean
import typingsJapgolly.primereact.inplaceMod.InplaceProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Inplace {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onClose: /* event */ Event_ => Callback = null,
    onOpen: /* event */ Event_ => Callback = null,
    onToggle: /* e */ AnonValueBoolean => Callback = null,
    style: js.Object = null,
    tabIndex: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InplaceProps, 
    typingsJapgolly.primereact.primereactInplaceMod.Inplace, 
    Unit, 
    InplaceProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClose(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onOpen(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValueBoolean) => onToggle(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.inplaceMod.InplaceProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactInplaceMod.Inplace](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.inplaceMod.InplaceProps])(children: _*)
  }
  @JSImport("primereact/inplace", "Inplace")
  @js.native
  object componentImport extends js.Object
  
}

