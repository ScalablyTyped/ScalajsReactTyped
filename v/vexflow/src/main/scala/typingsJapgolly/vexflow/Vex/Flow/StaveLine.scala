package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.anon.Arrowheadangle
import typingsJapgolly.vexflow.anon.Family
import typingsJapgolly.vexflow.anon.Lastnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveLine extends StObject {
  
  def applyFontStyle(): Unit
  
  def applyLineStyle(): Unit
  
  def draw(): StaveLine
  
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: Arrowheadangle
  
  def setContext(context: js.Object): StaveLine
  
  def setFont(font: Family): StaveLine
  
  def setNotes(notes: Lastnote): StaveLine
  
  def setText(text: String): StaveLine
}
object StaveLine {
  
  inline def apply(
    applyFontStyle: Callback,
    applyLineStyle: Callback,
    draw: CallbackTo[StaveLine],
    render_options: Arrowheadangle,
    setContext: js.Object => StaveLine,
    setFont: Family => StaveLine,
    setNotes: Lastnote => StaveLine,
    setText: String => StaveLine
  ): StaveLine = {
    val __obj = js.Dynamic.literal(applyFontStyle = applyFontStyle.toJsFn, applyLineStyle = applyLineStyle.toJsFn, draw = draw.toJsFn, render_options = render_options.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[StaveLine]
  }
  
  @js.native
  sealed trait TextJustification extends StObject
  @JSGlobal("Vex.Flow.StaveLine.TextJustification")
  @js.native
  object TextJustification extends StObject {
    
    @js.native
    sealed trait CENTER
      extends StObject
         with TextJustification
    
    @js.native
    sealed trait LEFT
      extends StObject
         with TextJustification
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with TextJustification
  }
  
  @js.native
  sealed trait TextVerticalPosition extends StObject
  @JSGlobal("Vex.Flow.StaveLine.TextVerticalPosition")
  @js.native
  object TextVerticalPosition extends StObject {
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with TextVerticalPosition
    
    @js.native
    sealed trait TOP
      extends StObject
         with TextVerticalPosition
  }
  
  extension [Self <: StaveLine](x: Self) {
    
    inline def setApplyFontStyle(value: Callback): Self = StObject.set(x, "applyFontStyle", value.toJsFn)
    
    inline def setApplyLineStyle(value: Callback): Self = StObject.set(x, "applyLineStyle", value.toJsFn)
    
    inline def setDraw(value: CallbackTo[StaveLine]): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setRender_options(value: Arrowheadangle): Self = StObject.set(x, "render_options", value.asInstanceOf[js.Any])
    
    inline def setSetContext(value: js.Object => StaveLine): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetFont(value: Family => StaveLine): Self = StObject.set(x, "setFont", js.Any.fromFunction1(value))
    
    inline def setSetNotes(value: Lastnote => StaveLine): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => StaveLine): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
