package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion
import typingsJapgolly.blueprintjsTable.reorderableMod.IDragReorderable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragReorderable {
  def apply(
    locateClick: MouseEvent => CallbackTo[IRegion],
    locateDrag: (MouseEvent, ICoordinateData) => CallbackTo[Double],
    onFocusedCell: IFocusedCellCoordinates => Callback,
    onReordered: (Double, Double, Double) => Callback,
    onReordering: (Double, Double, Double) => Callback,
    onSelection: js.Array[IRegion] => Callback,
    toRegion: (Double, js.UndefOr[Double]) => CallbackTo[IRegion],
    disabled: Boolean | (js.Function1[/* event */ MouseEvent, Boolean]) = null,
    selectedRegions: js.Array[IRegion] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDragReorderable, 
    typingsJapgolly.blueprintjsTable.reorderableMod.DragReorderable, 
    Unit, 
    IDragReorderable
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("locateClick")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.MouseEvent) => locateClick(t0).runNow()))
    __obj.updateDynamic("locateDrag")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.MouseEvent, t1: typingsJapgolly.blueprintjsTable.draggableMod.ICoordinateData) => locateDrag(t0, t1).runNow()))
    __obj.updateDynamic("onFocusedCell")(js.Any.fromFunction1((t0: typingsJapgolly.blueprintjsTable.commonCellMod.IFocusedCellCoordinates) => onFocusedCell(t0).runNow()))
    __obj.updateDynamic("onReordered")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordered(t0, t1, t2).runNow()))
    __obj.updateDynamic("onReordering")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onReordering(t0, t1, t2).runNow()))
    __obj.updateDynamic("onSelection")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsTable.esmRegionsMod.IRegion]) => onSelection(t0).runNow()))
    __obj.updateDynamic("toRegion")(js.Any.fromFunction2((t0: scala.Double, t1: js.UndefOr[scala.Double]) => toRegion(t0, t1).runNow()))
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.reorderableMod.IDragReorderable, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.reorderableMod.DragReorderable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.reorderableMod.IDragReorderable])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
  @js.native
  object componentImport extends js.Object
  
}

