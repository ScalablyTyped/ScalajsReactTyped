package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkStrokeBuilder extends StObject {
  
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint
  
  def beginStroke(pointerPoint: PointerPoint): Unit
  
  def createStroke(points: IIterable[Point]): InkStroke
  
  def endStroke(pointerPoint: PointerPoint): InkStroke
  
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit
}
object IInkStrokeBuilder {
  
  inline def apply(
    appendToStroke: PointerPoint => PointerPoint,
    beginStroke: PointerPoint => Callback,
    createStroke: IIterable[Point] => InkStroke,
    endStroke: PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => Callback
  ): IInkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1((t0: PointerPoint) => beginStroke(t0).runNow()), createStroke = js.Any.fromFunction1(createStroke), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1((t0: InkDrawingAttributes) => setDefaultDrawingAttributes(t0).runNow()))
    __obj.asInstanceOf[IInkStrokeBuilder]
  }
  
  extension [Self <: IInkStrokeBuilder](x: Self) {
    
    inline def setAppendToStroke(value: PointerPoint => PointerPoint): Self = StObject.set(x, "appendToStroke", js.Any.fromFunction1(value))
    
    inline def setBeginStroke(value: PointerPoint => Callback): Self = StObject.set(x, "beginStroke", js.Any.fromFunction1((t0: PointerPoint) => value(t0).runNow()))
    
    inline def setCreateStroke(value: IIterable[Point] => InkStroke): Self = StObject.set(x, "createStroke", js.Any.fromFunction1(value))
    
    inline def setEndStroke(value: PointerPoint => InkStroke): Self = StObject.set(x, "endStroke", js.Any.fromFunction1(value))
    
    inline def setSetDefaultDrawingAttributes(value: InkDrawingAttributes => Callback): Self = StObject.set(x, "setDefaultDrawingAttributes", js.Any.fromFunction1((t0: InkDrawingAttributes) => value(t0).runNow()))
  }
}
