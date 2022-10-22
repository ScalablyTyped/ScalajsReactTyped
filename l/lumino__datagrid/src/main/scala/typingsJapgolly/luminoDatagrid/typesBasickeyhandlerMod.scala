package typingsJapgolly.luminoDatagrid

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.luminoDatagrid.typesDatagridMod.DataGrid
import typingsJapgolly.luminoDatagrid.typesDatagridMod.DataGrid.IKeyHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBasickeyhandlerMod {
  
  @JSImport("@lumino/datagrid/types/basickeyhandler", "BasicKeyHandler")
  @js.native
  open class BasicKeyHandler ()
    extends StObject
       with IKeyHandler {
    
    /* private */ var _disposed: Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Handle the `'ArrowDown'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowDown(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'ArrowLeft'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowLeft(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'ArrowRight'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowRight(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'ArrowUp'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onArrowUp(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'Delete'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onDelete(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'Escape'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onEscape(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'C'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onKeyC(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the key down event for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keydown event of interest.
      *
      * #### Notes
      * This will not be called if the mouse button is pressed.
      */
    /* CompleteClass */
    override def onKeyDown(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'PageDown'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onPageDown(grid: DataGrid, event: KeyboardEvent): Unit = js.native
    
    /**
      * Handle the `'PageUp'` key press for the data grid.
      *
      * @param grid - The data grid of interest.
      *
      * @param event - The keyboard event of interest.
      */
    /* protected */ def onPageUp(grid: DataGrid, event: KeyboardEvent): Unit = js.native
  }
}
