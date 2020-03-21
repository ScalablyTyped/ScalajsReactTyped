package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.rowHeaderCellMod.IRowHeaderCellProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RowHeaderCell {
  def apply(
    className: String = null,
    enableRowReordering: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isRowSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => CallbackTo[Element] = null,
    name: String = null,
    nameRenderer: (/* name */ String, /* index */ js.UndefOr[Double]) => CallbackTo[Element] = null,
    reorderHandle: VdomElement = null,
    resizeHandle: typingsJapgolly.blueprintjsTable.resizeHandleMod.ResizeHandle = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IRowHeaderCellProps, 
    typingsJapgolly.blueprintjsTable.mod.RowHeaderCell, 
    Unit, 
    IRowHeaderCellProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isRowSelected)) __obj.updateDynamic("isRowSelected")(isRowSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => menuRenderer(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameRenderer != null) __obj.updateDynamic("nameRenderer")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* index */ js.UndefOr[scala.Double]) => nameRenderer(t0, t1).runNow()))
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.rawElement.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.rowHeaderCellMod.IRowHeaderCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.RowHeaderCell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.rowHeaderCellMod.IRowHeaderCellProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "RowHeaderCell")
  @js.native
  object componentImport extends js.Object
  
}

