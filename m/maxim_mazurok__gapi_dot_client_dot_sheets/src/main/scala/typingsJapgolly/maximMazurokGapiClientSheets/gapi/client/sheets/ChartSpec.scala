package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSpec extends StObject {
  
  /** The alternative text that describes the chart. This is often used for accessibility. */
  var altText: js.UndefOr[String] = js.undefined
  
  /** The background color of the entire chart. Not applicable to Org charts. Deprecated: Use background_color_style. */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  /** The background color of the entire chart. Not applicable to Org charts. If background_color is also set, this field takes precedence. */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** A basic chart specification, can be one of many kinds of charts. See BasicChartType for the list of all charts this supports. */
  var basicChart: js.UndefOr[BasicChartSpec] = js.undefined
  
  /** A bubble chart specification. */
  var bubbleChart: js.UndefOr[BubbleChartSpec] = js.undefined
  
  /** A candlestick chart specification. */
  var candlestickChart: js.UndefOr[CandlestickChartSpec] = js.undefined
  
  /** If present, the field contains data source chart specific properties. */
  var dataSourceChartProperties: js.UndefOr[DataSourceChartProperties] = js.undefined
  
  /** The filters applied to the source data of the chart. Only supported for data source charts. */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.undefined
  
  /** The name of the font to use by default for all chart text (e.g. title, axis labels, legend). If a font is specified for a specific part of the chart it will override this font name. */
  var fontName: js.UndefOr[String] = js.undefined
  
  /** Determines how the charts will use hidden rows or columns. */
  var hiddenDimensionStrategy: js.UndefOr[String] = js.undefined
  
  /** A histogram chart specification. */
  var histogramChart: js.UndefOr[HistogramChartSpec] = js.undefined
  
  /** True to make a chart fill the entire space in which it's rendered with minimum padding. False to use the default padding. (Not applicable to Geo and Org charts.) */
  var maximized: js.UndefOr[Boolean] = js.undefined
  
  /** An org chart specification. */
  var orgChart: js.UndefOr[OrgChartSpec] = js.undefined
  
  /** A pie chart specification. */
  var pieChart: js.UndefOr[PieChartSpec] = js.undefined
  
  /** A scorecard chart specification. */
  var scorecardChart: js.UndefOr[ScorecardChartSpec] = js.undefined
  
  /** The order to sort the chart data by. Only a single sort spec is supported. Only supported for data source charts. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
  
  /** The subtitle of the chart. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** The subtitle text format. Strikethrough, underline, and link are not supported. */
  var subtitleTextFormat: js.UndefOr[TextFormat] = js.undefined
  
  /** The subtitle text position. This field is optional. */
  var subtitleTextPosition: js.UndefOr[TextPosition] = js.undefined
  
  /** The title of the chart. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The title text format. Strikethrough, underline, and link are not supported. */
  var titleTextFormat: js.UndefOr[TextFormat] = js.undefined
  
  /** The title text position. This field is optional. */
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
  
  /** A treemap chart specification. */
  var treemapChart: js.UndefOr[TreemapChartSpec] = js.undefined
  
  /** A waterfall chart specification. */
  var waterfallChart: js.UndefOr[WaterfallChartSpec] = js.undefined
}
object ChartSpec {
  
  inline def apply(): ChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSpec]
  }
  
  extension [Self <: ChartSpec](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyle(value: ColorStyle): Self = StObject.set(x, "backgroundColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorStyleUndefined: Self = StObject.set(x, "backgroundColorStyle", js.undefined)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBasicChart(value: BasicChartSpec): Self = StObject.set(x, "basicChart", value.asInstanceOf[js.Any])
    
    inline def setBasicChartUndefined: Self = StObject.set(x, "basicChart", js.undefined)
    
    inline def setBubbleChart(value: BubbleChartSpec): Self = StObject.set(x, "bubbleChart", value.asInstanceOf[js.Any])
    
    inline def setBubbleChartUndefined: Self = StObject.set(x, "bubbleChart", js.undefined)
    
    inline def setCandlestickChart(value: CandlestickChartSpec): Self = StObject.set(x, "candlestickChart", value.asInstanceOf[js.Any])
    
    inline def setCandlestickChartUndefined: Self = StObject.set(x, "candlestickChart", js.undefined)
    
    inline def setDataSourceChartProperties(value: DataSourceChartProperties): Self = StObject.set(x, "dataSourceChartProperties", value.asInstanceOf[js.Any])
    
    inline def setDataSourceChartPropertiesUndefined: Self = StObject.set(x, "dataSourceChartProperties", js.undefined)
    
    inline def setFilterSpecs(value: js.Array[FilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    inline def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    inline def setFilterSpecsVarargs(value: FilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value*))
    
    inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
    
    inline def setHiddenDimensionStrategy(value: String): Self = StObject.set(x, "hiddenDimensionStrategy", value.asInstanceOf[js.Any])
    
    inline def setHiddenDimensionStrategyUndefined: Self = StObject.set(x, "hiddenDimensionStrategy", js.undefined)
    
    inline def setHistogramChart(value: HistogramChartSpec): Self = StObject.set(x, "histogramChart", value.asInstanceOf[js.Any])
    
    inline def setHistogramChartUndefined: Self = StObject.set(x, "histogramChart", js.undefined)
    
    inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
    
    inline def setOrgChart(value: OrgChartSpec): Self = StObject.set(x, "orgChart", value.asInstanceOf[js.Any])
    
    inline def setOrgChartUndefined: Self = StObject.set(x, "orgChart", js.undefined)
    
    inline def setPieChart(value: PieChartSpec): Self = StObject.set(x, "pieChart", value.asInstanceOf[js.Any])
    
    inline def setPieChartUndefined: Self = StObject.set(x, "pieChart", js.undefined)
    
    inline def setScorecardChart(value: ScorecardChartSpec): Self = StObject.set(x, "scorecardChart", value.asInstanceOf[js.Any])
    
    inline def setScorecardChartUndefined: Self = StObject.set(x, "scorecardChart", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTextFormat(value: TextFormat): Self = StObject.set(x, "subtitleTextFormat", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTextFormatUndefined: Self = StObject.set(x, "subtitleTextFormat", js.undefined)
    
    inline def setSubtitleTextPosition(value: TextPosition): Self = StObject.set(x, "subtitleTextPosition", value.asInstanceOf[js.Any])
    
    inline def setSubtitleTextPositionUndefined: Self = StObject.set(x, "subtitleTextPosition", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleTextFormat(value: TextFormat): Self = StObject.set(x, "titleTextFormat", value.asInstanceOf[js.Any])
    
    inline def setTitleTextFormatUndefined: Self = StObject.set(x, "titleTextFormat", js.undefined)
    
    inline def setTitleTextPosition(value: TextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
    
    inline def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTreemapChart(value: TreemapChartSpec): Self = StObject.set(x, "treemapChart", value.asInstanceOf[js.Any])
    
    inline def setTreemapChartUndefined: Self = StObject.set(x, "treemapChart", js.undefined)
    
    inline def setWaterfallChart(value: WaterfallChartSpec): Self = StObject.set(x, "waterfallChart", value.asInstanceOf[js.Any])
    
    inline def setWaterfallChartUndefined: Self = StObject.set(x, "waterfallChart", js.undefined)
  }
}
