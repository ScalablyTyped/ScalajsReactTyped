package typingsJapgolly.winrtUwp.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods to manage one or more InkRecognizer objects used for handwriting recognition. */
trait InkRecognizerContainer extends StObject {
  
  /**
    * Gets the collection of installed handwriting recognizers.
    * @return The installed handwriting recognizers as a collection of InkRecognizer objects.
    */
  def getRecognizers(): IVectorView[InkRecognizer]
  
  /**
    * Performs handwriting recognition on one or more InkStroke objects.
    * @param strokeCollection The set of strokes on which recognition is performed.
    * @param recognitionTarget One of the values from the InkRecognitionTarget enumeration.
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def recognizeAsync(strokeCollection: InkStrokeContainer, recognitionTarget: InkRecognitionTarget): IPromiseWithIAsyncOperation[IVectorView[Any]]
  
  /**
    * Sets the default InkRecognizer used for handwriting recognition.
    * @param recognizer The InkRecognizer .
    */
  def setDefaultRecognizer(recognizer: InkRecognizer): Unit
}
object InkRecognizerContainer {
  
  inline def apply(
    getRecognizers: CallbackTo[IVectorView[InkRecognizer]],
    recognizeAsync: (InkStrokeContainer, InkRecognitionTarget) => IPromiseWithIAsyncOperation[IVectorView[Any]],
    setDefaultRecognizer: InkRecognizer => Callback
  ): InkRecognizerContainer = {
    val __obj = js.Dynamic.literal(getRecognizers = getRecognizers.toJsFn, recognizeAsync = js.Any.fromFunction2(recognizeAsync), setDefaultRecognizer = js.Any.fromFunction1((t0: InkRecognizer) => setDefaultRecognizer(t0).runNow()))
    __obj.asInstanceOf[InkRecognizerContainer]
  }
  
  extension [Self <: InkRecognizerContainer](x: Self) {
    
    inline def setGetRecognizers(value: CallbackTo[IVectorView[InkRecognizer]]): Self = StObject.set(x, "getRecognizers", value.toJsFn)
    
    inline def setRecognizeAsync(value: (InkStrokeContainer, InkRecognitionTarget) => IPromiseWithIAsyncOperation[IVectorView[Any]]): Self = StObject.set(x, "recognizeAsync", js.Any.fromFunction2(value))
    
    inline def setSetDefaultRecognizer(value: InkRecognizer => Callback): Self = StObject.set(x, "setDefaultRecognizer", js.Any.fromFunction1((t0: InkRecognizer) => value(t0).runNow()))
  }
}
