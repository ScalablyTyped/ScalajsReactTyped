package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRecognizerContainer extends js.Object {
  def getRecognizers(): IVectorView[InkRecognizer]
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]]
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit
}

object IInkRecognizerContainer {
  @scala.inline
  def apply(
    getRecognizers: CallbackTo[IVectorView[InkRecognizer]],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => CallbackTo[IAsyncOperation[IVectorView[InkRecognitionResult]]],
    setDefaultRecognizer: InkRecognizer => Callback
  ): IInkRecognizerContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRecognizers")(getRecognizers.toJsFn)
    __obj.updateDynamic("recognizeAsync")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeContainer, t1: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionTarget) => recognizeAsync(t0, t1).runNow()))
    __obj.updateDynamic("setDefaultRecognizer")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizer) => setDefaultRecognizer(t0).runNow()))
    __obj.asInstanceOf[IInkRecognizerContainer]
  }
}

