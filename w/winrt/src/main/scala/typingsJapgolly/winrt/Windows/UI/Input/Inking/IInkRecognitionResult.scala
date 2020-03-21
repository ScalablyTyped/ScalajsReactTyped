package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognitionResult extends js.Object {
  var boundingRect: Rect
  def getStrokes(): IVectorView[InkStroke]
  def getTextCandidates(): IVectorView[String]
}

object IInkRecognitionResult {
  @scala.inline
  def apply(
    boundingRect: Rect,
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    getTextCandidates: CallbackTo[IVectorView[String]]
  ): IInkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any])
    __obj.updateDynamic("getStrokes")(getStrokes.toJsFn)
    __obj.updateDynamic("getTextCandidates")(getTextCandidates.toJsFn)
    __obj.asInstanceOf[IInkRecognitionResult]
  }
}

