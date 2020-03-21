package typingsJapgolly.amcharts.amStockChartMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.amcharts.AnonDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmStockChart extends js.Object {
  /**
    * Specifies if animation was already played.
    * Animation is only played once, when chart is rendered for the first time.
    * If you want the animation to be repeated, set this property to false.
    */
  var animationPlayed: Boolean
  /**
    * Balloon object.
    */
  var balloon: typingsJapgolly.amcharts.amBalloonMod.default
  /**
    * Settings for category axes.
    */
  var categoryAxesSettings: typingsJapgolly.amcharts.categoryAxesSettingsMod.default
  /**
    * Indicates if the chart is created.
    */
  var chartCreated: Boolean
  /**
    * Chart cursor settings.
    */
  var chartCursorSettings: typingsJapgolly.amcharts.chartCursorSettingsMod.default
  /**
    * Chart scrollbar settings.
    */
  var chartScrollbarSettings: typingsJapgolly.amcharts.chartScrollbarSettingsMod.default
  /**
    * Array of colors used by data sets if no color was set explicitly on data set itself.
    * [
    * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
    * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
    * ]
    */
  var colors: js.Array[_]
  /**
    * Array of data sets selected for comparing.
    */
  var comparedDataSets: js.Array[_]
  /**
    * DataSetSelector object.
    * You can add it if you have more than one data set and want users to be able to select/compare them.
    */
  var dataSetSelector: typingsJapgolly.amcharts.dataSetSelectorMod.default
  /**
    * Array of DataSets.
    */
  var dataSets: js.Array[_]
  /**
    * Current end date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var endDate: js.Date
  /**
    * Defines on which day week starts. 0 - Sunday, 1 - Monday..
    * @default 1
    */
  var firstDayOfWeek: Double
  /**
    * If set to true the scope of the data view will be set to the end after data update.
    */
  var glueToTheEnd: Boolean
  /**
    * Legend settings.
    */
  var legendSettings: typingsJapgolly.amcharts.legendSettingsMod.default
  /**
    * Data set selected as main.
    */
  var mainDataSet: typingsJapgolly.amcharts.dataSetMod.default
  /**
    * Array of StockPanels (charts).
    */
  var panels: js.Array[_]
  /**
    * Settings for stock panels.
    */
  var panelsSettings: typingsJapgolly.amcharts.panelSettingsMod.default
  /**
    * Period selector object.
    * You can add it if you want user's to be able to enter date ranges or
    * zoom chart with predefined period buttons.
    */
  var periodSelector: typingsJapgolly.amcharts.periodSelectorMod.default
  /**
    * Scrollbar's chart object, get only.
    */
  var scrollbarChart: typingsJapgolly.amcharts.amSerialChartMod.default
  /**
    * Current start date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var startDate: js.Date
  /**
    * Settings for stock events.
    */
  var stockEventsSettings: js.Any
  /**
    * Settings for value axes.
    */
  var valueAxesSettings: typingsJapgolly.amcharts.valueAxesSettingsMod.default
  /**
    * read-only. Indicates current version of a script.
    */
  var version: String
  /**
    * Specifies whether the chart should zoom-out when main data set is changed.
    */
  var zoomOutOnDataSetChange: Boolean
  /**
    * Adds event listener.
    * @param type - One of
    * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
    * "rollOverStockEvent", "zoomed".
    * @param handler - The event handler.
    */
  def addListener(`type`: String, handler: js.Function1[/* e */ AnonDate, Unit]): Unit
  /**
    * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanel(panel: typingsJapgolly.amcharts.stockPanelMod.default): Unit
  /**
    * Adds panel to the stock chart at a specified index.
    * Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanelAt(panel: typingsJapgolly.amcharts.stockPanelMod.default, index: Double): Unit
  /**
    * Destroys chart, all timeouts and listeners.
    */
  def clear(): Unit
  /**
    * Hides event bullets.
    */
  def hideStockEvents(): Unit
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
  /**
    * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def removePanel(panel: typingsJapgolly.amcharts.stockPanelMod.default): Unit
  /**
    * Shows event bullets.
    */
  def showStockEvents(): Unit
  /**
    * Method which should be called after data was changed.
    */
  def validateData(): Unit
  /**
    * Method which forces the stock chart to rebuild. Should be called after properties are changed.
    */
  def validateNow(): Unit
  /**
    * Zooms chart to specified dates. startDate, endDate - Date objects.
    */
  def zoom(startDate: js.Date, endDate: js.Date): Unit
  /**
    * Zooms out the chart.
    */
  def zoomOut(): Unit
}

