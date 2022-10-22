package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modifier extends StObject {
  
  def alignSubNotesWithNote(subNotes: js.Array[Note], note: Note): Unit
  
  //inconsistent type: void -> Modifier
  def draw(): Unit
  
  def getCategory(): String
  
  def getContext(): IRenderContext
  
  def getIndex(): Double
  
  def getModifierContext(): ModifierContext
  
  def getNote(): Note
  
  def getPosition(): Position
  
  // (Modifier extends Element in vexflow, but not in these definitions, probably because of some typing problem)
  def getStyle(): FillStyle_
  
  def getWidth(): Double
  
  def setContext(context: IRenderContext): Modifier
  
  def setIndex(index: Double): Modifier
  
  def setModifierContext(c: ModifierContext): Modifier
  
  def setNote(note: Note): Modifier
  
  def setPosition(position: Position): Modifier
  
  def setStyle(style: FillStyle_): Modifier
  
  def setTextLine(line: Double): Modifier
  
  def setWidth(width: Double): Modifier
  
  def setXShift(x: Double): Unit
  
  def setYShift(y: Double): Modifier
}
object Modifier {
  
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
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Callback,
    setYShift: Double => Modifier
  ): Modifier = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (alignSubNotesWithNote(t0, t1)).runNow()), draw = draw.toJsFn, getCategory = getCategory.toJsFn, getContext = getContext.toJsFn, getIndex = getIndex.toJsFn, getModifierContext = getModifierContext.toJsFn, getNote = getNote.toJsFn, getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, setContext = js.Any.fromFunction1(setContext), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1((t0: Double) => setXShift(t0).runNow()), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Modifier]
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("Vex.Flow.Modifier.Position")
  @js.native
  object Position extends StObject {
    
    @js.native
    sealed trait ABOVE
      extends StObject
         with Position
    
    @js.native
    sealed trait BELOW
      extends StObject
         with Position
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Position
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Position
  }
  
  extension [Self <: Modifier](x: Self) {
    
    inline def setAlignSubNotesWithNote(value: (js.Array[Note], Note) => Callback): Self = StObject.set(x, "alignSubNotesWithNote", js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (value(t0, t1)).runNow()))
    
    inline def setDraw(value: Callback): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setGetCategory(value: CallbackTo[String]): Self = StObject.set(x, "getCategory", value.toJsFn)
    
    inline def setGetContext(value: CallbackTo[IRenderContext]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetModifierContext(value: CallbackTo[ModifierContext]): Self = StObject.set(x, "getModifierContext", value.toJsFn)
    
    inline def setGetNote(value: CallbackTo[Note]): Self = StObject.set(x, "getNote", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Position]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetStyle(value: CallbackTo[FillStyle_]): Self = StObject.set(x, "getStyle", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setSetContext(value: IRenderContext => Modifier): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetIndex(value: Double => Modifier): Self = StObject.set(x, "setIndex", js.Any.fromFunction1(value))
    
    inline def setSetModifierContext(value: ModifierContext => Modifier): Self = StObject.set(x, "setModifierContext", js.Any.fromFunction1(value))
    
    inline def setSetNote(value: Note => Modifier): Self = StObject.set(x, "setNote", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Position => Modifier): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetStyle(value: FillStyle_ => Modifier): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    inline def setSetTextLine(value: Double => Modifier): Self = StObject.set(x, "setTextLine", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Double => Modifier): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetXShift(value: Double => Callback): Self = StObject.set(x, "setXShift", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetYShift(value: Double => Modifier): Self = StObject.set(x, "setYShift", js.Any.fromFunction1(value))
  }
}
