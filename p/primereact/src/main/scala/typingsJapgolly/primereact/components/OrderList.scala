package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonValue
import typingsJapgolly.primereact.orderListMod.OrderListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OrderList {
  def apply(
    className: String = null,
    dragdrop: js.UndefOr[Boolean] = js.undefined,
    header: js.Any = null,
    id: String = null,
    itemTemplate: /* item */ js.Any => CallbackTo[js.UndefOr[Element]] = null,
    listStyle: js.Object = null,
    onChange: /* e */ AnonValue => Callback = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: String = null,
    value: js.Array[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OrderListProps, 
    typingsJapgolly.primereact.primereactOrderlistMod.OrderList, 
    Unit, 
    OrderListProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dragdrop)) __obj.updateDynamic("dragdrop")(dragdrop.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1((t0: /* item */ js.Any) => itemTemplate(t0).runNow()))
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onChange(t0).runNow()))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.orderListMod.OrderListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactOrderlistMod.OrderList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.orderListMod.OrderListProps])(children: _*)
  }
  @JSImport("primereact/orderlist", "OrderList")
  @js.native
  object componentImport extends js.Object
  
}

