package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroke
  extends StObject
     with Modifier {
  
  def addEndNote(note: Note): Stroke
}
object Stroke {
  
  inline def apply(
    addEndNote: Note => Stroke,
    alignSubNotesWithNote: (js.Array[Note], Note) => Callback,
    draw: Callback,
    getCategory: CallbackTo[String],
    getContext: CallbackTo[IRenderContext],
    getIndex: CallbackTo[Double],
    getModifierContext: CallbackTo[ModifierContext],
    getNote: CallbackTo[Note],
    getPosition: CallbackTo[Position],
    getStyle: CallbackTo[FillStyle_],
    getWidth: CallbackTo[Double],
    setContext: IRenderContext => Modifier,
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Callback,
    setYShift: Double => Modifier
  ): Stroke = {
    val __obj = js.Dynamic.literal(addEndNote = js.Any.fromFunction1(addEndNote), alignSubNotesWithNote = js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (alignSubNotesWithNote(t0, t1)).runNow()), draw = draw.toJsFn, getCategory = getCategory.toJsFn, getContext = getContext.toJsFn, getIndex = getIndex.toJsFn, getModifierContext = getModifierContext.toJsFn, getNote = getNote.toJsFn, getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, setContext = js.Any.fromFunction1(setContext), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1((t0: Double) => setXShift(t0).runNow()), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Stroke]
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSGlobal("Vex.Flow.Stroke.Type")
  @js.native
  object Type extends StObject {
    
    @js.native
    sealed trait ARPEGGIO_DIRECTIONLESS
      extends StObject
         with Type
    
    @js.native
    sealed trait BRUSH_DOWN
      extends StObject
         with Type
    
    @js.native
    sealed trait BRUSH_UP
      extends StObject
         with Type
    
    @js.native
    sealed trait RASQUEDO_DOWN
      extends StObject
         with Type
    
    @js.native
    sealed trait RASQUEDO_UP
      extends StObject
         with Type
    
    @js.native
    sealed trait ROLL_DOWN
      extends StObject
         with Type
    
    @js.native
    sealed trait ROLL_UP
      extends StObject
         with Type
  }
  
  extension [Self <: Stroke](x: Self) {
    
    inline def setAddEndNote(value: Note => Stroke): Self = StObject.set(x, "addEndNote", js.Any.fromFunction1(value))
  }
}
