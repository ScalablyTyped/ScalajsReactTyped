package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonIndexItem
import typingsJapgolly.primereact.menuItemMod.MenuItem
import typingsJapgolly.primereact.stepsMod.StepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  def apply(
    model: js.Array[MenuItem],
    activeIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    onSelect: /* e */ AnonIndexItem => Callback = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StepsProps, typingsJapgolly.primereact.primereactStepsMod.Steps, Unit, StepsProps] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
  
      if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndexItem) => onSelect(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.stepsMod.StepsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactStepsMod.Steps](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.stepsMod.StepsProps])(children: _*)
  }
  @JSImport("primereact/steps", "Steps")
  @js.native
  object componentImport extends js.Object
  
}

