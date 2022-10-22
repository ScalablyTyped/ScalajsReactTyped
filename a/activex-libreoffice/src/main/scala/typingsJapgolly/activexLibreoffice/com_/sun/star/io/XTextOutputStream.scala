package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to write strings to a stream using a special character encoding.
  *
  * This interfaces allows to write strings to a stream. The character encoding to be used can be set by {@link setEncoding()} . Default encoding is
  * "utf8".
  */
trait XTextOutputStream
  extends StObject
     with XOutputStream {
  
  /**
    * sets character encoding.
    * @param Encoding sets the character encoding that should be used. The character encoding names refer to the document [http://www.iana.org/assignments/cha
    */
  def setEncoding(Encoding: String): Unit
  
  /**
    * writes a string to the stream using the encoding defined by {@link setEncoding()} .
    *
    * Line breaks or delimiters that may be necessary to support {@link XTextInputStream.readLine()} and {@link XTextInputStream.readString()} have to be
    * added manually to the parameter string.
    * @see setEncoding
    * @see XTextInputStream.readLine
    * @see XTextInputStream.readString
    */
  def writeString(aString: String): Unit
}
object XTextOutputStream {
  
  inline def apply(
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setEncoding: String => Callback,
    writeBytes: SeqEquiv[Double] => Callback,
    writeString: String => Callback
  ): XTextOutputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setEncoding = js.Any.fromFunction1((t0: String) => setEncoding(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()))
    __obj.asInstanceOf[XTextOutputStream]
  }
  
  extension [Self <: XTextOutputStream](x: Self) {
    
    inline def setSetEncoding(value: String => Callback): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteString(value: String => Callback): Self = StObject.set(x, "writeString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
