package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FretHandFinger
  extends StObject
     with Modifier {
  
  var finger: Double | String
  
  def setFretHandFinger(number: Double): FretHandFinger
  
  def setOffsetX(x: Double): FretHandFinger
  
  def setOffsetY(y: Double): FretHandFinger
}
object FretHandFinger {
  
  inline def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Callback,
    draw: Callback,
    finger: Double | String,
    getCategory: CallbackTo[String],
    getContext: CallbackTo[IRenderContext],
    getIndex: CallbackTo[Double],
    getModifierContext: CallbackTo[ModifierContext],
    getNote: CallbackTo[Note],
    getPosition: CallbackTo[Position],
    getStyle: CallbackTo[FillStyle_],
    getWidth: CallbackTo[Double],
    setContext: IRenderContext => Modifier,
    setFretHandFinger: Double => FretHandFinger,
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setOffsetX: Double => FretHandFinger,
    setOffsetY: Double => FretHandFinger,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Callback,
    setYShift: Double => Modifier
  ): FretHandFinger = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (alignSubNotesWithNote(t0, t1)).runNow()), draw = draw.toJsFn, finger = finger.asInstanceOf[js.Any], getCategory = getCategory.toJsFn, getContext = getContext.toJsFn, getIndex = getIndex.toJsFn, getModifierContext = getModifierContext.toJsFn, getNote = getNote.toJsFn, getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, setContext = js.Any.fromFunction1(setContext), setFretHandFinger = js.Any.fromFunction1(setFretHandFinger), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setOffsetX = js.Any.fromFunction1(setOffsetX), setOffsetY = js.Any.fromFunction1(setOffsetY), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1((t0: Double) => setXShift(t0).runNow()), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[FretHandFinger]
  }
  
  extension [Self <: FretHandFinger](x: Self) {
    
    inline def setFinger(value: Double | String): Self = StObject.set(x, "finger", value.asInstanceOf[js.Any])
    
    inline def setSetFretHandFinger(value: Double => FretHandFinger): Self = StObject.set(x, "setFretHandFinger", js.Any.fromFunction1(value))
    
    inline def setSetOffsetX(value: Double => FretHandFinger): Self = StObject.set(x, "setOffsetX", js.Any.fromFunction1(value))
    
    inline def setSetOffsetY(value: Double => FretHandFinger): Self = StObject.set(x, "setOffsetY", js.Any.fromFunction1(value))
  }
}
