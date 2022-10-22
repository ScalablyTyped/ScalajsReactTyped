package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.anon.Bpm
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveTempo
  extends StObject
     with StaveModifier {
  
  def draw(stave: Stave, shift_x: Double): StaveTempo
  
  def setShiftX(x: Double): StaveTempo
  
  def setShiftY(y: Double): StaveTempo
  
  def setTempo(tempo: Bpm): StaveTempo
}
object StaveTempo {
  
  inline def apply(
    addEndModifier: Callback,
    addModifier: Callback,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => StaveTempo,
    getCategory: CallbackTo[String],
    getPadding: Double => Double,
    getPosition: CallbackTo[Double],
    getStyle: CallbackTo[FillStyle_],
    getWidth: CallbackTo[Double],
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Callback,
    setPadding: Double => Callback,
    setShiftX: Double => StaveTempo,
    setShiftY: Double => StaveTempo,
    setStyle: FillStyle_ => StaveModifier,
    setTempo: Bpm => StaveTempo
  ): StaveTempo = {
    val __obj = js.Dynamic.literal(addEndModifier = addEndModifier.toJsFn, addModifier = addModifier.toJsFn, addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), getCategory = getCategory.toJsFn, getPadding = js.Any.fromFunction1(getPadding), getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3((t0: Glyph, t1: Stave, t2: Double) => (placeGlyphOnLine(t0, t1, t2)).runNow()), setPadding = js.Any.fromFunction1((t0: Double) => setPadding(t0).runNow()), setShiftX = js.Any.fromFunction1(setShiftX), setShiftY = js.Any.fromFunction1(setShiftY), setStyle = js.Any.fromFunction1(setStyle), setTempo = js.Any.fromFunction1(setTempo))
    __obj.asInstanceOf[StaveTempo]
  }
  
  extension [Self <: StaveTempo](x: Self) {
    
    inline def setDraw(value: (Stave, Double) => StaveTempo): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setSetShiftX(value: Double => StaveTempo): Self = StObject.set(x, "setShiftX", js.Any.fromFunction1(value))
    
    inline def setSetShiftY(value: Double => StaveTempo): Self = StObject.set(x, "setShiftY", js.Any.fromFunction1(value))
    
    inline def setSetTempo(value: Bpm => StaveTempo): Self = StObject.set(x, "setTempo", js.Any.fromFunction1(value))
  }
}
