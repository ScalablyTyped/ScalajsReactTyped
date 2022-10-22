package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkRecognizerContainer extends StObject {
  
  def getRecognizers(): IVectorView[InkRecognizer]
  
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IAsyncOperation[IVectorView[InkRecognitionResult]]
  
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit
}
object IInkRecognizerContainer {
  
  inline def apply(
    getRecognizers: CallbackTo[IVectorView[InkRecognizer]],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]],
    setDefaultRecognizer: InkRecognizer => Callback
  ): IInkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = getRecognizers.toJsFn, recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1((t0: InkRecognizer) => setDefaultRecognizer(t0).runNow()))
    __obj.asInstanceOf[IInkRecognizerContainer]
  }
  
  extension [Self <: IInkRecognizerContainer](x: Self) {
    
    inline def setGetRecognizers(value: CallbackTo[IVectorView[InkRecognizer]]): Self = StObject.set(x, "getRecognizers", value.toJsFn)
    
    inline def setRecognizeAsync(
      value: (InkStrokeContainer, InkRecognitionTarget) => IAsyncOperation[IVectorView[InkRecognitionResult]]
    ): Self = StObject.set(x, "recognizeAsync", js.Any.fromFunction2(value))
    
    inline def setSetDefaultRecognizer(value: InkRecognizer => Callback): Self = StObject.set(x, "setDefaultRecognizer", js.Any.fromFunction1((t0: InkRecognizer) => value(t0).runNow()))
  }
}
