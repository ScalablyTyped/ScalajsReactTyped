package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.mod.DTickValue
import typingsJapgolly.plotlyJs.mod.Datum
import typingsJapgolly.plotlyJs.mod.Font
import typingsJapgolly.plotlyJs.mod.TickFormatStop
import typingsJapgolly.plotlyJs.mod.TypedArray
import typingsJapgolly.plotlyJs.plotlyJsStrings.B
import typingsJapgolly.plotlyJs.plotlyJsStrings.E
import typingsJapgolly.plotlyJs.plotlyJsStrings.SI
import typingsJapgolly.plotlyJs.plotlyJsStrings._empty
import typingsJapgolly.plotlyJs.plotlyJsStrings.all
import typingsJapgolly.plotlyJs.plotlyJsStrings.array
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.e_
import typingsJapgolly.plotlyJs.plotlyJsStrings.first
import typingsJapgolly.plotlyJs.plotlyJsStrings.fraction
import typingsJapgolly.plotlyJs.plotlyJsStrings.inside
import typingsJapgolly.plotlyJs.plotlyJsStrings.last
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.none
import typingsJapgolly.plotlyJs.plotlyJsStrings.outside
import typingsJapgolly.plotlyJs.plotlyJsStrings.pixels
import typingsJapgolly.plotlyJs.plotlyJsStrings.power
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ColorBar> */
trait PartialColorBarBgcolor extends StObject {
  
  var bgcolor: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var dtick: js.UndefOr[DTickValue] = js.undefined
  
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.undefined
  
  var len: js.UndefOr[Double] = js.undefined
  
  var lenmode: js.UndefOr[fraction | pixels] = js.undefined
  
  var nticks: js.UndefOr[Double] = js.undefined
  
  var outlinecolor: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var outlinewidth: js.UndefOr[Double] = js.undefined
  
  var separatethousands: js.UndefOr[Boolean] = js.undefined
  
  var showexponent: js.UndefOr[all | first | last | none] = js.undefined
  
  var showticklabels: js.UndefOr[Boolean] = js.undefined
  
  var showtickprefix: js.UndefOr[all | first | last | none] = js.undefined
  
  var showticksuffix: js.UndefOr[all | first | last | none] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var thicknessmode: js.UndefOr[fraction | pixels] = js.undefined
  
  var tick0: js.UndefOr[Double | String] = js.undefined
  
  var tickangle: js.UndefOr[auto | Double] = js.undefined
  
  var tickcolor: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var tickfont: js.UndefOr[Font] = js.undefined
  
  var tickformat: js.UndefOr[String] = js.undefined
  
  var tickformatstops: js.UndefOr[js.Array[Partial[TickFormatStop]]] = js.undefined
  
  var ticklen: js.UndefOr[Double] = js.undefined
  
  var tickmode: js.UndefOr[auto | linear | array] = js.undefined
  
  var tickprefix: js.UndefOr[String] = js.undefined
  
  var ticks: js.UndefOr[outside | inside | _empty] = js.undefined
  
  var ticksuffix: js.UndefOr[String] = js.undefined
  
  var ticktext: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.undefined
  
  var ticktextsrc: js.UndefOr[Any] = js.undefined
  
  var tickvals: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.undefined
  
  var tickvalssrc: js.UndefOr[Any] = js.undefined
  
  var tickwidth: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var titlefont: js.UndefOr[Font] = js.undefined
  
  var titleside: js.UndefOr[right | top | bottom] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xanchor: js.UndefOr[left | center | right] = js.undefined
  
  var xpad: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yanchor: js.UndefOr[top | middle | bottom] = js.undefined
  
  var ypad: js.UndefOr[Double] = js.undefined
}
object PartialColorBarBgcolor {
  
