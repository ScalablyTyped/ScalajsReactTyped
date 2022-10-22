package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextDocument extends StObject {
  
  def applyDisplayUpdates(): Double
  
  def batchDisplayUpdates(): Double
  
  def beginUndoGroup(): Unit
  
  def canCopy(): Boolean
  
  def canPaste(): Boolean
  
  def canRedo(): Boolean
  
  def canUndo(): Boolean
  
  var caretType: CaretType
  
  var defaultTabStop: Double
  
  def endUndoGroup(): Unit
  
  def getDefaultCharacterFormat(): ITextCharacterFormat
  
  def getDefaultParagraphFormat(): ITextParagraphFormat
  
  def getRange(startPosition: Double, endPosition: Double): ITextRange
  
  def getRangeFromPoint(point: Point, options: PointOptions): ITextRange
  
  def getText(options: TextGetOptions): String
  
  def loadFromStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  
  def redo(): Unit
  
  def saveToStream(options: TextGetOptions, value: IRandomAccessStream): Unit
  
  var selection: ITextSelection
  
  def setDefaultCharacterFormat(value: ITextCharacterFormat): Unit
  
  def setDefaultParagraphFormat(value: ITextParagraphFormat): Unit
  
  def setText(options: TextSetOptions, value: String): Unit
  
  def undo(): Unit
  
  var undoLimit: Double
}
object ITextDocument {
  
  inline def apply(
    applyDisplayUpdates: CallbackTo[Double],
    batchDisplayUpdates: CallbackTo[Double],
    beginUndoGroup: Callback,
    canCopy: CallbackTo[Boolean],
    canPaste: CallbackTo[Boolean],
    canRedo: CallbackTo[Boolean],
    canUndo: CallbackTo[Boolean],
    caretType: CaretType,
    defaultTabStop: Double,
    endUndoGroup: Callback,
    getDefaultCharacterFormat: CallbackTo[ITextCharacterFormat],
    getDefaultParagraphFormat: CallbackTo[ITextParagraphFormat],
    getRange: (Double, Double) => ITextRange,
    getRangeFromPoint: (Point, PointOptions) => ITextRange,
    getText: TextGetOptions => String,
    loadFromStream: (TextSetOptions, IRandomAccessStream) => Callback,
    redo: Callback,
    saveToStream: (TextGetOptions, IRandomAccessStream) => Callback,
    selection: ITextSelection,
    setDefaultCharacterFormat: ITextCharacterFormat => Callback,
    setDefaultParagraphFormat: ITextParagraphFormat => Callback,
    setText: (TextSetOptions, String) => Callback,
    undo: Callback,
    undoLimit: Double
  ): ITextDocument = {
    val __obj = js.Dynamic.literal(applyDisplayUpdates = applyDisplayUpdates.toJsFn, batchDisplayUpdates = batchDisplayUpdates.toJsFn, beginUndoGroup = beginUndoGroup.toJsFn, canCopy = canCopy.toJsFn, canPaste = canPaste.toJsFn, canRedo = canRedo.toJsFn, canUndo = canUndo.toJsFn, caretType = caretType.asInstanceOf[js.Any], defaultTabStop = defaultTabStop.asInstanceOf[js.Any], endUndoGroup = endUndoGroup.toJsFn, getDefaultCharacterFormat = getDefaultCharacterFormat.toJsFn, getDefaultParagraphFormat = getDefaultParagraphFormat.toJsFn, getRange = js.Any.fromFunction2(getRange), getRangeFromPoint = js.Any.fromFunction2(getRangeFromPoint), getText = js.Any.fromFunction1(getText), loadFromStream = js.Any.fromFunction2((t0: TextSetOptions, t1: IRandomAccessStream) => (loadFromStream(t0, t1)).runNow()), redo = redo.toJsFn, saveToStream = js.Any.fromFunction2((t0: TextGetOptions, t1: IRandomAccessStream) => (saveToStream(t0, t1)).runNow()), selection = selection.asInstanceOf[js.Any], setDefaultCharacterFormat = js.Any.fromFunction1((t0: ITextCharacterFormat) => setDefaultCharacterFormat(t0).runNow()), setDefaultParagraphFormat = js.Any.fromFunction1((t0: ITextParagraphFormat) => setDefaultParagraphFormat(t0).runNow()), setText = js.Any.fromFunction2((t0: TextSetOptions, t1: String) => (setText(t0, t1)).runNow()), undo = undo.toJsFn, undoLimit = undoLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextDocument]
  }
  
