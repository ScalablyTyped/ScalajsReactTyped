package typingsJapgolly.amcharts

import japgolly.scalajs.react.Callback
import typingsJapgolly.amcharts.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amStockChartMod {
  
  @JSImport("amcharts/AmStockChart", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AmStockChart {
    
    /**
      * Adds event listener.
      * @param type - One of
      * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
      * "rollOverStockEvent", "zoomed".
      * @param handler - The event handler.
      */
    /* CompleteClass */
    override def addListener(`type`: String, handler: js.Function1[/* e */ Date, Unit]): Unit = js.native
    
    /**
      * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    /* CompleteClass */
    override def addPanel(panel: typingsJapgolly.amcharts.stockPanelMod.default): Unit = js.native
    
    /**
      * Adds panel to the stock chart at a specified index.
      * Requires stockChart.validateNow() method to be called after this action.
      */
    /* CompleteClass */
    override def addPanelAt(panel: typingsJapgolly.amcharts.stockPanelMod.default, index: Double): Unit = js.native
    
    /**
      * Specifies if animation was already played.
      * Animation is only played once, when chart is rendered for the first time.
      * If you want the animation to be repeated, set this property to false.
      */
    /* CompleteClass */
    var animationPlayed: Boolean = js.native
    
    /**
      * Balloon object.
      */
    /* CompleteClass */
    var balloon: typingsJapgolly.amcharts.amBalloonMod.default = js.native
    
    /**
      * Settings for category axes.
      */
    /* CompleteClass */
    var categoryAxesSettings: typingsJapgolly.amcharts.categoryAxesSettingsMod.default = js.native
    
    /**
      * Indicates if the chart is created.
      */
    /* CompleteClass */
    var chartCreated: Boolean = js.native
    
    /**
      * Chart cursor settings.
      */
    /* CompleteClass */
    var chartCursorSettings: typingsJapgolly.amcharts.chartCursorSettingsMod.default = js.native
    
    /**
      * Chart scrollbar settings.
      */
    /* CompleteClass */
    var chartScrollbarSettings: typingsJapgolly.amcharts.chartScrollbarSettingsMod.default = js.native
    
    /**
      * Destroys chart, all timeouts and listeners.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Array of colors used by data sets if no color was set explicitly on data set itself.
      * [
      * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
      * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
      * ]
      */
    /* CompleteClass */
    var colors: js.Array[Any] = js.native
    
    /**
      * Array of data sets selected for comparing.
      */
    /* CompleteClass */
    var comparedDataSets: js.Array[Any] = js.native
    
    /**
      * DataSetSelector object.
      * You can add it if you have more than one data set and want users to be able to select/compare them.
      */
    /* CompleteClass */
    var dataSetSelector: typingsJapgolly.amcharts.dataSetSelectorMod.default = js.native
    
    /**
      * Array of DataSets.
      */
    /* CompleteClass */
    var dataSets: js.Array[Any] = js.native
    
    /**
      * Current end date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    /* CompleteClass */
    var endDate: js.Date = js.native
    
    /**
      * Defines on which day week starts. 0 - Sunday, 1 - Monday..
      * @default 1
      */
    /* CompleteClass */
    var firstDayOfWeek: Double = js.native
    
    /**
      * If set to true the scope of the data view will be set to the end after data update.
      */
    /* CompleteClass */
    var glueToTheEnd: Boolean = js.native
    
    /**
      * Hides event bullets.
      */
    /* CompleteClass */
    override def hideStockEvents(): Unit = js.native
    
    /**
      * Legend settings.
      */
    /* CompleteClass */
    var legendSettings: typingsJapgolly.amcharts.legendSettingsMod.default = js.native
    
    /**
      * Data set selected as main.
      */
    /* CompleteClass */
    var mainDataSet: typingsJapgolly.amcharts.dataSetMod.default = js.native
    
    /**
      * Array of StockPanels (charts).
      */
    /* CompleteClass */
    var panels: js.Array[Any] = js.native
    
    /**
      * Settings for stock panels.
      */
    /* CompleteClass */
    var panelsSettings: typingsJapgolly.amcharts.panelSettingsMod.default = js.native
    
    /**
      * Period selector object.
      * You can add it if you want user's to be able to enter date ranges or
      * zoom chart with predefined period buttons.
      */
    /* CompleteClass */
    var periodSelector: typingsJapgolly.amcharts.periodSelectorMod.default = js.native
    
    /**
      * Removes event listener from chart object.
      */
    /* CompleteClass */
    override def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: Any): Unit = js.native
    
    /**
      * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    /* CompleteClass */
    override def removePanel(panel: typingsJapgolly.amcharts.stockPanelMod.default): Unit = js.native
    
    /**
      * Scrollbar's chart object, get only.
      */
    /* CompleteClass */
    var scrollbarChart: typingsJapgolly.amcharts.amSerialChartMod.default = js.native
    
    /**
      * Shows event bullets.
      */
    /* CompleteClass */
    override def showStockEvents(): Unit = js.native
    
    /**
      * Current start date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    /* CompleteClass */
    var startDate: js.Date = js.native
    
    /**
      * Settings for stock events.
      */
    /* CompleteClass */
    var stockEventsSettings: Any = js.native
    
    /**
      * Method which should be called after data was changed.
      */
    /* CompleteClass */
    override def validateData(): Unit = js.native
    
    /**
      * Method which forces the stock chart to rebuild. Should be called after properties are changed.
      */
    /* CompleteClass */
    override def validateNow(): Unit = js.native
    
    /**
      * Settings for value axes.
      */
    /* CompleteClass */
    var valueAxesSettings: typingsJapgolly.amcharts.valueAxesSettingsMod.default = js.native
    
    /**
      * read-only. Indicates current version of a script.
      */
    /* CompleteClass */
    var version: String = js.native
    
    /**
      * Zooms chart to specified dates. startDate, endDate - Date objects.
      */
    /* CompleteClass */
    override def zoom(startDate: js.Date, endDate: js.Date): Unit = js.native
    
    /**
      * Zooms out the chart.
      */
    /* CompleteClass */
    override def zoomOut(): Unit = js.native
    
    /**
      * Specifies whether the chart should zoom-out when main data set is changed.
      */
    /* CompleteClass */
    var zoomOutOnDataSetChange: Boolean = js.native
  }
  
  trait AmStockChart extends StObject {
    
    /**
      * Adds event listener.
      * @param type - One of
      * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
      * "rollOverStockEvent", "zoomed".
      * @param handler - The event handler.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ Date, Unit]): Unit
    
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
      * Destroys chart, all timeouts and listeners.
      */
    def clear(): Unit
    
    /**
      * Array of colors used by data sets if no color was set explicitly on data set itself.
      * [
      * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
      * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
      * ]
      */
    var colors: js.Array[Any]
    
    /**
      * Array of data sets selected for comparing.
      */
    var comparedDataSets: js.Array[Any]
    
    /**
      * DataSetSelector object.
      * You can add it if you have more than one data set and want users to be able to select/compare them.
      */
    var dataSetSelector: typingsJapgolly.amcharts.dataSetSelectorMod.default
    
    /**
      * Array of DataSets.
      */
    var dataSets: js.Array[Any]
    
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
      * Hides event bullets.
      */
    def hideStockEvents(): Unit
    
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
    var panels: js.Array[Any]
    
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
      * Removes event listener from chart object.
      */
    def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: Any): Unit
    
    /**
      * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    def removePanel(panel: typingsJapgolly.amcharts.stockPanelMod.default): Unit
    
    /**
      * Scrollbar's chart object, get only.
      */
    var scrollbarChart: typingsJapgolly.amcharts.amSerialChartMod.default
    
    /**
      * Shows event bullets.
      */
    def showStockEvents(): Unit
    
    /**
      * Current start date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    var startDate: js.Date
    
    /**
      * Settings for stock events.
      */
    var stockEventsSettings: Any
    
    /**
      * Method which should be called after data was changed.
      */
    def validateData(): Unit
    
    /**
      * Method which forces the stock chart to rebuild. Should be called after properties are changed.
      */
    def validateNow(): Unit
    
    /**
      * Settings for value axes.
      */
    var valueAxesSettings: typingsJapgolly.amcharts.valueAxesSettingsMod.default
    
    /**
      * read-only. Indicates current version of a script.
      */
    var version: String
    
    /**
      * Zooms chart to specified dates. startDate, endDate - Date objects.
      */
    def zoom(startDate: js.Date, endDate: js.Date): Unit
    
    /**
      * Zooms out the chart.
      */
    def zoomOut(): Unit
    
    /**
      * Specifies whether the chart should zoom-out when main data set is changed.
      */
    var zoomOutOnDataSetChange: Boolean
  }
  object AmStockChart {
    
    inline def apply(
      addListener: (String, js.Function1[/* e */ Date, Unit]) => Callback,
      addPanel: typingsJapgolly.amcharts.stockPanelMod.default => Callback,
      addPanelAt: (typingsJapgolly.amcharts.stockPanelMod.default, Double) => Callback,
      animationPlayed: Boolean,
      balloon: typingsJapgolly.amcharts.amBalloonMod.default,
      categoryAxesSettings: typingsJapgolly.amcharts.categoryAxesSettingsMod.default,
      chartCreated: Boolean,
      chartCursorSettings: typingsJapgolly.amcharts.chartCursorSettingsMod.default,
      chartScrollbarSettings: typingsJapgolly.amcharts.chartScrollbarSettingsMod.default,
      clear: Callback,
      colors: js.Array[Any],
      comparedDataSets: js.Array[Any],
      dataSetSelector: typingsJapgolly.amcharts.dataSetSelectorMod.default,
      dataSets: js.Array[Any],
      endDate: js.Date,
      firstDayOfWeek: Double,
      glueToTheEnd: Boolean,
      hideStockEvents: Callback,
      legendSettings: typingsJapgolly.amcharts.legendSettingsMod.default,
      mainDataSet: typingsJapgolly.amcharts.dataSetMod.default,
      panels: js.Array[Any],
      panelsSettings: typingsJapgolly.amcharts.panelSettingsMod.default,
      periodSelector: typingsJapgolly.amcharts.periodSelectorMod.default,
      removeListener: (typingsJapgolly.amcharts.amChartMod.default, String, Any) => Callback,
      removePanel: typingsJapgolly.amcharts.stockPanelMod.default => Callback,
      scrollbarChart: typingsJapgolly.amcharts.amSerialChartMod.default,
      showStockEvents: Callback,
      startDate: js.Date,
      stockEventsSettings: Any,
      validateData: Callback,
      validateNow: Callback,
      valueAxesSettings: typingsJapgolly.amcharts.valueAxesSettingsMod.default,
      version: String,
      zoom: (js.Date, js.Date) => Callback,
      zoomOut: Callback,
      zoomOutOnDataSetChange: Boolean
    ): AmStockChart = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Date, Unit]) => (addListener(t0, t1)).runNow()), addPanel = js.Any.fromFunction1((t0: typingsJapgolly.amcharts.stockPanelMod.default) => addPanel(t0).runNow()), addPanelAt = js.Any.fromFunction2((t0: typingsJapgolly.amcharts.stockPanelMod.default, t1: Double) => (addPanelAt(t0, t1)).runNow()), animationPlayed = animationPlayed.asInstanceOf[js.Any], balloon = balloon.asInstanceOf[js.Any], categoryAxesSettings = categoryAxesSettings.asInstanceOf[js.Any], chartCreated = chartCreated.asInstanceOf[js.Any], chartCursorSettings = chartCursorSettings.asInstanceOf[js.Any], chartScrollbarSettings = chartScrollbarSettings.asInstanceOf[js.Any], clear = clear.toJsFn, colors = colors.asInstanceOf[js.Any], comparedDataSets = comparedDataSets.asInstanceOf[js.Any], dataSetSelector = dataSetSelector.asInstanceOf[js.Any], dataSets = dataSets.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], glueToTheEnd = glueToTheEnd.asInstanceOf[js.Any], hideStockEvents = hideStockEvents.toJsFn, legendSettings = legendSettings.asInstanceOf[js.Any], mainDataSet = mainDataSet.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], panelsSettings = panelsSettings.asInstanceOf[js.Any], periodSelector = periodSelector.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3((t0: typingsJapgolly.amcharts.amChartMod.default, t1: String, t2: Any) => (removeListener(t0, t1, t2)).runNow()), removePanel = js.Any.fromFunction1((t0: typingsJapgolly.amcharts.stockPanelMod.default) => removePanel(t0).runNow()), scrollbarChart = scrollbarChart.asInstanceOf[js.Any], showStockEvents = showStockEvents.toJsFn, startDate = startDate.asInstanceOf[js.Any], stockEventsSettings = stockEventsSettings.asInstanceOf[js.Any], validateData = validateData.toJsFn, validateNow = validateNow.toJsFn, valueAxesSettings = valueAxesSettings.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zoom = js.Any.fromFunction2((t0: js.Date, t1: js.Date) => (zoom(t0, t1)).runNow()), zoomOut = zoomOut.toJsFn, zoomOutOnDataSetChange = zoomOutOnDataSetChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmStockChart]
    }
    
    extension [Self <: AmStockChart](x: Self) {
      
      inline def setAddListener(value: (String, js.Function1[/* e */ Date, Unit]) => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Date, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setAddPanel(value: typingsJapgolly.amcharts.stockPanelMod.default => Callback): Self = StObject.set(x, "addPanel", js.Any.fromFunction1((t0: typingsJapgolly.amcharts.stockPanelMod.default) => value(t0).runNow()))
      
      inline def setAddPanelAt(value: (typingsJapgolly.amcharts.stockPanelMod.default, Double) => Callback): Self = StObject.set(x, "addPanelAt", js.Any.fromFunction2((t0: typingsJapgolly.amcharts.stockPanelMod.default, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setAnimationPlayed(value: Boolean): Self = StObject.set(x, "animationPlayed", value.asInstanceOf[js.Any])
      
      inline def setBalloon(value: typingsJapgolly.amcharts.amBalloonMod.default): Self = StObject.set(x, "balloon", value.asInstanceOf[js.Any])
      
      inline def setCategoryAxesSettings(value: typingsJapgolly.amcharts.categoryAxesSettingsMod.default): Self = StObject.set(x, "categoryAxesSettings", value.asInstanceOf[js.Any])
      
      inline def setChartCreated(value: Boolean): Self = StObject.set(x, "chartCreated", value.asInstanceOf[js.Any])
      
      inline def setChartCursorSettings(value: typingsJapgolly.amcharts.chartCursorSettingsMod.default): Self = StObject.set(x, "chartCursorSettings", value.asInstanceOf[js.Any])
      
      inline def setChartScrollbarSettings(value: typingsJapgolly.amcharts.chartScrollbarSettingsMod.default): Self = StObject.set(x, "chartScrollbarSettings", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setColors(value: js.Array[Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: Any*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setComparedDataSets(value: js.Array[Any]): Self = StObject.set(x, "comparedDataSets", value.asInstanceOf[js.Any])
      
      inline def setComparedDataSetsVarargs(value: Any*): Self = StObject.set(x, "comparedDataSets", js.Array(value*))
      
      inline def setDataSetSelector(value: typingsJapgolly.amcharts.dataSetSelectorMod.default): Self = StObject.set(x, "dataSetSelector", value.asInstanceOf[js.Any])
      
      inline def setDataSets(value: js.Array[Any]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
      
      inline def setDataSetsVarargs(value: Any*): Self = StObject.set(x, "dataSets", js.Array(value*))
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setGlueToTheEnd(value: Boolean): Self = StObject.set(x, "glueToTheEnd", value.asInstanceOf[js.Any])
      
      inline def setHideStockEvents(value: Callback): Self = StObject.set(x, "hideStockEvents", value.toJsFn)
      
      inline def setLegendSettings(value: typingsJapgolly.amcharts.legendSettingsMod.default): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      inline def setMainDataSet(value: typingsJapgolly.amcharts.dataSetMod.default): Self = StObject.set(x, "mainDataSet", value.asInstanceOf[js.Any])
      
      inline def setPanels(value: js.Array[Any]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsSettings(value: typingsJapgolly.amcharts.panelSettingsMod.default): Self = StObject.set(x, "panelsSettings", value.asInstanceOf[js.Any])
      
      inline def setPanelsVarargs(value: Any*): Self = StObject.set(x, "panels", js.Array(value*))
      
      inline def setPeriodSelector(value: typingsJapgolly.amcharts.periodSelectorMod.default): Self = StObject.set(x, "periodSelector", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: (typingsJapgolly.amcharts.amChartMod.default, String, Any) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction3((t0: typingsJapgolly.amcharts.amChartMod.default, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemovePanel(value: typingsJapgolly.amcharts.stockPanelMod.default => Callback): Self = StObject.set(x, "removePanel", js.Any.fromFunction1((t0: typingsJapgolly.amcharts.stockPanelMod.default) => value(t0).runNow()))
      
      inline def setScrollbarChart(value: typingsJapgolly.amcharts.amSerialChartMod.default): Self = StObject.set(x, "scrollbarChart", value.asInstanceOf[js.Any])
      
      inline def setShowStockEvents(value: Callback): Self = StObject.set(x, "showStockEvents", value.toJsFn)
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStockEventsSettings(value: Any): Self = StObject.set(x, "stockEventsSettings", value.asInstanceOf[js.Any])
      
      inline def setValidateData(value: Callback): Self = StObject.set(x, "validateData", value.toJsFn)
      
      inline def setValidateNow(value: Callback): Self = StObject.set(x, "validateNow", value.toJsFn)
      
      inline def setValueAxesSettings(value: typingsJapgolly.amcharts.valueAxesSettingsMod.default): Self = StObject.set(x, "valueAxesSettings", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: (js.Date, js.Date) => Callback): Self = StObject.set(x, "zoom", js.Any.fromFunction2((t0: js.Date, t1: js.Date) => (value(t0, t1)).runNow()))
      
      inline def setZoomOut(value: Callback): Self = StObject.set(x, "zoomOut", value.toJsFn)
      
      inline def setZoomOutOnDataSetChange(value: Boolean): Self = StObject.set(x, "zoomOutOnDataSetChange", value.asInstanceOf[js.Any])
    }
  }
}
