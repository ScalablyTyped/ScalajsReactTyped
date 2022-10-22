package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGridInstance extends StObject {
  
  @JSName("$canvas")
  var $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$footerPanel")
  var $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$groupPanel")
  var $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$headerContainer")
  var $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$headerScroller")
  var $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$headers")
  var $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$root")
  var $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$topPanel")
  var $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  @JSName("$viewport")
  var $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
  
  def buildColumnDefsFromData(): Unit
  
  def buildColumns(): Unit
  
  def calcMaxCanvasHeight(): Unit
  
  def clearSortingData(): Unit
  
  var config: IGridOptions
  
  def configureColumnWidths(): Unit
  
  var data: Any
  
  var elementDims: IElementDimension
  
  var eventProvider: IEventProvider
  
  var filteredRows: js.Array[IRow]
  
  def fixColumnIndexes(): Unit
  
  def fixGroupIndexes(): Unit
  
  var footerController: Any
  
  def getTemplate(key: String): Any
  
  var gridId: String
  
  def init(): Any
  
  def initTemplates(): Any
  
  var lastSortedColumns: js.Array[IColumn]
  
  var lateBindColumns: Boolean
  
  var maxCanvasHt: Double
  
  def minRowsToRender(): Unit
  
  var prevScrollIndex: Double
  
  var prevScrollTop: Double
  
  def refreshDomSizes(): Unit
  
  def resizeOnData(col: IColumn): Unit
  
  var rootDim: IDimension
  
  var rowCache: js.Array[IRow]
  
  var rowFactory: IRowFactory
  
  var rowMap: js.Array[IRow]
  
  var searchProvider: ISearchProvider
  
  def setRenderedRows(newRows: js.Array[IRow]): Unit
  
  def sortActual(): Unit
  
  def sortColumnsInit(): Unit
  
  def sortData(col: IColumn, event: Any): Unit
  
  var styleProvider: IStyleProvider
}
object IGridInstance {
  
