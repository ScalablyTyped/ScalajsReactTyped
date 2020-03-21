package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonSource
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.pickListMod.PickListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickList {
  def apply(
    className: String = null,
    id: String = null,
    itemTemplate: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ AnonSource => Callback = null,
    onMoveAllToSource: /* e */ AnonValue => Callback = null,
    onMoveAllToTarget: /* e */ AnonValue => Callback = null,
    onMoveToSource: /* e */ AnonValue => Callback = null,
    onMoveToTarget: /* e */ AnonValue => Callback = null,
    onSourceSelect: /* e */ AnonValue => Callback = null,
    onTargetSelect: /* e */ AnonValue => Callback = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    showSourceControls: js.UndefOr[Boolean] = js.undefined,
    showTargetControls: js.UndefOr[Boolean] = js.undefined,
    source: js.Array[_] = null,
    sourceHeader: js.Any = null,
    sourceStyle: js.Object = null,
    style: js.Object = null,
    tabIndex: String = null,
    target: js.Array[_] = null,
    targetHeader: js.Any = null,
    targetStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickListProps, 
    typingsJapgolly.primereact.primereactPicklistMod.PickList, 
    Unit, 
    PickListProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* item */ js.Any) => itemTemplate(t0).runNow()))
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonSource) => onChange(t0).runNow()))
    if (onMoveAllToSource != null) __obj.updateDynamic("onMoveAllToSource")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveAllToSource(t0).runNow()))
    if (onMoveAllToTarget != null) __obj.updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveAllToTarget(t0).runNow()))
    if (onMoveToSource != null) __obj.updateDynamic("onMoveToSource")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveToSource(t0).runNow()))
    if (onMoveToTarget != null) __obj.updateDynamic("onMoveToTarget")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onMoveToTarget(t0).runNow()))
    if (onSourceSelect != null) __obj.updateDynamic("onSourceSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onSourceSelect(t0).runNow()))
    if (onTargetSelect != null) __obj.updateDynamic("onTargetSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onTargetSelect(t0).runNow()))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(showSourceControls)) __obj.updateDynamic("showSourceControls")(showSourceControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showTargetControls)) __obj.updateDynamic("showTargetControls")(showTargetControls.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader.asInstanceOf[js.Any])
    if (sourceStyle != null) __obj.updateDynamic("sourceStyle")(sourceStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetHeader != null) __obj.updateDynamic("targetHeader")(targetHeader.asInstanceOf[js.Any])
    if (targetStyle != null) __obj.updateDynamic("targetStyle")(targetStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.pickListMod.PickListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactPicklistMod.PickList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.pickListMod.PickListProps])(children: _*)
  }
  @JSImport("primereact/picklist", "PickList")
  @js.native
  object componentImport extends js.Object
  
}

