package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowFactory extends js.Object {
  var aggCache: js.Any
  var dataChanged: Boolean
  var groupedData: js.Any
  var numberOfAggregates: Double
  var parentCache: js.Array[_]
  var parsedData: js.Array[_]
  var renderedRange: IRenderedRange
  var rowConfig: IRowConfig
  var rowHeight: Double
  var selectionProvider: ISelectionProvider
  def UpdateViewableRange(newRange: IRenderedRange): Unit
  def buildAggregateRow(aggEntity: js.Any, rowIndex: Double): IAggregate
  def buildEntityRow(entity: js.Any, rowIndex: Double): IRow
  def filteredRowsChanged(): Unit
  def fixRowCache(): Unit
  def getGrouping(groups: js.Any): Unit
  def parseGroupData(groupData: js.Any): Unit
  def renderedChange(): Unit
  def renderedChangeNoGroups(): Unit
}

object IRowFactory {
  @scala.inline
  def apply(
    UpdateViewableRange: IRenderedRange => Callback,
    aggCache: js.Any,
    buildAggregateRow: (js.Any, Double) => CallbackTo[IAggregate],
    buildEntityRow: (js.Any, Double) => CallbackTo[IRow],
    dataChanged: Boolean,
    filteredRowsChanged: Callback,
    fixRowCache: Callback,
    getGrouping: js.Any => Callback,
    groupedData: js.Any,
    numberOfAggregates: Double,
    parentCache: js.Array[_],
    parseGroupData: js.Any => Callback,
    parsedData: js.Array[_],
    renderedChange: Callback,
    renderedChangeNoGroups: Callback,
    renderedRange: IRenderedRange,
    rowConfig: IRowConfig,
    rowHeight: Double,
    selectionProvider: ISelectionProvider
  ): IRowFactory = {
    val __obj = js.Dynamic.literal(aggCache = aggCache.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], groupedData = groupedData.asInstanceOf[js.Any], numberOfAggregates = numberOfAggregates.asInstanceOf[js.Any], parentCache = parentCache.asInstanceOf[js.Any], parsedData = parsedData.asInstanceOf[js.Any], renderedRange = renderedRange.asInstanceOf[js.Any], rowConfig = rowConfig.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("UpdateViewableRange")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IRenderedRange) => UpdateViewableRange(t0).runNow()))
    __obj.updateDynamic("buildAggregateRow")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => buildAggregateRow(t0, t1).runNow()))
    __obj.updateDynamic("buildEntityRow")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => buildEntityRow(t0, t1).runNow()))
    __obj.updateDynamic("filteredRowsChanged")(filteredRowsChanged.toJsFn)
    __obj.updateDynamic("fixRowCache")(fixRowCache.toJsFn)
    __obj.updateDynamic("getGrouping")(js.Any.fromFunction1((t0: js.Any) => getGrouping(t0).runNow()))
    __obj.updateDynamic("parseGroupData")(js.Any.fromFunction1((t0: js.Any) => parseGroupData(t0).runNow()))
    __obj.updateDynamic("renderedChange")(renderedChange.toJsFn)
    __obj.updateDynamic("renderedChangeNoGroups")(renderedChangeNoGroups.toJsFn)
    __obj.asInstanceOf[IRowFactory]
  }
}