  extension [Self <: ITextDocument](x: Self) {
    
    inline def setApplyDisplayUpdates(value: CallbackTo[Double]): Self = StObject.set(x, "applyDisplayUpdates", value.toJsFn)
    
    inline def setBatchDisplayUpdates(value: CallbackTo[Double]): Self = StObject.set(x, "batchDisplayUpdates", value.toJsFn)
    
    inline def setBeginUndoGroup(value: Callback): Self = StObject.set(x, "beginUndoGroup", value.toJsFn)
    
    inline def setCanCopy(value: CallbackTo[Boolean]): Self = StObject.set(x, "canCopy", value.toJsFn)
    
    inline def setCanPaste(value: CallbackTo[Boolean]): Self = StObject.set(x, "canPaste", value.toJsFn)
    
    inline def setCanRedo(value: CallbackTo[Boolean]): Self = StObject.set(x, "canRedo", value.toJsFn)
    
    inline def setCanUndo(value: CallbackTo[Boolean]): Self = StObject.set(x, "canUndo", value.toJsFn)
    
    inline def setCaretType(value: CaretType): Self = StObject.set(x, "caretType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTabStop(value: Double): Self = StObject.set(x, "defaultTabStop", value.asInstanceOf[js.Any])
    
    inline def setEndUndoGroup(value: Callback): Self = StObject.set(x, "endUndoGroup", value.toJsFn)
    
    inline def setGetDefaultCharacterFormat(value: CallbackTo[ITextCharacterFormat]): Self = StObject.set(x, "getDefaultCharacterFormat", value.toJsFn)
    
    inline def setGetDefaultParagraphFormat(value: CallbackTo[ITextParagraphFormat]): Self = StObject.set(x, "getDefaultParagraphFormat", value.toJsFn)
    
    inline def setGetRange(value: (Double, Double) => ITextRange): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
    
    inline def setGetRangeFromPoint(value: (Point, PointOptions) => ITextRange): Self = StObject.set(x, "getRangeFromPoint", js.Any.fromFunction2(value))
    
    inline def setGetText(value: TextGetOptions => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    inline def setLoadFromStream(value: (TextSetOptions, IRandomAccessStream) => Callback): Self = StObject.set(x, "loadFromStream", js.Any.fromFunction2((t0: TextSetOptions, t1: IRandomAccessStream) => (value(t0, t1)).runNow()))
    
    inline def setRedo(value: Callback): Self = StObject.set(x, "redo", value.toJsFn)
    
    inline def setSaveToStream(value: (TextGetOptions, IRandomAccessStream) => Callback): Self = StObject.set(x, "saveToStream", js.Any.fromFunction2((t0: TextGetOptions, t1: IRandomAccessStream) => (value(t0, t1)).runNow()))
    
    inline def setSelection(value: ITextSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultCharacterFormat(value: ITextCharacterFormat => Callback): Self = StObject.set(x, "setDefaultCharacterFormat", js.Any.fromFunction1((t0: ITextCharacterFormat) => value(t0).runNow()))
    
    inline def setSetDefaultParagraphFormat(value: ITextParagraphFormat => Callback): Self = StObject.set(x, "setDefaultParagraphFormat", js.Any.fromFunction1((t0: ITextParagraphFormat) => value(t0).runNow()))
    
    inline def setSetText(value: (TextSetOptions, String) => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction2((t0: TextSetOptions, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setUndo(value: Callback): Self = StObject.set(x, "undo", value.toJsFn)
    
    inline def setUndoLimit(value: Double): Self = StObject.set(x, "undoLimit", value.asInstanceOf[js.Any])
  }
}
