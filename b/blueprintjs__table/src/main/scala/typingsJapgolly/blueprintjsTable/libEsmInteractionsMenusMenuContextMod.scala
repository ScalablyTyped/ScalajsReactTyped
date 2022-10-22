package typingsJapgolly.blueprintjsTable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.CellCoordinate
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsMenusMenuContextMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/menus/menuContext", "MenuContext")
  @js.native
  open class MenuContext protected ()
    extends StObject
       with IMenuContext {
    def this(target: Region, selectedRegions: js.Array[Region], numRows: Double, numCols: Double) = this()
    
    /**
      * Returns an array of `Region`s that represent the user-intended context
      * of this menu. If the mouse click was on a selection, the array will
      * contain all selected regions. Otherwise it will have one `Region` that
      * represents the clicked cell (the same `Region` from `getTarget`).
      */
    /* CompleteClass */
    override def getRegions(): js.Array[Region] = js.native
    
    /**
      * Returns the list of selected `Region` in the table, regardless of
      * where the users clicked to launch the context menu. For the user-
      * intended regions for this context, use `getRegions` instead.
      */
    /* CompleteClass */
    override def getSelectedRegions(): js.Array[Region] = js.native
    
    /**
      * Returns a region containing the single cell that was clicked to launch
      * this context menu.
      */
    /* CompleteClass */
    override def getTarget(): Region = js.native
    
    /**
      * Returns an array containing all of the unique, potentially non-
      * contiguous, cells contained in all the regions from `getRegions`. The
      * cell coordinates are sorted by rows then columns.
      */
    /* CompleteClass */
    override def getUniqueCells(): js.Array[CellCoordinate] = js.native
    
    /* private */ var numCols: Any = js.native
    
    /* private */ var numRows: Any = js.native
    
    /* private */ var regions: Any = js.native
    
    /* private */ var selectedRegions: Any = js.native
    
    /* private */ var target: Any = js.native
  }
  
  type ContextMenuRenderer = IContextMenuRenderer
  
  type IContextMenuRenderer = js.Function1[/* context */ IMenuContext, Element]
  
  trait IMenuContext extends StObject {
    
    /**
      * Returns an array of `Region`s that represent the user-intended context
      * of this menu. If the mouse click was on a selection, the array will
      * contain all selected regions. Otherwise it will have one `Region` that
      * represents the clicked cell (the same `Region` from `getTarget`).
      */
    def getRegions(): js.Array[Region]
    
    /**
      * Returns the list of selected `Region` in the table, regardless of
      * where the users clicked to launch the context menu. For the user-
      * intended regions for this context, use `getRegions` instead.
      */
    def getSelectedRegions(): js.Array[Region]
    
    /**
      * Returns a region containing the single cell that was clicked to launch
      * this context menu.
      */
    def getTarget(): Region
    
    /**
      * Returns an array containing all of the unique, potentially non-
      * contiguous, cells contained in all the regions from `getRegions`. The
      * cell coordinates are sorted by rows then columns.
      */
    def getUniqueCells(): js.Array[CellCoordinate]
  }
  object IMenuContext {
    
    inline def apply(
      getRegions: CallbackTo[js.Array[Region]],
      getSelectedRegions: CallbackTo[js.Array[Region]],
      getTarget: CallbackTo[Region],
      getUniqueCells: CallbackTo[js.Array[CellCoordinate]]
    ): IMenuContext = {
      val __obj = js.Dynamic.literal(getRegions = getRegions.toJsFn, getSelectedRegions = getSelectedRegions.toJsFn, getTarget = getTarget.toJsFn, getUniqueCells = getUniqueCells.toJsFn)
      __obj.asInstanceOf[IMenuContext]
    }
    
    extension [Self <: IMenuContext](x: Self) {
      
      inline def setGetRegions(value: CallbackTo[js.Array[Region]]): Self = StObject.set(x, "getRegions", value.toJsFn)
      
      inline def setGetSelectedRegions(value: CallbackTo[js.Array[Region]]): Self = StObject.set(x, "getSelectedRegions", value.toJsFn)
      
      inline def setGetTarget(value: CallbackTo[Region]): Self = StObject.set(x, "getTarget", value.toJsFn)
      
      inline def setGetUniqueCells(value: CallbackTo[js.Array[CellCoordinate]]): Self = StObject.set(x, "getUniqueCells", value.toJsFn)
    }
  }
}
