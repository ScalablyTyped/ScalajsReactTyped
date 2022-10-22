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

trait IInkStrokeContainer extends StObject {
  
  def addStroke(stroke: InkStroke): Unit
  
  var boundingRect: Rect
  
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
  ): IInkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1((t0: InkStroke) => addStroke(t0).runNow()), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = canPasteFromClipboard.toJsFn, copySelectedToClipboard = copySelectedToClipboard.toJsFn, deleteSelected = deleteSelected.toJsFn, getRecognitionResults = getRecognitionResults.toJsFn, getStrokes = getStrokes.toJsFn, loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1((t0: IVectorView[InkRecognitionResult]) => updateRecognitionResults(t0).runNow()))
    __obj.asInstanceOf[IInkStrokeContainer]
  }
  
  extension [Self <: IInkStrokeContainer](x: Self) {
    
    inline def setAddStroke(value: InkStroke => Callback): Self = StObject.set(x, "addStroke", js.Any.fromFunction1((t0: InkStroke) => value(t0).runNow()))
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setCanPasteFromClipboard(value: CallbackTo[Boolean]): Self = StObject.set(x, "canPasteFromClipboard", value.toJsFn)
    
    inline def setCopySelectedToClipboard(value: Callback): Self = StObject.set(x, "copySelectedToClipboard", value.toJsFn)
    
    inline def setDeleteSelected(value: CallbackTo[Rect]): Self = StObject.set(x, "deleteSelected", value.toJsFn)
    
    inline def setGetRecognitionResults(value: CallbackTo[IVectorView[InkRecognitionResult]]): Self = StObject.set(x, "getRecognitionResults", value.toJsFn)
    
    inline def setGetStrokes(value: CallbackTo[IVectorView[InkStroke]]): Self = StObject.set(x, "getStrokes", value.toJsFn)
    
    inline def setLoadAsync(value: IInputStream => IAsyncActionWithProgress[Double]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    
    inline def setMoveSelected(value: Point => Rect): Self = StObject.set(x, "moveSelected", js.Any.fromFunction1(value))
    
    inline def setPasteFromClipboard(value: Point => Rect): Self = StObject.set(x, "pasteFromClipboard", js.Any.fromFunction1(value))
    
    inline def setSaveAsync(value: IOutputStream => IAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "saveAsync", js.Any.fromFunction1(value))
    
    inline def setSelectWithLine(value: (Point, Point) => Rect): Self = StObject.set(x, "selectWithLine", js.Any.fromFunction2(value))
    
    inline def setSelectWithPolyLine(value: IIterable[Point] => Rect): Self = StObject.set(x, "selectWithPolyLine", js.Any.fromFunction1(value))
    
    inline def setUpdateRecognitionResults(value: IVectorView[InkRecognitionResult] => Callback): Self = StObject.set(x, "updateRecognitionResults", js.Any.fromFunction1((t0: IVectorView[InkRecognitionResult]) => value(t0).runNow()))
  }
}
