package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextRange extends StObject {
  
  def canPaste(format: Double): Boolean
  
  def changeCase(value: LetterCase): Unit
  
  var character: String
  
  var characterFormat: ITextCharacterFormat
  
  def collapse(value: Boolean): Unit
  
  def copy(): Unit
  
  def cut(): Unit
  
  def delete_(unit: TextRangeUnit, count: Double): Double
  
  def endOf(unit: TextRangeUnit, extend: Boolean): Double
  
  var endPosition: Double
  
  def expand(unit: TextRangeUnit): Double
  
  def findText(value: String, scanLength: Double, options: FindOptions): Double
  
  var formattedText: ITextRange
  
  def getCharacterUtf32(offset: Double): Double
  
  def getClone(): ITextRange
  
  def getIndex(unit: TextRangeUnit): Double
  
  def getPoint(
    horizontalAlign: HorizontalCharacterAlignment,
    verticalAlign: VerticalCharacterAlignment,
    options: PointOptions
  ): Point
  
  def getRect(options: PointOptions): Hit
  
  def getText(options: TextGetOptions): String
  
  def getTextViaStream(options: TextGetOptions, value: IRandomAccessStream): Unit
  
  var gravity: RangeGravity
  
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
  
  var length: Double
  
  var link: String
  
  def matchSelection(): Unit
  
  def move(unit: TextRangeUnit, count: Double): Double
  
  def moveEnd(unit: TextRangeUnit, count: Double): Double
  
  def moveStart(unit: TextRangeUnit, count: Double): Double
  
  var paragraphFormat: ITextParagraphFormat
  
  def paste(format: Double): Unit
  
  def scrollIntoView(value: PointOptions): Unit
  
  def setIndex(unit: TextRangeUnit, index: Double, extend: Boolean): Unit
  
  def setPoint(point: Point, options: PointOptions, extend: Boolean): Unit
  
  def setRange(startPosition: Double, endPosition: Double): Unit
  
  def setText(options: TextSetOptions, value: String): Unit
  
  def setTextViaStream(options: TextSetOptions, value: IRandomAccessStream): Unit
  
  def startOf(unit: TextRangeUnit, extend: Boolean): Double
  
  var startPosition: Double
  
  var storyLength: Double
  
  var text: String
}
object ITextRange {
  
