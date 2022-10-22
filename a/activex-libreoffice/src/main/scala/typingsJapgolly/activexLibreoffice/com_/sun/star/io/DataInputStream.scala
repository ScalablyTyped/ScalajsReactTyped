package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * reads structured data from a chained {@link XInputStream} .
  *
  * An implementation of this service in general does not need to buffer data itself.
  * @see com.sun.star.io.ObjectInputStream
  */
trait DataInputStream
  extends StObject
     with XDataInputStream
     with XActiveDataSink
     with XConnectable
object DataInputStream {
  
  inline def apply(
    InputStream: XInputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    getInputStream: CallbackTo[XInputStream],
    getPredecessor: CallbackTo[XConnectable],
    getSuccessor: CallbackTo[XConnectable],
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
    setInputStream: XInputStream => Callback,
    setPredecessor: XConnectable => Callback,
    setSuccessor: XConnectable => Callback,
    skipBytes: Double => Callback
  ): DataInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, getInputStream = getInputStream.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = readBoolean.toJsFn, readByte = readByte.toJsFn, readBytes = js.Any.fromFunction2(readBytes), readChar = readChar.toJsFn, readDouble = readDouble.toJsFn, readFloat = readFloat.toJsFn, readHyper = readHyper.toJsFn, readLong = readLong.toJsFn, readShort = readShort.toJsFn, readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = readUTF.toJsFn, release = release.toJsFn, setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setPredecessor = js.Any.fromFunction1((t0: XConnectable) => setPredecessor(t0).runNow()), setSuccessor = js.Any.fromFunction1((t0: XConnectable) => setSuccessor(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[DataInputStream]
  }
}
