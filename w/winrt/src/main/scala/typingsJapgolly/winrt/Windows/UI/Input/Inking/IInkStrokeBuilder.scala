package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeBuilder extends js.Object {
  def appendToStroke(pointerPoint: PointerPoint): PointerPoint
  def beginStroke(pointerPoint: PointerPoint): Unit
  def createStroke(points: IIterable[Point]): InkStroke
  def endStroke(pointerPoint: PointerPoint): InkStroke
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit
}

object IInkStrokeBuilder {
  @scala.inline
  def apply(
    appendToStroke: PointerPoint => CallbackTo[PointerPoint],
    beginStroke: PointerPoint => Callback,
    createStroke: IIterable[Point] => CallbackTo[InkStroke],
    endStroke: PointerPoint => CallbackTo[InkStroke],
    setDefaultDrawingAttributes: InkDrawingAttributes => Callback
  ): IInkStrokeBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendToStroke")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint) => appendToStroke(t0).runNow()))
    __obj.updateDynamic("beginStroke")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint) => beginStroke(t0).runNow()))
    __obj.updateDynamic("createStroke")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrt.Windows.Foundation.Point]) => createStroke(t0).runNow()))
    __obj.updateDynamic("endStroke")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint) => endStroke(t0).runNow()))
    __obj.updateDynamic("setDefaultDrawingAttributes")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkDrawingAttributes) => setDefaultDrawingAttributes(t0).runNow()))
    __obj.asInstanceOf[IInkStrokeBuilder]
  }
}

