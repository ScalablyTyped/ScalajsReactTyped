package typingsJapgolly.timelinejs3

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.timelinejs3.anon.Color
import typingsJapgolly.timelinejs3.timelinejs3Strings.back_to_start
import typingsJapgolly.timelinejs3.timelinejs3Strings.bottom
import typingsJapgolly.timelinejs3.timelinejs3Strings.cosmological
import typingsJapgolly.timelinejs3.timelinejs3Strings.human
import typingsJapgolly.timelinejs3.timelinejs3Strings.nav_next
import typingsJapgolly.timelinejs3.timelinejs3Strings.nav_previous
import typingsJapgolly.timelinejs3.timelinejs3Strings.top
import typingsJapgolly.timelinejs3.timelinejs3Strings.zoom_in
import typingsJapgolly.timelinejs3.timelinejs3Strings.zoom_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TL {
  
  @js.native
  trait ITimeline
    extends StObject
       with ITimelineEvents
       with Instantiable2[
          /* containerId */ String, 
          (/* data */ ITimelineConfig) | (/* data */ String), 
          ITimeline
        ]
       with Instantiable3[
          /* containerId */ String, 
          (/* data */ ITimelineConfig) | (/* data */ String), 
          /* options */ ITimelineOptions, 
          ITimeline
        ] {
    
    def _getSlideIndex(id: String): Double = js.native
    def _getSlideIndex(id: Double): Double = js.native
    
    def add(event: ITimelineSlideData): Unit = js.native
    
    var current_id: String = js.native
    
    def getCurrentSlide(): ITimelineSlide = js.native
    
    def getData(n: Double): ITimelineSlideData = js.native
    
    def getDataById(id: String): ITimelineSlideData = js.native
    def getDataById(id: Double): ITimelineSlideData = js.native
    
    def getSlide(n: Double): ITimelineSlide = js.native
    
    def getSlideById(id: String): ITimelineSlide = js.native
    def getSlideById(id: Double): ITimelineSlide = js.native
    
    def goTo(n: Double): Unit = js.native
    
    def goToEnd(): Unit = js.native
    
    def goToId(id: String): Unit = js.native
    def goToId(id: Double): Unit = js.native
    
    def goToNext(): Unit = js.native
    
    def goToPrev(): Unit = js.native
    
    def goToStart(): Unit = js.native
    
    def remove(n: Double): Unit = js.native
    
    def removeId(id: String): Unit = js.native
    def removeId(id: Double): Unit = js.native
    
    def setConfig(config: ITimelineConfig): Unit = js.native
    
    def setZoom(level: Double): Unit = js.native
    
    def showMessage(msg: String): Unit = js.native
    
    def updateDisplay(): Unit = js.native
    
    def zoomIn(): Unit = js.native
    
    def zoomOut(): Unit = js.native
  }
  
  trait ITimelineConfig extends StObject {
    
    var eras: js.UndefOr[js.Array[ITimelineEra]] = js.undefined
    
    var events: js.Array[ITimelineSlideData]
    
    /*
      * Either human or cosmological. If no scale is specified, the default is human. The cosmological scale is
      * required to handle dates in the very distant past or future. (Before Tuesday, April 20th, 271,821 BCE
      * after Saturday, September 13 275,760 CE) For the cosmological scale, only the year is considered, but it's
      * OK to have a cosmological timeline with years between 271,821 BCE and 275,760 CE.
      */
    var scale: js.UndefOr[human | cosmological] = js.undefined
    
    var title: js.UndefOr[ITimelineSlideData] = js.undefined
  }
  object ITimelineConfig {
    
    inline def apply(events: js.Array[ITimelineSlideData]): ITimelineConfig = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineConfig]
    }
    
    extension [Self <: ITimelineConfig](x: Self) {
      
      inline def setEras(value: js.Array[ITimelineEra]): Self = StObject.set(x, "eras", value.asInstanceOf[js.Any])
      
      inline def setErasUndefined: Self = StObject.set(x, "eras", js.undefined)
      
      inline def setErasVarargs(value: ITimelineEra*): Self = StObject.set(x, "eras", js.Array(value*))
      
      inline def setEvents(value: js.Array[ITimelineSlideData]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: ITimelineSlideData*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setScale(value: human | cosmological): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTitle(value: ITimelineSlideData): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ITimelineDate extends StObject {
    
    var day: js.UndefOr[Double] = js.undefined
    
    /*
      * A string for presenting the date. Useful if Timeline's date formatting doesn't fit your needs.
      */
    var display_date: js.UndefOr[String] = js.undefined
    
    /*
      * 0-23
      */
    var hour: js.UndefOr[Double] = js.undefined
    
    var millisecond: js.UndefOr[Double] = js.undefined
    
    /*
      * 0-59
      */
    var minute: js.UndefOr[Double] = js.undefined
    
    /*
      * 1-12
      */
    var month: js.UndefOr[Double] = js.undefined
    
    /*
      * 0-59
      */
    var second: js.UndefOr[Double] = js.undefined
    
    /*
      * BCE years should be negative numbers.
      */
    var year: Double
  }
  object ITimelineDate {
    
    inline def apply(year: Double): ITimelineDate = {
      val __obj = js.Dynamic.literal(year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineDate]
    }
    
    extension [Self <: ITimelineDate](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setDisplay_date(value: String): Self = StObject.set(x, "display_date", value.asInstanceOf[js.Any])
      
      inline def setDisplay_dateUndefined: Self = StObject.set(x, "display_date", js.undefined)
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimelineEra extends StObject {
    
    var end_date: ITimelineDate
    
    var start_date: ITimelineDate
    
    /*
      * Not required, but recommended.
      */
    var text: js.UndefOr[ITimelineText] = js.undefined
  }
  object ITimelineEra {
    
    inline def apply(end_date: ITimelineDate, start_date: ITimelineDate): ITimelineEra = {
      val __obj = js.Dynamic.literal(end_date = end_date.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineEra]
    }
    
    extension [Self <: ITimelineEra](x: Self) {
      
      inline def setEnd_date(value: ITimelineDate): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
      
      inline def setStart_date(value: ITimelineDate): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      inline def setText(value: ITimelineText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ITimelineEvents extends StObject {
    
    def addEventListener(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def addEventListener(`type`: String, fn: js.Function0[Unit], context: Any): ITimelineEvents = js.native
    
    def fire(`type`: String): ITimelineEvents = js.native
    def fire(`type`: String, data: Any): ITimelineEvents = js.native
    
    def fireEvent(`type`: String): ITimelineEvents = js.native
    def fireEvent(`type`: String, data: Any): ITimelineEvents = js.native
    
    def hasEventListeners(`type`: String): Boolean = js.native
    
    def off(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def off(`type`: String, fn: js.Function0[Unit], context: Any): ITimelineEvents = js.native
    
    def on(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def on(`type`: String, fn: js.Function0[Unit], context: Any): ITimelineEvents = js.native
    
    def removeEventListener(`type`: String, fn: js.Function0[Unit]): ITimelineEvents = js.native
    def removeEventListener(`type`: String, fn: js.Function0[Unit], context: Any): ITimelineEvents = js.native
  }
  
  trait ITimelineMedia extends StObject {
    
    /*
      * HTML markup is OK.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /*
      * HTML markup is OK.
      */
    var credit: js.UndefOr[String] = js.undefined
    
    /*
      * A URL for an image to use in the timenav marker for this event. If omitted, Timeline will use an icon based
      * on the type of media. Not relevant for title slides, because they do not have a marker.
      */
    var thumbnail: js.UndefOr[String] = js.undefined
    
    /*
      * In most cases, a URL (see https://timeline.knightlab.com/docs/media-types.html for complete details).
      */
    var url: String
  }
  object ITimelineMedia {
    
    inline def apply(url: String): ITimelineMedia = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineMedia]
    }
    
    extension [Self <: ITimelineMedia](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setCredit(value: String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimelineOptions extends StObject {
    
    /*
      * Default: 'tl-timeline
      * Removing the tl-timeline base class will disable all default stylesheets.
      */
    var base_class: js.UndefOr[String] = js.undefined
    
    /*
      * Default: false
      * If true, copious console logging will be enabled.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: white
      * RGB values to use for slide backgrounds. Specify as hex code, CSS named color, or a Javascript object with r, g, and b properties from 0-255.
      */
    var default_bg_color: js.UndefOr[String] = js.undefined
    
    /*
      * Default: true
      */
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: 1000
      * Animation duration (in milliseconds).
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: TL.Ease.easeInOutQuint
      */
    var ease: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /*
      * Default: null
      * Google Analytics ID.
      */
    var ga_property_id: js.UndefOr[Any] = js.undefined
    
    /*
      * Default: false
      * If set to true, TimelineJS will update the browser URL each time a slide advances, so that people can link directly to specific slides.
      */
    var hash_bookmark: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: this._el.container.offsetHeight
      * The height of the timeline.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /*
      * The position in the zoom_sequence series used to scale the Timeline when it is first created. Takes precedence over scale_factor.
      */
    var initial_zoom: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: false
      * If true, the class tl-timeline-embed is added to the outer Timeline container. Typically only used to support Timeline iframe embeds.
      */
    var is_embed: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: 'en'
      */
    var language: js.UndefOr[String] = js.undefined
    
    /*
      * Default: 30
      * The minimum marker height (in pixels).
      */
    var marker_height_min: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 5
      * Top and bottom padding (in pixels) for markers.
      */
    var marker_padding: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 100
      * The minimum marker witdh (in pixels).
      */
    var marker_width_min: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 0
      */
    var menubar_height: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 100
      * optimal distance (in pixels) between ticks on axis
      */
    var optimal_tick_width: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 2
      * How many screen widths wide the timeline should be at first presentation.
      */
    var scale_factor: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: ''
      * Can be used to help Timeline load related resources such as CSS themes and language files. Rarely needs to be set.
      */
    var script_path: js.UndefOr[String] = js.undefined
    
    /*
      * Default: '0%'
      */
    var slide_default_fade: js.UndefOr[String] = js.undefined
    
    /*
      * Default: 100
      * Padding (in pixels) on the left and right of each slide.
      */
    var slide_padding_lr: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: false
      * If true, loads timeline on last slide.
      */
    var start_at_end: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: 0
      * The first slide to display when the timeline is loaded.
      */
    var start_at_slide: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 150
      * The height in pixels of the timeline nav. Takes precedence over timenav_height_percentage.
      */
    var timenav_height: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 150
      * The minimum timeline nav height (in pixels).
      */
    var timenav_height_min: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 25
      * Specify the timeline nav height as a percentage of the screen instead of in pixels.
      */
    var timenav_height_percentage: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 40
      * Specify the timeline nav height as a percentage of a mobile device screen.
      */
    var timenav_mobile_height_percentage: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: 'bottom'
      * Display the timeline nav on the top or bottom.
      */
    var timenav_position: js.UndefOr[bottom | top] = js.undefined
    
    /*
      * Default: true
      */
    var trackResize: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: ['back_to_start','nav_next','nav_previous','zoom_in','zoom_out']
      */
    var track_events: js.UndefOr[js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]] = js.undefined
    
    /*
      * Default: false
      * Use declared suffix on dates earlier than 0.
      */
    var use_bc: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Default: this._el.container.offsetWidth
      * The width of the timeline.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /*
      * Default: [0.5, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
      * Array of values for TimeNav zoom levels. Each value is a scale_factor, which means that at any given level, the full timeline would require that many screens to display all events.
      */
    var zoom_sequence: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ITimelineOptions {
    
    inline def apply(): ITimelineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimelineOptions]
    }
    
    extension [Self <: ITimelineOptions](x: Self) {
      
      inline def setBase_class(value: String): Self = StObject.set(x, "base_class", value.asInstanceOf[js.Any])
      
      inline def setBase_classUndefined: Self = StObject.set(x, "base_class", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefault_bg_color(value: String): Self = StObject.set(x, "default_bg_color", value.asInstanceOf[js.Any])
      
      inline def setDefault_bg_colorUndefined: Self = StObject.set(x, "default_bg_color", js.undefined)
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEase(value: CallbackTo[Double]): Self = StObject.set(x, "ease", value.toJsFn)
      
      inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      inline def setGa_property_id(value: Any): Self = StObject.set(x, "ga_property_id", value.asInstanceOf[js.Any])
      
      inline def setGa_property_idUndefined: Self = StObject.set(x, "ga_property_id", js.undefined)
      
      inline def setHash_bookmark(value: Boolean): Self = StObject.set(x, "hash_bookmark", value.asInstanceOf[js.Any])
      
      inline def setHash_bookmarkUndefined: Self = StObject.set(x, "hash_bookmark", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitial_zoom(value: Double): Self = StObject.set(x, "initial_zoom", value.asInstanceOf[js.Any])
      
      inline def setInitial_zoomUndefined: Self = StObject.set(x, "initial_zoom", js.undefined)
      
      inline def setIs_embed(value: Boolean): Self = StObject.set(x, "is_embed", value.asInstanceOf[js.Any])
      
      inline def setIs_embedUndefined: Self = StObject.set(x, "is_embed", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setMarker_height_min(value: Double): Self = StObject.set(x, "marker_height_min", value.asInstanceOf[js.Any])
      
      inline def setMarker_height_minUndefined: Self = StObject.set(x, "marker_height_min", js.undefined)
      
      inline def setMarker_padding(value: Double): Self = StObject.set(x, "marker_padding", value.asInstanceOf[js.Any])
      
      inline def setMarker_paddingUndefined: Self = StObject.set(x, "marker_padding", js.undefined)
      
      inline def setMarker_width_min(value: Double): Self = StObject.set(x, "marker_width_min", value.asInstanceOf[js.Any])
      
      inline def setMarker_width_minUndefined: Self = StObject.set(x, "marker_width_min", js.undefined)
      
      inline def setMenubar_height(value: Double): Self = StObject.set(x, "menubar_height", value.asInstanceOf[js.Any])
      
      inline def setMenubar_heightUndefined: Self = StObject.set(x, "menubar_height", js.undefined)
      
      inline def setOptimal_tick_width(value: Double): Self = StObject.set(x, "optimal_tick_width", value.asInstanceOf[js.Any])
      
      inline def setOptimal_tick_widthUndefined: Self = StObject.set(x, "optimal_tick_width", js.undefined)
      
      inline def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      inline def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
      
      inline def setScript_path(value: String): Self = StObject.set(x, "script_path", value.asInstanceOf[js.Any])
      
      inline def setScript_pathUndefined: Self = StObject.set(x, "script_path", js.undefined)
      
      inline def setSlide_default_fade(value: String): Self = StObject.set(x, "slide_default_fade", value.asInstanceOf[js.Any])
      
      inline def setSlide_default_fadeUndefined: Self = StObject.set(x, "slide_default_fade", js.undefined)
      
      inline def setSlide_padding_lr(value: Double): Self = StObject.set(x, "slide_padding_lr", value.asInstanceOf[js.Any])
      
      inline def setSlide_padding_lrUndefined: Self = StObject.set(x, "slide_padding_lr", js.undefined)
      
      inline def setStart_at_end(value: Boolean): Self = StObject.set(x, "start_at_end", value.asInstanceOf[js.Any])
      
      inline def setStart_at_endUndefined: Self = StObject.set(x, "start_at_end", js.undefined)
      
      inline def setStart_at_slide(value: Double): Self = StObject.set(x, "start_at_slide", value.asInstanceOf[js.Any])
      
      inline def setStart_at_slideUndefined: Self = StObject.set(x, "start_at_slide", js.undefined)
      
      inline def setTimenav_height(value: Double): Self = StObject.set(x, "timenav_height", value.asInstanceOf[js.Any])
      
      inline def setTimenav_heightUndefined: Self = StObject.set(x, "timenav_height", js.undefined)
      
      inline def setTimenav_height_min(value: Double): Self = StObject.set(x, "timenav_height_min", value.asInstanceOf[js.Any])
      
      inline def setTimenav_height_minUndefined: Self = StObject.set(x, "timenav_height_min", js.undefined)
      
      inline def setTimenav_height_percentage(value: Double): Self = StObject.set(x, "timenav_height_percentage", value.asInstanceOf[js.Any])
      
      inline def setTimenav_height_percentageUndefined: Self = StObject.set(x, "timenav_height_percentage", js.undefined)
      
      inline def setTimenav_mobile_height_percentage(value: Double): Self = StObject.set(x, "timenav_mobile_height_percentage", value.asInstanceOf[js.Any])
      
      inline def setTimenav_mobile_height_percentageUndefined: Self = StObject.set(x, "timenav_mobile_height_percentage", js.undefined)
      
      inline def setTimenav_position(value: bottom | top): Self = StObject.set(x, "timenav_position", value.asInstanceOf[js.Any])
      
      inline def setTimenav_positionUndefined: Self = StObject.set(x, "timenav_position", js.undefined)
      
      inline def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
      
      inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
      
      inline def setTrack_events(value: js.Array[back_to_start | nav_next | nav_previous | zoom_in | zoom_out]): Self = StObject.set(x, "track_events", value.asInstanceOf[js.Any])
      
      inline def setTrack_eventsUndefined: Self = StObject.set(x, "track_events", js.undefined)
      
      inline def setTrack_eventsVarargs(value: (back_to_start | nav_next | nav_previous | zoom_in | zoom_out)*): Self = StObject.set(x, "track_events", js.Array(value*))
      
      inline def setUse_bc(value: Boolean): Self = StObject.set(x, "use_bc", value.asInstanceOf[js.Any])
      
      inline def setUse_bcUndefined: Self = StObject.set(x, "use_bc", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoom_sequence(value: js.Array[Double]): Self = StObject.set(x, "zoom_sequence", value.asInstanceOf[js.Any])
      
      inline def setZoom_sequenceUndefined: Self = StObject.set(x, "zoom_sequence", js.undefined)
      
      inline def setZoom_sequenceVarargs(value: Double*): Self = StObject.set(x, "zoom_sequence", js.Array(value*))
    }
  }
  
  trait ITimelineSlide extends StObject {
    
    var data: ITimelineSlideData
  }
  object ITimelineSlide {
    
    inline def apply(data: ITimelineSlideData): ITimelineSlide = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineSlide]
    }
    
    extension [Self <: ITimelineSlide](x: Self) {
      
      inline def setData(value: ITimelineSlideData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimelineSlideData extends StObject {
    
    /*
      * Defaults to true, which means that Timeline will scan text fields and automatically add <a> tags so that
      * links and email addresses are "clickable." If set to false, you may still manually apply the tags in the
      * appropriate fields when you want links. Autolinking applies to the text field in a text object and the
      * caption and credit fields in a media object.
      */
    var autolink: js.UndefOr[Boolean] = js.undefined
    
    /*
      * A Javascript object. The object can have these properties:
      * url: the fully-qualified URL pointing to an image which will be used as the background
      * color: a CSS color, in hexadecimal (e.g. #0f9bd1) or a valid CSS color keyword.
      */
    var background: js.UndefOr[Color] = js.undefined
    
    /*
      * A string which will be used when Timeline displays the date for this. If used, override's display_date
      * values set on the start or end date for this event, which is useful if you want to control how the two
      * dates relate to each other.
      */
    var display_date: js.UndefOr[String] = js.undefined
    
    var end_date: js.UndefOr[ITimelineDate] = js.undefined
    
    /*
      * If present, Timeline will organize events with the same value for group to be in the same row or adjacent
      * rows, separate from events in other groups. The common value for the group will be shown as a label at the
      * left edge of the navigation.
      */
    var group: js.UndefOr[String] = js.undefined
    
    var media: js.UndefOr[ITimelineMedia] = js.undefined
    
    /*
      * Required for events, but not for `title` slides.
      */
    var start_date: js.UndefOr[ITimelineDate] = js.undefined
    
    /*
      * Not required, but recommended.
      */
    var text: js.UndefOr[ITimelineText] = js.undefined
    
    /*
      * A string value which is unique among all slides in your timeline. If not specified, TimelineJS will
      * construct an ID based on the headline, but if you later edit your headline, the ID will change. Unique IDs
      * are used when the hash_bookmark option is used, and can also be used with the timeline.goToId() method to
      * programmatically move the timeline to a specific slide.
      */
    var unique_id: js.UndefOr[String] = js.undefined
  }
  object ITimelineSlideData {
    
    inline def apply(): ITimelineSlideData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimelineSlideData]
    }
    
    extension [Self <: ITimelineSlideData](x: Self) {
      
      inline def setAutolink(value: Boolean): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
      
      inline def setAutolinkUndefined: Self = StObject.set(x, "autolink", js.undefined)
      
      inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDisplay_date(value: String): Self = StObject.set(x, "display_date", value.asInstanceOf[js.Any])
      
      inline def setDisplay_dateUndefined: Self = StObject.set(x, "display_date", js.undefined)
      
      inline def setEnd_date(value: ITimelineDate): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
      
      inline def setEnd_dateUndefined: Self = StObject.set(x, "end_date", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setMedia(value: ITimelineMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setStart_date(value: ITimelineDate): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
      
      inline def setStart_dateUndefined: Self = StObject.set(x, "start_date", js.undefined)
      
      inline def setText(value: ITimelineText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUnique_id(value: String): Self = StObject.set(x, "unique_id", value.asInstanceOf[js.Any])
      
      inline def setUnique_idUndefined: Self = StObject.set(x, "unique_id", js.undefined)
    }
  }
  
  trait ITimelineText extends StObject {
    
    /*
      * HTML markup is OK. Blank is also OK.
      */
    var headline: js.UndefOr[String] = js.undefined
    
    /*
      * HTML markup is OK. Blank is also OK. Not used for era objects.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ITimelineText {
    
    inline def apply(): ITimelineText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITimelineText]
    }
    
    extension [Self <: ITimelineText](x: Self) {
      
      inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
