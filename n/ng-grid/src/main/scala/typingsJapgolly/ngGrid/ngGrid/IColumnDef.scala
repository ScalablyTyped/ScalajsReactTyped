package typingsJapgolly.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnDef extends StObject {
  
  /** String name for filter to use on the aggregate label ('currency', 'date', etc..) defaults to cellFilter if not set. */
  var aggLabelFilter: js.UndefOr[String] = js.undefined
  
  /** User defined CSS class name */
  var cellClass: js.UndefOr[String] = js.undefined
  
  /** Controls when to use the edit template on per-row basis using an angular expression (enableCellEdit must also be true for editing)*/
  var cellEditableCondition: js.UndefOr[String] = js.undefined
  
  /** string name for filter to use on the cell ('currency', 'date', etc..) */
  var cellFilter: js.UndefOr[String] = js.undefined
  
  /** Html template used to render the cell */
  var cellTemplate: js.UndefOr[String] = js.undefined
  
  /** What to display in the column header */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The template to use while editing */
  var editableCellTemplate: js.UndefOr[String] = js.undefined
  
  /** Allows the cell to use an edit template when focused (grid option enableCellSelection must be enabled)*/
  var enableCellEdit: js.UndefOr[Boolean] = js.undefined
  
  /** Can also be a property path on your data model. "foo.bar.myField", "Name.First", etc..*/
  var field: js.UndefOr[String] = js.undefined
  
  /** Allows the column to be grouped with drag and drop, but has no effect on gridOptions.groups */
  var groupable: js.UndefOr[Boolean] = js.undefined
  
  /** Html template used to render the header cell */
  var headerCellTemplate: js.UndefOr[String] = js.undefined
  
  /** User defined CSS class name for the header cell */
  var headerClass: js.UndefOr[String] = js.undefined
  
  /** The minum width the column is allowed to be. See width for the different options */
  var minWidth: js.UndefOr[Any] = js.undefined
  
  /** Allows the column to be pinned when enablePinning is set to true */
  var pinnable: js.UndefOr[Boolean] = js.undefined
  
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /** Restrict or allow the column to be resized */
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /** The funtion to use when filtering values in this column */
  var sortFn: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Double]] = js.undefined
  
  /** Restrict or allow the column to be sorted */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /** Set the default visiblity of the column */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This can be an absolute numberor it can also be defined in percentages (20%, 30%),
    * in weighted *s, or "auto" (which sizes the column based on data length)
    * (much like WPF/Silverlight)/ note: "auto" only works in single page apps currently because the re-size
    * happens on "document.ready
    */
  var width: js.UndefOr[Any] = js.undefined
}
object IColumnDef {
  
  inline def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  
  extension [Self <: IColumnDef](x: Self) {
    
    inline def setAggLabelFilter(value: String): Self = StObject.set(x, "aggLabelFilter", value.asInstanceOf[js.Any])
    
    inline def setAggLabelFilterUndefined: Self = StObject.set(x, "aggLabelFilter", js.undefined)
    
    inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
    
    inline def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
    
    inline def setCellEditableCondition(value: String): Self = StObject.set(x, "cellEditableCondition", value.asInstanceOf[js.Any])
    
    inline def setCellEditableConditionUndefined: Self = StObject.set(x, "cellEditableCondition", js.undefined)
    
    inline def setCellFilter(value: String): Self = StObject.set(x, "cellFilter", value.asInstanceOf[js.Any])
    
    inline def setCellFilterUndefined: Self = StObject.set(x, "cellFilter", js.undefined)
    
    inline def setCellTemplate(value: String): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    inline def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEditableCellTemplate(value: String): Self = StObject.set(x, "editableCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditableCellTemplateUndefined: Self = StObject.set(x, "editableCellTemplate", js.undefined)
    
    inline def setEnableCellEdit(value: Boolean): Self = StObject.set(x, "enableCellEdit", value.asInstanceOf[js.Any])
    
    inline def setEnableCellEditUndefined: Self = StObject.set(x, "enableCellEdit", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    inline def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
    
    inline def setHeaderCellTemplate(value: String): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderCellTemplateUndefined: Self = StObject.set(x, "headerCellTemplate", js.undefined)
    
    inline def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
    
    inline def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
    
    inline def setMinWidth(value: Any): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setPinnable(value: Boolean): Self = StObject.set(x, "pinnable", value.asInstanceOf[js.Any])
    
    inline def setPinnableUndefined: Self = StObject.set(x, "pinnable", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setSortFn(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
    
    inline def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
