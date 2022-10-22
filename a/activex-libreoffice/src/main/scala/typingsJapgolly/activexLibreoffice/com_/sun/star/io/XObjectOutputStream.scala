package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * stores {@link XPersistObject} implementations into the stream
  *
  * An implementation of the type {@link XPersistObject} uses this interface to write its internal state into a stream. Have a look there for the
  * explanation of the concept.
  * @see com.sun.star.io.XPersistObject
  */
trait XObjectOutputStream
  extends StObject
     with XDataOutputStream {
  
  /**
    * writes an object to the stream.
    * @param Object the object, which shall serialize itself into the stream.
    */
  def writeObject(Object: XPersistObject): Unit
}
object XObjectOutputStream {
  
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
    writeObject: XPersistObject => Callback,
    writeShort: Double => Callback,
    writeUTF: String => Callback
  ): XObjectOutputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeByte = js.Any.fromFunction1((t0: Double) => writeByte(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeChar = js.Any.fromFunction1((t0: String) => writeChar(t0).runNow()), writeDouble = js.Any.fromFunction1((t0: Double) => writeDouble(t0).runNow()), writeFloat = js.Any.fromFunction1((t0: Double) => writeFloat(t0).runNow()), writeHyper = js.Any.fromFunction1((t0: Double) => writeHyper(t0).runNow()), writeLong = js.Any.fromFunction1((t0: Double) => writeLong(t0).runNow()), writeObject = js.Any.fromFunction1((t0: XPersistObject) => writeObject(t0).runNow()), writeShort = js.Any.fromFunction1((t0: Double) => writeShort(t0).runNow()), writeUTF = js.Any.fromFunction1((t0: String) => writeUTF(t0).runNow()))
    __obj.asInstanceOf[XObjectOutputStream]
  }
  
  extension [Self <: XObjectOutputStream](x: Self) {
    
    inline def setWriteObject(value: XPersistObject => Callback): Self = StObject.set(x, "writeObject", js.Any.fromFunction1((t0: XPersistObject) => value(t0).runNow()))
  }
}
