package typingsJapgolly.rcTreeSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.rcTreeSelect.AnonSelected
import typingsJapgolly.rcTreeSelect.interfaceMod.DataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType
import typingsJapgolly.rcTreeSelect.optionListMod.OptionListProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptionList {
  def apply(
    childrenAsData: Boolean,
    flattenOptions: js.Array[FlattenDataNode],
    height: Double,
    id: String,
    itemHeight: Double,
    multiple: Boolean,
    open: Boolean,
    options: js.Array[DataNode],
    prefixCls: String,
    searchValue: String,
    values: Set[RawValueType],
    onActiveValue: (RawValueType, Double) => Callback,
    onScroll: ReactUIEventFrom[HTMLDivElement] => Callback,
    onSelect: (RawValueType, AnonSelected) => Callback,
    onToggleOpen: js.UndefOr[Boolean] => Callback,
    defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined,
    menuItemSelectedIcon: js.Any = null,
    notFoundContent: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OptionListProps[js.Array[DataNode]] with RefAttributes[js.Any], 
    Ref, 
    Unit, 
    OptionListProps[js.Array[DataNode]] with RefAttributes[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(childrenAsData = childrenAsData.asInstanceOf[js.Any], flattenOptions = flattenOptions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onActiveValue")(js.Any.fromFunction2((t0: typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType, t1: scala.Double) => onActiveValue(t0, t1).runNow()))
    __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onScroll(t0).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: typingsJapgolly.rcTreeSelect.interfaceMod.RawValueType, t1: typingsJapgolly.rcTreeSelect.AnonSelected) => onSelect(t0, t1).runNow()))
    __obj.updateDynamic("onToggleOpen")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => onToggleOpen(t0).runNow()))
    if (!js.isUndefined(defaultActiveFirstOption)) __obj.updateDynamic("defaultActiveFirstOption")(defaultActiveFirstOption.asInstanceOf[js.Any])
    if (menuItemSelectedIcon != null) __obj.updateDynamic("menuItemSelectedIcon")(menuItemSelectedIcon.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcTreeSelect.optionListMod.OptionListProps[js.Array[typingsJapgolly.rcTreeSelect.interfaceMod.DataNode]] with typingsJapgolly.react.mod.RefAttributes[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  japgolly.scalajs.react.raw.React.Ref](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTreeSelect.optionListMod.OptionListProps[js.Array[typingsJapgolly.rcTreeSelect.interfaceMod.DataNode]] with typingsJapgolly.react.mod.RefAttributes[js.Any]])(children: _*)
  }
  @JSImport("rc-tree-select/lib/OptionList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

