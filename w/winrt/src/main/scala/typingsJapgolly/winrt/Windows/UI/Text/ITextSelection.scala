package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextSelection
  extends StObject
     with ITextRange {
  
  def endKey(unit: TextRangeUnit, extend: Boolean): Double
  
  def homeKey(unit: TextRangeUnit, extend: Boolean): Double
  
  def moveDown(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  def moveLeft(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  def moveRight(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  def moveUp(unit: TextRangeUnit, count: Double, extend: Boolean): Double
  
  var options: SelectionOptions
  
  var `type`: SelectionType
  
  def typeText(value: String): Unit
}
object ITextSelection {
  
  inline def apply(
    canPaste: Double => Boolean,
    changeCase: LetterCase => Callback,
    character: String,
    characterFormat: ITextCharacterFormat,
    collapse: Boolean => Callback,
    copy: Callback,
    cut: Callback,
    delete_ : (TextRangeUnit, Double) => Double,
    endKey: (TextRangeUnit, Boolean) => Double,
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
    homeKey: (TextRangeUnit, Boolean) => Double,
    inRange: ITextRange => Boolean,
    inStory: ITextRange => Boolean,
    insertImage: (Double, Double, Double, VerticalCharacterAlignment, String, IRandomAccessStream) => Callback,
    isEqual: ITextRange => Boolean,
    length: Double,
    link: String,
    matchSelection: Callback,
    move: (TextRangeUnit, Double) => Double,
    moveDown: (TextRangeUnit, Double, Boolean) => Double,
    moveEnd: (TextRangeUnit, Double) => Double,
    moveLeft: (TextRangeUnit, Double, Boolean) => Double,
    moveRight: (TextRangeUnit, Double, Boolean) => Double,
    moveStart: (TextRangeUnit, Double) => Double,
    moveUp: (TextRangeUnit, Double, Boolean) => Double,
    options: SelectionOptions,
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
    text: String,
    `type`: SelectionType,
    typeText: String => Callback
  ): ITextSelection = {
    val __obj = js.Dynamic.literal(canPaste = js.Any.fromFunction1(canPaste), changeCase = js.Any.fromFunction1((t0: LetterCase) => changeCase(t0).runNow()), character = character.asInstanceOf[js.Any], characterFormat = characterFormat.asInstanceOf[js.Any], collapse = js.Any.fromFunction1((t0: Boolean) => collapse(t0).runNow()), copy = copy.toJsFn, cut = cut.toJsFn, delete_ = js.Any.fromFunction2(delete_), endKey = js.Any.fromFunction2(endKey), endOf = js.Any.fromFunction2(endOf), endPosition = endPosition.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), findText = js.Any.fromFunction3(findText), formattedText = formattedText.asInstanceOf[js.Any], getCharacterUtf32 = js.Any.fromFunction1(getCharacterUtf32), getClone = getClone.toJsFn, getIndex = js.Any.fromFunction1(getIndex), getPoint = js.Any.fromFunction3(getPoint), getRect = js.Any.fromFunction1(getRect), getText = js.Any.fromFunction1(getText), getTextViaStream = js.Any.fromFunction2((t0: TextGetOptions, t1: IRandomAccessStream) => (getTextViaStream(t0, t1)).runNow()), gravity = gravity.asInstanceOf[js.Any], homeKey = js.Any.fromFunction2(homeKey), inRange = js.Any.fromFunction1(inRange), inStory = js.Any.fromFunction1(inStory), insertImage = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: VerticalCharacterAlignment, t4: String, t5: IRandomAccessStream) => (insertImage(t0, t1, t2, t3, t4, t5)).runNow()), isEqual = js.Any.fromFunction1(isEqual), length = length.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], matchSelection = matchSelection.toJsFn, move = js.Any.fromFunction2(move), moveDown = js.Any.fromFunction3(moveDown), moveEnd = js.Any.fromFunction2(moveEnd), moveLeft = js.Any.fromFunction3(moveLeft), moveRight = js.Any.fromFunction3(moveRight), moveStart = js.Any.fromFunction2(moveStart), moveUp = js.Any.fromFunction3(moveUp), options = options.asInstanceOf[js.Any], paragraphFormat = paragraphFormat.asInstanceOf[js.Any], paste = js.Any.fromFunction1((t0: Double) => paste(t0).runNow()), scrollIntoView = js.Any.fromFunction1((t0: PointOptions) => scrollIntoView(t0).runNow()), setIndex = js.Any.fromFunction3((t0: TextRangeUnit, t1: Double, t2: Boolean) => (setIndex(t0, t1, t2)).runNow()), setPoint = js.Any.fromFunction3((t0: Point, t1: PointOptions, t2: Boolean) => (setPoint(t0, t1, t2)).runNow()), setRange = js.Any.fromFunction2((t0: Double, t1: Double) => (setRange(t0, t1)).runNow()), setText = js.Any.fromFunction2((t0: TextSetOptions, t1: String) => (setText(t0, t1)).runNow()), setTextViaStream = js.Any.fromFunction2((t0: TextSetOptions, t1: IRandomAccessStream) => (setTextViaStream(t0, t1)).runNow()), startOf = js.Any.fromFunction2(startOf), startPosition = startPosition.asInstanceOf[js.Any], storyLength = storyLength.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], typeText = js.Any.fromFunction1((t0: String) => typeText(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextSelection]
  }
  
  extension [Self <: ITextSelection](x: Self) {
    
    inline def setEndKey(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "endKey", js.Any.fromFunction2(value))
    
    inline def setHomeKey(value: (TextRangeUnit, Boolean) => Double): Self = StObject.set(x, "homeKey", js.Any.fromFunction2(value))
    
    inline def setMoveDown(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveDown", js.Any.fromFunction3(value))
    
    inline def setMoveLeft(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveLeft", js.Any.fromFunction3(value))
    
    inline def setMoveRight(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveRight", js.Any.fromFunction3(value))
    
    inline def setMoveUp(value: (TextRangeUnit, Double, Boolean) => Double): Self = StObject.set(x, "moveUp", js.Any.fromFunction3(value))
    
    inline def setOptions(value: SelectionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setType(value: SelectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeText(value: String => Callback): Self = StObject.set(x, "typeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