object AmStockChart {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ AnonDate, Unit]) => Callback,
    addPanel: typingsJapgolly.amcharts.stockPanelMod.default => Callback,
    addPanelAt: (typingsJapgolly.amcharts.stockPanelMod.default, Double) => Callback,
    animationPlayed: Boolean,
    balloon: typingsJapgolly.amcharts.amBalloonMod.default,
    categoryAxesSettings: typingsJapgolly.amcharts.categoryAxesSettingsMod.default,
    chartCreated: Boolean,
    chartCursorSettings: typingsJapgolly.amcharts.chartCursorSettingsMod.default,
    chartScrollbarSettings: typingsJapgolly.amcharts.chartScrollbarSettingsMod.default,
    clear: Callback,
    colors: js.Array[_],
    comparedDataSets: js.Array[_],
    dataSetSelector: typingsJapgolly.amcharts.dataSetSelectorMod.default,
    dataSets: js.Array[_],
    endDate: js.Date,
    firstDayOfWeek: Double,
    glueToTheEnd: Boolean,
    hideStockEvents: Callback,
    legendSettings: typingsJapgolly.amcharts.legendSettingsMod.default,
    mainDataSet: typingsJapgolly.amcharts.dataSetMod.default,
    panels: js.Array[_],
    panelsSettings: typingsJapgolly.amcharts.panelSettingsMod.default,
    periodSelector: typingsJapgolly.amcharts.periodSelectorMod.default,
    removeListener: (typingsJapgolly.amcharts.amChartMod.default, String, js.Any) => Callback,
    removePanel: typingsJapgolly.amcharts.stockPanelMod.default => Callback,
    scrollbarChart: typingsJapgolly.amcharts.amSerialChartMod.default,
    showStockEvents: Callback,
    startDate: js.Date,
    stockEventsSettings: js.Any,
    validateData: Callback,
    validateNow: Callback,
    valueAxesSettings: typingsJapgolly.amcharts.valueAxesSettingsMod.default,
    version: String,
    zoom: (js.Date, js.Date) => Callback,
    zoomOut: Callback,
    zoomOutOnDataSetChange: Boolean
  ): AmStockChart = {
    val __obj = js.Dynamic.literal(animationPlayed = animationPlayed.asInstanceOf[js.Any], balloon = balloon.asInstanceOf[js.Any], categoryAxesSettings = categoryAxesSettings.asInstanceOf[js.Any], chartCreated = chartCreated.asInstanceOf[js.Any], chartCursorSettings = chartCursorSettings.asInstanceOf[js.Any], chartScrollbarSettings = chartScrollbarSettings.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], comparedDataSets = comparedDataSets.asInstanceOf[js.Any], dataSetSelector = dataSetSelector.asInstanceOf[js.Any], dataSets = dataSets.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], glueToTheEnd = glueToTheEnd.asInstanceOf[js.Any], legendSettings = legendSettings.asInstanceOf[js.Any], mainDataSet = mainDataSet.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], panelsSettings = panelsSettings.asInstanceOf[js.Any], periodSelector = periodSelector.asInstanceOf[js.Any], scrollbarChart = scrollbarChart.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], stockEventsSettings = stockEventsSettings.asInstanceOf[js.Any], valueAxesSettings = valueAxesSettings.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zoomOutOnDataSetChange = zoomOutOnDataSetChange.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* e */ typingsJapgolly.amcharts.AnonDate, scala.Unit]) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("addPanel")(js.Any.fromFunction1((t0: typingsJapgolly.amcharts.stockPanelMod.default) => addPanel(t0).runNow()))
    __obj.updateDynamic("addPanelAt")(js.Any.fromFunction2((t0: typingsJapgolly.amcharts.stockPanelMod.default, t1: scala.Double) => addPanelAt(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("hideStockEvents")(hideStockEvents.toJsFn)
    __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: typingsJapgolly.amcharts.amChartMod.default, t1: java.lang.String, t2: js.Any) => removeListener(t0, t1, t2).runNow()))
    __obj.updateDynamic("removePanel")(js.Any.fromFunction1((t0: typingsJapgolly.amcharts.stockPanelMod.default) => removePanel(t0).runNow()))
    __obj.updateDynamic("showStockEvents")(showStockEvents.toJsFn)
    __obj.updateDynamic("validateData")(validateData.toJsFn)
    __obj.updateDynamic("validateNow")(validateNow.toJsFn)
    __obj.updateDynamic("zoom")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => zoom(t0, t1).runNow()))
    __obj.updateDynamic("zoomOut")(zoomOut.toJsFn)
    __obj.asInstanceOf[AmStockChart]
  }
}

