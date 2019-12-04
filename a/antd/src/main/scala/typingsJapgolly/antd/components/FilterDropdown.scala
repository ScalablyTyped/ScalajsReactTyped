package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.libTableFilterDropdownMod.default
import typingsJapgolly.antd.libTableInterfaceMod.ColumnProps
import typingsJapgolly.antd.libTableInterfaceMod.FilterMenuProps
import typingsJapgolly.antd.libTableInterfaceMod.TableLocale
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilterDropdown {
  def apply[T](
    column: ColumnProps[T],
    dropdownPrefixCls: String,
    locale: TableLocale,
    prefixCls: String,
    selectedKeys: js.Array[String],
    confirmFilter: (ColumnProps[T], js.Array[Key]) => CallbackTo[js.Any],
    getPopupContainer: /* triggerNode */ js.UndefOr[HTMLElement] => CallbackTo[HTMLElement] = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FilterMenuProps[T], default[T], Unit, FilterMenuProps[T]] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
  
      __obj.updateDynamic("confirmFilter")(js.Any.fromFunction2((t0: typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T], t1: js.Array[typingsJapgolly.react.reactMod.Key]) => confirmFilter(t0, t1).runNow()))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => getPopupContainer(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTableInterfaceMod.FilterMenuProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTableFilterDropdownMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTableInterfaceMod.FilterMenuProps[T]])(children: _*)
  }
  @JSImport("antd/lib/table/filterDropdown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

