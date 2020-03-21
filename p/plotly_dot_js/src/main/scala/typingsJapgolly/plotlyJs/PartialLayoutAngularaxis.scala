package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.AxisType
import typingsJapgolly.plotlyJs.mod.Calendar
import typingsJapgolly.plotlyJs.mod.Color
import typingsJapgolly.plotlyJs.mod.Datum
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsNumbers.`0`
import typingsJapgolly.plotlyJs.plotlyJsNumbers.`1`
import typingsJapgolly.plotlyJs.plotlyJsStrings._empty
import typingsJapgolly.plotlyJs.plotlyJsStrings.any
import typingsJapgolly.plotlyJs.plotlyJsStrings.closest
import typingsJapgolly.plotlyJs.plotlyJsStrings.d
import typingsJapgolly.plotlyJs.plotlyJsStrings.fraction
import typingsJapgolly.plotlyJs.plotlyJsStrings.group
import typingsJapgolly.plotlyJs.plotlyJsStrings.h
import typingsJapgolly.plotlyJs.plotlyJsStrings.lasso
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Layout> */
trait PartialLayoutAngularaxis extends js.Object {
  var angularaxis: js.UndefOr[js.Object] = js.undefined
  var annotations: js.UndefOr[js.Array[PartialAnnotations]] = js.undefined
  var autosize: js.UndefOr[Boolean] = js.undefined
  var bargap: js.UndefOr[`0` | `1`] = js.undefined
  var bargroupgap: js.UndefOr[`0` | `1`] = js.undefined
  var barmode: js.UndefOr[stack | group | overlay | relative] = js.undefined
  var barnorm: js.UndefOr[_empty | fraction | percent] = js.undefined
  var calendar: js.UndefOr[Calendar] = js.undefined
  var dragmode: js.UndefOr[zoom | pan | select | lasso | orbit | turntable | `false`] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var geo: js.UndefOr[js.Object] = js.undefined
  var grid: js.UndefOr[PartialrowsnumberroworderColumns] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hiddenlabels: js.UndefOr[js.Array[String]] = js.undefined
  var hidesources: js.UndefOr[Boolean] = js.undefined
  var hoverlabel: js.UndefOr[PartialHoverLabelAlign] = js.undefined
  var hovermode: js.UndefOr[closest | x | y | `false`] = js.undefined
  var images: js.UndefOr[js.Array[PartialImage]] = js.undefined
  var legend: js.UndefOr[PartialLegendBgcolor] = js.undefined
  var mapbox: js.UndefOr[js.Object] = js.undefined
  var margin: js.UndefOr[PartialMargin] = js.undefined
  var orientation: js.UndefOr[Double] = js.undefined
  var paper_bgcolor: js.UndefOr[Color] = js.undefined
  var plot_bgcolor: js.UndefOr[Color] = js.undefined
  var radialaxis: js.UndefOr[PartialAxisAutorange] = js.undefined
  var scene: js.UndefOr[PartialSceneAnnotations] = js.undefined
  var selectdirection: js.UndefOr[h | v | d | any] = js.undefined
  var separators: js.UndefOr[String] = js.undefined
  var shapes: js.UndefOr[js.Array[PartialShapeFillcolor]] = js.undefined
  var showlegend: js.UndefOr[Boolean] = js.undefined
  var sliders: js.UndefOr[js.Array[PartialSliderActive]] = js.undefined
  var ternary: js.UndefOr[js.Object] = js.undefined
  var title: js.UndefOr[String | PartialtextstringfontPartFont] = js.undefined
  var titlefont: js.UndefOr[PartialFont] = js.undefined
  var updatemenus: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xaxis: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis2: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis3: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis4: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis5: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis6: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis7: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis8: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var xaxis9: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  @JSName("xaxis.autorange")
  var xaxisDotautorange: js.UndefOr[Boolean] = js.undefined
  @JSName("xaxis.range")
  var xaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.undefined
  @JSName("xaxis.range[0]")
  var `xaxisDotrange[0]`: js.UndefOr[Datum] = js.undefined
  @JSName("xaxis.range[1]")
  var `xaxisDotrange[1]`: js.UndefOr[Datum] = js.undefined
  @JSName("xaxis.title")
  var xaxisDottitle: js.UndefOr[String] = js.undefined
  @JSName("xaxis.type")
  var xaxisDottype: js.UndefOr[AxisType] = js.undefined
  var yaxis: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis2: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis3: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis4: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis5: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis6: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis7: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis8: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  var yaxis9: js.UndefOr[PartialLayoutAxisAnchor] = js.undefined
  @JSName("yaxis.autorange")
  var yaxisDotautorange: js.UndefOr[Boolean] = js.undefined
  @JSName("yaxis.range")
  var yaxisDotrange: js.UndefOr[js.Tuple2[Datum, Datum]] = js.undefined
  @JSName("yaxis.range[0]")
  var `yaxisDotrange[0]`: js.UndefOr[Datum] = js.undefined
  @JSName("yaxis.range[1]")
  var `yaxisDotrange[1]`: js.UndefOr[Datum] = js.undefined
  @JSName("yaxis.title")
  var yaxisDottitle: js.UndefOr[String] = js.undefined
  @JSName("yaxis.type")
  var yaxisDottype: js.UndefOr[AxisType] = js.undefined
}

