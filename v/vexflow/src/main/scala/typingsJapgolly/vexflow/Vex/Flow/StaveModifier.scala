package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.anon.FillStyle_
import typingsJapgolly.vexflow.anon.GetContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveModifier extends StObject {
  
  def addEndModifier(): Unit
  
  def addModifier(): Unit
  
  def addToStave(stave: Stave, firstGlyph: Boolean): StaveModifier
  
  def addToStaveEnd(stave: Stave, firstGlyph: Boolean): StaveModifier
  
  def getCategory(): String
  
  def getPadding(index: Double): Double
  
  def getPosition(): Double
  
  def getStyle(): FillStyle_
  
  def getWidth(): Double
  
  def makeSpacer(padding: Double): GetContext
  
  def placeGlyphOnLine(glyph: Glyph, stave: Stave, line: Double): Unit
  
  def setPadding(padding: Double): Unit
  
  // (StaveModifier extends Element in vexflow, but not in these definitions, probably because of a typing problem)
  def setStyle(style: FillStyle_): StaveModifier
}
object StaveModifier {
  
  inline def apply(
    addEndModifier: Callback,
    addModifier: Callback,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    getCategory: CallbackTo[String],
    getPadding: Double => Double,
    getPosition: CallbackTo[Double],
    getStyle: CallbackTo[FillStyle_],
    getWidth: CallbackTo[Double],
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Callback,
    setPadding: Double => Callback,
    setStyle: FillStyle_ => StaveModifier
  ): StaveModifier = {
    val __obj = js.Dynamic.literal(addEndModifier = addEndModifier.toJsFn, addModifier = addModifier.toJsFn, addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), getCategory = getCategory.toJsFn, getPadding = js.Any.fromFunction1(getPadding), getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3((t0: Glyph, t1: Stave, t2: Double) => (placeGlyphOnLine(t0, t1, t2)).runNow()), setPadding = js.Any.fromFunction1((t0: Double) => setPadding(t0).runNow()), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[StaveModifier]
  }
  
  @js.native
  sealed trait Position extends StObject
  // @see https://github.com/0xfe/vexflow/blob/master/src/stavemodifier.js#L9
  @JSGlobal("Vex.Flow.StaveModifier.Position")
  @js.native
  object Position extends StObject {
    
    @js.native
    sealed trait ABOVE
      extends StObject
         with Position
    
    @js.native
    sealed trait BEGIN
      extends StObject
         with Position
    
    @js.native
    sealed trait BELOW
      extends StObject
         with Position
    
    @js.native
    sealed trait END
      extends StObject
         with Position
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Position
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Position
  }
  
  extension [Self <: StaveModifier](x: Self) {
    
    inline def setAddEndModifier(value: Callback): Self = StObject.set(x, "addEndModifier", value.toJsFn)
    
    inline def setAddModifier(value: Callback): Self = StObject.set(x, "addModifier", value.toJsFn)
    
    inline def setAddToStave(value: (Stave, Boolean) => StaveModifier): Self = StObject.set(x, "addToStave", js.Any.fromFunction2(value))
    
    inline def setAddToStaveEnd(value: (Stave, Boolean) => StaveModifier): Self = StObject.set(x, "addToStaveEnd", js.Any.fromFunction2(value))
    
    inline def setGetCategory(value: CallbackTo[String]): Self = StObject.set(x, "getCategory", value.toJsFn)
    
    inline def setGetPadding(value: Double => Double): Self = StObject.set(x, "getPadding", js.Any.fromFunction1(value))
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetStyle(value: CallbackTo[FillStyle_]): Self = StObject.set(x, "getStyle", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setMakeSpacer(value: Double => GetContext): Self = StObject.set(x, "makeSpacer", js.Any.fromFunction1(value))
    
    inline def setPlaceGlyphOnLine(value: (Glyph, Stave, Double) => Callback): Self = StObject.set(x, "placeGlyphOnLine", js.Any.fromFunction3((t0: Glyph, t1: Stave, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetPadding(value: Double => Callback): Self = StObject.set(x, "setPadding", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStyle(value: FillStyle_ => StaveModifier): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
  }
}
