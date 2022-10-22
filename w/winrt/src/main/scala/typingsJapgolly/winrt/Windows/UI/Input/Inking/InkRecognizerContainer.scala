package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkRecognizerContainer
  extends StObject
     with IInkRecognizerContainer
object InkRecognizerContainer {
  
  inline def apply(
    getRecognizers: CallbackTo[IVectorView[InkRecognizer]],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]],
    setDefaultRecognizer: InkRecognizer => Callback
  ): InkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = getRecognizers.toJsFn, recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1((t0: InkRecognizer) => setDefaultRecognizer(t0).runNow()))
    __obj.asInstanceOf[InkRecognizerContainer]
  }
}