object PartialLayoutAngularaxis {
  @scala.inline
  def apply(
    angularaxis: js.Object = null,
    annotations: js.Array[PartialAnnotations] = null,
    autosize: js.UndefOr[Boolean] = js.undefined,
    bargap: `0` | `1` = null,
    bargroupgap: `0` | `1` = null,
    barmode: stack | group | overlay | relative = null,
    barnorm: _empty | fraction | percent = null,
    calendar: Calendar = null,
    dragmode: zoom | pan | select | lasso | orbit | turntable | `false` = null,
    font: PartialFont = null,
    geo: js.Object = null,
    grid: PartialrowsnumberroworderColumns = null,
    height: Int | Double = null,
    hiddenlabels: js.Array[String] = null,
    hidesources: js.UndefOr[Boolean] = js.undefined,
    hoverlabel: PartialHoverLabelAlign = null,
    hovermode: closest | x | y | `false` = null,
    images: js.Array[PartialImage] = null,
    legend: PartialLegendBgcolor = null,
    mapbox: js.Object = null,
    margin: PartialMargin = null,
    orientation: Int | Double = null,
    paper_bgcolor: Color = null,
    plot_bgcolor: Color = null,
    radialaxis: PartialAxisAutorange = null,
    scene: PartialSceneAnnotations = null,
    selectdirection: h | v | d | any = null,
    separators: String = null,
    shapes: js.Array[PartialShapeFillcolor] = null,
    showlegend: js.UndefOr[Boolean] = js.undefined,
    sliders: js.Array[PartialSliderActive] = null,
    ternary: js.Object = null,
    title: String | PartialtextstringfontPartFont = null,
    titlefont: PartialFont = null,
    updatemenus: js.Object = null,
    width: Int | Double = null,
    xaxis: PartialLayoutAxisAnchor = null,
    xaxis2: PartialLayoutAxisAnchor = null,
    xaxis3: PartialLayoutAxisAnchor = null,
    xaxis4: PartialLayoutAxisAnchor = null,
    xaxis5: PartialLayoutAxisAnchor = null,
    xaxis6: PartialLayoutAxisAnchor = null,
    xaxis7: PartialLayoutAxisAnchor = null,
    xaxis8: PartialLayoutAxisAnchor = null,
    xaxis9: PartialLayoutAxisAnchor = null,
    xaxisDotautorange: js.UndefOr[Boolean] = js.undefined,
    xaxisDotrange: js.Tuple2[Datum, Datum] = null,
    `xaxisDotrange[0]`: Datum = null,
    `xaxisDotrange[1]`: Datum = null,
    xaxisDottitle: String = null,
    xaxisDottype: AxisType = null,
    yaxis: PartialLayoutAxisAnchor = null,
    yaxis2: PartialLayoutAxisAnchor = null,
    yaxis3: PartialLayoutAxisAnchor = null,
    yaxis4: PartialLayoutAxisAnchor = null,
    yaxis5: PartialLayoutAxisAnchor = null,
    yaxis6: PartialLayoutAxisAnchor = null,
    yaxis7: PartialLayoutAxisAnchor = null,
    yaxis8: PartialLayoutAxisAnchor = null,
    yaxis9: PartialLayoutAxisAnchor = null,
    yaxisDotautorange: js.UndefOr[Boolean] = js.undefined,
    yaxisDotrange: js.Tuple2[Datum, Datum] = null,
    `yaxisDotrange[0]`: Datum = null,
    `yaxisDotrange[1]`: Datum = null,
    yaxisDottitle: String = null,
    yaxisDottype: AxisType = null
  ): PartialLayoutAngularaxis = {
    val __obj = js.Dynamic.literal()
    if (angularaxis != null) __obj.updateDynamic("angularaxis")(angularaxis.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (!js.isUndefined(autosize)) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (bargap != null) __obj.updateDynamic("bargap")(bargap.asInstanceOf[js.Any])
    if (bargroupgap != null) __obj.updateDynamic("bargroupgap")(bargroupgap.asInstanceOf[js.Any])
    if (barmode != null) __obj.updateDynamic("barmode")(barmode.asInstanceOf[js.Any])
    if (barnorm != null) __obj.updateDynamic("barnorm")(barnorm.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (dragmode != null) __obj.updateDynamic("dragmode")(dragmode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (geo != null) __obj.updateDynamic("geo")(geo.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenlabels != null) __obj.updateDynamic("hiddenlabels")(hiddenlabels.asInstanceOf[js.Any])
    if (!js.isUndefined(hidesources)) __obj.updateDynamic("hidesources")(hidesources.asInstanceOf[js.Any])
    if (hoverlabel != null) __obj.updateDynamic("hoverlabel")(hoverlabel.asInstanceOf[js.Any])
    if (hovermode != null) __obj.updateDynamic("hovermode")(hovermode.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (mapbox != null) __obj.updateDynamic("mapbox")(mapbox.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paper_bgcolor != null) __obj.updateDynamic("paper_bgcolor")(paper_bgcolor.asInstanceOf[js.Any])
    if (plot_bgcolor != null) __obj.updateDynamic("plot_bgcolor")(plot_bgcolor.asInstanceOf[js.Any])
    if (radialaxis != null) __obj.updateDynamic("radialaxis")(radialaxis.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (selectdirection != null) __obj.updateDynamic("selectdirection")(selectdirection.asInstanceOf[js.Any])
    if (separators != null) __obj.updateDynamic("separators")(separators.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (!js.isUndefined(showlegend)) __obj.updateDynamic("showlegend")(showlegend.asInstanceOf[js.Any])
    if (sliders != null) __obj.updateDynamic("sliders")(sliders.asInstanceOf[js.Any])
    if (ternary != null) __obj.updateDynamic("ternary")(ternary.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlefont != null) __obj.updateDynamic("titlefont")(titlefont.asInstanceOf[js.Any])
    if (updatemenus != null) __obj.updateDynamic("updatemenus")(updatemenus.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (xaxis2 != null) __obj.updateDynamic("xaxis2")(xaxis2.asInstanceOf[js.Any])
    if (xaxis3 != null) __obj.updateDynamic("xaxis3")(xaxis3.asInstanceOf[js.Any])
    if (xaxis4 != null) __obj.updateDynamic("xaxis4")(xaxis4.asInstanceOf[js.Any])
    if (xaxis5 != null) __obj.updateDynamic("xaxis5")(xaxis5.asInstanceOf[js.Any])
    if (xaxis6 != null) __obj.updateDynamic("xaxis6")(xaxis6.asInstanceOf[js.Any])
    if (xaxis7 != null) __obj.updateDynamic("xaxis7")(xaxis7.asInstanceOf[js.Any])
    if (xaxis8 != null) __obj.updateDynamic("xaxis8")(xaxis8.asInstanceOf[js.Any])
    if (xaxis9 != null) __obj.updateDynamic("xaxis9")(xaxis9.asInstanceOf[js.Any])
    if (!js.isUndefined(xaxisDotautorange)) __obj.updateDynamic("xaxis.autorange")(xaxisDotautorange.asInstanceOf[js.Any])
    if (xaxisDotrange != null) __obj.updateDynamic("xaxis.range")(xaxisDotrange.asInstanceOf[js.Any])
    if (`xaxisDotrange[0]` != null) __obj.updateDynamic("xaxis.range[0]")(`xaxisDotrange[0]`.asInstanceOf[js.Any])
    if (`xaxisDotrange[1]` != null) __obj.updateDynamic("xaxis.range[1]")(`xaxisDotrange[1]`.asInstanceOf[js.Any])
    if (xaxisDottitle != null) __obj.updateDynamic("xaxis.title")(xaxisDottitle.asInstanceOf[js.Any])
    if (xaxisDottype != null) __obj.updateDynamic("xaxis.type")(xaxisDottype.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    if (yaxis2 != null) __obj.updateDynamic("yaxis2")(yaxis2.asInstanceOf[js.Any])
    if (yaxis3 != null) __obj.updateDynamic("yaxis3")(yaxis3.asInstanceOf[js.Any])
    if (yaxis4 != null) __obj.updateDynamic("yaxis4")(yaxis4.asInstanceOf[js.Any])
    if (yaxis5 != null) __obj.updateDynamic("yaxis5")(yaxis5.asInstanceOf[js.Any])
    if (yaxis6 != null) __obj.updateDynamic("yaxis6")(yaxis6.asInstanceOf[js.Any])
    if (yaxis7 != null) __obj.updateDynamic("yaxis7")(yaxis7.asInstanceOf[js.Any])
    if (yaxis8 != null) __obj.updateDynamic("yaxis8")(yaxis8.asInstanceOf[js.Any])
    if (yaxis9 != null) __obj.updateDynamic("yaxis9")(yaxis9.asInstanceOf[js.Any])
    if (!js.isUndefined(yaxisDotautorange)) __obj.updateDynamic("yaxis.autorange")(yaxisDotautorange.asInstanceOf[js.Any])
    if (yaxisDotrange != null) __obj.updateDynamic("yaxis.range")(yaxisDotrange.asInstanceOf[js.Any])
    if (`yaxisDotrange[0]` != null) __obj.updateDynamic("yaxis.range[0]")(`yaxisDotrange[0]`.asInstanceOf[js.Any])
    if (`yaxisDotrange[1]` != null) __obj.updateDynamic("yaxis.range[1]")(`yaxisDotrange[1]`.asInstanceOf[js.Any])
    if (yaxisDottitle != null) __obj.updateDynamic("yaxis.title")(yaxisDottitle.asInstanceOf[js.Any])
    if (yaxisDottype != null) __obj.updateDynamic("yaxis.type")(yaxisDottype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLayoutAngularaxis]
  }
}

