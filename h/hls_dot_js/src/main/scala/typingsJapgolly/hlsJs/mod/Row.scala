package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hlsJs.anon.PartialPenStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CEA-608 row consisting of NR_COLS instances of StyledUnicodeChar.
  * @constructor
  */
trait Row extends StObject {
  
  /**
    * Backspace, move one step back and clear character.
    */
  def backSpace(): Unit
  
  var chars: js.Array[StyledUnicodeChar]
  
  def clear(): Unit
  
  def clearFromPos(startPos: Double): Unit
  
  def clearToEndOfRow(): Unit
  
  def copy(other: Row): Unit
  
  var cueStartTime: js.UndefOr[Double] = js.undefined
  
  var currPenState: PenState
  
  def equals(other: Row): Boolean
  
  def getTextString(): String
  
  def insertChar(byte: Double): Unit
  
  def isEmpty(): Boolean
  
  var logger: CaptionsLogger
  
  /**
    * Move the cursor relative to current position.
    */
  def moveCursor(relPos: Double): Unit
  
  var pos: Double
  
  /**
    *  Set the cursor to a valid column.
    */
  def setCursor(absPos: Double): Unit
  
  def setPenStyles(styles: PartialPenStyles): Unit
}
object Row {
  
  inline def apply(
    backSpace: Callback,
    chars: js.Array[StyledUnicodeChar],
    clear: Callback,
    clearFromPos: Double => Callback,
    clearToEndOfRow: Callback,
    copy: Row => Callback,
    currPenState: PenState,
    equals_ : Row => Boolean,
    getTextString: CallbackTo[String],
    insertChar: Double => Callback,
    isEmpty: CallbackTo[Boolean],
    logger: CaptionsLogger,
    moveCursor: Double => Callback,
    pos: Double,
    setCursor: Double => Callback,
    setPenStyles: PartialPenStyles => Callback
  ): Row = {
    val __obj = js.Dynamic.literal(backSpace = backSpace.toJsFn, chars = chars.asInstanceOf[js.Any], clear = clear.toJsFn, clearFromPos = js.Any.fromFunction1((t0: Double) => clearFromPos(t0).runNow()), clearToEndOfRow = clearToEndOfRow.toJsFn, copy = js.Any.fromFunction1((t0: Row) => copy(t0).runNow()), currPenState = currPenState.asInstanceOf[js.Any], getTextString = getTextString.toJsFn, insertChar = js.Any.fromFunction1((t0: Double) => insertChar(t0).runNow()), isEmpty = isEmpty.toJsFn, logger = logger.asInstanceOf[js.Any], moveCursor = js.Any.fromFunction1((t0: Double) => moveCursor(t0).runNow()), pos = pos.asInstanceOf[js.Any], setCursor = js.Any.fromFunction1((t0: Double) => setCursor(t0).runNow()), setPenStyles = js.Any.fromFunction1((t0: PartialPenStyles) => setPenStyles(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setBackSpace(value: Callback): Self = StObject.set(x, "backSpace", value.toJsFn)
    
    inline def setChars(value: js.Array[StyledUnicodeChar]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    inline def setCharsVarargs(value: StyledUnicodeChar*): Self = StObject.set(x, "chars", js.Array(value*))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClearFromPos(value: Double => Callback): Self = StObject.set(x, "clearFromPos", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClearToEndOfRow(value: Callback): Self = StObject.set(x, "clearToEndOfRow", value.toJsFn)
    
    inline def setCopy(value: Row => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction1((t0: Row) => value(t0).runNow()))
    
    inline def setCueStartTime(value: Double): Self = StObject.set(x, "cueStartTime", value.asInstanceOf[js.Any])
    
    inline def setCueStartTimeUndefined: Self = StObject.set(x, "cueStartTime", js.undefined)
    
    inline def setCurrPenState(value: PenState): Self = StObject.set(x, "currPenState", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: Row => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetTextString(value: CallbackTo[String]): Self = StObject.set(x, "getTextString", value.toJsFn)
    
    inline def setInsertChar(value: Double => Callback): Self = StObject.set(x, "insertChar", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setLogger(value: CaptionsLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMoveCursor(value: Double => Callback): Self = StObject.set(x, "moveCursor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setSetCursor(value: Double => Callback): Self = StObject.set(x, "setCursor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPenStyles(value: PartialPenStyles => Callback): Self = StObject.set(x, "setPenStyles", js.Any.fromFunction1((t0: PartialPenStyles) => value(t0).runNow()))
  }
}
