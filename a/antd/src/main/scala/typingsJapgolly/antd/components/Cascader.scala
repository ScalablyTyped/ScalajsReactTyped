package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.libCascaderMod.CascaderExpandTrigger
import typingsJapgolly.antd.libCascaderMod.CascaderOptionType
import typingsJapgolly.antd.libCascaderMod.CascaderProps
import typingsJapgolly.antd.libCascaderMod.FieldNamesType
import typingsJapgolly.antd.libCascaderMod.ShowSearchType
import typingsJapgolly.antd.libCascaderMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader {
  def apply(
    options: js.Array[CascaderOptionType],
    allowClear: js.UndefOr[Boolean] = js.undefined,
    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayRender: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => CallbackTo[Node] = null,
    expandTrigger: CascaderExpandTrigger = null,
    fieldNames: FieldNamesType = null,
    filedNames: FieldNamesType = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    inputPrefixCls: String = null,
    loadData: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Callback = null,
    notFoundContent: VdomNode = null,
    onChange: (/* value */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Callback = null,
    onPopupVisibleChange: /* popupVisible */ Boolean => Callback = null,
    placeholder: String = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    showSearch: Boolean | ShowSearchType = null,
    size: String = null,
    style: CSSProperties = null,
    suffixIcon: VdomNode = null,
    value: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CascaderProps, default, Unit, CascaderProps] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOnSelect)) __obj.updateDynamic("changeOnSelect")(changeOnSelect.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayRender != null) __obj.updateDynamic("displayRender")(js.Any.fromFunction2((t0: /* label */ js.Array[java.lang.String], t1: /* selectedOptions */ js.UndefOr[js.Array[typingsJapgolly.antd.libCascaderMod.CascaderOptionType]]) => displayRender(t0, t1).runNow()))
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (filedNames != null) __obj.updateDynamic("filedNames")(filedNames.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1((t0: /* selectedOptions */ js.UndefOr[js.Array[typingsJapgolly.antd.libCascaderMod.CascaderOptionType]]) => loadData(t0).runNow()))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ js.Array[java.lang.String], t1: /* selectedOptions */ js.UndefOr[js.Array[typingsJapgolly.antd.libCascaderMod.CascaderOptionType]]) => onChange(t0, t1).runNow()))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1((t0: /* popupVisible */ scala.Boolean) => onPopupVisibleChange(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showSearch != null) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libCascaderMod.CascaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libCascaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libCascaderMod.CascaderProps])(children: _*)
  }
  @JSImport("antd/lib/cascader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

