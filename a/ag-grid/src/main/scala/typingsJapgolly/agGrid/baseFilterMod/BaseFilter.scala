package typingsJapgolly.agGrid.baseFilterMod

import typingsJapgolly.agGrid.componentMod.Component
import typingsJapgolly.agGrid.contextMod.Context
import typingsJapgolly.agGrid.floatingFilterMod.FloatingFilterChange
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsJapgolly.agGrid.iFilterMod.IDoesFilterPassParams
import typingsJapgolly.agGrid.iFilterMod.IFilter
import typingsJapgolly.agGrid.iFilterMod.IFilterParams
import typingsJapgolly.agGrid.textFilterMod.INumberFilterParams
import typingsJapgolly.agGrid.textFilterMod.ITextFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
@js.native
abstract class BaseFilter[T, P /* <: IFilterParams */, M] ()
  extends Component
     with IFilter {
  var applyActive: Boolean = js.native
  var clearActive: Boolean = js.native
  var conditionValue: String = js.native
  var context: Context = js.native
  var defaultFilter: String = js.native
  var eApplyButton: js.Any = js.native
  var eButtonsPanel: js.Any = js.native
  var eClearButton: js.Any = js.native
  var eConditionWrapper: js.Any = js.native
  var eFilterBodyWrapper: js.Any = js.native
  var filter: String = js.native
  var filterCondition: String = js.native
  var filterParams: P = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  var newRowsActionKeep: js.Any = js.native
  def acceptsBooleanLogic(): Boolean = js.native
  def bodyTemplate(`type`: FilterConditionType): String = js.native
  /* private */ def createConditionBody(`type`: js.Any): js.Any = js.native
  /* private */ def createConditionTemplate(`type`: js.Any): js.Any = js.native
  def customInit(): Unit = js.native
  /* private */ def doOnFilterChanged(): js.Any = js.native
  /* private */ def doOnFilterChanged(applyNow: js.Any): js.Any = js.native
  /** The grid will ask each active filter, in turn, whether each row in the grid passes. If any
    filter fails, then the row will be excluded from the final set. The method is provided a
    params object with attributes node (the rodNode the grid creates that wraps the data) and data
    (the data object that you provided to the grid for that row). */
  /* CompleteClass */
  override def doesFilterPass(params: IDoesFilterPassParams): Boolean = js.native
  def floatingFilter(from: String): Unit = js.native
  def generateFilterHeader(`type`: FilterConditionType): String = js.native
  /* private */ def generateTemplate(): js.Any = js.native
  def getDebounceMs(filterParams: INumberFilterParams): Double = js.native
  def getDebounceMs(filterParams: ITextFilterParams): Double = js.native
  /** Gets the filter state for storing */
  /* CompleteClass */
  override def getModel(): js.Any = js.native
  def getNullableModel(): M | CombinedFilter[M] = js.native
  @JSName("init")
  def init_MBaseFilter(params: P): Unit = js.native
  def initialiseFilterBodyUi(`type`: FilterConditionType): Unit = js.native
  /** This is used to show the filter icon in the header. If true, the filter icon will be shown. */
  /* CompleteClass */
  override def isFilterActive(): Boolean = js.native
  def isFilterConditionActive(`type`: FilterConditionType): Boolean = js.native
  def modelFromFloatingFilter(from: String): M = js.native
  def onClearButton(): Unit = js.native
  def onFilterChanged(): Unit = js.native
  def onFilterChanged(applyNow: Boolean): Unit = js.native
  @JSName("onFloatingFilterChanged")
  def onFloatingFilterChanged_MBaseFilter(change: FloatingFilterChange): Boolean = js.native
  @JSName("onNewRowsLoaded")
  def onNewRowsLoaded_MBaseFilter(): Unit = js.native
  def parse(toParse: M, `type`: FilterConditionType): Unit = js.native
  /* private */ def redrawCondition(): js.Any = js.native
  def refreshFilterBodyUi(`type`: FilterConditionType): Unit = js.native
  /* private */ def refreshOperatorUi(): js.Any = js.native
  def resetState(): Unit = js.native
  def serialize(`type`: FilterConditionType): M = js.native
  def setModel(model: M): Unit = js.native
  /** Restores the filter state. */
  /* CompleteClass */
  override def setModel(model: js.Any): Unit = js.native
  def setModel(model: CombinedFilter[M]): Unit = js.native
  def translate(toTranslate: String): String = js.native
  def wrapCondition(mainCondition: String): String = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
@js.native
object BaseFilter extends js.Object {
  var CONTAINS: String = js.native
  var ENDS_WITH: String = js.native
  var EQUALS: String = js.native
  var GREATER_THAN: String = js.native
  var GREATER_THAN_OR_EQUAL: String = js.native
  var IN_RANGE: String = js.native
  var LESS_THAN: String = js.native
  var LESS_THAN_OR_EQUAL: String = js.native
  var NOT_CONTAINS: String = js.native
  var NOT_EQUAL: String = js.native
  var STARTS_WITH: String = js.native
}

