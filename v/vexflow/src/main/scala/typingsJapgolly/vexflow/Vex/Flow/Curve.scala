package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Curve extends StObject {
  
  def draw(): Boolean
  
  def isPartial(): Boolean
  
  def renderCurve(params: Direction): Unit
  
  def setContext(context: IRenderContext): Curve
  
  def setNotes(from: Note, to: Note): Curve
}
object Curve {
  
  inline def apply(
    draw: CallbackTo[Boolean],
    isPartial: CallbackTo[Boolean],
    renderCurve: Direction => Callback,
    setContext: IRenderContext => Curve,
    setNotes: (Note, Note) => Curve
  ): Curve = {
    val __obj = js.Dynamic.literal(draw = draw.toJsFn, isPartial = isPartial.toJsFn, renderCurve = js.Any.fromFunction1((t0: Direction) => renderCurve(t0).runNow()), setContext = js.Any.fromFunction1(setContext), setNotes = js.Any.fromFunction2(setNotes))
    __obj.asInstanceOf[Curve]
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("Vex.Flow.Curve.Position")
  @js.native
  object Position extends StObject {
    
    @js.native
    sealed trait NEAR_HEAD
      extends StObject
         with Position
    
    @js.native
    sealed trait NEAR_TOP
      extends StObject
         with Position
  }
  
  extension [Self <: Curve](x: Self) {
    
    inline def setDraw(value: CallbackTo[Boolean]): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setIsPartial(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPartial", value.toJsFn)
    
    inline def setRenderCurve(value: Direction => Callback): Self = StObject.set(x, "renderCurve", js.Any.fromFunction1((t0: Direction) => value(t0).runNow()))
    
    inline def setSetContext(value: IRenderContext => Curve): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetNotes(value: (Note, Note) => Curve): Self = StObject.set(x, "setNotes", js.Any.fromFunction2(value))
  }
}
