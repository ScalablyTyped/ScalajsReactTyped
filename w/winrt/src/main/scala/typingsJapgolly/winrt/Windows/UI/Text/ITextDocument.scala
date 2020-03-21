package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextDocument extends js.Object {
  var caretType: CaretType
  var defaultTabStop: Double
  var selection: ITextSelection
  var undoLimit: Double
  def applyDisplayUpdates(): Double
  def batchDisplayUpdates(): Double
  def beginUndoGroup(): Unit
  def canCopy(): Boolean
  def canPaste(): Boolean
  def canRedo(): Boolean
  def canUndo(): Boolean
  def endUndoGroup(): Unit
  def getDefaultCharacterFormat(): ITextCharacterFormat
  def getDefaultParagraphFormat(): ITextParagraphFormat
  def getRange(startPosition: Double, endPosition: Double): ITextRange
  def getRangeFromPoint(point: Point, options: PointOptions): ITextRange
  def getText(options: TextGetOptions): String
  def loadFromStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  def redo(): Unit
  def saveToStream(options: TextGetOptions, value: IRandomAccessStream): Unit
  def setDefaultCharacterFormat(value: ITextCharacterFormat): Unit
  def setDefaultParagraphFormat(value: ITextParagraphFormat): Unit
  def setText(options: TextSetOptions, value: String): Unit
  def undo(): Unit
}

object ITextDocument {
  @scala.inline
  def apply(
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
    getRange: (Double, Double) => CallbackTo[ITextRange],
    getRangeFromPoint: (Point, PointOptions) => CallbackTo[ITextRange],
    getText: TextGetOptions => CallbackTo[String],
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
    val __obj = js.Dynamic.literal(caretType = caretType.asInstanceOf[js.Any], defaultTabStop = defaultTabStop.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], undoLimit = undoLimit.asInstanceOf[js.Any])
    __obj.updateDynamic("applyDisplayUpdates")(applyDisplayUpdates.toJsFn)
    __obj.updateDynamic("batchDisplayUpdates")(batchDisplayUpdates.toJsFn)
    __obj.updateDynamic("beginUndoGroup")(beginUndoGroup.toJsFn)
    __obj.updateDynamic("canCopy")(canCopy.toJsFn)
    __obj.updateDynamic("canPaste")(canPaste.toJsFn)
    __obj.updateDynamic("canRedo")(canRedo.toJsFn)
    __obj.updateDynamic("canUndo")(canUndo.toJsFn)
    __obj.updateDynamic("endUndoGroup")(endUndoGroup.toJsFn)
    __obj.updateDynamic("getDefaultCharacterFormat")(getDefaultCharacterFormat.toJsFn)
    __obj.updateDynamic("getDefaultParagraphFormat")(getDefaultParagraphFormat.toJsFn)
    __obj.updateDynamic("getRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getRange(t0, t1).runNow()))
    __obj.updateDynamic("getRangeFromPoint")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Point, t1: typingsJapgolly.winrt.Windows.UI.Text.PointOptions) => getRangeFromPoint(t0, t1).runNow()))
    __obj.updateDynamic("getText")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions) => getText(t0).runNow()))
    __obj.updateDynamic("loadFromStream")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => loadFromStream(t0, t1).runNow()))
    __obj.updateDynamic("redo")(redo.toJsFn)
    __obj.updateDynamic("saveToStream")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => saveToStream(t0, t1).runNow()))
    __obj.updateDynamic("setDefaultCharacterFormat")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextCharacterFormat) => setDefaultCharacterFormat(t0).runNow()))
    __obj.updateDynamic("setDefaultParagraphFormat")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextParagraphFormat) => setDefaultParagraphFormat(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions, t1: java.lang.String) => setText(t0, t1).runNow()))
    __obj.updateDynamic("undo")(undo.toJsFn)
    __obj.asInstanceOf[ITextDocument]
  }
}

