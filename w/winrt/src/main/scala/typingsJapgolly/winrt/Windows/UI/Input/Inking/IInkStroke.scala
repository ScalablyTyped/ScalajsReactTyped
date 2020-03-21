package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStroke extends js.Object {
  var boundingRect: Rect
  var drawingAttributes: InkDrawingAttributes
  var recognized: Boolean
  var selected: Boolean
  def getRenderingSegments(): IVectorView[InkStrokeRenderingSegment]
}

object IInkStroke {
  @scala.inline
  def apply(
    boundingRect: Rect,
    drawingAttributes: InkDrawingAttributes,
    getRenderingSegments: CallbackTo[IVectorView[InkStrokeRenderingSegment]],
    recognized: Boolean,
    selected: Boolean
  ): IInkStroke = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], drawingAttributes = drawingAttributes.asInstanceOf[js.Any], recognized = recognized.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("getRenderingSegments")(getRenderingSegments.toJsFn)
    __obj.asInstanceOf[IInkStroke]
  }
}

