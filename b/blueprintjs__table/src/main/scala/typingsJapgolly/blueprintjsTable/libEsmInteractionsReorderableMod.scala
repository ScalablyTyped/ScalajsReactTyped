package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.MouseEvent
import typingsJapgolly.blueprintjsTable.anon.PartialIDragReorderable
import typingsJapgolly.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typingsJapgolly.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsReorderableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
  @js.native
  open class DragReorderable protected ()
    extends PureComponent[IDragReorderable, js.Object, Any] {
    def this(props: IDragReorderable) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDragReorderable, context: Any) = this()
    
    /* private */ var getDraggableProps: Any = js.native
    
    /* private */ var handleActivate: Any = js.native
    
    /* private */ var handleDragEnd: Any = js.native
    
    /* private */ var handleDragMove: Any = js.native
    
    /* private */ var maybeSelectRegion: Any = js.native
    
    /* private */ var selectedRegionLength: Any = js.native
    
    /* private */ var selectedRegionStartIndex: Any = js.native
    
    /* private */ var shouldIgnoreMouseDown: Any = js.native
  }
  /* static members */
  object DragReorderable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable.defaultProps")
    @js.native
    def defaultProps: PartialIDragReorderable = js.native
    inline def defaultProps_=(x: PartialIDragReorderable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDragReorderable
    extends StObject
       with IReorderableProps {
    
    /** Element to drag & reorder. */
    var children: js.UndefOr[Node] = js.native
    
    /**
      * Whether the reordering behavior is disabled.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
    
    /**
      * A callback that determines a `Region` for the single `MouseEvent`. If
      * no valid region can be found, `null` may be returned.
      */
    def locateClick(event: MouseEvent): Region = js.native
    
    /**
      * A callback that determines the index at which to show the preview guide.
      * This is equivalent to the absolute index in the old ordering where the
      * reordered element will move.
      */
    def locateDrag(event: MouseEvent, coords: ICoordinateData): js.UndefOr[Double] = js.native
    
    /**
      * A callback that converts the provided index into a region. The returned
      * region will be used to update the current selection after drag-reordering.
      */
    def toRegion(index1: Double): Region = js.native
    def toRegion(index1: Double, index2: Double): Region = js.native
  }
  
  trait IReorderableProps extends StObject {
    
    /**
      * When the user reorders something, this callback is called with the new
      * focus cell for the newly selected set of regions.
      */
    def onFocusedCell(focusedCell: FocusedCellCoordinates): Unit
    
    /**
      * A callback that is called when the user is done dragging to reorder.
      *
      * @param oldIndex the original index of the element or set of elements
      * @param newIndex the new index of the element or set of elements
      * @param length the number of contiguous elements that were moved
      */
    def onReordered(oldIndex: Double, newIndex: Double, length: Double): Unit
    
    /**
      * A callback that is called while the user is dragging to reorder.
      *
      * @param oldIndex the original index of the element or set of elements
      * @param newIndex the new index of the element or set of elements
      * @param length the number of contiguous elements that were moved
      */
    def onReordering(oldIndex: Double, newIndex: Double, length: Double): Unit
    
    /**
      * When the user reorders something, this callback is called with a new
      * array of `Region`s. This array should be considered the new selection
      * state for the entire table.
      */
    def onSelection(regions: js.Array[Region]): Unit
    
    /**
      * An array containing the table's selection Regions.
      *
      * @default []
      */
    var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
  }
  object IReorderableProps {
    
    inline def apply(
      onFocusedCell: FocusedCellCoordinates => Callback,
      onReordered: (Double, Double, Double) => Callback,
      onReordering: (Double, Double, Double) => Callback,
      onSelection: js.Array[Region] => Callback
    ): IReorderableProps = {
      val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1((t0: FocusedCellCoordinates) => onFocusedCell(t0).runNow()), onReordered = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordered(t0, t1, t2)).runNow()), onReordering = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onReordering(t0, t1, t2)).runNow()), onSelection = js.Any.fromFunction1((t0: js.Array[Region]) => onSelection(t0).runNow()))
      __obj.asInstanceOf[IReorderableProps]
    }
    
    extension [Self <: IReorderableProps](x: Self) {
      
      inline def setOnFocusedCell(value: FocusedCellCoordinates => Callback): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1((t0: FocusedCellCoordinates) => value(t0).runNow()))
      
      inline def setOnReordered(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "onReordered", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnReordering(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "onReordering", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnSelection(value: js.Array[Region] => Callback): Self = StObject.set(x, "onSelection", js.Any.fromFunction1((t0: js.Array[Region]) => value(t0).runNow()))
      
      inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
    }
  }
}
