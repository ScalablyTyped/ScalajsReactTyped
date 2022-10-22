package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to write machine-independent simple data types to a stream.
  * @see com.sun.star.io.XDataInputStream
  */
trait XDataOutputStream
  extends StObject
     with XOutputStream {
  
  /** writes a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def writeBoolean(Value: Boolean): Unit
  
  /** writes an 8-bit byte. */
  def writeByte(Value: Double): Unit
  
  /** writes a 16-bit character. */
  def writeChar(Value: String): Unit
  
  /** writes a 64-bit IEEE double. */
  def writeDouble(Value: Double): Unit
  
  /** writes a 32-bit IEEE float. */
  def writeFloat(Value: Double): Unit
  
  /** writes a 64-bit big endian integer. */
  def writeHyper(Value: Double): Unit
  
  /** writes a 32-bit big endian integer. */
  def writeLong(Value: Double): Unit
  
  /** writes a 16-bit big endian integer. */
  def writeShort(Value: Double): Unit
  
  /** writes a string in UTF format. */
  def writeUTF(Value: String): Unit
}
object XDataOutputStream {
  
  inline def apply(
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    writeBoolean: Boolean => Callback,
    writeByte: Double => Callback,
    writeBytes: SeqEquiv[Double] => Callback,
    writeChar: String => Callback,
    writeDouble: Double => Callback,
    writeFloat: Double => Callback,
    writeHyper: Double => Callback,
    writeLong: Double => Callback,
    writeShort: Double => Callback,
    writeUTF: String => Callback
  ): XDataOutputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeByte = js.Any.fromFunction1((t0: Double) => writeByte(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeChar = js.Any.fromFunction1((t0: String) => writeChar(t0).runNow()), writeDouble = js.Any.fromFunction1((t0: Double) => writeDouble(t0).runNow()), writeFloat = js.Any.fromFunction1((t0: Double) => writeFloat(t0).runNow()), writeHyper = js.Any.fromFunction1((t0: Double) => writeHyper(t0).runNow()), writeLong = js.Any.fromFunction1((t0: Double) => writeLong(t0).runNow()), writeShort = js.Any.fromFunction1((t0: Double) => writeShort(t0).runNow()), writeUTF = js.Any.fromFunction1((t0: String) => writeUTF(t0).runNow()))
    __obj.asInstanceOf[XDataOutputStream]
  }
  
  extension [Self <: XDataOutputStream](x: Self) {
    
    inline def setWriteBoolean(value: Boolean => Callback): Self = StObject.set(x, "writeBoolean", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setWriteByte(value: Double => Callback): Self = StObject.set(x, "writeByte", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteChar(value: String => Callback): Self = StObject.set(x, "writeChar", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteDouble(value: Double => Callback): Self = StObject.set(x, "writeDouble", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteFloat(value: Double => Callback): Self = StObject.set(x, "writeFloat", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteHyper(value: Double => Callback): Self = StObject.set(x, "writeHyper", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteLong(value: Double => Callback): Self = StObject.set(x, "writeLong", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteShort(value: Double => Callback): Self = StObject.set(x, "writeShort", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWriteUTF(value: String => Callback): Self = StObject.set(x, "writeUTF", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
