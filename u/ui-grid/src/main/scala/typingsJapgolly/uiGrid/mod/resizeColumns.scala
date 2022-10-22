package typingsJapgolly.uiGrid.mod

import typingsJapgolly.uiGrid.anon.ColumnSizeChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeColumns {
  
  trait IColumnDef extends StObject {
    
    /**
      * Enable column resizing on an individual column
      * Defaults to GridOptions.enableColumnResizing
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply(): typingsJapgolly.uiGrid.mod.resizeColumns.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.uiGrid.mod.resizeColumns.IColumnDef]
    }
    
    extension [Self <: typingsJapgolly.uiGrid.mod.resizeColumns.IColumnDef](x: Self) {
      
      inline def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
    }
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * Enable column resizing on the entire grid
      * Defaults to true
      * @default true
      */
    var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typingsJapgolly.uiGrid.mod.resizeColumns.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.uiGrid.mod.resizeColumns.IGridOptions]
    }
    
    extension [Self <: typingsJapgolly.uiGrid.mod.resizeColumns.IGridOptions](x: Self) {
      
      inline def setEnableColumnResizing(value: Boolean): Self = StObject.set(x, "enableColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResizingUndefined: Self = StObject.set(x, "enableColumnResizing", js.undefined)
    }
  }
  
  trait IGridResizeColumnsApi extends StObject {
    
    // Events
    var on: ColumnSizeChanged
  }
  object IGridResizeColumnsApi {
    
    inline def apply(on: ColumnSizeChanged): IGridResizeColumnsApi = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridResizeColumnsApi]
    }
    
    extension [Self <: IGridResizeColumnsApi](x: Self) {
      
      inline def setOn(value: ColumnSizeChanged): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  type columnSizeChangedHandler = js.Function2[
    /* colDef */ typingsJapgolly.uiGrid.mod.resizeColumns.IColumnDef, 
    /* delta */ Double, 
    Unit
  ]
}
