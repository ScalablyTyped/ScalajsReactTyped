package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to read machine-independent simple data types from a stream.
  * @see com.sun.star.io.XDataOutputStream
  */
trait XDataInputStream
  extends StObject
     with XInputStream {
  
  /** reads in a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def readBoolean(): Double
  
  /** reads an 8-bit byte. */
  def readByte(): Double
  
  /** reads a 16-bit unicode character. */
  def readChar(): String
  
  /** reads a 64-bit IEEE double. */
  def readDouble(): Double
  
  /** reads a 32-bit IEEE float. */
  def readFloat(): Double
  
  /** reads a 64-bit big endian integer. */
  def readHyper(): Double
  
  /** reads a 32-bit big endian integer. */
  def readLong(): Double
  
  /** reads a 16-bit big endian integer. */
  def readShort(): Double
  
  /** reads a string of UTF encoded characters. */
  def readUTF(): String
}
object XDataInputStream {
  
  inline def apply(
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    queryInterface: `type` => Any,
    readBoolean: CallbackTo[Double],
    readByte: CallbackTo[Double],
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: CallbackTo[String],
    readDouble: CallbackTo[Double],
    readFloat: CallbackTo[Double],
    readHyper: CallbackTo[Double],
    readLong: CallbackTo[Double],
    readShort: CallbackTo[Double],
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: CallbackTo[String],
    release: Callback,
    skipBytes: Double => Callback
  ): XDataInputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = readBoolean.toJsFn, readByte = readByte.toJsFn, readBytes = js.Any.fromFunction2(readBytes), readChar = readChar.toJsFn, readDouble = readDouble.toJsFn, readFloat = readFloat.toJsFn, readHyper = readHyper.toJsFn, readLong = readLong.toJsFn, readShort = readShort.toJsFn, readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = readUTF.toJsFn, release = release.toJsFn, skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[XDataInputStream]
  }
  
  extension [Self <: XDataInputStream](x: Self) {
    
    inline def setReadBoolean(value: CallbackTo[Double]): Self = StObject.set(x, "readBoolean", value.toJsFn)
    
    inline def setReadByte(value: CallbackTo[Double]): Self = StObject.set(x, "readByte", value.toJsFn)
    
    inline def setReadChar(value: CallbackTo[String]): Self = StObject.set(x, "readChar", value.toJsFn)
    
    inline def setReadDouble(value: CallbackTo[Double]): Self = StObject.set(x, "readDouble", value.toJsFn)
    
    inline def setReadFloat(value: CallbackTo[Double]): Self = StObject.set(x, "readFloat", value.toJsFn)
    
    inline def setReadHyper(value: CallbackTo[Double]): Self = StObject.set(x, "readHyper", value.toJsFn)
    
    inline def setReadLong(value: CallbackTo[Double]): Self = StObject.set(x, "readLong", value.toJsFn)
    
    inline def setReadShort(value: CallbackTo[Double]): Self = StObject.set(x, "readShort", value.toJsFn)
    
    inline def setReadUTF(value: CallbackTo[String]): Self = StObject.set(x, "readUTF", value.toJsFn)
  }
}