  inline def apply(): PartialColorBarBgcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColorBarBgcolor]
  }
  
  extension [Self <: PartialColorBarBgcolor](x: Self) {
    
    inline def setBgcolor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setBorderwidthVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "borderwidth", js.Array(value*))
    
    inline def setDtick(value: DTickValue): Self = StObject.set(x, "dtick", value.asInstanceOf[js.Any])
    
    inline def setDtickUndefined: Self = StObject.set(x, "dtick", js.undefined)
    
    inline def setExponentformat(value: none | e_ | E | power | SI | B): Self = StObject.set(x, "exponentformat", value.asInstanceOf[js.Any])
    
    inline def setExponentformatUndefined: Self = StObject.set(x, "exponentformat", js.undefined)
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    inline def setLenmodeUndefined: Self = StObject.set(x, "lenmode", js.undefined)
    
    inline def setNticks(value: Double): Self = StObject.set(x, "nticks", value.asInstanceOf[js.Any])
    
    inline def setNticksUndefined: Self = StObject.set(x, "nticks", js.undefined)
    
    inline def setOutlinecolor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "outlinecolor", value.asInstanceOf[js.Any])
    
    inline def setOutlinecolorUndefined: Self = StObject.set(x, "outlinecolor", js.undefined)
    
    inline def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outlinecolor", js.Array(value*))
    
    inline def setOutlinewidth(value: Double): Self = StObject.set(x, "outlinewidth", value.asInstanceOf[js.Any])
    
    inline def setOutlinewidthUndefined: Self = StObject.set(x, "outlinewidth", js.undefined)
    
    inline def setSeparatethousands(value: Boolean): Self = StObject.set(x, "separatethousands", value.asInstanceOf[js.Any])
    
    inline def setSeparatethousandsUndefined: Self = StObject.set(x, "separatethousands", js.undefined)
    
    inline def setShowexponent(value: all | first | last | none): Self = StObject.set(x, "showexponent", value.asInstanceOf[js.Any])
    
    inline def setShowexponentUndefined: Self = StObject.set(x, "showexponent", js.undefined)
    
    inline def setShowticklabels(value: Boolean): Self = StObject.set(x, "showticklabels", value.asInstanceOf[js.Any])
    
    inline def setShowticklabelsUndefined: Self = StObject.set(x, "showticklabels", js.undefined)
    
    inline def setShowtickprefix(value: all | first | last | none): Self = StObject.set(x, "showtickprefix", value.asInstanceOf[js.Any])
    
    inline def setShowtickprefixUndefined: Self = StObject.set(x, "showtickprefix", js.undefined)
    
    inline def setShowticksuffix(value: all | first | last | none): Self = StObject.set(x, "showticksuffix", value.asInstanceOf[js.Any])
    
    inline def setShowticksuffixUndefined: Self = StObject.set(x, "showticksuffix", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setThicknessmode(value: fraction | pixels): Self = StObject.set(x, "thicknessmode", value.asInstanceOf[js.Any])
    
    inline def setThicknessmodeUndefined: Self = StObject.set(x, "thicknessmode", js.undefined)
    
    inline def setTick0(value: Double | String): Self = StObject.set(x, "tick0", value.asInstanceOf[js.Any])
    
    inline def setTick0Undefined: Self = StObject.set(x, "tick0", js.undefined)
    
    inline def setTickangle(value: auto | Double): Self = StObject.set(x, "tickangle", value.asInstanceOf[js.Any])
    
    inline def setTickangleUndefined: Self = StObject.set(x, "tickangle", js.undefined)
    
    inline def setTickcolor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    inline def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    inline def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value*))
    
    inline def setTickfont(value: Font): Self = StObject.set(x, "tickfont", value.asInstanceOf[js.Any])
    
    inline def setTickfontUndefined: Self = StObject.set(x, "tickfont", js.undefined)
    
    inline def setTickformat(value: String): Self = StObject.set(x, "tickformat", value.asInstanceOf[js.Any])
    
    inline def setTickformatUndefined: Self = StObject.set(x, "tickformat", js.undefined)
    
    inline def setTickformatstops(value: js.Array[Partial[TickFormatStop]]): Self = StObject.set(x, "tickformatstops", value.asInstanceOf[js.Any])
    
    inline def setTickformatstopsUndefined: Self = StObject.set(x, "tickformatstops", js.undefined)
    
    inline def setTickformatstopsVarargs(value: Partial[TickFormatStop]*): Self = StObject.set(x, "tickformatstops", js.Array(value*))
    
    inline def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    inline def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    inline def setTickmode(value: auto | linear | array): Self = StObject.set(x, "tickmode", value.asInstanceOf[js.Any])
    
    inline def setTickmodeUndefined: Self = StObject.set(x, "tickmode", js.undefined)
    
    inline def setTickprefix(value: String): Self = StObject.set(x, "tickprefix", value.asInstanceOf[js.Any])
    
    inline def setTickprefixUndefined: Self = StObject.set(x, "tickprefix", js.undefined)
    
    inline def setTicks(value: outside | inside | _empty): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksuffix(value: String): Self = StObject.set(x, "ticksuffix", value.asInstanceOf[js.Any])
    
    inline def setTicksuffixUndefined: Self = StObject.set(x, "ticksuffix", js.undefined)
    
    inline def setTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "ticktext", value.asInstanceOf[js.Any])
    
    inline def setTicktextUndefined: Self = StObject.set(x, "ticktext", js.undefined)
    
    inline def setTicktextVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "ticktext", js.Array(value*))
    
    inline def setTicktextsrc(value: Any): Self = StObject.set(x, "ticktextsrc", value.asInstanceOf[js.Any])
    
    inline def setTicktextsrcUndefined: Self = StObject.set(x, "ticktextsrc", js.undefined)
    
    inline def setTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = StObject.set(x, "tickvals", value.asInstanceOf[js.Any])
    
    inline def setTickvalsUndefined: Self = StObject.set(x, "tickvals", js.undefined)
    
    inline def setTickvalsVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = StObject.set(x, "tickvals", js.Array(value*))
    
    inline def setTickvalssrc(value: Any): Self = StObject.set(x, "tickvalssrc", value.asInstanceOf[js.Any])
    
    inline def setTickvalssrcUndefined: Self = StObject.set(x, "tickvalssrc", js.undefined)
    
    inline def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    inline def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitlefont(value: Font): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    inline def setTitlefontUndefined: Self = StObject.set(x, "titlefont", js.undefined)
    
    inline def setTitleside(value: right | top | bottom): Self = StObject.set(x, "titleside", value.asInstanceOf[js.Any])
    
    inline def setTitlesideUndefined: Self = StObject.set(x, "titleside", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    inline def setXpad(value: Double): Self = StObject.set(x, "xpad", value.asInstanceOf[js.Any])
    
    inline def setXpadUndefined: Self = StObject.set(x, "xpad", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYanchor(value: top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    inline def setYpad(value: Double): Self = StObject.set(x, "ypad", value.asInstanceOf[js.Any])
    
    inline def setYpadUndefined: Self = StObject.set(x, "ypad", js.undefined)
  }
}
