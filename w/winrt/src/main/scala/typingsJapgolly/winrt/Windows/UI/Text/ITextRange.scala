package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonHit
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextRange extends js.Object {
  var character: String
  var characterFormat: ITextCharacterFormat
  var endPosition: Double
  var formattedText: ITextRange
  var gravity: RangeGravity
  var length: Double
  var link: String
  var paragraphFormat: ITextParagraphFormat
  var startPosition: Double
  var storyLength: Double
  var text: String
  def canPaste(format: Double): Boolean
  def changeCase(value: LetterCase): Unit
  def collapse(value: Boolean): Unit
  def copy(): Unit
  def cut(): Unit
  def delete_(unit: TextRangeUnit, count: Double): Double
  def endOf(unit: TextRangeUnit, extend: Boolean): Double
  def expand(unit: TextRangeUnit): Double
  def findText(value: String, scanLength: Double, options: FindOptions): Double
  def getCharacterUtf32(offset: Double): Double
  def getClone(): ITextRange
  def getIndex(unit: TextRangeUnit): Double
  def getPoint(
    horizontalAlign: HorizontalCharacterAlignment,
    verticalAlign: VerticalCharacterAlignment,
    options: PointOptions
  ): Point
  def getRect(options: PointOptions): AnonHit
  def getText(options: TextGetOptions): String
  def getTextViaStream(options: TextGetOptions, value: IRandomAccessStream): Unit
  def inRange(range: ITextRange): Boolean
  def inStory(range: ITextRange): Boolean
  def insertImage(
    width: Double,
    height: Double,
    ascent: Double,
    verticalAlign: VerticalCharacterAlignment,
    alternateText: String,
    value: IRandomAccessStream
  ): Unit
  def isEqual(range: ITextRange): Boolean
  def matchSelection(): Unit
  def move(unit: TextRangeUnit, count: Double): Double
  def moveEnd(unit: TextRangeUnit, count: Double): Double
  def moveStart(unit: TextRangeUnit, count: Double): Double
  def paste(format: Double): Unit
  def scrollIntoView(value: PointOptions): Unit
  def setIndex(unit: TextRangeUnit, index: Double, extend: Boolean): Unit
  def setPoint(point: Point, options: PointOptions, extend: Boolean): Unit
  def setRange(startPosition: Double, endPosition: Double): Unit
  def setText(options: TextSetOptions, value: String): Unit
  def setTextViaStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  def startOf(unit: TextRangeUnit, extend: Boolean): Double
}

