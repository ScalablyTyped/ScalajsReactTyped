package typingsJapgolly.plotlyJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.plotlyJs.anon.PartialEdits
import typingsJapgolly.plotlyJs.anon.Partialfilenamestringscal
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsInts.`0`
import typingsJapgolly.plotlyJs.plotlyJsInts.`1`
import typingsJapgolly.plotlyJs.plotlyJsInts.`2`
import typingsJapgolly.plotlyJs.plotlyJsStrings.autosize
import typingsJapgolly.plotlyJs.plotlyJsStrings.hover
import typingsJapgolly.plotlyJs.plotlyJsStrings.opaque
import typingsJapgolly.plotlyJs.plotlyJsStrings.reset
import typingsJapgolly.plotlyJs.plotlyJsStrings.resetPlussignautosize
import typingsJapgolly.plotlyJs.plotlyJsStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /** DO autosize once regardless of layout.autosize (use default width or height values otherwise) */
  var autosizable: Boolean
  
  /** display the mode bar (true, false, or 'hover') */
  var displayModeBar: hover | Boolean
  
  /** add the plotly logo on the end of the mode bar */
  var displaylogo: Boolean
  
  /** double click interaction (false, 'reset', 'autosize' or 'reset+autosize') */
  var doubleClick: resetPlussignautosize | reset | autosize | `false`
  
  /** sets the delay for registering a double-click in ms */
  var doubleClickDelay: Double
  
  /** we can edit titles, move annotations, etc */
  var editable: Boolean
  
  var edits: PartialEdits
  
  /** if we DO autosize, do we fill the container or the screen? */
  var fillFrame: Boolean
  
  /** if we DO autosize, set the frame margins in percents of plot size */
  var frameMargins: Double
  
  /** Set global transform to be applied to all traces with no specification needed */
  var globalTransforms: js.Array[Any]
  
  /** text appearing in the sendData link */
  var linkText: String
  
  /** Which localization should we use? Should be a string like 'en' or 'en-US' */
  var locale: String
  
  /**
    * Turn all console logging on or off (errors will be thrown)
    * This should ONLY be set via Plotly.setPlotConfig
    */
  var logging: Boolean | `0` | `1` | `2`
  
  /**
    * Mapbox access token (required to plot mapbox trace types)
    * If using an Mapbox Atlas server, set this option to '',
    * so that plotly.js won't attempt to authenticate to the public Mapbox server.
    */
  var mapboxAccessToken: String
  
  /**
    * fully custom mode bar buttons as nested array, where the outer
    * arrays represents button groups, and the inner arrays have
    * buttons config objects or names of default buttons
    * (see ./components/modebar/buttons.js for more info)
    */
  var modeBarButtons: (js.Array[js.Array[ModeBarDefaultButtons | ModeBarButton]]) | `false`
  
  /** add mode bar button using config objects (see ./components/modebar/buttons.js for list of arguments) */
  var modeBarButtonsToAdd: js.Array[ModeBarButton | ModeBarDefaultButtons]
  
  /** remove mode bar button by name (see ./components/modebar/buttons.js for the list of names) */
  var modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons]
  
  /** increase the pixel ratio for Gl plot images */
  var plotGlPixelRatio: Double
  
  /**
    * When set it determines base URL for the 'Edit in Chart Studio' `showEditInChartStudio`/`showSendToCloud` mode bar button and the showLink/sendData on-graph link.
    * To enable sending your data to Chart Studio Cloud, you need to set both `plotlyServerURL` to 'https://chart-studio.plotly.com' and also set `showSendToCloud` to true.
    * @default ''
    */
  var plotlyServerURL: String
  
  /** set the length of the undo/redo queue */
  var queueLength: Double
  
  /** Make the chart responsive to window size */
  var responsive: Boolean
  
  /** mousewheel or two-finger scroll zooms the plot */
  var scrollZoom: Boolean
  
  /** if we show a link, does it contain data or just link to a plotly file? */
  var sendData: Boolean
  
  /**
    * function to add the background color to a different container
    * or 'opaque' to ensure there's white behind it
    */
  var setBackground: (js.Function2[/* gd */ PlotlyHTMLElement, /* bgColor */ String, Unit]) | opaque | transparent
  
  /** enable axis pan/zoom drag handles */
  var showAxisDragHandles: Boolean
  
  /** enable direct range entry at the pan/zoom drag points (drag handles must be enabled above) */
  var showAxisRangeEntryBoxes: Boolean
  
  /**
    * Same as `showSendToCloud`, but use a pencil icon instead of a floppy-disk.
    * Note that if both `showSendToCloud` and `showEditInChartStudio` are turned, only `showEditInChartStudio` will be honored.
    * @default false
    */
  var showEditInChartStudio: Boolean
  
  /** link to open this plot in plotly */
  var showLink: Boolean
  
  /**
    * Should we include a ModeBar button, labeled "Edit in Chart Studio",
    * that sends this chart to chart-studio.plotly.com (formerly plot.ly)
    * or another plotly server as specified by `plotlyServerURL` for editing, export, etc?
    * Prior to version 1.43.0 this button was included by default, now it is opt-in using this flag.
    * Note that this button can (depending on `plotlyServerURL` being set) send your data to an external server.
    * However that server does not persist your data until you arrive at the Chart Studio and explicitly click "Save".
    * @default false
    */
  var showSendToCloud: Boolean
  
  /** false or function adding source(s) to linkText <text> */
  var showSources: Boolean
  
  /** new users see some hints about interactivity */
  var showTips: Boolean
  
  /** no interactivity, for export or image generation */
  var staticPlot: Boolean
  
  /** override the defaults for the toImageButton */
  var toImageButtonOptions: Partialfilenamestringscal
  
  /** URL to topojson files used in geo charts */
  var topojsonURL: String
  
  /**
    * Determines whether math should be typeset or not,
    * when MathJax (either v2 or v3) is present on the page.
    */
  var typesetMath: Boolean
  
  /** Watermark the images with the company's logo */
  var watermark: Boolean
}
object Config {
  
