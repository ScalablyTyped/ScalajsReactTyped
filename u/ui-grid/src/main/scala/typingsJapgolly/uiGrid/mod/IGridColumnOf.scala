package typingsJapgolly.uiGrid.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridColumnOf[TEntity] extends StObject {
  
  /**
    * Initializes a column
    * @param colDef the column def to associate with this column
    * @param uid The unique and immutable uid we'd like to allocate to this column
    * @param grid the grid we'd like to create this column in
    */
  def GridColumn(colDef: IColumnDefOf[TEntity], uid: Double, grid: IGridInstanceOf[TEntity]): Unit
  
  /** Column definition */
  var colDef: IColumnDefOf[TEntity]
  
  /** Default sort on this column */
  var defaultSort: js.UndefOr[ISortInfo] = js.undefined
  
  /**
    * Column name that will be shown in the header.
    * If displayName is not provided then one is generated using the name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * field must be provided if you wish to bind to a property in the data source.
    * Should be an angular expression that evaluates against grid.options.data array element.
    * Can be a complex expression: employee.address.city, or can be a function: employee.getFullAddress().
    * See the angular docs on binding expressions.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /** Filter on this column */
  var filter: js.UndefOr[IFilterOptions] = js.undefined
  
  /** Filters for this column. Includes 'term' property bound to filter input elements */
  var filters: js.UndefOr[js.Array[IFilterOptions]] = js.undefined
  
  /**
    * Gets the aggregation label from colDef.aggregationLabel if specified or by using i18n,
    * including deciding whether or not to display based on colDef.aggregationHideLabel.
    * @param label the i18n lookup value to use for the column label
    */
  def getAggregationText(label: String): Unit
  
  /**
    * gets the aggregation value based on the aggregation type for this column.
    * Debounced using scrollDebounce option setting
    */
  def getAggregationValue(): String
  
  /**
    * Returns the class name for the column
    * @param prefixDot if true, will return .className instead of className
    */
  def getColClass(prefixDot: Boolean): String
  
  /** Returns the class definition for th column */
  def getColClassDefinition(): String
  
  /**
    * Returns the render container object that this column belongs to.
    * Columns will be default be in the body render container
    * if they aren't allocated to one specifically.
    */
  def getRenderContainer(): Any
  
  /** Reference to grid containing the column */
  var grid: IGridInstanceOf[TEntity]
  
  // @todo replace with interface for render container
  /** Hides the column by setting colDef.visible = false */
  def hideColumn(): Unit
  
  /** Returns true if column is in the left render container */
  def isPinnedLeft(): Boolean
  
  /** Returns true if column is in the right render container */
  def isPinnedRight(): Boolean
  
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Sets a property on the column using the passed in columnDef,
    * and setting the defaultValue if the value cannot be found on the colDef
    * @param colDef the column def to look in for the property value
    * @param propName the property name we'd like to set
    * @param defaultValue the value to use if the colDef doesn't provide the setting
    */
  def setPropertyOrDefault(colDef: IColumnDefOf[TEntity], propName: String, defaultValue: Any): Unit
  
  /** Makes the column visible by setting colDef.visible = true */
  def showColumn(): Unit
  
  /** Sort on this column */
  var sort: js.UndefOr[ISortInfo] = js.undefined
  
  /**
    * Algorithm to use for sorting this column. Takes 'a' and 'b' parameters
    * like any normal sorting function with additional 'rowA', 'rowB', and 'direction'
    * parameters that are the row objects and the current direction of the sort
    * respectively.
    */
  var sortingAlgorithm: js.UndefOr[
    js.Function5[
      /* a */ Any, 
      /* b */ Any, 
      /* rowA */ IGridRowOf[TEntity], 
      /* rowB */ IGridRowOf[TEntity], 
      /* direction */ String, 
      Double
    ]
  ] = js.undefined
  
  /**
    * Moves settings from the columnDef down onto the column, and sets properties as appropriate
    * @param colDef the column def to look in for property value
    * @param isNew whether the column is being newly created, if not we're updating an existing
    *              column, and some items such as the sort shouldn't be copied down
    */
  def updateColumnDef(colDef: IColumnDefOf[TEntity], isNew: Boolean): Unit
  
  /** Column width */
  var width: Double
}
object IGridColumnOf {
  
