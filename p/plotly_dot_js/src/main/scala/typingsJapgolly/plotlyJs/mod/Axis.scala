package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.PartialFont
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`false`
import typingsJapgolly.plotlyJs.plotlyJsBooleans.`true`
import typingsJapgolly.plotlyJs.plotlyJsStrings.B
import typingsJapgolly.plotlyJs.plotlyJsStrings.E
import typingsJapgolly.plotlyJs.plotlyJsStrings.SI
import typingsJapgolly.plotlyJs.plotlyJsStrings._empty
import typingsJapgolly.plotlyJs.plotlyJsStrings.`category ascending`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`category descending`
import typingsJapgolly.plotlyJs.plotlyJsStrings.all
import typingsJapgolly.plotlyJs.plotlyJsStrings.allticks
import typingsJapgolly.plotlyJs.plotlyJsStrings.array
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.e_
import typingsJapgolly.plotlyJs.plotlyJsStrings.first
import typingsJapgolly.plotlyJs.plotlyJsStrings.inside
import typingsJapgolly.plotlyJs.plotlyJsStrings.last
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.none
import typingsJapgolly.plotlyJs.plotlyJsStrings.nonnegative
import typingsJapgolly.plotlyJs.plotlyJsStrings.normal
import typingsJapgolly.plotlyJs.plotlyJsStrings.outside
import typingsJapgolly.plotlyJs.plotlyJsStrings.power
import typingsJapgolly.plotlyJs.plotlyJsStrings.reversed
import typingsJapgolly.plotlyJs.plotlyJsStrings.ticks
import typingsJapgolly.plotlyJs.plotlyJsStrings.tozero
import typingsJapgolly.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axis extends js.Object {
  var autorange: `true` | `false` | reversed
  var calendar: Calendar
  var categoryarray: js.Array[_]
  var categoryorder: trace | (`category ascending`) | (`category descending`) | array
  var color: Color
  var dtick: Double | String
  var exponentformat: none | e_ | E | power | SI | B
  var gridcolor: Color
  var gridwidth: Double
  var hoverformat: String
  var linecolor: Color
  var linewidth: Double
  var mirror: `true` | ticks | `false` | all | allticks
  var nticks: Double
  var range: js.Array[_]
  var rangemode: normal | tozero | nonnegative
  var separatethousands: Boolean
  var showexponent: all | first | last | none
  var showgrid: Boolean
  var showline: Boolean
  var showspikes: Boolean
  var showticklabels: Boolean
  var showtickprefix: all | first | last | none
  var showticksuffix: all | first | last | none
  var spikecolor: Color
  var spikethickness: Double
  var tick0: Double | String
  var tickangle: Double
  var tickcolor: Color
  var tickfont: PartialFont
  var tickformat: String
  var ticklen: Double
  var tickmode: auto | linear | array
  var tickprefix: String
  var ticks: outside | inside | _empty
  var ticksuffix: String
  var ticktext: js.Array[String]
  var tickvals: js.Array[_]
  var tickwidth: Double
  var title: String
  var titlefont: PartialFont
  var `type`: AxisType
  var visible: Boolean
  var zeroline: Boolean
  var zerolinecolor: Color
  var zerolinewidth: Double
}

object Axis {
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array,
    color: Color,
    dtick: Double | String,
    exponentformat: none | e_ | E | power | SI | B,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    separatethousands: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    spikecolor: Color,
    spikethickness: Double,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: PartialFont,
    tickformat: String,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
    ticksuffix: String,
    ticktext: js.Array[String],
    tickvals: js.Array[_],
    tickwidth: Double,
    title: String,
    titlefont: PartialFont,
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

