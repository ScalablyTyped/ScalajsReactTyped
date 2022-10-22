package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Firstnote
import typingsJapgolly.vexflow.anon.Firstx
import typingsJapgolly.vexflow.anon.Leftshiftpx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveHairpin extends StObject {
  
  def draw(): Boolean
  
  def renderHairpin(params: Firstx): Unit
  
  def setContext(context: IRenderContext): StaveHairpin
  
  def setNotes(notes: Firstnote): StaveHairpin
  
  def setPosition(position: Position): StaveHairpin
  
  def setRenderOptions(options: Leftshiftpx): StaveHairpin
}
object StaveHairpin {
  
  inline def apply(
    draw: CallbackTo[Boolean],
    renderHairpin: Firstx => Callback,
    setContext: IRenderContext => StaveHairpin,
    setNotes: Firstnote => StaveHairpin,
    setPosition: Position => StaveHairpin,
    setRenderOptions: Leftshiftpx => StaveHairpin
  ): StaveHairpin = {
    val __obj = js.Dynamic.literal(draw = draw.toJsFn, renderHairpin = js.Any.fromFunction1((t0: Firstx) => renderHairpin(t0).runNow()), setContext = js.Any.fromFunction1(setContext), setNotes = js.Any.fromFunction1(setNotes), setPosition = js.Any.fromFunction1(setPosition), setRenderOptions = js.Any.fromFunction1(setRenderOptions))
    __obj.asInstanceOf[StaveHairpin]
  }
  
  @js.native
  sealed trait `type` extends StObject
  @JSGlobal("Vex.Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @js.native
    sealed trait CRESC
      extends StObject
         with `type`
    
    @js.native
    sealed trait DECRESC
      extends StObject
         with `type`
  }
  
  extension [Self <: StaveHairpin](x: Self) {
    
    inline def setDraw(value: CallbackTo[Boolean]): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setRenderHairpin(value: Firstx => Callback): Self = StObject.set(x, "renderHairpin", js.Any.fromFunction1((t0: Firstx) => value(t0).runNow()))
    
    inline def setSetContext(value: IRenderContext => StaveHairpin): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetNotes(value: Firstnote => StaveHairpin): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Position => StaveHairpin): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetRenderOptions(value: Leftshiftpx => StaveHairpin): Self = StObject.set(x, "setRenderOptions", js.Any.fromFunction1(value))
  }
}
