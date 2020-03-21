package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.selectableMod.IDragSelectableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragSelectable {
  def apply(
    locateClick: MouseEvent => CallbackTo[IRegion],
    locateDrag: (MouseEvent, ICoordinateData, js.UndefOr[Boolean]) => CallbackTo[IRegion],
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onSelection: js.Array[IRegion] => Callback,
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    enableMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    focusedCell: IFocusedCellCoordinates = null,
    ignoredSelectors: js.Array[String] = null,
    onSelectionEnd: /* regions */ js.Array[IRegion] => Callback = null,
    selectedRegionTransform: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => CallbackTo[IRegion] = null,
    selectedRegions: js.Array[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDragSelectableProps, 
    typingsJapgolly.blueprintjsTable.mod.DragSelectable, 
    Unit, 
    IDragSelectableProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("locateClick")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => locateClick(t0).runNow()))
    __obj.updateDynamic("locateDrag")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.MouseEvent, t1: typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData, t2: js.UndefOr[scala.Boolean]) => locateDrag(t0, t1, t2).runNow()))
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMultipleSelection)) __obj.updateDynamic("enableMultipleSelection")(enableMultipleSelection.asInstanceOf[js.Any])
    if (focusedCell != null) __obj.updateDynamic("focusedCell")(focusedCell.asInstanceOf[js.Any])
    if (ignoredSelectors != null) __obj.updateDynamic("ignoredSelectors")(ignoredSelectors.asInstanceOf[js.Any])
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction1((t0: /* regions */ js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelectionEnd(t0).runNow()))
    if (selectedRegionTransform != null) __obj.updateDynamic("selectedRegionTransform")(js.Any.fromFunction3((t0: /* region */ typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion, t1: /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, t2: /* coords */ js.UndefOr[typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData]) => selectedRegionTransform(t0, t1, t2).runNow()))
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.selectableMod.IDragSelectableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.DragSelectable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.selectableMod.IDragSelectableProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "DragSelectable")
  @js.native
  object componentImport extends js.Object
  
}

