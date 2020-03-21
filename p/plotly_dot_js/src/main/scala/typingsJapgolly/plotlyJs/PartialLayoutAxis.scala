package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.mod.AxisName
import typingsJapgolly.plotlyJs.mod.AxisType
import typingsJapgolly.plotlyJs.mod.Calendar
import typingsJapgolly.plotlyJs.mod.Color
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`true`
import typingsJapgolly.plotlyJs.plotlyJsStrings.B
import typingsJapgolly.plotlyJs.plotlyJsStrings.E
import typingsJapgolly.plotlyJs.plotlyJsStrings.SI
import typingsJapgolly.plotlyJs.plotlyJsStrings._empty
import typingsJapgolly.plotlyJs.plotlyJsStrings.`above traces`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`below traces`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`category ascending`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`category descending`
import typingsJapgolly.plotlyJs.plotlyJsStrings.all
import typingsJapgolly.plotlyJs.plotlyJsStrings.allticks
import typingsJapgolly.plotlyJs.plotlyJsStrings.array
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.domain
import typingsJapgolly.plotlyJs.plotlyJsStrings.e_
import typingsJapgolly.plotlyJs.plotlyJsStrings.first
import typingsJapgolly.plotlyJs.plotlyJsStrings.free
import typingsJapgolly.plotlyJs.plotlyJsStrings.inside
import typingsJapgolly.plotlyJs.plotlyJsStrings.last
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.none
import typingsJapgolly.plotlyJs.plotlyJsStrings.nonnegative
import typingsJapgolly.plotlyJs.plotlyJsStrings.normal
import typingsJapgolly.plotlyJs.plotlyJsStrings.outside
import typingsJapgolly.plotlyJs.plotlyJsStrings.power
import typingsJapgolly.plotlyJs.plotlyJsStrings.range
import typingsJapgolly.plotlyJs.plotlyJsStrings.reversed
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.ticks
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import typingsJapgolly.plotlyJs.plotlyJsStrings.tozero
import typingsJapgolly.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.LayoutAxis> */
trait PartialLayoutAxis extends js.Object {
  var anchor: js.UndefOr[free | AxisName] = js.undefined
  var automargin: js.UndefOr[Boolean] = js.undefined
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.undefined
  var autotick: js.UndefOr[Boolean] = js.undefined
  var calendar: js.UndefOr[Calendar] = js.undefined
  var categoryarray: js.UndefOr[js.Array[_]] = js.undefined
  var categoryorder: js.UndefOr[trace | (`category ascending`) | (`category descending`) | array] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var constrain: js.UndefOr[range | domain] = js.undefined
  var constraintoward: js.UndefOr[left | center | right | top | middle | bottom] = js.undefined
  var domain: js.UndefOr[js.Array[Double]] = js.undefined
  var dtick: js.UndefOr[Double | String] = js.undefined
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.undefined
  var fixedrange: js.UndefOr[Boolean] = js.undefined
  var gridcolor: js.UndefOr[Color] = js.undefined
  var gridwidth: js.UndefOr[Double] = js.undefined
  var hoverformat: js.UndefOr[String] = js.undefined
  var layer: js.UndefOr[(`above traces`) | (`below traces`)] = js.undefined
  var linecolor: js.UndefOr[Color] = js.undefined
  var linewidth: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.undefined
  var nticks: js.UndefOr[Double] = js.undefined
  var overlaying: js.UndefOr[free | AxisName] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[js.Array[_]] = js.undefined
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.undefined
  var rangeselector: js.UndefOr[PartialRangeSelector] = js.undefined
  var rangeslider: js.UndefOr[PartialRangeSlider] = js.undefined
  var scaleanchor: js.UndefOr[AxisName] = js.undefined
  var scaleratio: js.UndefOr[Double] = js.undefined
  var separatethousands: js.UndefOr[Boolean] = js.undefined
  var showexponent: js.UndefOr[all | first | last | none] = js.undefined
  var showgrid: js.UndefOr[Boolean] = js.undefined
  var showline: js.UndefOr[Boolean] = js.undefined
  var showspikes: js.UndefOr[Boolean] = js.undefined
  var showticklabels: js.UndefOr[Boolean] = js.undefined
  var showtickprefix: js.UndefOr[all | first | last | none] = js.undefined
  var showticksuffix: js.UndefOr[all | first | last | none] = js.undefined
  var side: js.UndefOr[top | bottom | left | right] = js.undefined
  var spikecolor: js.UndefOr[Color] = js.undefined
  var spikedash: js.UndefOr[String] = js.undefined
  var spikemode: js.UndefOr[String] = js.undefined
  var spikethickness: js.UndefOr[Double] = js.undefined
  var tick0: js.UndefOr[Double | String] = js.undefined
  var tickangle: js.UndefOr[Double] = js.undefined
  var tickcolor: js.UndefOr[Color] = js.undefined
  var tickfont: js.UndefOr[PartialFont] = js.undefined
  var tickformat: js.UndefOr[String] = js.undefined
  var ticklen: js.UndefOr[Double] = js.undefined
  var tickmode: js.UndefOr[auto | linear | array] = js.undefined
  var tickprefix: js.UndefOr[String] = js.undefined
  var ticks: js.UndefOr[outside | inside | _empty] = js.undefined
  var ticksuffix: js.UndefOr[String] = js.undefined
  var ticktext: js.UndefOr[js.Array[String]] = js.undefined
  var tickvals: js.UndefOr[js.Array[_]] = js.undefined
  var tickwidth: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlefont: js.UndefOr[PartialFont] = js.undefined
  var `type`: js.UndefOr[AxisType] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var zeroline: js.UndefOr[Boolean] = js.undefined
  var zerolinecolor: js.UndefOr[Color] = js.undefined
  var zerolinewidth: js.UndefOr[Double] = js.undefined
}