  inline def apply[TEntity](
    GridColumn: (IColumnDefOf[TEntity], Double, IGridInstanceOf[TEntity]) => Callback,
    colDef: IColumnDefOf[TEntity],
    getAggregationText: String => Callback,
    getAggregationValue: CallbackTo[String],
    getColClass: Boolean => String,
    getColClassDefinition: CallbackTo[String],
    getRenderContainer: CallbackTo[Any],
    grid: IGridInstanceOf[TEntity],
    hideColumn: Callback,
    isPinnedLeft: CallbackTo[Boolean],
    isPinnedRight: CallbackTo[Boolean],
    setPropertyOrDefault: (IColumnDefOf[TEntity], String, Any) => Callback,
    showColumn: Callback,
    updateColumnDef: (IColumnDefOf[TEntity], Boolean) => Callback,
    width: Double
  ): IGridColumnOf[TEntity] = {
    val __obj = js.Dynamic.literal(GridColumn = js.Any.fromFunction3((t0: IColumnDefOf[TEntity], t1: Double, t2: IGridInstanceOf[TEntity]) => (GridColumn(t0, t1, t2)).runNow()), colDef = colDef.asInstanceOf[js.Any], getAggregationText = js.Any.fromFunction1((t0: String) => getAggregationText(t0).runNow()), getAggregationValue = getAggregationValue.toJsFn, getColClass = js.Any.fromFunction1(getColClass), getColClassDefinition = getColClassDefinition.toJsFn, getRenderContainer = getRenderContainer.toJsFn, grid = grid.asInstanceOf[js.Any], hideColumn = hideColumn.toJsFn, isPinnedLeft = isPinnedLeft.toJsFn, isPinnedRight = isPinnedRight.toJsFn, setPropertyOrDefault = js.Any.fromFunction3((t0: IColumnDefOf[TEntity], t1: String, t2: Any) => (setPropertyOrDefault(t0, t1, t2)).runNow()), showColumn = showColumn.toJsFn, updateColumnDef = js.Any.fromFunction2((t0: IColumnDefOf[TEntity], t1: Boolean) => (updateColumnDef(t0, t1)).runNow()), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridColumnOf[TEntity]]
  }
  
  extension [Self <: IGridColumnOf[?], TEntity](x: Self & IGridColumnOf[TEntity]) {
    
    inline def setColDef(value: IColumnDefOf[TEntity]): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
    
    inline def setDefaultSort(value: ISortInfo): Self = StObject.set(x, "defaultSort", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortUndefined: Self = StObject.set(x, "defaultSort", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilter(value: IFilterOptions): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilters(value: js.Array[IFilterOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: IFilterOptions*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setGetAggregationText(value: String => Callback): Self = StObject.set(x, "getAggregationText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetAggregationValue(value: CallbackTo[String]): Self = StObject.set(x, "getAggregationValue", value.toJsFn)
    
    inline def setGetColClass(value: Boolean => String): Self = StObject.set(x, "getColClass", js.Any.fromFunction1(value))
    
    inline def setGetColClassDefinition(value: CallbackTo[String]): Self = StObject.set(x, "getColClassDefinition", value.toJsFn)
    
    inline def setGetRenderContainer(value: CallbackTo[Any]): Self = StObject.set(x, "getRenderContainer", value.toJsFn)
    
    inline def setGrid(value: IGridInstanceOf[TEntity]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridColumn(value: (IColumnDefOf[TEntity], Double, IGridInstanceOf[TEntity]) => Callback): Self = StObject.set(x, "GridColumn", js.Any.fromFunction3((t0: IColumnDefOf[TEntity], t1: Double, t2: IGridInstanceOf[TEntity]) => (value(t0, t1, t2)).runNow()))
    
    inline def setHideColumn(value: Callback): Self = StObject.set(x, "hideColumn", value.toJsFn)
    
    inline def setIsPinnedLeft(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPinnedLeft", value.toJsFn)
    
    inline def setIsPinnedRight(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPinnedRight", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSetPropertyOrDefault(value: (IColumnDefOf[TEntity], String, Any) => Callback): Self = StObject.set(x, "setPropertyOrDefault", js.Any.fromFunction3((t0: IColumnDefOf[TEntity], t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setShowColumn(value: Callback): Self = StObject.set(x, "showColumn", value.toJsFn)
    
    inline def setSort(value: ISortInfo): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortingAlgorithm(
      value: (/* a */ Any, /* b */ Any, /* rowA */ IGridRowOf[TEntity], /* rowB */ IGridRowOf[TEntity], /* direction */ String) => Double
    ): Self = StObject.set(x, "sortingAlgorithm", js.Any.fromFunction5(value))
    
    inline def setSortingAlgorithmUndefined: Self = StObject.set(x, "sortingAlgorithm", js.undefined)
    
    inline def setUpdateColumnDef(value: (IColumnDefOf[TEntity], Boolean) => Callback): Self = StObject.set(x, "updateColumnDef", js.Any.fromFunction2((t0: IColumnDefOf[TEntity], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