  inline def apply(
    autosizable: Boolean,
    displayModeBar: hover | Boolean,
    displaylogo: Boolean,
    doubleClick: resetPlussignautosize | reset | autosize | `false`,
    doubleClickDelay: Double,
    editable: Boolean,
    edits: PartialEdits,
    fillFrame: Boolean,
    frameMargins: Double,
    globalTransforms: js.Array[Any],
    linkText: String,
    locale: String,
    logging: Boolean | `0` | `1` | `2`,
    mapboxAccessToken: String,
    modeBarButtons: (js.Array[js.Array[ModeBarDefaultButtons | ModeBarButton]]) | `false`,
    modeBarButtonsToAdd: js.Array[ModeBarButton | ModeBarDefaultButtons],
    modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons],
    plotGlPixelRatio: Double,
    plotlyServerURL: String,
    queueLength: Double,
    responsive: Boolean,
    scrollZoom: Boolean,
    sendData: Boolean,
    setBackground: (js.Function2[/* gd */ PlotlyHTMLElement, /* bgColor */ String, Unit]) | opaque | transparent,
    showAxisDragHandles: Boolean,
    showAxisRangeEntryBoxes: Boolean,
    showEditInChartStudio: Boolean,
    showLink: Boolean,
    showSendToCloud: Boolean,
    showSources: Boolean,
    showTips: Boolean,
    staticPlot: Boolean,
    toImageButtonOptions: Partialfilenamestringscal,
    topojsonURL: String,
    typesetMath: Boolean,
    watermark: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(autosizable = autosizable.asInstanceOf[js.Any], displayModeBar = displayModeBar.asInstanceOf[js.Any], displaylogo = displaylogo.asInstanceOf[js.Any], doubleClick = doubleClick.asInstanceOf[js.Any], doubleClickDelay = doubleClickDelay.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], fillFrame = fillFrame.asInstanceOf[js.Any], frameMargins = frameMargins.asInstanceOf[js.Any], globalTransforms = globalTransforms.asInstanceOf[js.Any], linkText = linkText.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], mapboxAccessToken = mapboxAccessToken.asInstanceOf[js.Any], modeBarButtons = modeBarButtons.asInstanceOf[js.Any], modeBarButtonsToAdd = modeBarButtonsToAdd.asInstanceOf[js.Any], modeBarButtonsToRemove = modeBarButtonsToRemove.asInstanceOf[js.Any], plotGlPixelRatio = plotGlPixelRatio.asInstanceOf[js.Any], plotlyServerURL = plotlyServerURL.asInstanceOf[js.Any], queueLength = queueLength.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], scrollZoom = scrollZoom.asInstanceOf[js.Any], sendData = sendData.asInstanceOf[js.Any], setBackground = setBackground.asInstanceOf[js.Any], showAxisDragHandles = showAxisDragHandles.asInstanceOf[js.Any], showAxisRangeEntryBoxes = showAxisRangeEntryBoxes.asInstanceOf[js.Any], showEditInChartStudio = showEditInChartStudio.asInstanceOf[js.Any], showLink = showLink.asInstanceOf[js.Any], showSendToCloud = showSendToCloud.asInstanceOf[js.Any], showSources = showSources.asInstanceOf[js.Any], showTips = showTips.asInstanceOf[js.Any], staticPlot = staticPlot.asInstanceOf[js.Any], toImageButtonOptions = toImageButtonOptions.asInstanceOf[js.Any], topojsonURL = topojsonURL.asInstanceOf[js.Any], typesetMath = typesetMath.asInstanceOf[js.Any], watermark = watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setAutosizable(value: Boolean): Self = StObject.set(x, "autosizable", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeBar(value: hover | Boolean): Self = StObject.set(x, "displayModeBar", value.asInstanceOf[js.Any])
    
    inline def setDisplaylogo(value: Boolean): Self = StObject.set(x, "displaylogo", value.asInstanceOf[js.Any])
    
    inline def setDoubleClick(value: resetPlussignautosize | reset | autosize | `false`): Self = StObject.set(x, "doubleClick", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickDelay(value: Double): Self = StObject.set(x, "doubleClickDelay", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEdits(value: PartialEdits): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setFillFrame(value: Boolean): Self = StObject.set(x, "fillFrame", value.asInstanceOf[js.Any])
    
    inline def setFrameMargins(value: Double): Self = StObject.set(x, "frameMargins", value.asInstanceOf[js.Any])
    
    inline def setGlobalTransforms(value: js.Array[Any]): Self = StObject.set(x, "globalTransforms", value.asInstanceOf[js.Any])
    
    inline def setGlobalTransformsVarargs(value: Any*): Self = StObject.set(x, "globalTransforms", js.Array(value*))
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLogging(value: Boolean | `0` | `1` | `2`): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setMapboxAccessToken(value: String): Self = StObject.set(x, "mapboxAccessToken", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtons(value: (js.Array[js.Array[ModeBarDefaultButtons | ModeBarButton]]) | `false`): Self = StObject.set(x, "modeBarButtons", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtonsToAdd(value: js.Array[ModeBarButton | ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToAdd", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtonsToAddVarargs(value: (ModeBarButton | ModeBarDefaultButtons)*): Self = StObject.set(x, "modeBarButtonsToAdd", js.Array(value*))
    
    inline def setModeBarButtonsToRemove(value: js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "modeBarButtonsToRemove", value.asInstanceOf[js.Any])
    
    inline def setModeBarButtonsToRemoveVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "modeBarButtonsToRemove", js.Array(value*))
    
    inline def setModeBarButtonsVarargs(value: (js.Array[ModeBarDefaultButtons | ModeBarButton])*): Self = StObject.set(x, "modeBarButtons", js.Array(value*))
    
    inline def setPlotGlPixelRatio(value: Double): Self = StObject.set(x, "plotGlPixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPlotlyServerURL(value: String): Self = StObject.set(x, "plotlyServerURL", value.asInstanceOf[js.Any])
    
    inline def setQueueLength(value: Double): Self = StObject.set(x, "queueLength", value.asInstanceOf[js.Any])
    
    inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setSendData(value: Boolean): Self = StObject.set(x, "sendData", value.asInstanceOf[js.Any])
    
    inline def setSetBackground(
      value: (js.Function2[/* gd */ PlotlyHTMLElement, /* bgColor */ String, Unit]) | opaque | transparent
    ): Self = StObject.set(x, "setBackground", value.asInstanceOf[js.Any])
    
    inline def setSetBackgroundFunction2(value: (/* gd */ PlotlyHTMLElement, /* bgColor */ String) => Callback): Self = StObject.set(x, "setBackground", js.Any.fromFunction2((t0: /* gd */ PlotlyHTMLElement, t1: /* bgColor */ String) => (value(t0, t1)).runNow()))
    
    inline def setShowAxisDragHandles(value: Boolean): Self = StObject.set(x, "showAxisDragHandles", value.asInstanceOf[js.Any])
    
    inline def setShowAxisRangeEntryBoxes(value: Boolean): Self = StObject.set(x, "showAxisRangeEntryBoxes", value.asInstanceOf[js.Any])
    
    inline def setShowEditInChartStudio(value: Boolean): Self = StObject.set(x, "showEditInChartStudio", value.asInstanceOf[js.Any])
    
    inline def setShowLink(value: Boolean): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
    
    inline def setShowSendToCloud(value: Boolean): Self = StObject.set(x, "showSendToCloud", value.asInstanceOf[js.Any])
    
    inline def setShowSources(value: Boolean): Self = StObject.set(x, "showSources", value.asInstanceOf[js.Any])
    
    inline def setShowTips(value: Boolean): Self = StObject.set(x, "showTips", value.asInstanceOf[js.Any])
    
    inline def setStaticPlot(value: Boolean): Self = StObject.set(x, "staticPlot", value.asInstanceOf[js.Any])
    
    inline def setToImageButtonOptions(value: Partialfilenamestringscal): Self = StObject.set(x, "toImageButtonOptions", value.asInstanceOf[js.Any])
    
    inline def setTopojsonURL(value: String): Self = StObject.set(x, "topojsonURL", value.asInstanceOf[js.Any])
    
    inline def setTypesetMath(value: Boolean): Self = StObject.set(x, "typesetMath", value.asInstanceOf[js.Any])
    
    inline def setWatermark(value: Boolean): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
  }
}
