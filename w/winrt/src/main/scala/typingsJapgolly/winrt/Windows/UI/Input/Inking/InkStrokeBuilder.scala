package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkStrokeBuilder
  extends StObject
     with IInkStrokeBuilder
object InkStrokeBuilder {
  
  inline def apply(
    appendToStroke: PointerPoint => PointerPoint,
    beginStroke: PointerPoint => Callback,
    createStroke: IIterable[Point] => InkStroke,
    endStroke: PointerPoint => InkStroke,
    setDefaultDrawingAttributes: InkDrawingAttributes => Callback
  ): InkStrokeBuilder = {
    val __obj = js.Dynamic.literal(appendToStroke = js.Any.fromFunction1(appendToStroke), beginStroke = js.Any.fromFunction1((t0: PointerPoint) => beginStroke(t0).runNow()), createStroke = js.Any.fromFunction1(createStroke), endStroke = js.Any.fromFunction1(endStroke), setDefaultDrawingAttributes = js.Any.fromFunction1((t0: InkDrawingAttributes) => setDefaultDrawingAttributes(t0).runNow()))
    __obj.asInstanceOf[InkStrokeBuilder]
  }
}
