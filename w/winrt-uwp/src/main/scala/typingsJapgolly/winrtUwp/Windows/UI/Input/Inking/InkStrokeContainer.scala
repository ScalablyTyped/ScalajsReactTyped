package typingsJapgolly.winrtUwp.Windows.UI.Input.Inking

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods to store and manage the collection of InkStroke objects rendered by the InkPresenter . */
trait InkStrokeContainer extends StObject {
  
  /**
    * Adds an InkStroke object to the collection managed by the InkStrokeContainer .
    * @param stroke The ink stroke to be added.
    */
  def addStroke(stroke: InkStroke): Unit
  
  /**
    * Adds one or more ink strokes to the collection managed by the InkStrokeContainer .
    * @param strokes The ink strokes to be added as a collection of InkStroke objects.
    */
  def addStrokes(strokes: IIterable[InkStroke]): Unit
  
  /** Gets the bounding rectangle of the InkStroke collection managed by the InkStrokeContainer . */
  var boundingRect: Rect
  
  /**
    * Identifies whether content on the clipboard can be added to the InkStroke collection managed by the InkStrokeContainer .
    * @return True if content can be pasted from the clipboard; otherwise, false.
    */
  def canPasteFromClipboard(): Boolean
  
  /** Deletes all InkStroke objects from the collection managed by the InkStrokeContainer . */
  def clear(): Unit
  
  /** Copies the selected InkStroke objects (from the InkStroke collection managed by the InkStrokeContainer ) to the clipboard in Ink Serialized Format (ISF) format. */
  def copySelectedToClipboard(): Unit
  
  /**
    * Deletes the selected InkStroke objects from the InkStroke collection managed by the InkStrokeContainer .
    * @return The bounding rectangle of the selected ink strokes, or the invalidated rectangle (0, 0, 0, 0) if no strokes were removed (no selected strokes).
    */
  def deleteSelected(): Rect
  
  /**
    * Gets the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @return The results of the recognition as a collection of InkRecognitionResult objects.
    */
  def getRecognitionResults(): IVectorView[InkRecognitionResult]
  
  /**
    * Retrieves all ink strokes in the collection managed by the InkStrokeContainer .
    * @return The ink strokes managed by the InkStrokeContainer as a collection of InkStroke objects.
    */
  def getStrokes(): IVectorView[InkStroke]
  
  /**
    * Asynchronously loads all InkStroke objects from the specified stream to the InkStroke collection that is managed by the InkStrokeContainer .
    * @param inputStream The target stream.
    * @return The status of the asynchronous operation as the number of bytes fetched. For more information, see ReadAsync method.
    */
  def loadAsync(inputStream: IInputStream): IPromiseWithIAsyncActionWithProgress[Double]
  
  /**
    * Moves the selected strokes. All affected strokes are re-rendered.
    * @param translation The destination screen coordinates for the upper-left corner of the bounding rectangle of the selected strokes.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def moveSelected(translation: Point): Rect
  
  /**
    * Adds the InkStroke content from the clipboard to the InkStroke collection that is managed by the InkStrokeContainer and renders the new strokes..
    * @param position The screen coordinates for the upper-left corner of the bounding rectangle of the clipboard content.
    * @return The invalidated bounding rectangle of the InkStroke collection.
    */
  def pasteFromClipboard(position: Point): Rect
  
  /**
    * Asynchronously saves all InkStroke objects in the InkStroke collection that is managed by the InkStrokeContainer to the specified stream.
    * @param outputStream The target stream. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
    * @return The status of the asynchronous operation as the number of bytes sent. For more information, see WriteAsync method.
    */
  def saveAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  
  /**
    * Selects all strokes intersected by the new stroke.
    * @param from The start of the line.
    * @param to The of the line.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithLine(from: Point, to: Point): Rect
  
  /**
    * Selects all strokes contained entirely within the polyline.
    * @param polyline The points of the polyline.
    * @return The bounding rectangle of the selected ink strokes.
    */
  def selectWithPolyLine(polyline: IIterable[Point]): Rect
  
  /**
    * Updates the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
    * @param recognitionResults The updated collection of InkRecognitionResult objects.
    */
  def updateRecognitionResults(recognitionResults: IVectorView[InkRecognitionResult]): Unit
}
object InkStrokeContainer {
  
