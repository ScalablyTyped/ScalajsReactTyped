package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.filterDropdownMod.FilterDropdownProps
import typingsJapgolly.antd.tableInterfaceMod.ColumnType
import typingsJapgolly.antd.tableInterfaceMod.Key
import typingsJapgolly.antd.tableInterfaceMod.TableLocale
import typingsJapgolly.antd.useFilterMod.FilterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilterDropdown {
  def apply[RecordType](
    column: ColumnType[RecordType],
    columnKey: Key,
    dropdownPrefixCls: String,
    filterMultiple: Boolean,
    locale: TableLocale,
    prefixCls: String,
    triggerFilter: FilterState[RecordType] => Callback,
    filterState: FilterState[RecordType] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FilterDropdownProps[RecordType], 
    MountedWithRawType[
      FilterDropdownProps[RecordType], 
      js.Object, 
      RawMounted[FilterDropdownProps[RecordType], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
      __obj.updateDynamic("triggerFilter")(js.Any.fromFunction1((t0: typingsJapgolly.antd.useFilterMod.FilterState[RecordType]) => triggerFilter(t0).runNow()))
    if (filterState != null) __obj.updateDynamic("filterState")(filterState.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.filterDropdownMod.FilterDropdownProps[RecordType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.filterDropdownMod.FilterDropdownProps[RecordType]])(children: _*)
  }
  @JSImport("antd/lib/table/hooks/useFilter/FilterDropdown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

