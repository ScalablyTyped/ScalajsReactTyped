package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Cache
import typingsJapgolly.vexflow.anon.Xmax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Glyph extends StObject {
  
  def getContext(): IRenderContext
  
  def getMetrics(): Xmax
  
  def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit
  
  def renderToStave(x: Double): Unit
  
  def reset(): Unit
  
  def setContext(context: IRenderContext): Glyph
  
  def setOptions(options: Cache): Unit
  
  def setStave(stave: Stave): Glyph
  
  def setWidth(width: Double): Glyph
  
  def setXShift(x_shift: Double): Glyph
  
  def setYShift(y_shift: Double): Glyph
}
object Glyph {
  
  inline def apply(
    getContext: CallbackTo[IRenderContext],
    getMetrics: CallbackTo[Xmax],
    render: (IRenderContext, Double, Double) => Callback,
    renderToStave: Double => Callback,
    reset: Callback,
    setContext: IRenderContext => Glyph,
    setOptions: Cache => Callback,
    setStave: Stave => Glyph,
    setWidth: Double => Glyph,
    setXShift: Double => Glyph,
    setYShift: Double => Glyph
  ): Glyph = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getMetrics = getMetrics.toJsFn, render = js.Any.fromFunction3((t0: IRenderContext, t1: Double, t2: Double) => (render(t0, t1, t2)).runNow()), renderToStave = js.Any.fromFunction1((t0: Double) => renderToStave(t0).runNow()), reset = reset.toJsFn, setContext = js.Any.fromFunction1(setContext), setOptions = js.Any.fromFunction1((t0: Cache) => setOptions(t0).runNow()), setStave = js.Any.fromFunction1(setStave), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Glyph]
  }
  
  extension [Self <: Glyph](x: Self) {
    
    inline def setGetContext(value: CallbackTo[IRenderContext]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setGetMetrics(value: CallbackTo[Xmax]): Self = StObject.set(x, "getMetrics", value.toJsFn)
    
    inline def setRender(value: (IRenderContext, Double, Double) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction3((t0: IRenderContext, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setRenderToStave(value: Double => Callback): Self = StObject.set(x, "renderToStave", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetContext(value: IRenderContext => Glyph): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: Cache => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: Cache) => value(t0).runNow()))
    
    inline def setSetStave(value: Stave => Glyph): Self = StObject.set(x, "setStave", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Double => Glyph): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetXShift(value: Double => Glyph): Self = StObject.set(x, "setXShift", js.Any.fromFunction1(value))
    
    inline def setSetYShift(value: Double => Glyph): Self = StObject.set(x, "setYShift", js.Any.fromFunction1(value))
  }
}
