package typingsJapgolly.luminoDatagrid

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`cells-changed`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`columns-inserted`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`columns-moved`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`columns-removed`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`model-reset`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`rows-inserted`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`rows-moved`
import typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`rows-removed`
import typingsJapgolly.luminoDatagrid.typesCellgroupMod.CellGroup
import typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.CellRegion
import typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ChangedArgs
import typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnRegion
import typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.Metadata
import typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowRegion
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDatamodelMod {
  
  /* note: abstract class */ @JSImport("@lumino/datagrid/types/datamodel", "DataModel")
  @js.native
  open class DataModel () extends StObject {
    
    /* private */ var _changed: Any = js.native
    
    /**
      * A signal emitted when the data model has changed.
      */
    val changed: ISignal[this.type, ChangedArgs] = js.native
    
    /**
      * Get the column count for a region in the data model.
      *
      * @param region - The column region of interest.
      *
      * @returns - The column count for the region.
      *
      * #### Notes
      * This method is called often, and so should be efficient.
      */
    def columnCount(region: ColumnRegion): Double = js.native
    
    /**
      * Get the data value for a cell in the data model.
      *
      * @param region - The cell region of interest.
      *
      * @param row - The row index of the cell of interest.
      *
      * @param column - The column index of the cell of interest.
      *
      * @returns The data value for the specified cell.
      *
      * #### Notes
      * The returned data should be treated as immutable.
      *
      * This method is called often, and so should be efficient.
      */
    def data(region: CellRegion, row: Double, column: Double): Any = js.native
    
    /**
      * Emit the `changed` signal for the data model.
      *
      * #### Notes
      * Subclasses should call this method whenever the data model has
      * changed so that attached data grids can update themselves.
      */
    /* protected */ def emitChanged(args: ChangedArgs): Unit = js.native
    
    /**
      * Get the merged cell group corresponding to a region and index number.
      * @param region the cell region of cell group.
      * @param groupIndex the group index of the cell group.
      * @returns a cell group.
      */
    def group(region: CellRegion, groupIndex: Double): CellGroup | Null = js.native
    
    /**
      * Get the count of merged cell groups pertaining to a given
      * cell region.
      * @param region the target cell region.
      */
    def groupCount(region: CellRegion): Double = js.native
    
    /**
      * Get the metadata for a cell in the data model.
      *
      * @param region - The cell region of interest.
      *
      * @param row - The row index of the cell of interest.
      *
      * @param column - The column index of the cell of interest.
      *
      * @returns The metadata for the specified cell.
      *
      * #### Notes
      * The returned metadata should be treated as immutable.
      *
      * This method is called often, and so should be efficient.
      *
      * The default implementation returns `{}`.
      */
    def metadata(region: CellRegion, row: Double, column: Double): Metadata = js.native
    
    /**
      * Get the row count for a region in the data model.
      *
      * @param region - The row region of interest.
      *
      * @returns - The row count for the region.
      *
      * #### Notes
      * This method is called often, and so should be efficient.
      */
    def rowCount(region: RowRegion): Double = js.native
  }
  object DataModel {
    
    /**
      * A singleton empty metadata object.
      */
    @JSImport("@lumino/datagrid/types/datamodel", "DataModel.emptyMetadata")
    @js.native
    val emptyMetadata: Metadata = js.native
    
    /**
      * A type alias for the data model cell regions.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`row-header`
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`column-header`
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`corner-header`
    */
    trait CellRegion extends StObject
    object CellRegion {
      
      inline def body: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body = "body".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body]
      
      inline def `column-header`: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`column-header` = "column-header".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`column-header`]
      
      inline def `corner-header`: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`corner-header` = "corner-header".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`corner-header`]
      
      inline def `row-header`: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`row-header` = "row-header".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`row-header`]
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when cells are changed in-place.
      */
    trait CellsChangedArgs
      extends StObject
         with ChangedArgs {
      
      /**
        * The column index of the first modified cell.
        */
      val column: Double
      
      /**
        * The number of columns in the modified cell range.
        */
      val columnSpan: Double
      
      /**
        * The region which contains the modified cells.
        */
      val region: CellRegion
      
      /**
        * The row index of the first modified cell.
        */
      val row: Double
      
      /**
        * The number of rows in the modified cell range.
        */
      val rowSpan: Double
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `cells-changed`
    }
    object CellsChangedArgs {
      
      inline def apply(column: Double, columnSpan: Double, region: CellRegion, row: Double, rowSpan: Double): CellsChangedArgs = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("cells-changed")
        __obj.asInstanceOf[CellsChangedArgs]
      }
      
      extension [Self <: CellsChangedArgs](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: CellRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
        
        inline def setType(value: `cells-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the args objects of the `changed` signal.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowsChangedArgs
      - typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnsChangedArgs
      - typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowsMovedArgs
      - typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnsMovedArgs
      - typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.CellsChangedArgs
      - typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ModelResetArgs
    */
    trait ChangedArgs extends StObject
    object ChangedArgs {
      
      inline def CellsChangedArgs(column: Double, columnSpan: Double, region: CellRegion, row: Double, rowSpan: Double): typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.CellsChangedArgs = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("cells-changed")
        __obj.asInstanceOf[typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.CellsChangedArgs]
      }
      
      inline def ColumnsChangedArgs(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnsChangedArgs]
      }
      
      inline def ColumnsMovedArgs(destination: Double, index: Double, region: ColumnRegion, span: Double): typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("columns-moved")
        __obj.asInstanceOf[typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ColumnsMovedArgs]
      }
      
      inline def ModelResetArgs(): typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ModelResetArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")("model-reset")
        __obj.asInstanceOf[typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.ModelResetArgs]
      }
      
      inline def RowsChangedArgs(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowsChangedArgs]
      }
      
      inline def RowsMovedArgs(destination: Double, index: Double, region: RowRegion, span: Double): typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("rows-moved")
        __obj.asInstanceOf[typingsJapgolly.luminoDatagrid.typesDatamodelMod.DataModel.RowsMovedArgs]
      }
    }
    
    /**
      * A type alias for the data model column regions.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`row-header`
    */
    trait ColumnRegion extends StObject
    object ColumnRegion {
      
      inline def body: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body = "body".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body]
      
      inline def `row-header`: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`row-header` = "row-header".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`row-header`]
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when columns are inserted or removed.
      */
    trait ColumnsChangedArgs
      extends StObject
         with ChangedArgs {
      
      /**
        * The index of the first modified column.
        */
      val index: Double
      
      /**
        * The region which contains the modified columns.
        */
      val region: ColumnRegion
      
      /**
        * The number of modified columns.
        */
      val span: Double
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `columns-inserted` | `columns-removed`
    }
    object ColumnsChangedArgs {
      
      inline def apply(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ColumnsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ColumnsChangedArgs]
      }
      
      extension [Self <: ColumnsChangedArgs](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: ColumnRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setType(value: `columns-inserted` | `columns-removed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when columns are moved.
      */
    trait ColumnsMovedArgs
      extends StObject
         with ChangedArgs {
      
      /**
        * The ending index of the first modified column.
        */
      val destination: Double
      
      /**
        * The starting index of the first modified column.
        */
      val index: Double
      
      /**
        * The region which contains the modified columns.
        */
      val region: ColumnRegion
      
      /**
        * The number of modified columns.
        */
      val span: Double
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `columns-moved`
    }
    object ColumnsMovedArgs {
      
      inline def apply(destination: Double, index: Double, region: ColumnRegion, span: Double): ColumnsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("columns-moved")
        __obj.asInstanceOf[ColumnsMovedArgs]
      }
      
      extension [Self <: ColumnsMovedArgs](x: Self) {
        
        inline def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: ColumnRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setType(value: `columns-moved`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The metadata for a column in a data model.
      */
    type Metadata = StringDictionary[Any]
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when the model has changed in a fashion that cannot be easily
      * expressed by the other args object types.
      *
      * This is the "big hammer" approach, and will cause any associated
      * data grid to perform a full reset. The other changed args types
      * should be used whenever possible.
      */
    trait ModelResetArgs
      extends StObject
         with ChangedArgs {
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `model-reset`
    }
    object ModelResetArgs {
      
      inline def apply(): ModelResetArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")("model-reset")
        __obj.asInstanceOf[ModelResetArgs]
      }
      
      extension [Self <: ModelResetArgs](x: Self) {
        
        inline def setType(value: `model-reset`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for the data model row regions.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body
      - typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`column-header`
    */
    trait RowRegion extends StObject
    object RowRegion {
      
      inline def body: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body = "body".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.body]
      
      inline def `column-header`: typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`column-header` = "column-header".asInstanceOf[typingsJapgolly.luminoDatagrid.luminoDatagridStrings.`column-header`]
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when rows are inserted or removed.
      */
    trait RowsChangedArgs
      extends StObject
         with ChangedArgs {
      
      /**
        * The index of the first modified row.
        */
      val index: Double
      
      /**
        * The region which contains the modified rows.
        */
      val region: RowRegion
      
      /**
        * The number of modified rows.
        */
      val span: Double
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `rows-inserted` | `rows-removed`
    }
    object RowsChangedArgs {
      
      inline def apply(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): RowsChangedArgs = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[RowsChangedArgs]
      }
      
      extension [Self <: RowsChangedArgs](x: Self) {
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: RowRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setType(value: `rows-inserted` | `rows-removed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An arguments object for the `changed` signal.
      *
      * #### Notes
      * Data models should emit the `changed` signal with this args object
      * type when rows are moved.
      */
    trait RowsMovedArgs
      extends StObject
         with ChangedArgs {
      
      /**
        * The ending index of the first modified row.
        */
      val destination: Double
      
      /**
        * The starting index of the first modified row.
        */
      val index: Double
      
      /**
        * The region which contains the modified rows.
        */
      val region: RowRegion
      
      /**
        * The number of modified rows.
        */
      val span: Double
      
      /**
        * The discriminated type of the args object.
        */
      val `type`: `rows-moved`
    }
    object RowsMovedArgs {
      
      inline def apply(destination: Double, index: Double, region: RowRegion, span: Double): RowsMovedArgs = {
        val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("rows-moved")
        __obj.asInstanceOf[RowsMovedArgs]
      }
      
      extension [Self <: RowsMovedArgs](x: Self) {
        
        inline def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setRegion(value: RowRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setType(value: `rows-moved`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* note: abstract class */ @JSImport("@lumino/datagrid/types/datamodel", "MutableDataModel")
  @js.native
  open class MutableDataModel () extends DataModel {
    
    /**
      * Set the data value for a cell in the data model.
      *
      * @param region - The cell region of interest.
      *
      * @param row - The row index of the cell of interest.
      *
      * @param column - The column index of the cell of interest.
      *
      * @returns true if succeeds, false otherwise.
      *
      */
    def setData(region: CellRegion, row: Double, column: Double, value: Any): Boolean = js.native
  }
}
