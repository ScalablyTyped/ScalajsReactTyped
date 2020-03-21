package typingsJapgolly.winrt.Windows.UI.Input.Inking

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
@js.native
class InkRecognizerContainer () extends IInkRecognizerContainer {
  /* CompleteClass */
  override def getRecognizers(): IVectorView[InkRecognizer] = js.native
  /* CompleteClass */
  override def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]] = js.native
  /* CompleteClass */
  override def setDefaultRecognizer(recognizer: InkRecognizer): Unit = js.native
}

