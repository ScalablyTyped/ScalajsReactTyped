package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteSubGroup
  extends StObject
     with Modifier {
  
  def preFormat(): Unit
}
object NoteSubGroup {
  
  inline def apply(
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
    preFormat: Callback,
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
  ): NoteSubGroup = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (alignSubNotesWithNote(t0, t1)).runNow()), draw = draw.toJsFn, getCategory = getCategory.toJsFn, getContext = getContext.toJsFn, getIndex = getIndex.toJsFn, getModifierContext = getModifierContext.toJsFn, getNote = getNote.toJsFn, getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, preFormat = preFormat.toJsFn, setContext = js.Any.fromFunction1(setContext), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1((t0: Double) => setXShift(t0).runNow()), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[NoteSubGroup]
  }
  
  extension [Self <: NoteSubGroup](x: Self) {
    
    inline def setPreFormat(value: Callback): Self = StObject.set(x, "preFormat", value.toJsFn)
  }
}
