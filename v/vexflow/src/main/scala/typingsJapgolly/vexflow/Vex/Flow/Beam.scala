package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.End
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beam extends StObject {
  
  def applyStemExtensions(): Unit
  
  def breakSecondaryAt(indices: js.Array[Double]): Beam
  
  def calculateSlope(): Unit
  
  def calculateStemDirection(notes: Note): Double
  
  def draw(): Boolean
  
  def drawBeamLines(): Unit
  
  def drawStems(): Unit
  
  def getBeamCount(): Double
  
  def getBeamLines(duration: String): js.Array[End]
  
  def getNotes(): js.Array[StemmableNote]
  
  def getSlopeY(): Double
  
  def postFormat(): Beam
  
  def preFormat(): Beam
  
  def setContext(context: IRenderContext): Beam
  
  def setStyle(style: FillStyle_): Beam
}
object Beam {
  
  inline def apply(
    applyStemExtensions: Callback,
    breakSecondaryAt: js.Array[Double] => Beam,
    calculateSlope: Callback,
    calculateStemDirection: Note => Double,
    draw: CallbackTo[Boolean],
    drawBeamLines: Callback,
    drawStems: Callback,
    getBeamCount: CallbackTo[Double],
    getBeamLines: String => js.Array[End],
    getNotes: CallbackTo[js.Array[StemmableNote]],
    getSlopeY: CallbackTo[Double],
    postFormat: CallbackTo[Beam],
    preFormat: CallbackTo[Beam],
    setContext: IRenderContext => Beam,
    setStyle: FillStyle_ => Beam
  ): Beam = {
    val __obj = js.Dynamic.literal(applyStemExtensions = applyStemExtensions.toJsFn, breakSecondaryAt = js.Any.fromFunction1(breakSecondaryAt), calculateSlope = calculateSlope.toJsFn, calculateStemDirection = js.Any.fromFunction1(calculateStemDirection), draw = draw.toJsFn, drawBeamLines = drawBeamLines.toJsFn, drawStems = drawStems.toJsFn, getBeamCount = getBeamCount.toJsFn, getBeamLines = js.Any.fromFunction1(getBeamLines), getNotes = getNotes.toJsFn, getSlopeY = getSlopeY.toJsFn, postFormat = postFormat.toJsFn, preFormat = preFormat.toJsFn, setContext = js.Any.fromFunction1(setContext), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[Beam]
  }
  
  extension [Self <: Beam](x: Self) {
    
    inline def setApplyStemExtensions(value: Callback): Self = StObject.set(x, "applyStemExtensions", value.toJsFn)
    
    inline def setBreakSecondaryAt(value: js.Array[Double] => Beam): Self = StObject.set(x, "breakSecondaryAt", js.Any.fromFunction1(value))
    
    inline def setCalculateSlope(value: Callback): Self = StObject.set(x, "calculateSlope", value.toJsFn)
    
    inline def setCalculateStemDirection(value: Note => Double): Self = StObject.set(x, "calculateStemDirection", js.Any.fromFunction1(value))
    
    inline def setDraw(value: CallbackTo[Boolean]): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setDrawBeamLines(value: Callback): Self = StObject.set(x, "drawBeamLines", value.toJsFn)
    
    inline def setDrawStems(value: Callback): Self = StObject.set(x, "drawStems", value.toJsFn)
    
    inline def setGetBeamCount(value: CallbackTo[Double]): Self = StObject.set(x, "getBeamCount", value.toJsFn)
    
    inline def setGetBeamLines(value: String => js.Array[End]): Self = StObject.set(x, "getBeamLines", js.Any.fromFunction1(value))
    
    inline def setGetNotes(value: CallbackTo[js.Array[StemmableNote]]): Self = StObject.set(x, "getNotes", value.toJsFn)
    
    inline def setGetSlopeY(value: CallbackTo[Double]): Self = StObject.set(x, "getSlopeY", value.toJsFn)
    
    inline def setPostFormat(value: CallbackTo[Beam]): Self = StObject.set(x, "postFormat", value.toJsFn)
    
    inline def setPreFormat(value: CallbackTo[Beam]): Self = StObject.set(x, "preFormat", value.toJsFn)
    
    inline def setSetContext(value: IRenderContext => Beam): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetStyle(value: FillStyle_ => Beam): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
  }
}
