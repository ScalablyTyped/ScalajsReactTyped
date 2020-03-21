package typingsJapgolly.rcCascader.menusMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcCascader.cascaderMod.CascaderFieldNames
import typingsJapgolly.rcCascader.cascaderMod.CascaderOption
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenusProps extends js.Object {
  var activeValue: js.UndefOr[js.Array[String]] = js.undefined
  var defaultFieldNames: js.UndefOr[CascaderFieldNames] = js.undefined
  var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.undefined
  var expandIcon: js.UndefOr[Node] = js.undefined
  var expandTrigger: js.UndefOr[String] = js.undefined
  var fieldNames: js.UndefOr[CascaderFieldNames] = js.undefined
  var loadingIcon: js.UndefOr[Node] = js.undefined
  var onItemDoubleClick: js.UndefOr[
    js.Function3[
      /* targetOption */ js.Array[String], 
      /* index */ Double, 
      /* e */ ReactMouseEventFrom[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function3[
      /* targetOption */ js.Array[String], 
      /* index */ Double, 
      /* e */ ReactKeyboardEventFrom[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  var options: js.UndefOr[js.Array[CascaderOption]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Array[String]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object MenusProps {
  @scala.inline
  def apply(
    activeValue: js.Array[String] = null,
    defaultFieldNames: CascaderFieldNames = null,
    dropdownMenuColumnStyle: CSSProperties = null,
    expandIcon: VdomNode = null,
    expandTrigger: String = null,
    fieldNames: CascaderFieldNames = null,
    loadingIcon: VdomNode = null,
    onItemDoubleClick: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onSelect: (/* targetOption */ js.Array[String], /* index */ Double, /* e */ ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    options: js.Array[CascaderOption] = null,
    prefixCls: String = null,
    value: js.Array[String] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MenusProps = {
    val __obj = js.Dynamic.literal()
    if (activeValue != null) __obj.updateDynamic("activeValue")(activeValue.asInstanceOf[js.Any])
    if (defaultFieldNames != null) __obj.updateDynamic("defaultFieldNames")(defaultFieldNames.asInstanceOf[js.Any])
    if (dropdownMenuColumnStyle != null) __obj.updateDynamic("dropdownMenuColumnStyle")(dropdownMenuColumnStyle.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.rawNode.asInstanceOf[js.Any])
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.rawNode.asInstanceOf[js.Any])
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(js.Any.fromFunction3((t0: /* targetOption */ js.Array[java.lang.String], t1: /* index */ scala.Double, t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemDoubleClick(t0, t1, t2).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3((t0: /* targetOption */ js.Array[java.lang.String], t1: /* index */ scala.Double, t2: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSelect(t0, t1, t2).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenusProps]
  }
}

