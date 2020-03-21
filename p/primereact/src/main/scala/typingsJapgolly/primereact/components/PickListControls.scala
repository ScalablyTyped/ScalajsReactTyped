package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonDirection
import typingsJapgolly.primereact.pickListControlsMod.PickListControlsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListControls {
  def apply(
    className: String = null,
    list: js.Array[_] = null,
    onReorder: /* e */ AnonDirection => Callback = null,
    selection: js.Array[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickListControlsProps, 
    typingsJapgolly.primereact.pickListControlsMod.PickListControls, 
    Unit, 
    PickListControlsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (onReorder != null) __obj.updateDynamic("onReorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonDirection) => onReorder(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.pickListControlsMod.PickListControlsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.pickListControlsMod.PickListControls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.pickListControlsMod.PickListControlsProps])(children: _*)
  }
  @JSImport("primereact/components/picklist/PickListControls", "PickListControls")
  @js.native
  object componentImport extends js.Object
  
}

