package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonEvent
import typingsJapgolly.primereact.fieldsetMod.FieldsetProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fieldset {
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    legend: js.Any = null,
    onClick: /* event */ Event_ => Callback = null,
    onCollapse: /* event */ Event_ => Callback = null,
    onExpand: /* event */ Event_ => Callback = null,
    onToggle: /* e */ AnonEvent => Callback = null,
    style: js.Object = null,
    toggleable: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FieldsetProps, 
    typingsJapgolly.primereact.primereactFieldsetMod.Fieldset, 
    Unit, 
    FieldsetProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onCollapse(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onExpand(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonEvent) => onToggle(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.fieldsetMod.FieldsetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactFieldsetMod.Fieldset](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.fieldsetMod.FieldsetProps])(children: _*)
  }
  @JSImport("primereact/fieldset", "Fieldset")
  @js.native
  object componentImport extends js.Object
  
}

