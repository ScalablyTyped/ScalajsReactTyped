package typingsJapgolly.uiGrid.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.uiGrid.anon.ColumnPositionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveColumns {
  
  trait IColumnDef extends StObject {
    
    /**
      * Enable column moving for the column
      */
    var enableColumnMoving: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnDef {
    
    inline def apply(): typingsJapgolly.uiGrid.mod.moveColumns.IColumnDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.uiGrid.mod.moveColumns.IColumnDef]
    }
    
    extension [Self <: typingsJapgolly.uiGrid.mod.moveColumns.IColumnDef](x: Self) {
      
      inline def setEnableColumnMoving(value: Boolean): Self = StObject.set(x, "enableColumnMoving", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnMovingUndefined: Self = StObject.set(x, "enableColumnMoving", js.undefined)
    }
  }
  
  trait IGridMoveColumnsApi extends StObject {
    
    // Methods
    /**
      * Method can be used to change column position
      * @param originalPosition Original column position as a 0 indexed integer
      * @param newPosition New column position as a 0 indexed integer
      */
    def moveColumn(originalPosition: Double, newPosition: Double): Unit
    
    // Events
    var on: ColumnPositionChanged
  }
  object IGridMoveColumnsApi {
    
    inline def apply(moveColumn: (Double, Double) => Callback, on: ColumnPositionChanged): IGridMoveColumnsApi = {
      val __obj = js.Dynamic.literal(moveColumn = js.Any.fromFunction2((t0: Double, t1: Double) => (moveColumn(t0, t1)).runNow()), on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridMoveColumnsApi]
    }
    
    extension [Self <: IGridMoveColumnsApi](x: Self) {
      
      inline def setMoveColumn(value: (Double, Double) => Callback): Self = StObject.set(x, "moveColumn", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: ColumnPositionChanged): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * If defined, sets the default value for the colMovable flag on each individual colDefs
      * if their individual enableColumnMoving configuration is not defined.
      * Defaults to true.
      * @default true
      */
    var enableColumnMoving: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typingsJapgolly.uiGrid.mod.moveColumns.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.uiGrid.mod.moveColumns.IGridOptions]
    }
    
    extension [Self <: typingsJapgolly.uiGrid.mod.moveColumns.IGridOptions](x: Self) {
      
      inline def setEnableColumnMoving(value: Boolean): Self = StObject.set(x, "enableColumnMoving", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnMovingUndefined: Self = StObject.set(x, "enableColumnMoving", js.undefined)
    }
  }
  
  type columnPositionChangedHandler = js.Function3[
    /* colDef */ typingsJapgolly.uiGrid.mod.moveColumns.IColumnDef, 
    /* originalPosition */ Double, 
    /* finalPosition */ Double, 
    Unit
  ]
}
