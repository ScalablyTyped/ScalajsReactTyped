package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.headerCellMod.IInternalHeaderCellProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderCell {
  def apply(
    className: String = null,
    index: Int | Double = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[Double] => CallbackTo[Element] = null,
    name: String = null,
    reorderHandle: VdomElement = null,
    resizeHandle: typingsJapgolly.blueprintjsTable.resizeHandleMod.ResizeHandle = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IInternalHeaderCellProps, 
    typingsJapgolly.blueprintjsTable.headerCellMod.HeaderCell, 
    Unit, 
    IInternalHeaderCellProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => menuRenderer(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.rawElement.asInstanceOf[js.Any])
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.headerCellMod.IInternalHeaderCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.headerCellMod.HeaderCell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.headerCellMod.IInternalHeaderCellProps])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/headers/headerCell", "HeaderCell")
  @js.native
  object componentImport extends js.Object
  
}

