package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.anon.PartialAnnotationsArrowcolor
import typingsJapgolly.plotlyJs.anon.PartialAxisCalendar
import typingsJapgolly.plotlyJs.anon.PartialFont
import typingsJapgolly.plotlyJs.anon.PartialHoverLabel
import typingsJapgolly.plotlyJs.anon.PartialImage
import typingsJapgolly.plotlyJs.anon.PartialLayoutAxisAngle
import typingsJapgolly.plotlyJs.anon.PartialLegend
import typingsJapgolly.plotlyJs.anon.PartialMapboxAccesstoken
import typingsJapgolly.plotlyJs.anon.PartialMargin
import typingsJapgolly.plotlyJs.anon.PartialModeBar
import typingsJapgolly.plotlyJs.anon.PartialPolarLayoutAngularaxis
import typingsJapgolly.plotlyJs.anon.PartialSceneAnnotations
import typingsJapgolly.plotlyJs.anon.PartialShape
import typingsJapgolly.plotlyJs.anon.PartialSliderActive
import typingsJapgolly.plotlyJs.anon.Partialrowsnumberroworder
import typingsJapgolly.plotlyJs.anon.PartialtextstringfontPart
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsStrings._empty
import typingsJapgolly.plotlyJs.plotlyJsStrings.`x unified`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`y unified`
import typingsJapgolly.plotlyJs.plotlyJsStrings.any
import typingsJapgolly.plotlyJs.plotlyJsStrings.closest
import typingsJapgolly.plotlyJs.plotlyJsStrings.d
import typingsJapgolly.plotlyJs.plotlyJsStrings.event
import typingsJapgolly.plotlyJs.plotlyJsStrings.eventPlussignselect
import typingsJapgolly.plotlyJs.plotlyJsStrings.fraction
import typingsJapgolly.plotlyJs.plotlyJsStrings.group
import typingsJapgolly.plotlyJs.plotlyJsStrings.h
import typingsJapgolly.plotlyJs.plotlyJsStrings.lasso
import typingsJapgolly.plotlyJs.plotlyJsStrings.none
import typingsJapgolly.plotlyJs.plotlyJsStrings.orbit
import typingsJapgolly.plotlyJs.plotlyJsStrings.overlay
import typingsJapgolly.plotlyJs.plotlyJsStrings.pan
import typingsJapgolly.plotlyJs.plotlyJsStrings.percent
import typingsJapgolly.plotlyJs.plotlyJsStrings.relative
import typingsJapgolly.plotlyJs.plotlyJsStrings.select
import typingsJapgolly.plotlyJs.plotlyJsStrings.stack
import typingsJapgolly.plotlyJs.plotlyJsStrings.turntable
import typingsJapgolly.plotlyJs.plotlyJsStrings.v
import typingsJapgolly.plotlyJs.plotlyJsStrings.x
import typingsJapgolly.plotlyJs.plotlyJsStrings.y
import typingsJapgolly.plotlyJs.plotlyJsStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  var annotations: js.Array[PartialAnnotationsArrowcolor]
  
  var autosize: Boolean
  
  var bargap: Double
  
  var bargroupgap: Double
  
  var barmode: stack | group | overlay | relative
  
  var barnorm: _empty | fraction | percent
  
  var boxmode: group | overlay
  
  var calendar: Calendar
  
  var clickmode: event | select | eventPlussignselect | none
  
  var colorway: js.Array[String]
  
  var datarevision: Double | String
  
  // TODO
  var dragmode: zoom | pan | select | lasso | orbit | turntable | `false`
  
  var editrevision: Double | String
  
  var font: PartialFont
  
  var grid: Partialrowsnumberroworder
  
  var height: Double
  
  var hiddenlabels: js.Array[String]
  
  var hidesources: Boolean
  
  var hoverdistance: Double
  
  var hoverlabel: PartialHoverLabel
  
  var hovermode: closest | x | y | (`x unified`) | (`y unified`) | `false`
  
  var images: js.Array[PartialImage]
  
  var legend: PartialLegend
  
  // TODO
  var mapbox: PartialMapboxAccesstoken
  
  var margin: PartialMargin
  
  var modebar: PartialModeBar
  
  var orientation: Double
  
  var paper_bgcolor: Color
  
  var plot_bgcolor: Color
  
  var polar: PartialPolarLayoutAngularaxis
  
  var polar2: PartialPolarLayoutAngularaxis
  
  var polar3: PartialPolarLayoutAngularaxis
  
  var polar4: PartialPolarLayoutAngularaxis
  
  var polar5: PartialPolarLayoutAngularaxis
  
  var polar6: PartialPolarLayoutAngularaxis
  
  var polar7: PartialPolarLayoutAngularaxis
  
  var polar8: PartialPolarLayoutAngularaxis
  
  var polar9: PartialPolarLayoutAngularaxis
  
  var radialaxis: PartialAxisCalendar
  
  var scene: PartialSceneAnnotations
  
  var selectdirection: h | v | d | any
  
  var selectionrevision: Double | String
  
  var separators: String
  
  var shapes: js.Array[PartialShape]
  
  var showlegend: Boolean
  
  // TODO
  var sliders: js.Array[PartialSliderActive]
  
  var subplot: String
  
  var template: Template
  
  var title: String | PartialtextstringfontPart
  
  var titlefont: PartialFont
  
  var transition: Transition
  
  var uirevision: Double | String
  
  var width: Double
  
  var xaxis: PartialLayoutAxisAngle
  
  var xaxis2: PartialLayoutAxisAngle
  
  var xaxis3: PartialLayoutAxisAngle
  
  var xaxis4: PartialLayoutAxisAngle
  
  var xaxis5: PartialLayoutAxisAngle
  
  var xaxis6: PartialLayoutAxisAngle
  
  var xaxis7: PartialLayoutAxisAngle
  
  var xaxis8: PartialLayoutAxisAngle
  
  var xaxis9: PartialLayoutAxisAngle
  
  @JSName("xaxis.autorange")
  var xaxisDotautorange: Boolean
  
  @JSName("xaxis.range")
  var xaxisDotrange: js.Tuple2[Datum, Datum]
  
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: Datum
  
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: Datum
  
  @JSName("xaxis.title")
  var xaxisDottitle: String
  
  @JSName("xaxis.type")
  var xaxisDottype: AxisType
  
  var yaxis: PartialLayoutAxisAngle
  
  var yaxis2: PartialLayoutAxisAngle
  
  var yaxis3: PartialLayoutAxisAngle
  
  var yaxis4: PartialLayoutAxisAngle
  
  var yaxis5: PartialLayoutAxisAngle
  
  var yaxis6: PartialLayoutAxisAngle
  
  var yaxis7: PartialLayoutAxisAngle
  
  var yaxis8: PartialLayoutAxisAngle
  
  var yaxis9: PartialLayoutAxisAngle
  
  @JSName("yaxis.autorange")
  var yaxisDotautorange: Boolean
  
  @JSName("yaxis.range")
  var yaxisDotrange: js.Tuple2[Datum, Datum]
  
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: Datum
  
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: Datum
  
  @JSName("yaxis.title")
  var yaxisDottitle: String
  
  @JSName("yaxis.type")
  var yaxisDottype: AxisType
}
object Layout {
  
