package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Family
import typingsJapgolly.vexflow.anon.Firstxpx
import typingsJapgolly.vexflow.anon.Lastindices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveTie extends StObject {
  
  def draw(): Boolean
  
  def isPartial(): Boolean
  
  def renderText(first_x_px: Double, last_x_px: Double): Unit
  
  def renderTie(params: Firstxpx): Unit
  
  def setContext(context: IRenderContext): StaveTie
  
  def setFont(font: Family): StaveTie
  
  def setNotes(notes: Lastindices): StaveTie
}
object StaveTie {
  
  inline def apply(
    draw: CallbackTo[Boolean],
    isPartial: CallbackTo[Boolean],
    renderText: (Double, Double) => Callback,
    renderTie: Firstxpx => Callback,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): StaveTie = {
    val __obj = js.Dynamic.literal(draw = draw.toJsFn, isPartial = isPartial.toJsFn, renderText = js.Any.fromFunction2((t0: Double, t1: Double) => (renderText(t0, t1)).runNow()), renderTie = js.Any.fromFunction1((t0: Firstxpx) => renderTie(t0).runNow()), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[StaveTie]
  }
  
  extension [Self <: StaveTie](x: Self) {
    
    inline def setDraw(value: CallbackTo[Boolean]): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setIsPartial(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPartial", value.toJsFn)
    
    inline def setRenderText(value: (Double, Double) => Callback): Self = StObject.set(x, "renderText", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRenderTie(value: Firstxpx => Callback): Self = StObject.set(x, "renderTie", js.Any.fromFunction1((t0: Firstxpx) => value(t0).runNow()))
    
    inline def setSetContext(value: IRenderContext => StaveTie): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetFont(value: Family => StaveTie): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    inline def setSetNotes(value: Lastindices => StaveTie): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
  }
}
