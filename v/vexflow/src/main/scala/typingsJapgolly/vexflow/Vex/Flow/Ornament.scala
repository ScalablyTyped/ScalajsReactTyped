package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ornament
  extends StObject
     with Modifier {
  
  def setDelayed(delayed: Boolean): Ornament
  
  def setLowerAccidental(acc: String): Ornament
  
  def setUpperAccidental(acc: String): Ornament
}
object Ornament {
  
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
    setContext: IRenderContext => Modifier,
    setDelayed: Boolean => Ornament,
    setIndex: Double => Modifier,
    setLowerAccidental: String => Ornament,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setUpperAccidental: String => Ornament,
    setWidth: Double => Modifier,
    setXShift: Double => Callback,
    setYShift: Double => Modifier
  ): Ornament = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (alignSubNotesWithNote(t0, t1)).runNow()), draw = draw.toJsFn, getCategory = getCategory.toJsFn, getContext = getContext.toJsFn, getIndex = getIndex.toJsFn, getModifierContext = getModifierContext.toJsFn, getNote = getNote.toJsFn, getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, setContext = js.Any.fromFunction1(setContext), setDelayed = js.Any.fromFunction1(setDelayed), setIndex = js.Any.fromFunction1(setIndex), setLowerAccidental = js.Any.fromFunction1(setLowerAccidental), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setUpperAccidental = js.Any.fromFunction1(setUpperAccidental), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1((t0: Double) => setXShift(t0).runNow()), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Ornament]
  }
  
  extension [Self <: Ornament](x: Self) {
    
    inline def setSetDelayed(value: Boolean => Ornament): Self = StObject.set(x, "setDelayed", js.Any.fromFunction1(value))
    
    inline def setSetLowerAccidental(value: String => Ornament): Self = StObject.set(x, "setLowerAccidental", js.Any.fromFunction1(value))
    
    inline def setSetUpperAccidental(value: String => Ornament): Self = StObject.set(x, "setUpperAccidental", js.Any.fromFunction1(value))
  }
}