  inline def apply(
    annotations: js.Array[PartialAnnotationsArrowcolor],
    autosize: Boolean,
    bargap: Double,
    bargroupgap: Double,
    barmode: stack | group | overlay | relative,
    barnorm: _empty | fraction | percent,
    boxmode: group | overlay,
    calendar: Calendar,
    clickmode: event | select | eventPlussignselect | none,
    colorway: js.Array[String],
    datarevision: Double | String,
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false`,
    editrevision: Double | String,
    font: PartialFont,
    grid: Partialrowsnumberroworder,
    height: Double,
    hiddenlabels: js.Array[String],
    hidesources: Boolean,
    hoverdistance: Double,
    hoverlabel: PartialHoverLabel,
    hovermode: closest | x | y | (`x unified`) | (`y unified`) | `false`,
    images: js.Array[PartialImage],
    legend: PartialLegend,
    mapbox: PartialMapboxAccesstoken,
    margin: PartialMargin,
    modebar: PartialModeBar,
    orientation: Double,
    paper_bgcolor: Color,
    plot_bgcolor: Color,
    polar: PartialPolarLayoutAngularaxis,
    polar2: PartialPolarLayoutAngularaxis,
    polar3: PartialPolarLayoutAngularaxis,
    polar4: PartialPolarLayoutAngularaxis,
    polar5: PartialPolarLayoutAngularaxis,
    polar6: PartialPolarLayoutAngularaxis,
    polar7: PartialPolarLayoutAngularaxis,
    polar8: PartialPolarLayoutAngularaxis,
    polar9: PartialPolarLayoutAngularaxis,
    radialaxis: PartialAxisCalendar,
    scene: PartialSceneAnnotations,
    selectdirection: h | v | d | any,
    selectionrevision: Double | String,
    separators: String,
    shapes: js.Array[PartialShape],
    showlegend: Boolean,
    sliders: js.Array[PartialSliderActive],
    subplot: String,
    template: Template,
    title: String | PartialtextstringfontPart,
    titlefont: PartialFont,
    transition: Transition,
    uirevision: Double | String,
    width: Double,
    xaxis: PartialLayoutAxisAngle,
    xaxis2: PartialLayoutAxisAngle,
    xaxis3: PartialLayoutAxisAngle,
    xaxis4: PartialLayoutAxisAngle,
    xaxis5: PartialLayoutAxisAngle,
    xaxis6: PartialLayoutAxisAngle,
    xaxis7: PartialLayoutAxisAngle,
    xaxis8: PartialLayoutAxisAngle,
    xaxis9: PartialLayoutAxisAngle,
    xaxisDotautorange: Boolean,
    xaxisDotrange: js.Tuple2[Datum, Datum],
    xaxisDottitle: String,
    xaxisDottype: AxisType,
    yaxis: PartialLayoutAxisAngle,
    yaxis2: PartialLayoutAxisAngle,
    yaxis3: PartialLayoutAxisAngle,
    yaxis4: PartialLayoutAxisAngle,
    yaxis5: PartialLayoutAxisAngle,
    yaxis6: PartialLayoutAxisAngle,
    yaxis7: PartialLayoutAxisAngle,
    yaxis8: PartialLayoutAxisAngle,
    yaxis9: PartialLayoutAxisAngle,
    yaxisDotautorange: Boolean,
    yaxisDotrange: js.Tuple2[Datum, Datum],
    yaxisDottitle: String,
    yaxisDottype: AxisType
  ): Layout = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], autosize = autosize.asInstanceOf[js.Any], bargap = bargap.asInstanceOf[js.Any], bargroupgap = bargroupgap.asInstanceOf[js.Any], barmode = barmode.asInstanceOf[js.Any], barnorm = barnorm.asInstanceOf[js.Any], boxmode = boxmode.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], clickmode = clickmode.asInstanceOf[js.Any], colorway = colorway.asInstanceOf[js.Any], datarevision = datarevision.asInstanceOf[js.Any], dragmode = dragmode.asInstanceOf[js.Any], editrevision = editrevision.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hiddenlabels = hiddenlabels.asInstanceOf[js.Any], hidesources = hidesources.asInstanceOf[js.Any], hoverdistance = hoverdistance.asInstanceOf[js.Any], hoverlabel = hoverlabel.asInstanceOf[js.Any], hovermode = hovermode.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], mapbox = mapbox.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], modebar = modebar.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], paper_bgcolor = paper_bgcolor.asInstanceOf[js.Any], plot_bgcolor = plot_bgcolor.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], polar2 = polar2.asInstanceOf[js.Any], polar3 = polar3.asInstanceOf[js.Any], polar4 = polar4.asInstanceOf[js.Any], polar5 = polar5.asInstanceOf[js.Any], polar6 = polar6.asInstanceOf[js.Any], polar7 = polar7.asInstanceOf[js.Any], polar8 = polar8.asInstanceOf[js.Any], polar9 = polar9.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], selectdirection = selectdirection.asInstanceOf[js.Any], selectionrevision = selectionrevision.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], showlegend = showlegend.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any], subplot = subplot.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], xaxis2 = xaxis2.asInstanceOf[js.Any], xaxis3 = xaxis3.asInstanceOf[js.Any], xaxis4 = xaxis4.asInstanceOf[js.Any], xaxis5 = xaxis5.asInstanceOf[js.Any], xaxis6 = xaxis6.asInstanceOf[js.Any], xaxis7 = xaxis7.asInstanceOf[js.Any], xaxis8 = xaxis8.asInstanceOf[js.Any], xaxis9 = xaxis9.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], yaxis2 = yaxis2.asInstanceOf[js.Any], yaxis3 = yaxis3.asInstanceOf[js.Any], yaxis4 = yaxis4.asInstanceOf[js.Any], yaxis5 = yaxis5.asInstanceOf[js.Any], yaxis6 = yaxis6.asInstanceOf[js.Any], yaxis7 = yaxis7.asInstanceOf[js.Any], yaxis8 = yaxis8.asInstanceOf[js.Any], yaxis9 = yaxis9.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.updateDynamic("xaxis.range[0]")(null)
    __obj.updateDynamic("xaxis.range[1]")(null)
    __obj.updateDynamic("yaxis.range[0]")(null)
    __obj.updateDynamic("yaxis.range[1]")(null)
    __obj.asInstanceOf[Layout]
  }
  
  extension [Self <: Layout](x: Self) {
    
    inline def setAnnotations(value: js.Array[PartialAnnotationsArrowcolor]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: PartialAnnotationsArrowcolor*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAutosize(value: Boolean): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setBargap(value: Double): Self = StObject.set(x, "bargap", value.asInstanceOf[js.Any])
    
    inline def setBargroupgap(value: Double): Self = StObject.set(x, "bargroupgap", value.asInstanceOf[js.Any])
    
    inline def setBarmode(value: stack | group | overlay | relative): Self = StObject.set(x, "barmode", value.asInstanceOf[js.Any])
    
    inline def setBarnorm(value: _empty | fraction | percent): Self = StObject.set(x, "barnorm", value.asInstanceOf[js.Any])
    
    inline def setBoxmode(value: group | overlay): Self = StObject.set(x, "boxmode", value.asInstanceOf[js.Any])
    
    inline def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setClickmode(value: event | select | eventPlussignselect | none): Self = StObject.set(x, "clickmode", value.asInstanceOf[js.Any])
    
    inline def setColorway(value: js.Array[String]): Self = StObject.set(x, "colorway", value.asInstanceOf[js.Any])
    
    inline def setColorwayVarargs(value: String*): Self = StObject.set(x, "colorway", js.Array(value*))
    
    inline def setDatarevision(value: Double | String): Self = StObject.set(x, "datarevision", value.asInstanceOf[js.Any])
    
    inline def setDragmode(value: zoom | pan | select | lasso | orbit | turntable | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    inline def setEditrevision(value: Double | String): Self = StObject.set(x, "editrevision", value.asInstanceOf[js.Any])
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: Partialrowsnumberroworder): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHiddenlabels(value: js.Array[String]): Self = StObject.set(x, "hiddenlabels", value.asInstanceOf[js.Any])
    
    inline def setHiddenlabelsVarargs(value: String*): Self = StObject.set(x, "hiddenlabels", js.Array(value*))
    
    inline def setHidesources(value: Boolean): Self = StObject.set(x, "hidesources", value.asInstanceOf[js.Any])
    
    inline def setHoverdistance(value: Double): Self = StObject.set(x, "hoverdistance", value.asInstanceOf[js.Any])
    
    inline def setHoverlabel(value: PartialHoverLabel): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    inline def setHovermode(
      value: closest | typingsJapgolly.plotlyJs.plotlyJsStrings.x | y | (`x unified`) | (`y unified`) | `false`
    ): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[PartialImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: PartialImage*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLegend(value: PartialLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setMapbox(value: PartialMapboxAccesstoken): Self = StObject.set(x, "mapbox", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: PartialMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setModebar(value: PartialModeBar): Self = StObject.set(x, "modebar", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPaper_bgcolor(value: Color): Self = StObject.set(x, "paper_bgcolor", value.asInstanceOf[js.Any])
    
    inline def setPaper_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "paper_bgcolor", js.Array(value*))
    
    inline def setPlot_bgcolor(value: Color): Self = StObject.set(x, "plot_bgcolor", value.asInstanceOf[js.Any])
    
    inline def setPlot_bgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "plot_bgcolor", js.Array(value*))
    
    inline def setPolar(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolar2(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar2", value.asInstanceOf[js.Any])
    
    inline def setPolar3(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar3", value.asInstanceOf[js.Any])
    
    inline def setPolar4(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar4", value.asInstanceOf[js.Any])
    
    inline def setPolar5(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar5", value.asInstanceOf[js.Any])
    
    inline def setPolar6(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar6", value.asInstanceOf[js.Any])
    
    inline def setPolar7(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar7", value.asInstanceOf[js.Any])
    
    inline def setPolar8(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar8", value.asInstanceOf[js.Any])
    
    inline def setPolar9(value: PartialPolarLayoutAngularaxis): Self = StObject.set(x, "polar9", value.asInstanceOf[js.Any])
    
    inline def setRadialaxis(value: PartialAxisCalendar): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    inline def setScene(value: PartialSceneAnnotations): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSelectdirection(value: h | v | d | any): Self = StObject.set(x, "selectdirection", value.asInstanceOf[js.Any])
    
    inline def setSelectionrevision(value: Double | String): Self = StObject.set(x, "selectionrevision", value.asInstanceOf[js.Any])
    
    inline def setSeparators(value: String): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
    
    inline def setShapes(value: js.Array[PartialShape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesVarargs(value: PartialShape*): Self = StObject.set(x, "shapes", js.Array(value*))
    
    inline def setShowlegend(value: Boolean): Self = StObject.set(x, "showlegend", value.asInstanceOf[js.Any])
    
    inline def setSliders(value: js.Array[PartialSliderActive]): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    
    inline def setSlidersVarargs(value: PartialSliderActive*): Self = StObject.set(x, "sliders", js.Array(value*))
    
    inline def setSubplot(value: String): Self = StObject.set(x, "subplot", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String | PartialtextstringfontPart): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitlefont(value: PartialFont): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXaxis(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    inline def setXaxis2(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis2", value.asInstanceOf[js.Any])
    
    inline def setXaxis3(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis3", value.asInstanceOf[js.Any])
    
    inline def setXaxis4(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis4", value.asInstanceOf[js.Any])
    
    inline def setXaxis5(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis5", value.asInstanceOf[js.Any])
    
    inline def setXaxis6(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis6", value.asInstanceOf[js.Any])
    
    inline def setXaxis7(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis7", value.asInstanceOf[js.Any])
    
    inline def setXaxis8(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis8", value.asInstanceOf[js.Any])
    
    inline def setXaxis9(value: PartialLayoutAxisAngle): Self = StObject.set(x, "xaxis9", value.asInstanceOf[js.Any])
    
    inline def setXaxisDotautorange(value: Boolean): Self = StObject.set(x, "xaxis.autorange", value.asInstanceOf[js.Any])
    
    inline def setXaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "xaxis.range", value.asInstanceOf[js.Any])
    
    inline def `setXaxisDotrange[0]`(value: Datum): Self = StObject.set(x, "xaxis.range[0]", value.asInstanceOf[js.Any])
    
    inline def `setXaxisDotrange[0]Null`: Self = StObject.set(x, "xaxis.range[0]", null)
    
    inline def `setXaxisDotrange[1]`(value: Datum): Self = StObject.set(x, "xaxis.range[1]", value.asInstanceOf[js.Any])
    
    inline def `setXaxisDotrange[1]Null`: Self = StObject.set(x, "xaxis.range[1]", null)
    
    inline def setXaxisDottitle(value: String): Self = StObject.set(x, "xaxis.title", value.asInstanceOf[js.Any])
    
    inline def setXaxisDottype(value: AxisType): Self = StObject.set(x, "xaxis.type", value.asInstanceOf[js.Any])
    
    inline def setYaxis(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    inline def setYaxis2(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis2", value.asInstanceOf[js.Any])
    
    inline def setYaxis3(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis3", value.asInstanceOf[js.Any])
    
    inline def setYaxis4(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis4", value.asInstanceOf[js.Any])
    
    inline def setYaxis5(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis5", value.asInstanceOf[js.Any])
    
    inline def setYaxis6(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis6", value.asInstanceOf[js.Any])
    
    inline def setYaxis7(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis7", value.asInstanceOf[js.Any])
    
    inline def setYaxis8(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis8", value.asInstanceOf[js.Any])
    
    inline def setYaxis9(value: PartialLayoutAxisAngle): Self = StObject.set(x, "yaxis9", value.asInstanceOf[js.Any])
    
    inline def setYaxisDotautorange(value: Boolean): Self = StObject.set(x, "yaxis.autorange", value.asInstanceOf[js.Any])
    
    inline def setYaxisDotrange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "yaxis.range", value.asInstanceOf[js.Any])
    
    inline def `setYaxisDotrange[0]`(value: Datum): Self = StObject.set(x, "yaxis.range[0]", value.asInstanceOf[js.Any])
    
    inline def `setYaxisDotrange[0]Null`: Self = StObject.set(x, "yaxis.range[0]", null)
    
    inline def `setYaxisDotrange[1]`(value: Datum): Self = StObject.set(x, "yaxis.range[1]", value.asInstanceOf[js.Any])
    
    inline def `setYaxisDotrange[1]Null`: Self = StObject.set(x, "yaxis.range[1]", null)
    
    inline def setYaxisDottitle(value: String): Self = StObject.set(x, "yaxis.title", value.asInstanceOf[js.Any])
    
    inline def setYaxisDottype(value: AxisType): Self = StObject.set(x, "yaxis.type", value.asInstanceOf[js.Any])
  }
}
