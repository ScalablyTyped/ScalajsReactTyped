package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonEventValue
import typingsJapgolly.primereact.pickListSubListMod.PickListSubListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListSubList {
  def apply(
    className: String = null,
    header: String = null,
    itemTemplate: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    list: js.Array[_] = null,
    listClassName: String = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    onItemClick: js.UndefOr[Callback] = js.undefined,
    onSelectionChange: /* e */ AnonEventValue => Callback = null,
    selection: js.Array[_] = null,
    showControls: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickListSubListProps, 
    typingsJapgolly.primereact.pickListSubListMod.PickListSubList, 
    Unit, 
    PickListSubListProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* item */ js.Any) => itemTemplate(t0).runNow()))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection.asInstanceOf[js.Any])
    onItemClick.foreach(p => __obj.updateDynamic("onItemClick")(p.toJsFn))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonEventValue) => onSelectionChange(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showControls)) __obj.updateDynamic("showControls")(showControls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.pickListSubListMod.PickListSubListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.pickListSubListMod.PickListSubList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.pickListSubListMod.PickListSubListProps])(children: _*)
  }
  @JSImport("primereact/components/picklist/PickListSubList", "PickListSubList")
  @js.native
  object componentImport extends js.Object
  
}

