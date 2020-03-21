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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkStrokeContainer extends js.Object {
  var boundingRect: Rect
  def addStroke(stroke: InkStroke): Unit
  def canPasteFromClipboard(): Boolean
  def copySelectedToClipboard(): Unit
  def deleteSelected(): Rect
  def getRecognitionResults(): IVectorView[InkRecognitionResult]
  def getStrokes(): IVectorView[InkStroke]
  def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double]
  def moveSelected(translation: Point): Rect
  def pasteFromClipboard(position: Point): Rect
  def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double]
  def selectWithLine(from: Point, to: Point): Rect
  def selectWithPolyLine(polyline: IIterable[Point]): Rect
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit
}

object IInkStrokeContainer {
  @scala.inline
  def apply(
    addStroke: InkStroke => Callback,
    boundingRect: Rect,
    canPasteFromClipboard: CallbackTo[Boolean],
    copySelectedToClipboard: Callback,
    deleteSelected: CallbackTo[Rect],
    getRecognitionResults: CallbackTo[IVectorView[InkRecognitionResult]],
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    loadAsync: IInputStream => CallbackTo[IAsyncActionWithProgress[Double]],
    moveSelected: Point => CallbackTo[Rect],
    pasteFromClipboard: Point => CallbackTo[Rect],
    saveAsync: IOutputStream => CallbackTo[IAsyncOperationWithProgress[Double, Double]],
    selectWithLine: (Point, Point) => CallbackTo[Rect],
    selectWithPolyLine: IIterable[Point] => CallbackTo[Rect],
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Callback
  ): IInkStrokeContainer = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any])
    __obj.updateDynamic("addStroke")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke) => addStroke(t0).runNow()))
    __obj.updateDynamic("canPasteFromClipboard")(canPasteFromClipboard.toJsFn)
    __obj.updateDynamic("copySelectedToClipboard")(copySelectedToClipboard.toJsFn)
    __obj.updateDynamic("deleteSelected")(deleteSelected.toJsFn)
    __obj.updateDynamic("getRecognitionResults")(getRecognitionResults.toJsFn)
    __obj.updateDynamic("getStrokes")(getStrokes.toJsFn)
    __obj.updateDynamic("loadAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream) => loadAsync(t0).runNow()))
    __obj.updateDynamic("moveSelected")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Point) => moveSelected(t0).runNow()))
    __obj.updateDynamic("pasteFromClipboard")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Point) => pasteFromClipboard(t0).runNow()))
    __obj.updateDynamic("saveAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream) => saveAsync(t0).runNow()))
    __obj.updateDynamic("selectWithLine")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Point, t1: typingsJapgolly.winrt.Windows.Foundation.Point) => selectWithLine(t0, t1).runNow()))
    __obj.updateDynamic("selectWithPolyLine")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrt.Windows.Foundation.Point]) => selectWithPolyLine(t0).runNow()))
    __obj.updateDynamic("updateRecognitionResults")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult]) => updateRecognitionResults(t0).runNow()))
    __obj.asInstanceOf[IInkStrokeContainer]
  }
}