object PartialLayoutAxis {
  @scala.inline
  def apply(
    anchor: free | AxisName = null,
    automargin: js.UndefOr[Boolean] = js.undefined,
    autorange: `true` | `false` | reversed = null,
    autotick: js.UndefOr[Boolean] = js.undefined,
    calendar: Calendar = null,
    categoryarray: js.Array[_] = null,
    categoryorder: trace | (`category ascending`) | (`category descending`) | array = null,
    color: Color = null,
    constrain: range | domain = null,
    constraintoward: left | center | right | top | middle | bottom = null,
    domain: js.Array[Double] = null,
    dtick: Double | String = null,
    exponentformat: none | e_ | E | power | SI | B = null,
    fixedrange: js.UndefOr[Boolean] = js.undefined,
    gridcolor: Color = null,
    gridwidth: Int | Double = null,
    hoverformat: String = null,
    layer: (`above traces`) | (`below traces`) = null,
    linecolor: Color = null,
    linewidth: Int | Double = null,
    mirror: `true` | ticks | `false` | all | allticks = null,
    nticks: Int | Double = null,
    overlaying: free | AxisName = null,
    position: Int | Double = null,
    range: js.Array[_] = null,
    rangemode: normal | tozero | nonnegative = null,
    rangeselector: PartialRangeSelector = null,
    rangeslider: PartialRangeSlider = null,
    scaleanchor: AxisName = null,
    scaleratio: Int | Double = null,
    separatethousands: js.UndefOr[Boolean] = js.undefined,
    showexponent: all | first | last | none = null,
    showgrid: js.UndefOr[Boolean] = js.undefined,
    showline: js.UndefOr[Boolean] = js.undefined,
    showspikes: js.UndefOr[Boolean] = js.undefined,
    showticklabels: js.UndefOr[Boolean] = js.undefined,
    showtickprefix: all | first | last | none = null,
    showticksuffix: all | first | last | none = null,
    side: top | bottom | left | right = null,
    spikecolor: Color = null,
    spikedash: String = null,
    spikemode: String = null,
    spikethickness: Int | Double = null,
    tick0: Double | String = null,
    tickangle: Int | Double = null,
    tickcolor: Color = null,
    tickfont: PartialFont = null,
    tickformat: String = null,
    ticklen: Int | Double = null,
    tickmode: auto | linear | array = null,
    tickprefix: String = null,
    ticks: outside | inside | _empty = null,
    ticksuffix: String = null,
    ticktext: js.Array[String] = null,
    tickvals: js.Array[_] = null,
    tickwidth: Int | Double = null,
    title: String = null,
    titlefont: PartialFont = null,
    `type`: AxisType = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zeroline: js.UndefOr[Boolean] = js.undefined,
    zerolinecolor: Color = null,
    zerolinewidth: Int | Double = null
  ): PartialLayoutAxis = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(automargin)) __obj.updateDynamic("automargin")(automargin.asInstanceOf[js.Any])
    if (autorange != null) __obj.updateDynamic("autorange")(autorange.asInstanceOf[js.Any])
    if (!js.isUndefined(autotick)) __obj.updateDynamic("autotick")(autotick.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (categoryarray != null) __obj.updateDynamic("categoryarray")(categoryarray.asInstanceOf[js.Any])
    if (categoryorder != null) __obj.updateDynamic("categoryorder")(categoryorder.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constrain != null) __obj.updateDynamic("constrain")(constrain.asInstanceOf[js.Any])
    if (constraintoward != null) __obj.updateDynamic("constraintoward")(constraintoward.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (dtick != null) __obj.updateDynamic("dtick")(dtick.asInstanceOf[js.Any])
    if (exponentformat != null) __obj.updateDynamic("exponentformat")(exponentformat.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedrange)) __obj.updateDynamic("fixedrange")(fixedrange.asInstanceOf[js.Any])
    if (gridcolor != null) __obj.updateDynamic("gridcolor")(gridcolor.asInstanceOf[js.Any])
    if (gridwidth != null) __obj.updateDynamic("gridwidth")(gridwidth.asInstanceOf[js.Any])
    if (hoverformat != null) __obj.updateDynamic("hoverformat")(hoverformat.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (linecolor != null) __obj.updateDynamic("linecolor")(linecolor.asInstanceOf[js.Any])
    if (linewidth != null) __obj.updateDynamic("linewidth")(linewidth.asInstanceOf[js.Any])
    if (mirror != null) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (nticks != null) __obj.updateDynamic("nticks")(nticks.asInstanceOf[js.Any])
    if (overlaying != null) __obj.updateDynamic("overlaying")(overlaying.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangemode != null) __obj.updateDynamic("rangemode")(rangemode.asInstanceOf[js.Any])
    if (rangeselector != null) __obj.updateDynamic("rangeselector")(rangeselector.asInstanceOf[js.Any])
    if (rangeslider != null) __obj.updateDynamic("rangeslider")(rangeslider.asInstanceOf[js.Any])
    if (scaleanchor != null) __obj.updateDynamic("scaleanchor")(scaleanchor.asInstanceOf[js.Any])
    if (scaleratio != null) __obj.updateDynamic("scaleratio")(scaleratio.asInstanceOf[js.Any])
    if (!js.isUndefined(separatethousands)) __obj.updateDynamic("separatethousands")(separatethousands.asInstanceOf[js.Any])
    if (showexponent != null) __obj.updateDynamic("showexponent")(showexponent.asInstanceOf[js.Any])
    if (!js.isUndefined(showgrid)) __obj.updateDynamic("showgrid")(showgrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showline)) __obj.updateDynamic("showline")(showline.asInstanceOf[js.Any])
    if (!js.isUndefined(showspikes)) __obj.updateDynamic("showspikes")(showspikes.asInstanceOf[js.Any])
    if (!js.isUndefined(showticklabels)) __obj.updateDynamic("showticklabels")(showticklabels.asInstanceOf[js.Any])
    if (showtickprefix != null) __obj.updateDynamic("showtickprefix")(showtickprefix.asInstanceOf[js.Any])
    if (showticksuffix != null) __obj.updateDynamic("showticksuffix")(showticksuffix.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (spikecolor != null) __obj.updateDynamic("spikecolor")(spikecolor.asInstanceOf[js.Any])
    if (spikedash != null) __obj.updateDynamic("spikedash")(spikedash.asInstanceOf[js.Any])
    if (spikemode != null) __obj.updateDynamic("spikemode")(spikemode.asInstanceOf[js.Any])
    if (spikethickness != null) __obj.updateDynamic("spikethickness")(spikethickness.asInstanceOf[js.Any])
    if (tick0 != null) __obj.updateDynamic("tick0")(tick0.asInstanceOf[js.Any])
    if (tickangle != null) __obj.updateDynamic("tickangle")(tickangle.asInstanceOf[js.Any])
    if (tickcolor != null) __obj.updateDynamic("tickcolor")(tickcolor.asInstanceOf[js.Any])
    if (tickfont != null) __obj.updateDynamic("tickfont")(tickfont.asInstanceOf[js.Any])
    if (tickformat != null) __obj.updateDynamic("tickformat")(tickformat.asInstanceOf[js.Any])
    if (ticklen != null) __obj.updateDynamic("ticklen")(ticklen.asInstanceOf[js.Any])
    if (tickmode != null) __obj.updateDynamic("tickmode")(tickmode.asInstanceOf[js.Any])
    if (tickprefix != null) __obj.updateDynamic("tickprefix")(tickprefix.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (ticksuffix != null) __obj.updateDynamic("ticksuffix")(ticksuffix.asInstanceOf[js.Any])
    if (ticktext != null) __obj.updateDynamic("ticktext")(ticktext.asInstanceOf[js.Any])
    if (tickvals != null) __obj.updateDynamic("tickvals")(tickvals.asInstanceOf[js.Any])
    if (tickwidth != null) __obj.updateDynamic("tickwidth")(tickwidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titlefont != null) __obj.updateDynamic("titlefont")(titlefont.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroline)) __obj.updateDynamic("zeroline")(zeroline.asInstanceOf[js.Any])
    if (zerolinecolor != null) __obj.updateDynamic("zerolinecolor")(zerolinecolor.asInstanceOf[js.Any])
    if (zerolinewidth != null) __obj.updateDynamic("zerolinewidth")(zerolinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLayoutAxis]
  }
}

