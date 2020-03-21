package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableSelectCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableSelectCell {
  def apply(
    checked: Boolean,
    fixedHeader: Boolean,
    classes: js.Object = null,
    expandableOn: js.UndefOr[Boolean] = js.undefined,
    isHeaderCell: js.UndefOr[Boolean] = js.undefined,
    isRowExpanded: js.UndefOr[Boolean] = js.undefined,
    isRowSelectable: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ js.Any => CallbackTo[js.Any] = null,
    onExpand: /* args */ js.Any => CallbackTo[js.Any] = null,
    otherProps: js.Any = null,
    selectableOn: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MUIDataTableSelectCell, 
    MountedWithRawType[MUIDataTableSelectCell, js.Object, RawMounted[MUIDataTableSelectCell, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any])
  
      if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableOn)) __obj.updateDynamic("expandableOn")(expandableOn.asInstanceOf[js.Any])
    if (!js.isUndefined(isHeaderCell)) __obj.updateDynamic("isHeaderCell")(isHeaderCell.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowExpanded)) __obj.updateDynamic("isRowExpanded")(isRowExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowSelectable)) __obj.updateDynamic("isRowSelectable")(isRowSelectable.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ js.Any) => onChange(t0).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1((t0: /* args */ js.Any) => onExpand(t0).runNow()))
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableOn)) __obj.updateDynamic("selectableOn")(selectableOn.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableSelectCell, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableSelectCell])(children: _*)
  }
  @JSImport("mui-datatables", "TableSelectCell")
  @js.native
  object componentImport extends js.Object
  
}

