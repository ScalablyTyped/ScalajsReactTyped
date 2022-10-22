package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to read strings from a stream.
  *
  * This interfaces allows to read strings separated by delimiters and to read lines. The character encoding to be used can be set by {@link
  * setEncoding()} . Default encoding is "utf8".
  */
trait XTextInputStream
  extends StObject
     with XInputStream {
  
  /**
    * Returns the EOF status.
    *
    * This method has to be used to detect if the end of the stream is reached.
    *
    * **Important:** This cannot be detected by asking for an empty string because that can be a valid return value of {@link readLine()} (if the line is
    * empty) and {@link readString()} (if a delimiter is directly followed by the next one).
    * @returns `TRUE` , if the end of file is reached, so that no next string can be read. `FALSE` otherwise
    */
  def isEOF(): Boolean
  
  /**
    * reads text until a line break (CR, LF, or CR/LF) or EOF is found and returns it as string (without CR, LF).
    *
    * The read characters are converted according to the encoding defined by {@link setEncoding()} . If EOF is already reached before calling this method an
    * empty string is returned.
    * @see setEncoding
    * @see isEOF
    */
  def readLine(): String
  
  /**
    * reads text until one of the given delimiter characters or EOF is found and returns it as string (without delimiter).
    *
    * **Important:** CR/LF is not used as default delimiter! So if no delimiter is defined or none of the delimiters is found, the stream will be read to
    * EOF. The read characters are converted according to the encoding defined by {@link setEncoding()} . If EOF is already reached before calling this
    * method an empty string is returned.
    * @see setEncoding
    * @see isEOF
    */
  def readString(Delimiters: SeqEquiv[String], bRemoveDelimiter: Boolean): String
  
  /**
    * sets character encoding.
    * @param Encoding sets the character encoding that should be used. The character encoding names refer to the document [http://www.iana.org/assignments/cha
    */
  def setEncoding(Encoding: String): Unit
}
object XTextInputStream {
  
  inline def apply(
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    isEOF: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readLine: CallbackTo[String],
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readString: (SeqEquiv[String], Boolean) => String,
    release: Callback,
    setEncoding: String => Callback,
    skipBytes: Double => Callback
  ): XTextInputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, isEOF = isEOF.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readLine = readLine.toJsFn, readSomeBytes = js.Any.fromFunction2(readSomeBytes), readString = js.Any.fromFunction2(readString), release = release.toJsFn, setEncoding = js.Any.fromFunction1((t0: String) => setEncoding(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[XTextInputStream]
  }
  
  extension [Self <: XTextInputStream](x: Self) {
    
    inline def setIsEOF(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEOF", value.toJsFn)
    
    inline def setReadLine(value: CallbackTo[String]): Self = StObject.set(x, "readLine", value.toJsFn)
    
    inline def setReadString(value: (SeqEquiv[String], Boolean) => String): Self = StObject.set(x, "readString", js.Any.fromFunction2(value))
    
    inline def setSetEncoding(value: String => Callback): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
