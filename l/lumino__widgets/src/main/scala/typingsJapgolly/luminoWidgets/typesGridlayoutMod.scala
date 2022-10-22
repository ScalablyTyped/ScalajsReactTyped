package typingsJapgolly.luminoWidgets

import typingsJapgolly.luminoWidgets.anon.PartialICellConfig
import typingsJapgolly.luminoWidgets.typesGridlayoutMod.GridLayout.IOptions
import typingsJapgolly.luminoWidgets.typesLayoutMod.Layout
import typingsJapgolly.luminoWidgets.typesWidgetMod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGridlayoutMod {
  
  @JSImport("@lumino/widgets/types/gridlayout", "GridLayout")
  @js.native
  /**
    * Construct a new grid layout.
    *
    * @param options - The options for initializing the layout.
    */
  open class GridLayout () extends Layout {
    def this(options: IOptions) = this()
    
    /* private */ var _box: Any = js.native
    
    /* private */ var _columnSizers: Any = js.native
    
    /* private */ var _columnSpacing: Any = js.native
    
    /* private */ var _columnStarts: Any = js.native
    
    /* private */ var _dirty: Any = js.native
    
    /**
      * Fit the layout to the total size required by the widgets.
      */
    /* private */ var _fit: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _rowSizers: Any = js.native
    
    /* private */ var _rowSpacing: Any = js.native
    
    /* private */ var _rowStarts: Any = js.native
    
    /**
      * Update the layout position and size of the widgets.
      *
      * The parent offset dimensions should be `-1` if unknown.
      */
    /* private */ var _update: Any = js.native
    
    /**
      * Add a widget to the grid layout.
      *
      * @param widget - The widget to add to the layout.
      *
      * #### Notes
      * If the widget is already contained in the layout, this is no-op.
      */
    def addWidget(widget: Widget): Unit = js.native
    
    /**
      * Attach a widget to the parent's DOM node.
      *
      * @param widget - The widget to attach to the parent.
      */
    /* protected */ def attachWidget(widget: Widget): Unit = js.native
    
    /**
      * Get the number of columns in the layout.
      */
    /**
      * Set the number of columns in the layout.
      *
      * #### Notes
      * The minimum column count is `1`.
      */
    var columnCount: Double = js.native
    
    /**
      * Get the column spacing for the layout.
      */
    /**
      * Set the col spacing for the layout.
      */
    var columnSpacing: Double = js.native
    
    /**
      * Get the stretch factor for a specific column.
      *
      * @param index - The column index of interest.
      *
      * @returns The stretch factor for the column.
      *
      * #### Notes
      * This returns `-1` if the index is out of range.
      */
    def columnStretch(index: Double): Double = js.native
    
    /**
      * Detach a widget from the parent's DOM node.
      *
      * @param widget - The widget to detach from the parent.
      */
    /* protected */ def detachWidget(widget: Widget): Unit = js.native
    
    /**
      * Get the number of rows in the layout.
      */
    /**
      * Set the number of rows in the layout.
      *
      * #### Notes
      * The minimum row count is `1`.
      */
    var rowCount: Double = js.native
    
    /**
      * Get the row spacing for the layout.
      */
    /**
      * Set the row spacing for the layout.
      */
    var rowSpacing: Double = js.native
    
    /**
      * Get the stretch factor for a specific row.
      *
      * @param index - The row index of interest.
      *
      * @returns The stretch factor for the row.
      *
      * #### Notes
      * This returns `-1` if the index is out of range.
      */
    def rowStretch(index: Double): Double = js.native
    
    /**
      * Set the stretch factor for a specific column.
      *
      * @param index - The column index of interest.
      *
      * @param value - The stretch factor for the column.
      *
      * #### Notes
      * This is a no-op if the index is out of range.
      */
    def setColumnStretch(index: Double, value: Double): Unit = js.native
    
    /**
      * Set the stretch factor for a specific row.
      *
      * @param index - The row index of interest.
      *
      * @param value - The stretch factor for the row.
      *
      * #### Notes
      * This is a no-op if the index is out of range.
      */
    def setRowStretch(index: Double, value: Double): Unit = js.native
  }
  object GridLayout {
    
    @JSImport("@lumino/widgets/types/gridlayout", "GridLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the cell config for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The cell config for the widget.
      */
    inline def getCellConfig(widget: Widget): ICellConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getCellConfig")(widget.asInstanceOf[js.Any]).asInstanceOf[ICellConfig]
    
    /**
      * Set the cell config for the given widget.
      *
      * @param widget - The widget of interest.
      *
      * @param value - The value for the cell config.
      */
    inline def setCellConfig(widget: Widget, value: PartialICellConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCellConfig")(widget.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * An object which holds the cell configuration for a widget.
      */
    trait ICellConfig extends StObject {
      
      /**
        * The column index for the widget.
        */
      val column: Double
      
      /**
        * The column span for the widget.
        */
      val columnSpan: Double
      
      /**
        * The row index for the widget.
        */
      val row: Double
      
      /**
        * The row span for the widget.
        */
      val rowSpan: Double
    }
    object ICellConfig {
      
      inline def apply(column: Double, columnSpan: Double, row: Double, rowSpan: Double): ICellConfig = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICellConfig]
      }
      
      extension [Self <: ICellConfig](x: Self) {
        
        inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        inline def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
        
        inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An options object for initializing a grid layout.
      */
    trait IOptions
      extends StObject
         with typingsJapgolly.luminoWidgets.typesLayoutMod.Layout.IOptions {
      
      /**
        * The initial column count for the layout.
        *
        * The default is `1`.
        */
      var columnCount: js.UndefOr[Double] = js.undefined
      
      /**
        * The spacing between columns in the layout.
        *
        * The default is `4`.
        */
      var columnSpacing: js.UndefOr[Double] = js.undefined
      
      /**
        * The initial row count for the layout.
        *
        * The default is `1`.
        */
      var rowCount: js.UndefOr[Double] = js.undefined
      
      /**
        * The spacing between rows in the layout.
        *
        * The default is `4`.
        */
      var rowSpacing: js.UndefOr[Double] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
        
        inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
        
        inline def setColumnSpacing(value: Double): Self = StObject.set(x, "columnSpacing", value.asInstanceOf[js.Any])
        
        inline def setColumnSpacingUndefined: Self = StObject.set(x, "columnSpacing", js.undefined)
        
        inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
        
        inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
        
        inline def setRowSpacing(value: Double): Self = StObject.set(x, "rowSpacing", value.asInstanceOf[js.Any])
        
        inline def setRowSpacingUndefined: Self = StObject.set(x, "rowSpacing", js.undefined)
      }
    }
  }
}
