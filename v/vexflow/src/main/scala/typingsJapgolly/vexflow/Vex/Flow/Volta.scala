package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volta
  extends StObject
     with StaveModifier {
  
  def draw(stave: Stave, x: Double): Volta
  
  def setShiftY(y: Double): Volta
}
object Volta {
  
  inline def apply(
    addEndModifier: Callback,
    addModifier: Callback,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => Volta,
    getCategory: CallbackTo[String],
    getPadding: Double => Double,
    getPosition: CallbackTo[Double],
    getStyle: CallbackTo[FillStyle_],
    getWidth: CallbackTo[Double],
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Callback,
    setPadding: Double => Callback,
    setShiftY: Double => Volta,
    setStyle: FillStyle_ => StaveModifier
  ): Volta = {
    val __obj = js.Dynamic.literal(addEndModifier = addEndModifier.toJsFn, addModifier = addModifier.toJsFn, addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), getCategory = getCategory.toJsFn, getPadding = js.Any.fromFunction1(getPadding), getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3((t0: Glyph, t1: Stave, t2: Double) => (placeGlyphOnLine(t0, t1, t2)).runNow()), setPadding = js.Any.fromFunction1((t0: Double) => setPadding(t0).runNow()), setShiftY = js.Any.fromFunction1(setShiftY), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[Volta]
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.Volta.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait BEGIN
      extends StObject
         with `type`
    
    @js.native
    sealed trait BEGIN_END
      extends StObject
         with `type`
    
    @js.native
    sealed trait END
      extends StObject
         with `type`
    
    @js.native
    sealed trait MID
      extends StObject
         with `type`
    
    @js.native
    sealed trait NONE
      extends StObject
         with `type`
  }
  
  extension [Self <: Volta](x: Self) {
    
    inline def setDraw(value: (Stave, Double) => Volta): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setSetShiftY(value: Double => Volta): Self = StObject.set(x, "setShiftY", js.Any.fromFunction1(value))
  }
}
