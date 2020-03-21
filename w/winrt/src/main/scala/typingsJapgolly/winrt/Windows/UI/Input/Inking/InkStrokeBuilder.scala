package typingsJapgolly.winrt.Windows.UI.Input.Inking

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.UI.Input.PointerPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
@js.native
class InkStrokeBuilder () extends IInkStrokeBuilder {
  /* CompleteClass */
  override def appendToStroke(pointerPoint: PointerPoint): PointerPoint = js.native
  /* CompleteClass */
  override def beginStroke(pointerPoint: PointerPoint): Unit = js.native
  /* CompleteClass */
  override def createStroke(points: IIterable[Point]): InkStroke = js.native
  /* CompleteClass */
  override def endStroke(pointerPoint: PointerPoint): InkStroke = js.native
  /* CompleteClass */
  override def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): Unit = js.native
}

