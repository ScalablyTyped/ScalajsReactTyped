package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStreamReader
  extends StObject
     with TextStreamBase {
  
  /**
    * Indicates whether the stream pointer position is at the end of a line.
    */
  /* standard scripthost */
  var AtEndOfLine: scala.Boolean
  
  /**
    * Indicates whether the stream pointer position is at the end of a stream.
    */
  /* standard scripthost */
  var AtEndOfStream: scala.Boolean
  
  /**
    * Returns a specified number of characters from an input stream, starting at the current pointer position.
    * Does not return until the ENTER key is pressed.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  /* standard scripthost */
  def Read(characters: Double): java.lang.String
  
  /**
    * Returns all characters from an input stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  /* standard scripthost */
  def ReadAll(): java.lang.String
  
  /**
    * Returns an entire line from an input stream.
    * Although this method extracts the newline character, it does not add it to the returned string.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  /* standard scripthost */
  def ReadLine(): java.lang.String
  
  /**
    * Skips a specified number of characters when reading from an input text stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
    */
  /* standard scripthost */
  def Skip(characters: Double): Unit
  
  /**
    * Skips the next line when reading from an input text stream.
    * Can only be used on a stream in reading mode, not writing or appending mode.
    */
  /* standard scripthost */
  def SkipLine(): Unit
}
object TextStreamReader {
  
  inline def apply(
    AtEndOfLine: scala.Boolean,
    AtEndOfStream: scala.Boolean,
    Close: Callback,
    Column: Double,
    Line: Double,
    Read: Double => java.lang.String,
    ReadAll: CallbackTo[java.lang.String],
    ReadLine: CallbackTo[java.lang.String],
    Skip: Double => Callback,
    SkipLine: Callback
  ): TextStreamReader = {
    val __obj = js.Dynamic.literal(AtEndOfLine = AtEndOfLine.asInstanceOf[js.Any], AtEndOfStream = AtEndOfStream.asInstanceOf[js.Any], Close = Close.toJsFn, Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Read = js.Any.fromFunction1(Read), ReadAll = ReadAll.toJsFn, ReadLine = ReadLine.toJsFn, Skip = js.Any.fromFunction1((t0: Double) => Skip(t0).runNow()), SkipLine = SkipLine.toJsFn)
    __obj.asInstanceOf[TextStreamReader]
  }
  
  extension [Self <: TextStreamReader](x: Self) {
    
    inline def setAtEndOfLine(value: scala.Boolean): Self = StObject.set(x, "AtEndOfLine", value.asInstanceOf[js.Any])
    
    inline def setAtEndOfStream(value: scala.Boolean): Self = StObject.set(x, "AtEndOfStream", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Double => java.lang.String): Self = StObject.set(x, "Read", js.Any.fromFunction1(value))
    
    inline def setReadAll(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "ReadAll", value.toJsFn)
    
    inline def setReadLine(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "ReadLine", value.toJsFn)
    
    inline def setSkip(value: Double => Callback): Self = StObject.set(x, "Skip", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSkipLine(value: Callback): Self = StObject.set(x, "SkipLine", value.toJsFn)
  }
}
