package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tuplet extends StObject {
  
  def attach(): Unit
  
  def detach(): Unit
  
  def draw(): Unit
  
  def getBeatsOccupied(): Double
  
  def getNoteCount(): Double
  
  def getNotes(): js.Array[StaveNote]
  
  def resolveGlyphs(): Unit
  
  def setBeatsOccupied(beats: Double): Unit
  
  def setBracketed(bracketed: Boolean): Tuplet
  
  def setContext(context: IRenderContext): Tuplet
  
  def setRatioed(ratioed: Boolean): Tuplet
  
  def setTupletLocation(location: Double): Tuplet
}
object Tuplet {
  
  inline def apply(
    attach: Callback,
    detach: Callback,
    draw: Callback,
    getBeatsOccupied: CallbackTo[Double],
    getNoteCount: CallbackTo[Double],
    getNotes: CallbackTo[js.Array[StaveNote]],
    resolveGlyphs: Callback,
    setBeatsOccupied: Double => Callback,
    setBracketed: Boolean => Tuplet,
    setContext: IRenderContext => Tuplet,
    setRatioed: Boolean => Tuplet,
    setTupletLocation: Double => Tuplet
  ): Tuplet = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, detach = detach.toJsFn, draw = draw.toJsFn, getBeatsOccupied = getBeatsOccupied.toJsFn, getNoteCount = getNoteCount.toJsFn, getNotes = getNotes.toJsFn, resolveGlyphs = resolveGlyphs.toJsFn, setBeatsOccupied = js.Any.fromFunction1((t0: Double) => setBeatsOccupied(t0).runNow()), setBracketed = js.Any.fromFunction1(setBracketed), setContext = js.Any.fromFunction1(setContext), setRatioed = js.Any.fromFunction1(setRatioed), setTupletLocation = js.Any.fromFunction1(setTupletLocation))
    __obj.asInstanceOf[Tuplet]
  }
  
  extension [Self <: Tuplet](x: Self) {
    
    inline def setAttach(value: Callback): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setDetach(value: Callback): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setDraw(value: Callback): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setGetBeatsOccupied(value: CallbackTo[Double]): Self = StObject.set(x, "getBeatsOccupied", value.toJsFn)
    
    inline def setGetNoteCount(value: CallbackTo[Double]): Self = StObject.set(x, "getNoteCount", value.toJsFn)
    
    inline def setGetNotes(value: CallbackTo[js.Array[StaveNote]]): Self = StObject.set(x, "getNotes", value.toJsFn)
    
    inline def setResolveGlyphs(value: Callback): Self = StObject.set(x, "resolveGlyphs", value.toJsFn)
    
    inline def setSetBeatsOccupied(value: Double => Callback): Self = StObject.set(x, "setBeatsOccupied", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetBracketed(value: Boolean => Tuplet): Self = StObject.set(x, "setBracketed", js.Any.fromFunction1(value))
    
    inline def setSetContext(value: IRenderContext => Tuplet): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetRatioed(value: Boolean => Tuplet): Self = StObject.set(x, "setRatioed", js.Any.fromFunction1(value))
    
    inline def setSetTupletLocation(value: Double => Tuplet): Self = StObject.set(x, "setTupletLocation", js.Any.fromFunction1(value))
  }
}
