package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.Flow.Annotation.Justify
import typingsJapgolly.vexflow.Vex.Flow.Annotation.VerticalJustify
import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation
  extends StObject
     with Modifier {
  
  def getJustification(): Justify
  
  def setFont(family: String, size: Double, weight: String): Annotation
  
  def setJustification(justification: Justify): Annotation
  
  def setVerticalJustification(just: VerticalJustify): Annotation
}
object Annotation {
  
  inline def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Callback,
    draw: Callback,
    getCategory: CallbackTo[String],
    getContext: CallbackTo[IRenderContext],
    getIndex: CallbackTo[Double],
    getJustification: CallbackTo[Justify],
    getModifierContext: CallbackTo[ModifierContext],
    getNote: CallbackTo[Note],
    getPosition: CallbackTo[Position],
    getStyle: CallbackTo[FillStyle_],
    getWidth: CallbackTo[Double],
    setContext: IRenderContext => Modifier,
    setFont: (String, Double, String) => Annotation,
    setIndex: Double => Modifier,
    setJustification: Justify => Annotation,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setStyle: FillStyle_ => Modifier,
    setTextLine: Double => Modifier,
    setVerticalJustification: VerticalJustify => Annotation,
    setWidth: Double => Modifier,
    setXShift: Double => Callback,
    setYShift: Double => Modifier
  ): Annotation = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2((t0: js.Array[Note], t1: Note) => (alignSubNotesWithNote(t0, t1)).runNow()), draw = draw.toJsFn, getCategory = getCategory.toJsFn, getContext = getContext.toJsFn, getIndex = getIndex.toJsFn, getJustification = getJustification.toJsFn, getModifierContext = getModifierContext.toJsFn, getNote = getNote.toJsFn, getPosition = getPosition.toJsFn, getStyle = getStyle.toJsFn, getWidth = getWidth.toJsFn, setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction3(setFont), setIndex = js.Any.fromFunction1(setIndex), setJustification = js.Any.fromFunction1(setJustification), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setStyle = js.Any.fromFunction1(setStyle), setTextLine = js.Any.fromFunction1(setTextLine), setVerticalJustification = js.Any.fromFunction1(setVerticalJustification), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1((t0: Double) => setXShift(t0).runNow()), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Annotation]
  }
  
  @js.native
  sealed trait Justify extends StObject
  @JSGlobal("Vex.Flow.Annotation.Justify")
  @js.native
  object Justify extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with Justify
    
    @js.native
    sealed trait CENTER_STEM
      extends StObject
         with Justify
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Justify
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Justify
  }
  
  @js.native
  sealed trait VerticalJustify extends StObject
  @JSGlobal("Vex.Flow.Annotation.VerticalJustify")
  @js.native
  object VerticalJustify extends StObject {
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with VerticalJustify
    
    @js.native
    sealed trait CENTER
      extends StObject
         with VerticalJustify
    
    @js.native
    sealed trait CENTER_STEM
      extends StObject
         with VerticalJustify
    
    @js.native
    sealed trait TOP
      extends StObject
         with VerticalJustify
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setGetJustification(value: CallbackTo[Justify]): Self = StObject.set(x, "getJustification", value.toJsFn)
    
    inline def setSetFont(value: (String, Double, String) => Annotation): Self = StObject.set(x, "setFont", js.Any.fromFunction3(value))
    
    inline def setSetJustification(value: Justify => Annotation): Self = StObject.set(x, "setJustification", js.Any.fromFunction1(value))
    
    inline def setSetVerticalJustification(value: VerticalJustify => Annotation): Self = StObject.set(x, "setVerticalJustification", js.Any.fromFunction1(value))
  }
}
