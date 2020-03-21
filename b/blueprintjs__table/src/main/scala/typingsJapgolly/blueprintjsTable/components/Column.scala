package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.columnMod.IColumnProps
import typingsJapgolly.blueprintjsTable.esmRegionsMod.ColumnLoadingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  def apply(
    cellRenderer: (/* rowIndex */ Double, /* columnIndex */ Double) => CallbackTo[Element] = null,
    className: String = null,
    columnHeaderCellRenderer: /* columnIndex */ Double => CallbackTo[Element] = null,
    id: String | Double = null,
    loadingOptions: js.Array[ColumnLoadingOption] = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => CallbackTo[Element] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IColumnProps, typingsJapgolly.blueprintjsTable.mod.Column, Unit, IColumnProps] = {
    val __obj = js.Dynamic.literal()
  
      if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction2((t0: /* rowIndex */ scala.Double, t1: /* columnIndex */ scala.Double) => cellRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnHeaderCellRenderer != null) __obj.updateDynamic("columnHeaderCellRenderer")(js.Any.fromFunction1((t0: /* columnIndex */ scala.Double) => columnHeaderCellRenderer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loadingOptions != null) __obj.updateDynamic("loadingOptions")(loadingOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* index */ js.UndefOr[scala.Double]) => nameRenderer(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.columnMod.IColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.Column](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.columnMod.IColumnProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "Column")
  @js.native
  object componentImport extends js.Object
  
}

