package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * writes structured data to a chained {@link XOutputStream} .
  *
  * An implementation of this service in general does not need to buffer data itself.
  */
trait DataOutputStream
  extends StObject
     with XDataOutputStream
     with XActiveDataSource
object DataOutputStream {
  
  inline def apply(
    OutputStream: XOutputStream,
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    getOutputStream: CallbackTo[XOutputStream],
    queryInterface: `type` => Any,
    release: Callback,
    setOutputStream: XOutputStream => Callback,
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
  ): DataOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, getOutputStream = getOutputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeByte = js.Any.fromFunction1((t0: Double) => writeByte(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeChar = js.Any.fromFunction1((t0: String) => writeChar(t0).runNow()), writeDouble = js.Any.fromFunction1((t0: Double) => writeDouble(t0).runNow()), writeFloat = js.Any.fromFunction1((t0: Double) => writeFloat(t0).runNow()), writeHyper = js.Any.fromFunction1((t0: Double) => writeHyper(t0).runNow()), writeLong = js.Any.fromFunction1((t0: Double) => writeLong(t0).runNow()), writeShort = js.Any.fromFunction1((t0: Double) => writeShort(t0).runNow()), writeUTF = js.Any.fromFunction1((t0: String) => writeUTF(t0).runNow()))
    __obj.asInstanceOf[DataOutputStream]
  }
}