  inline def apply(
    $canvas: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $footerPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $groupPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $headerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $headerScroller: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $topPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    $viewport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any,
    buildColumnDefsFromData: Callback,
    buildColumns: Callback,
    calcMaxCanvasHeight: Callback,
    clearSortingData: Callback,
    config: IGridOptions,
    configureColumnWidths: Callback,
    data: Any,
    elementDims: IElementDimension,
    eventProvider: IEventProvider,
    filteredRows: js.Array[IRow],
    fixColumnIndexes: Callback,
    fixGroupIndexes: Callback,
    footerController: Any,
    getTemplate: String => Any,
    gridId: String,
    init: CallbackTo[Any],
    initTemplates: CallbackTo[Any],
    lastSortedColumns: js.Array[IColumn],
    lateBindColumns: Boolean,
    maxCanvasHt: Double,
    minRowsToRender: Callback,
    prevScrollIndex: Double,
    prevScrollTop: Double,
    refreshDomSizes: Callback,
    resizeOnData: IColumn => Callback,
    rootDim: IDimension,
    rowCache: js.Array[IRow],
    rowFactory: IRowFactory,
    rowMap: js.Array[IRow],
    searchProvider: ISearchProvider,
    setRenderedRows: js.Array[IRow] => Callback,
    sortActual: Callback,
    sortColumnsInit: Callback,
    sortData: (IColumn, Any) => Callback,
    styleProvider: IStyleProvider
  ): IGridInstance = {
    val __obj = js.Dynamic.literal($canvas = $canvas.asInstanceOf[js.Any], $footerPanel = $footerPanel.asInstanceOf[js.Any], $groupPanel = $groupPanel.asInstanceOf[js.Any], $headerContainer = $headerContainer.asInstanceOf[js.Any], $headerScroller = $headerScroller.asInstanceOf[js.Any], $headers = $headers.asInstanceOf[js.Any], $root = $root.asInstanceOf[js.Any], $topPanel = $topPanel.asInstanceOf[js.Any], $viewport = $viewport.asInstanceOf[js.Any], buildColumnDefsFromData = buildColumnDefsFromData.toJsFn, buildColumns = buildColumns.toJsFn, calcMaxCanvasHeight = calcMaxCanvasHeight.toJsFn, clearSortingData = clearSortingData.toJsFn, config = config.asInstanceOf[js.Any], configureColumnWidths = configureColumnWidths.toJsFn, data = data.asInstanceOf[js.Any], elementDims = elementDims.asInstanceOf[js.Any], eventProvider = eventProvider.asInstanceOf[js.Any], filteredRows = filteredRows.asInstanceOf[js.Any], fixColumnIndexes = fixColumnIndexes.toJsFn, fixGroupIndexes = fixGroupIndexes.toJsFn, footerController = footerController.asInstanceOf[js.Any], getTemplate = js.Any.fromFunction1(getTemplate), gridId = gridId.asInstanceOf[js.Any], init = init.toJsFn, initTemplates = initTemplates.toJsFn, lastSortedColumns = lastSortedColumns.asInstanceOf[js.Any], lateBindColumns = lateBindColumns.asInstanceOf[js.Any], maxCanvasHt = maxCanvasHt.asInstanceOf[js.Any], minRowsToRender = minRowsToRender.toJsFn, prevScrollIndex = prevScrollIndex.asInstanceOf[js.Any], prevScrollTop = prevScrollTop.asInstanceOf[js.Any], refreshDomSizes = refreshDomSizes.toJsFn, resizeOnData = js.Any.fromFunction1((t0: IColumn) => resizeOnData(t0).runNow()), rootDim = rootDim.asInstanceOf[js.Any], rowCache = rowCache.asInstanceOf[js.Any], rowFactory = rowFactory.asInstanceOf[js.Any], rowMap = rowMap.asInstanceOf[js.Any], searchProvider = searchProvider.asInstanceOf[js.Any], setRenderedRows = js.Any.fromFunction1((t0: js.Array[IRow]) => setRenderedRows(t0).runNow()), sortActual = sortActual.toJsFn, sortColumnsInit = sortColumnsInit.toJsFn, sortData = js.Any.fromFunction2((t0: IColumn, t1: Any) => (sortData(t0, t1)).runNow()), styleProvider = styleProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridInstance]
  }
  
  extension [Self <: IGridInstance](x: Self) {
    