  inline def apply(
    canPaste: Double => Boolean,
    changeCase: LetterCase => Callback,
    character: String,
    characterFormat: ITextCharacterFormat,
    collapse: Boolean => Callback,
    copy: Callback,
    cut: Callback,
    delete_ : (TextRangeUnit, Double) => Double,
    endOf: (TextRangeUnit, Boolean) => Double,
    endPosition: Double,
    expand: TextRangeUnit => Double,
    findText: (String, Double, FindOptions) => Double,
    formattedText: ITextRange,
    getCharacterUtf32: Double => Double,
    getClone: CallbackTo[ITextRange],
    getIndex: TextRangeUnit => Double,
    getPoint: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point,
    getRect: PointOptions => Hit,
    getText: TextGetOptions => String,
    getTextViaStream: (TextGetOptions, IRandomAccessStream) => Callback,
    gravity: RangeGravity,
    inRange: ITextRange => Boolean,
    inStory: ITextRange => Boolean,
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Callback,
    isEqual: ITextRange => Boolean,
    length: Double,
    link: String,
    matchSelection: Callback,
    move: (TextRangeUnit, Double) => Double,
    moveEnd: (TextRangeUnit, Double) => Double,
    moveStart: (TextRangeUnit, Double) => Double,
    paragraphFormat: ITextParagraphFormat,
    paste: Double => Callback,
    scrollIntoView: PointOptions => Callback,
    setIndex: (TextRangeUnit, Double, Boolean) => Callback,
    setPoint: (Point, PointOptions, Boolean) => Callback,
    setRange: (Double, Double) => Callback,
    setText: (TextSetOptions, String) => Callback,
    setTextViaStream: (TextSetOptions, IRandomAccessStream) => Callback,
    startOf: (TextRangeUnit, Boolean) => Double,
    startPosition: Double,
    storyLength: Double,
    text: String
  ): ITextRange = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1((t0: LetterCase) => changeCase(t0).runNow()), character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], collapse = js.Any.fromFunction1((t0: Boolean) => collapse(t0).runNow()), copy = copy.toJsFn, cut = cut.toJsFn, delete_ = js.Any.fromFunction2(delete_), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText.asInstanceOf[js.Any], getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = getClone.toJsFn, getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2((t0: TextGetOptions, t1: IRandomAccessStream) => (getTextViaStream(t0, t1)).runNow()), gravity = gravity.asInstanceOf[js.Any], inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: VerticalCharacterAlignment, t4: String, t5: IRandomAccessStream) => (insertImage(t0, t1, t2, t3, t4, t5)).runNow()), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], matchSelection = matchSelection.toJsFn, move = js.Any.fromFunction2(move), moveEnd = js.Any.fromFunction2(moveEnd), moveStart = js.Any.fromFunction2(moveStart), paragraphFormat = paragraphFormat.asInstanceOf[js.Any], paste = js.Any.fromFunction1((t0: Double) => paste(t0).runNow()), scrollIntoView = js.Any.fromFunction1((t0: PointOptions) => scrollIntoView(t0).runNow()), setIndex = js.Any.fromFunction3((t0: TextRangeUnit, t1: Double, t2: Boolean) => (setIndex(t0, t1, t2)).runNow()), setPoint = js.Any.fromFunction3((t0: Point, t1: PointOptions, t2: Boolean) => (setPoint(t0, t1, t2)).runNow()), setRange = js.Any.fromFunction2((t0: Double, t1: Double) => (setRange(t0, t1)).runNow()), setText = js.Any.fromFunction2((t0: TextSetOptions, t1: String) => (setText(t0, t1)).runNow()), setTextViaStream = js.Any.fromFunction2((t0: TextSetOptions, t1: IRandomAccessStream) => (setTextViaStream(t0, t1)).runNow()), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextRange]
  }
  
  extension [Self <: ITextRange](x: Self) {
    
    inline def setCanPaste(value: Double => Boolean): Self = StObject.set(x, "canPaste", js.Any.fromFunction1(value))
    
    inline def setChangeCase(value: LetterCase => Callback): Self = StObject.set(x, "changeCase", js.Any.fromFunction1((t0: LetterCase) => value(t0).runNow()))
    
    inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setCharacterFormat(value: ITextCharacterFormat): Self = StObject.set(x, "characterFormat", value.asInstanceOf[js.Any])
    
    inline def setCollapse(value: Boolean => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setCut(value: Callback): Self = StObject.set(x, "cut", value.toJsFn)
    
    inline def setDelete_(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "delete_", js.Any.fromFunction2(value))
    
    inline def setEndOf(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "endOf", js.Any.fromFunction2(value))
    
    inline def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: TextRangeUnit => Double): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setFindText(value: (String, Double, FindOptions) => Double): Self = StObject.set(x, "findText", js.Any.fromFunction3(value))
    
    inline def setFormattedText(value: ITextRange): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    inline def setGetCharacterUtf32(value: Double => Double): Self = StObject.set(x, "getCharacterUtf32", js.Any.fromFunction1(value))
    
    inline def setGetClone(value: CallbackTo[ITextRange]): Self = StObject.set(x, "getClone", value.toJsFn)
    
    inline def setGetIndex(value: TextRangeUnit => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    inline def setGetPoint(value: (HorizontalCharacterAlignment, VerticalCharacterAlignment, PointOptions) => Point): Self = StObject.set(x, "getPoint", js.Any.fromFunction3(value))
    
    inline def setGetRect(value: PointOptions => Hit): Self = StObject.set(x, "getRect", js.Any.fromFunction1(value))
    
    inline def setGetText(value: TextGetOptions => String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    inline def setGetTextViaStream(value: (TextGetOptions, IRandomAccessStream) => Callback): Self = StObject.set(x, "getTextViaStream", js.Any.fromFunction2((t0: TextGetOptions, t1: IRandomAccessStream) => (value(t0, t1)).runNow()))
    
    inline def setGravity(value: RangeGravity): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setInRange(value: ITextRange => Boolean): Self = StObject.set(x, "inRange", js.Any.fromFunction1(value))
    
    inline def setInStory(value: ITextRange => Boolean): Self = StObject.set(x, "inStory", js.Any.fromFunction1(value))
    
    inline def setInsertImage(
      value: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Callback
    ): Self = StObject.set(x, "insertImage", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: VerticalCharacterAlignment, t4: String, t5: IRandomAccessStream) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setIsEqual(value: ITextRange => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMatchSelection(value: Callback): Self = StObject.set(x, "matchSelection", value.toJsFn)
    
    inline def setMove(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
    
    inline def setMoveEnd(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "moveEnd", js.Any.fromFunction2(value))
    
    inline def setMoveStart(value: (TextRangeUnit, Double) => Double): Self = StObject.set(x, "moveStart", js.Any.fromFunction2(value))
    
    inline def setParagraphFormat(value: ITextParagraphFormat): Self = StObject.set(x, "paragraphFormat", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: Double => Callback): Self = StObject.set(x, "paste", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setScrollIntoView(value: PointOptions => Callback): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction1((t0: PointOptions) => value(t0).runNow()))
    
    inline def setSetIndex(value: (TextRangeUnit, Double, Boolean) => Callback): Self = StObject.set(x, "setIndex", js.Any.fromFunction3((t0: TextRangeUnit, t1: Double, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetPoint(value: (Point, PointOptions, Boolean) => Callback): Self = StObject.set(x, "setPoint", js.Any.fromFunction3((t0: Point, t1: PointOptions, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetRange(value: (Double, Double) => Callback): Self = StObject.set(x, "setRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetText(value: (TextSetOptions, String) => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction2((t0: TextSetOptions, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetTextViaStream(value: (TextSetOptions, IRandomAccessStream) => Callback): Self = StObject.set(x, "setTextViaStream", js.Any.fromFunction2((t0: TextSetOptions, t1: IRandomAccessStream) => (value(t0, t1)).runNow()))
    
    inline def setStartOf(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "startOf", js.Any.fromFunction2(value))
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    inline def setStoryLength(value: Double): Self = StObject.set(x, "storyLength", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
