package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRowFactory extends StObject {
  
  def UpdateViewableRange(newRange: IRenderedRange): Unit
  
  var aggCache: Any
  
  def buildAggregateRow(aggEntity: Any, rowIndex: Double): IAggregate
  
  def buildEntityRow(entity: Any, rowIndex: Double): IRow
  
  var dataChanged: Boolean
  
  def filteredRowsChanged(): Unit
  
  def fixRowCache(): Unit
  
  def getGrouping(groups: Any): Unit
  
  var groupedData: Any
  
  var numberOfAggregates: Double
  
  var parentCache: js.Array[Any]
  
  def parseGroupData(groupData: Any): Unit
  
  var parsedData: js.Array[Any]
  
  def renderedChange(): Unit
  
  def renderedChangeNoGroups(): Unit
  
  var renderedRange: IRenderedRange
  
  var rowConfig: IRowConfig
  
  var rowHeight: Double
  
  var selectionProvider: ISelectionProvider
}
object IRowFactory {
  
  inline def apply(
    UpdateViewableRange: IRenderedRange => Callback,
    aggCache: Any,
    buildAggregateRow: (Any, Double) => IAggregate,
    buildEntityRow: (Any, Double) => IRow,
    dataChanged: Boolean,
    filteredRowsChanged: Callback,
    fixRowCache: Callback,
    getGrouping: Any => Callback,
    groupedData: Any,
    numberOfAggregates: Double,
    parentCache: js.Array[Any],
    parseGroupData: Any => Callback,
    parsedData: js.Array[Any],
    renderedChange: Callback,
    renderedChangeNoGroups: Callback,
    renderedRange: IRenderedRange,
    rowConfig: IRowConfig,
    rowHeight: Double,
    selectionProvider: ISelectionProvider
  ): IRowFactory = {
    val __obj = js.Dynamic.literal(UpdateViewableRange = js.Any.fromFunction1((t0: IRenderedRange) => UpdateViewableRange(t0).runNow()), aggCache = aggCache.asInstanceOf[js.Any], buildAggregateRow = js.Any.fromFunction2(buildAggregateRow), buildEntityRow = js.Any.fromFunction2(buildEntityRow), dataChanged = dataChanged.asInstanceOf[js.Any], filteredRowsChanged = filteredRowsChanged.toJsFn, fixRowCache = fixRowCache.toJsFn, getGrouping = js.Any.fromFunction1((t0: Any) => getGrouping(t0).runNow()), groupedData = groupedData.asInstanceOf[js.Any], numberOfAggregates = numberOfAggregates.asInstanceOf[js.Any], parentCache = parentCache.asInstanceOf[js.Any], parseGroupData = js.Any.fromFunction1((t0: Any) => parseGroupData(t0).runNow()), parsedData = parsedData.asInstanceOf[js.Any], renderedChange = renderedChange.toJsFn, renderedChangeNoGroups = renderedChangeNoGroups.toJsFn, renderedRange = renderedRange.asInstanceOf[js.Any], rowConfig = rowConfig.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowFactory]
  }
  
  extension [Self <: IRowFactory](x: Self) {
    
    inline def setAggCache(value: Any): Self = StObject.set(x, "aggCache", value.asInstanceOf[js.Any])
    
    inline def setBuildAggregateRow(value: (Any, Double) => IAggregate): Self = StObject.set(x, "buildAggregateRow", js.Any.fromFunction2(value))
    
    inline def setBuildEntityRow(value: (Any, Double) => IRow): Self = StObject.set(x, "buildEntityRow", js.Any.fromFunction2(value))
    
    inline def setDataChanged(value: Boolean): Self = StObject.set(x, "dataChanged", value.asInstanceOf[js.Any])
    
    inline def setFilteredRowsChanged(value: Callback): Self = StObject.set(x, "filteredRowsChanged", value.toJsFn)
    
    inline def setFixRowCache(value: Callback): Self = StObject.set(x, "fixRowCache", value.toJsFn)
    
    inline def setGetGrouping(value: Any => Callback): Self = StObject.set(x, "getGrouping", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGroupedData(value: Any): Self = StObject.set(x, "groupedData", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAggregates(value: Double): Self = StObject.set(x, "numberOfAggregates", value.asInstanceOf[js.Any])
    
    inline def setParentCache(value: js.Array[Any]): Self = StObject.set(x, "parentCache", value.asInstanceOf[js.Any])
    
    inline def setParentCacheVarargs(value: Any*): Self = StObject.set(x, "parentCache", js.Array(value*))
    
    inline def setParseGroupData(value: Any => Callback): Self = StObject.set(x, "parseGroupData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setParsedData(value: js.Array[Any]): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    inline def setParsedDataVarargs(value: Any*): Self = StObject.set(x, "parsedData", js.Array(value*))
    
    inline def setRenderedChange(value: Callback): Self = StObject.set(x, "renderedChange", value.toJsFn)
    
    inline def setRenderedChangeNoGroups(value: Callback): Self = StObject.set(x, "renderedChangeNoGroups", value.toJsFn)
    
    inline def setRenderedRange(value: IRenderedRange): Self = StObject.set(x, "renderedRange", value.asInstanceOf[js.Any])
    
    inline def setRowConfig(value: IRowConfig): Self = StObject.set(x, "rowConfig", value.asInstanceOf[js.Any])
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setSelectionProvider(value: ISelectionProvider): Self = StObject.set(x, "selectionProvider", value.asInstanceOf[js.Any])
    
    inline def setUpdateViewableRange(value: IRenderedRange => Callback): Self = StObject.set(x, "UpdateViewableRange", js.Any.fromFunction1((t0: IRenderedRange) => value(t0).runNow()))
  }
}
