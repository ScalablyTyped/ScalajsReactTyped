package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.anon.PartialCurrentValueFont
import typingsJapgolly.plotlyJs.anon.PartialPadding
import typingsJapgolly.plotlyJs.anon.PartialSliderStep
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.fraction
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.pixels
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slider extends StObject {
  
  /**
    * Determines which button (by index starting from 0) is
    * considered active.
    */
  var active: Double
  
  /**
    * Sets the background color of the slider grip
    * while dragging.
    */
  var activebgcolor: Color
  
  /**
    * Sets the background color of the slider.
    */
  var bgcolor: Color
  
  /**
    * Sets the color of the border enclosing the slider.
    */
  var bordercolor: Color
  
  /**
    * Sets the width (in px) of the border enclosing the slider.
    */
  var borderwidth: Double
  
  var currentvalue: PartialCurrentValueFont
  
  /**
    * Sets the font of the slider step labels.
    */
  var font: Font
  
  /**
    * Sets the length of the slider
    * This measure excludes the padding of both ends.
    * That is, the slider's length is this length minus the
    * padding on both ends.
    */
  var len: Double
  
  /**
    * Determines whether this slider length
    * is set in units of plot *fraction* or in *pixels.
    * Use `len` to set the value.
    */
  var lenmode: fraction | pixels
  
  /**
    * Sets the length in pixels of minor step tick marks
    */
  var minorticklen: Double
  
  /**
    * Set the padding of the slider component along each side.
    */
  var pad: PartialPadding
  
  var steps: js.Array[PartialSliderStep]
  
  /**
    * Sets the color of the border enclosing the slider.
    */
  var tickcolor: Color
  
  /**
    * Sets the length in pixels of step tick marks
    */
  var ticklen: Double
  
  /**
    * Sets the tick width (in px).
    */
  var tickwidth: Double
  
  var transition: Transition
  
  /**
    * Determines whether or not the slider is visible.
    */
  var visible: Boolean
  
  /**
    * Sets the x position (in normalized coordinates) of the slider.
    */
  var x: Double
  
  /**
    * Sets the slider's horizontal position anchor.
    * This anchor binds the `x` position to the *left*, *center*
    * or *right* of the range selector.
    */
  var xanchor: auto | left | center | right
  
  /**
    * Sets the y position (in normalized coordinates) of the slider.
    */
  var y: Double
  
  /**
    * Sets the slider's vertical position anchor
    * This anchor binds the `y` position to the *top*, *middle*
    * or *bottom* of the range selector.
    */
  var yanchor: auto | top | middle | bottom
}
object Slider {
  
  inline def apply(
    active: Double,
    activebgcolor: Color,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    currentvalue: PartialCurrentValueFont,
    font: Font,
    len: Double,
    lenmode: fraction | pixels,
    minorticklen: Double,
    pad: PartialPadding,
    steps: js.Array[PartialSliderStep],
    tickcolor: Color,
    ticklen: Double,
    tickwidth: Double,
    transition: Transition,
    visible: Boolean,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Slider = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], activebgcolor = activebgcolor.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], currentvalue = currentvalue.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], lenmode = lenmode.asInstanceOf[js.Any], minorticklen = minorticklen.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  
  extension [Self <: Slider](x: Self) {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActivebgcolor(value: Color): Self = StObject.set(x, "activebgcolor", value.asInstanceOf[js.Any])
    
    inline def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activebgcolor", js.Array(value*))
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setCurrentvalue(value: PartialCurrentValueFont): Self = StObject.set(x, "currentvalue", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    inline def setMinorticklen(value: Double): Self = StObject.set(x, "minorticklen", value.asInstanceOf[js.Any])
    
    inline def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[PartialSliderStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: PartialSliderStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTickcolor(value: Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    inline def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value*))
    
    inline def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    inline def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
  }
}