object ITextRange {
  @scala.inline
  def apply(
    canPaste: Double => CallbackTo[Boolean],
    changeCase: LetterCase => Callback,
    character: String,
    characterFormat: ITextCharacterFormat,
    collapse: Boolean => Callback,
    copy: Callback,
    cut: Callback,
    delete_ : (TextRangeUnit, Double) => CallbackTo[Double],
    endOf: (TextRangeUnit, Boolean) => CallbackTo[Double],
    endPosition: Double,
    expand: TextRangeUnit => CallbackTo[Double],
    findText: (String, Double, FindOptions) => CallbackTo[Double],
    formattedText: ITextRange,
    getCharacterUtf32: Double => CallbackTo[Double],
    getClone: CallbackTo[ITextRange],
    getIndex: TextRangeUnit => CallbackTo[Double],
    getPoint: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => CallbackTo[Point],
    getRect: PointOptions => CallbackTo[AnonHit],
    getText: TextGetOptions => CallbackTo[String],
    getTextViaStream: (TextGetOptions, IRandomAccessStream) => Callback,
    gravity: RangeGravity,
    inRange: ITextRange => CallbackTo[Boolean],
    inStory: ITextRange => CallbackTo[Boolean],
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Callback,
    isEqual: ITextRange => CallbackTo[Boolean],
    length: Double,
    link: String,
    matchSelection: Callback,
    move: (TextRangeUnit, Double) => CallbackTo[Double],
    moveEnd: (TextRangeUnit, Double) => CallbackTo[Double],
    moveStart: (TextRangeUnit, Double) => CallbackTo[Double],
    paragraphFormat: ITextParagraphFormat,
    paste: Double => Callback,
    scrollIntoView: PointOptions => Callback,
    setIndex: (TextRangeUnit, Double, Boolean) => Callback,
    setPoint: (Point, PointOptions, Boolean) => Callback,
    setRange: (Double, Double) => Callback,
    setText: (TextSetOptions, String) => Callback,
    setTextViaStream: (TextSetOptions, IRandomAccessStream) => Callback,
    startOf: (TextRangeUnit, Boolean) => CallbackTo[Double],
    startPosition: Double,
    storyLength: Double,
    text: String
  ): ITextRange = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], endPosition = endPosition.asInstanceOf[js.Any], formattedText = formattedText.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], paragraphFormat = paragraphFormat.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("canPaste")(js.Any.fromFunction1((t0: scala.Double) => canPaste(t0).runNow()))
    __obj.updateDynamic("changeCase")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.LetterCase) => changeCase(t0).runNow()))
    __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: scala.Boolean) => collapse(t0).runNow()))
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("cut")(cut.toJsFn)
    __obj.updateDynamic("delete_")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Double) => delete_(t0, t1).runNow()))
    __obj.updateDynamic("endOf")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Boolean) => endOf(t0, t1).runNow()))
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit) => expand(t0).runNow()))
    __obj.updateDynamic("findText")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: typingsJapgolly.winrt.Windows.UI.Text.FindOptions) => findText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCharacterUtf32")(js.Any.fromFunction1((t0: scala.Double) => getCharacterUtf32(t0).runNow()))
    __obj.updateDynamic("getClone")(getClone.toJsFn)
    __obj.updateDynamic("getIndex")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit) => getIndex(t0).runNow()))
    __obj.updateDynamic("getPoint")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.UI.Text.HorizontalCharacterAlignment, t1: typingsJapgolly.winrt.Windows.UI.Text.VerticalCharacterAlignment, t2: typingsJapgolly.winrt.Windows.UI.Text.PointOptions) => getPoint(t0, t1, t2).runNow()))
    __obj.updateDynamic("getRect")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.PointOptions) => getRect(t0).runNow()))
    __obj.updateDynamic("getText")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions) => getText(t0).runNow()))
    __obj.updateDynamic("getTextViaStream")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextGetOptions, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => getTextViaStream(t0, t1).runNow()))
    __obj.updateDynamic("inRange")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextRange) => inRange(t0).runNow()))
    __obj.updateDynamic("inStory")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextRange) => inStory(t0).runNow()))
    __obj.updateDynamic("insertImage")(js.Any.fromFunction6((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.winrt.Windows.UI.Text.VerticalCharacterAlignment, t4: java.lang.String, t5: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => insertImage(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextRange) => isEqual(t0).runNow()))
    __obj.updateDynamic("matchSelection")(matchSelection.toJsFn)
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Double) => move(t0, t1).runNow()))
    __obj.updateDynamic("moveEnd")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Double) => moveEnd(t0, t1).runNow()))
    __obj.updateDynamic("moveStart")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Double) => moveStart(t0, t1).runNow()))
    __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: scala.Double) => paste(t0).runNow()))
    __obj.updateDynamic("scrollIntoView")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.PointOptions) => scrollIntoView(t0).runNow()))
    __obj.updateDynamic("setIndex")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Double, t2: scala.Boolean) => setIndex(t0, t1, t2).runNow()))
    __obj.updateDynamic("setPoint")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Foundation.Point, t1: typingsJapgolly.winrt.Windows.UI.Text.PointOptions, t2: scala.Boolean) => setPoint(t0, t1, t2).runNow()))
    __obj.updateDynamic("setRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setRange(t0, t1).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions, t1: java.lang.String) => setText(t0, t1).runNow()))
    __obj.updateDynamic("setTextViaStream")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextSetOptions, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => setTextViaStream(t0, t1).runNow()))
    __obj.updateDynamic("startOf")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.UI.Text.TextRangeUnit, t1: scala.Boolean) => startOf(t0, t1).runNow()))
    __obj.asInstanceOf[ITextRange]
  }
}