  inline def apply(
    addStroke: InkStroke => Callback,
    addStrokes: IIterable[InkStroke] => Callback,
    boundingRect: Rect,
    canPasteFromClipboard: CallbackTo[Boolean],
    clear: Callback,
    copySelectedToClipboard: Callback,
    deleteSelected: CallbackTo[Rect],
    getRecognitionResults: CallbackTo[IVectorView[InkRecognitionResult]],
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    loadAsync: IInputStream => IPromiseWithIAsyncActionWithProgress[Double],
    moveSelected: Point => Rect,
    pasteFromClipboard: Point => Rect,
    saveAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    selectWithLine: (Point, Point) => Rect,
    selectWithPolyLine: IIterable[Point] => Rect,
    updateRecognitionResults: IVectorView[InkRecognitionResult] => Callback
  ): InkStrokeContainer = {
    val __obj = js.Dynamic.literal(addStroke = js.Any.fromFunction1((t0: InkStroke) => addStroke(t0).runNow()), addStrokes = js.Any.fromFunction1((t0: IIterable[InkStroke]) => addStrokes(t0).runNow()), boundingRect = boundingRect.asInstanceOf[js.Any], canPasteFromClipboard = canPasteFromClipboard.toJsFn, clear = clear.toJsFn, copySelectedToClipboard = copySelectedToClipboard.toJsFn, deleteSelected = deleteSelected.toJsFn, getRecognitionResults = getRecognitionResults.toJsFn, getStrokes = getStrokes.toJsFn, loadAsync = js.Any.fromFunction1(loadAsync), moveSelected = js.Any.fromFunction1(moveSelected), pasteFromClipboard = js.Any.fromFunction1(pasteFromClipboard), saveAsync = js.Any.fromFunction1(saveAsync), selectWithLine = js.Any.fromFunction2(selectWithLine), selectWithPolyLine = js.Any.fromFunction1(selectWithPolyLine), updateRecognitionResults = js.Any.fromFunction1((t0: IVectorView[InkRecognitionResult]) => updateRecognitionResults(t0).runNow()))
    __obj.asInstanceOf[InkStrokeContainer]
  }
  
  extension [Self <: InkStrokeContainer](x: Self) {
    
    inline def setAddStroke(value: InkStroke => Callback): Self = StObject.set(x, "addStroke", js.Any.fromFunction1((t0: InkStroke) => value(t0).runNow()))
    
    inline def setAddStrokes(value: IIterable[InkStroke] => Callback): Self = StObject.set(x, "addStrokes", js.Any.fromFunction1((t0: IIterable[InkStroke]) => value(t0).runNow()))
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setCanPasteFromClipboard(value: CallbackTo[Boolean]): Self = StObject.set(x, "canPasteFromClipboard", value.toJsFn)
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setCopySelectedToClipboard(value: Callback): Self = StObject.set(x, "copySelectedToClipboard", value.toJsFn)
    
    inline def setDeleteSelected(value: CallbackTo[Rect]): Self = StObject.set(x, "deleteSelected", value.toJsFn)
    
    inline def setGetRecognitionResults(value: CallbackTo[IVectorView[InkRecognitionResult]]): Self = StObject.set(x, "getRecognitionResults", value.toJsFn)
    
    inline def setGetStrokes(value: CallbackTo[IVectorView[InkStroke]]): Self = StObject.set(x, "getStrokes", value.toJsFn)
    
    inline def setLoadAsync(value: IInputStream => IPromiseWithIAsyncActionWithProgress[Double]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    
    inline def setMoveSelected(value: Point => Rect): Self = StObject.set(x, "moveSelected", js.Any.fromFunction1(value))
    
    inline def setPasteFromClipboard(value: Point => Rect): Self = StObject.set(x, "pasteFromClipboard", js.Any.fromFunction1(value))
    
    inline def setSaveAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "saveAsync", js.Any.fromFunction1(value))
    
    inline def setSelectWithLine(value: (Point, Point) => Rect): Self = StObject.set(x, "selectWithLine", js.Any.fromFunction2(value))
    
    inline def setSelectWithPolyLine(value: IIterable[Point] => Rect): Self = StObject.set(x, "selectWithPolyLine", js.Any.fromFunction1(value))
    
    inline def setUpdateRecognitionResults(value: IVectorView[InkRecognitionResult] => Callback): Self = StObject.set(x, "updateRecognitionResults", js.Any.fromFunction1((t0: IVectorView[InkRecognitionResult]) => value(t0).runNow()))
  }
}
