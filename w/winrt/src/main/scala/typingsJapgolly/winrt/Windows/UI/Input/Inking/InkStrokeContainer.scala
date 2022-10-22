package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkStrokeContainer
  extends StObject
     with IInkStrokeContainer
object InkStrokeContainer {
  
  inline def apply(
    addStroke: InkStroke => Callback,
    boundingRect: Rect,
    canPasteFromClipboard: CallbackTo[Boolean],
    copySelectedToClipboard: Callback,
    deleteSelected: CallbackTo[Rect],
    getRecognitionResults: CallbackTo[IVectorView[InkRecognitionResult]],
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    loadAsync: IInputStream => IAsyncActionWithProgress[Double],
    moveSelected: Point => Rect,
    pasteFromClipboard: Point => Rect,
    saveAsync: IOutputStream => IAsyncOperationWithProgress[Double, Double],
    selectWithLine: (Point, Point) => Rect,
    selectWithPolyLine: IIterable[Point] => Rect,
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Callback
  ): InkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1((t0: InkStroke) => addStroke(t0).runNow()), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = canPasteFromClipboard.toJsFn, copySelectedToClipboard = copySelectedToClipboard.toJsFn, deleteSelected = deleteSelected.toJsFn, getRecognitionResults = getRecognitionResults.toJsFn, getStrokes = getStrokes.toJsFn, loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1((t0: IVectorView[InkRecognitionResult]) => updateRecognitionResults(t0).runNow()))
    __obj.asInstanceOf[InkStrokeContainer]
  }
}
