package typingsJapgolly.winrt.Windows.UI.Input.Inking

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
@js.native
class InkRecognitionResult () extends IInkRecognitionResult {
  /* CompleteClass */
  override var boundingRect: Rect = js.native
  /* CompleteClass */
  override def getStrokes(): IVectorView[InkStroke] = js.native
  /* CompleteClass */
  override def getTextCandidates(): IVectorView[String] = js.native
}