    inline def set$canvas(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$canvas", value.asInstanceOf[js.Any])
    
    inline def set$footerPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$footerPanel", value.asInstanceOf[js.Any])
    
    inline def set$groupPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$groupPanel", value.asInstanceOf[js.Any])
    
    inline def set$headerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$headerContainer", value.asInstanceOf[js.Any])
    
    inline def set$headerScroller(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$headerScroller", value.asInstanceOf[js.Any])
    
    inline def set$headers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$headers", value.asInstanceOf[js.Any])
    
    inline def set$root(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$root", value.asInstanceOf[js.Any])
    
    inline def set$topPanel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$topPanel", value.asInstanceOf[js.Any])
    
    inline def set$viewport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ Any
    ): Self = StObject.set(x, "$viewport", value.asInstanceOf[js.Any])
    
    inline def setBuildColumnDefsFromData(value: Callback): Self = StObject.set(x, "buildColumnDefsFromData", value.toJsFn)
    
    inline def setBuildColumns(value: Callback): Self = StObject.set(x, "buildColumns", value.toJsFn)
    
    inline def setCalcMaxCanvasHeight(value: Callback): Self = StObject.set(x, "calcMaxCanvasHeight", value.toJsFn)
    
    inline def setClearSortingData(value: Callback): Self = StObject.set(x, "clearSortingData", value.toJsFn)
    
    inline def setConfig(value: IGridOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigureColumnWidths(value: Callback): Self = StObject.set(x, "configureColumnWidths", value.toJsFn)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setElementDims(value: IElementDimension): Self = StObject.set(x, "elementDims", value.asInstanceOf[js.Any])
    
    inline def setEventProvider(value: IEventProvider): Self = StObject.set(x, "eventProvider", value.asInstanceOf[js.Any])
    
    inline def setFilteredRows(value: js.Array[IRow]): Self = StObject.set(x, "filteredRows", value.asInstanceOf[js.Any])
    
    inline def setFilteredRowsVarargs(value: IRow*): Self = StObject.set(x, "filteredRows", js.Array(value*))
    
    inline def setFixColumnIndexes(value: Callback): Self = StObject.set(x, "fixColumnIndexes", value.toJsFn)
    
    inline def setFixGroupIndexes(value: Callback): Self = StObject.set(x, "fixGroupIndexes", value.toJsFn)
    
    inline def setFooterController(value: Any): Self = StObject.set(x, "footerController", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: String => Any): Self = StObject.set(x, "getTemplate", js.Any.fromFunction1(value))
    
    inline def setGridId(value: String): Self = StObject.set(x, "gridId", value.asInstanceOf[js.Any])
    
    inline def setInit(value: CallbackTo[Any]): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitTemplates(value: CallbackTo[Any]): Self = StObject.set(x, "initTemplates", value.toJsFn)
    
    inline def setLastSortedColumns(value: js.Array[IColumn]): Self = StObject.set(x, "lastSortedColumns", value.asInstanceOf[js.Any])
    
    inline def setLastSortedColumnsVarargs(value: IColumn*): Self = StObject.set(x, "lastSortedColumns", js.Array(value*))
    
    inline def setLateBindColumns(value: Boolean): Self = StObject.set(x, "lateBindColumns", value.asInstanceOf[js.Any])
    
    inline def setMaxCanvasHt(value: Double): Self = StObject.set(x, "maxCanvasHt", value.asInstanceOf[js.Any])
    
    inline def setMinRowsToRender(value: Callback): Self = StObject.set(x, "minRowsToRender", value.toJsFn)
    
    inline def setPrevScrollIndex(value: Double): Self = StObject.set(x, "prevScrollIndex", value.asInstanceOf[js.Any])
    
    inline def setPrevScrollTop(value: Double): Self = StObject.set(x, "prevScrollTop", value.asInstanceOf[js.Any])
    
    inline def setRefreshDomSizes(value: Callback): Self = StObject.set(x, "refreshDomSizes", value.toJsFn)
    
    inline def setResizeOnData(value: IColumn => Callback): Self = StObject.set(x, "resizeOnData", js.Any.fromFunction1((t0: IColumn) => value(t0).runNow()))
    
    inline def setRootDim(value: IDimension): Self = StObject.set(x, "rootDim", value.asInstanceOf[js.Any])
    
    inline def setRowCache(value: js.Array[IRow]): Self = StObject.set(x, "rowCache", value.asInstanceOf[js.Any])
    
    inline def setRowCacheVarargs(value: IRow*): Self = StObject.set(x, "rowCache", js.Array(value*))
    
    inline def setRowFactory(value: IRowFactory): Self = StObject.set(x, "rowFactory", value.asInstanceOf[js.Any])
    
    inline def setRowMap(value: js.Array[IRow]): Self = StObject.set(x, "rowMap", value.asInstanceOf[js.Any])
    
    inline def setRowMapVarargs(value: IRow*): Self = StObject.set(x, "rowMap", js.Array(value*))
    
    inline def setSearchProvider(value: ISearchProvider): Self = StObject.set(x, "searchProvider", value.asInstanceOf[js.Any])
    
    inline def setSetRenderedRows(value: js.Array[IRow] => Callback): Self = StObject.set(x, "setRenderedRows", js.Any.fromFunction1((t0: js.Array[IRow]) => value(t0).runNow()))
    
    inline def setSortActual(value: Callback): Self = StObject.set(x, "sortActual", value.toJsFn)
    
    inline def setSortColumnsInit(value: Callback): Self = StObject.set(x, "sortColumnsInit", value.toJsFn)
    
    inline def setSortData(value: (IColumn, Any) => Callback): Self = StObject.set(x, "sortData", js.Any.fromFunction2((t0: IColumn, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setStyleProvider(value: IStyleProvider): Self = StObject.set(x, "styleProvider", value.asInstanceOf[js.Any])
  }
}
