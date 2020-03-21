package typingsJapgolly.rcCascader.cascaderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TriggerProps * / any, 'getPopupContainer'> */
trait CascaderProps extends js.Object {
  var builtinPlacements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.undefined
  var changeOnSelect: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Element] = js.undefined
  var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.undefined
  var expandIcon: js.UndefOr[Node] = js.undefined
  var expandTrigger: js.UndefOr[String] = js.undefined
  var fieldNames: js.UndefOr[CascaderFieldNames] = js.undefined
  var filedNames: js.UndefOr[CascaderFieldNames] = js.undefined
  var getPopupContainer: js.Any
  var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[CascaderOption], Unit]] = js.undefined
  var loadingIcon: js.UndefOr[Node] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* value */ js.Array[String], /* selectOptions */ js.Array[CascaderOption], Unit]
  ] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ ReactKeyboardEventFrom[HTMLElement], Unit]] = js.undefined
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* popupVisible */ Boolean, Unit]] = js.undefined
  var options: js.UndefOr[js.Array[CascaderOption]] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupPlacement: js.UndefOr[String] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Array[String]] = js.undefined
}

object CascaderProps {
  @scala.inline
  def apply(
    getPopupContainer: js.Any,
    builtinPlacements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
    children: VdomElement = null,
    defaultValue: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownMenuColumnStyle: CSSProperties = null,
    expandIcon: VdomNode = null,
    expandTrigger: String = null,
    fieldNames: CascaderFieldNames = null,
    filedNames: CascaderFieldNames = null,
    loadData: /* selectOptions */ js.Array[CascaderOption] => Callback = null,
    loadingIcon: VdomNode = null,
    onChange: (/* value */ js.Array[String], /* selectOptions */ js.Array[CascaderOption]) => Callback = null,
    onKeyDown: /* e */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onPopupVisibleChange: /* popupVisible */ Boolean => Callback = null,
    options: js.Array[CascaderOption] = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    transitionName: String = null,
    value: js.Array[String] = null
  ): CascaderProps = {
    val __obj = js.Dynamic.literal(getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOnSelect)) __obj.updateDynamic("changeOnSelect")(changeOnSelect.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownMenuColumnStyle != null) __obj.updateDynamic("dropdownMenuColumnStyle")(dropdownMenuColumnStyle.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.rawNode.asInstanceOf[js.Any])
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (filedNames != null) __obj.updateDynamic("filedNames")(filedNames.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1((t0: /* selectOptions */ js.Array[typingsJapgolly.rcCascader.cascaderMod.CascaderOption]) => loadData(t0).runNow()))
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ js.Array[java.lang.String], t1: /* selectOptions */ js.Array[typingsJapgolly.rcCascader.cascaderMod.CascaderOption]) => onChange(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1((t0: /* popupVisible */ scala.Boolean) => onPopupVisibleChange(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderProps]
  }
}

