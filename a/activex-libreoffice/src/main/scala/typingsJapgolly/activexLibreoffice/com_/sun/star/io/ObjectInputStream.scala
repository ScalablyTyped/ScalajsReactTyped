package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a stream which allows reading the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataInputStream} service. It must be chained to an {@link
  * XMarkableStream} . Therefore, it provides the {@link XMarkableStream} interface, and delegates the calls to the chained object.
  *
  * The written objects are held until this instance is destroyed. The references to the objects are read as four-byte integers. Data format reads:
  *
  * `; short   InfoLength; long    ObjectReference  // 0 indicates no object; UTF     ServiceName      // length of 0 indicates this is only a reference;
  * long    ObjectLength     // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData       // the data of the
  * object; ...                      // skipping additional data; `
  */
trait ObjectInputStream
  extends StObject
     with XObjectInputStream
     with XActiveDataSink
     with XConnectable
     with XMarkableStream
object ObjectInputStream {
  
  inline def apply(
    InputStream: XInputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    createMark: CallbackTo[Double],
    deleteMark: Double => Callback,
    getInputStream: CallbackTo[XInputStream],
    getPredecessor: CallbackTo[XConnectable],
    getSuccessor: CallbackTo[XConnectable],
    jumpToFurthest: Callback,
    jumpToMark: Double => Callback,
    offsetToMark: Double => Double,
    queryInterface: `type` => Any,
    readBoolean: CallbackTo[Double],
    readByte: CallbackTo[Double],
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: CallbackTo[String],
    readDouble: CallbackTo[Double],
    readFloat: CallbackTo[Double],
    readHyper: CallbackTo[Double],
    readLong: CallbackTo[Double],
    readObject: CallbackTo[XPersistObject],
    readShort: CallbackTo[Double],
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: CallbackTo[String],
    release: Callback,
    setInputStream: XInputStream => Callback,
    setPredecessor: XConnectable => Callback,
    setSuccessor: XConnectable => Callback,
    skipBytes: Double => Callback
  ): ObjectInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, createMark = createMark.toJsFn, deleteMark = js.Any.fromFunction1((t0: Double) => deleteMark(t0).runNow()), getInputStream = getInputStream.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, jumpToFurthest = jumpToFurthest.toJsFn, jumpToMark = js.Any.fromFunction1((t0: Double) => jumpToMark(t0).runNow()), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = readBoolean.toJsFn, readByte = readByte.toJsFn, readBytes = js.Any.fromFunction2(readBytes), readChar = readChar.toJsFn, readDouble = readDouble.toJsFn, readFloat = readFloat.toJsFn, readHyper = readHyper.toJsFn, readLong = readLong.toJsFn, readObject = readObject.toJsFn, readShort = readShort.toJsFn, readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = readUTF.toJsFn, release = release.toJsFn, setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setPredecessor = js.Any.fromFunction1((t0: XConnectable) => setPredecessor(t0).runNow()), setSuccessor = js.Any.fromFunction1((t0: XConnectable) => setSuccessor(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[ObjectInputStream]
  }
}
