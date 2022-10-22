package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a stream which allows writing the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataOutputStream} service; furthermore, the stream needs to be chained
  * to a {@link XMarkableStream} . Therefore, it also provides the {@link XMarkableStream} interface, but it delegates the calls to the chained object.
  * The written objects are held until this instance is destroyed. The references to the objects are written as four-byte integers and begin at 1. Data
  * format is written:
  *
  * `; short   InfoLength; long    ObjectReference // 0 indicates no object; UTF     ServiceName     // length of 0 indicates this is only a reference;
  * long    ObjectLength    // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData      // the data of the
  * object; `
  */
trait ObjectOutputStream
  extends StObject
     with XObjectOutputStream
     with XActiveDataSource
     with XConnectable
object ObjectOutputStream {
  
  inline def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    getOutputStream: CallbackTo[XOutputStream],
    getPredecessor: CallbackTo[XConnectable],
    getSuccessor: CallbackTo[XConnectable],
    queryInterface: `type` => Any,
    release: Callback,
    setOutputStream: XOutputStream => Callback,
    setPredecessor: XConnectable => Callback,
    setSuccessor: XConnectable => Callback,
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
  ): ObjectOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, getOutputStream = getOutputStream.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), setPredecessor = js.Any.fromFunction1((t0: XConnectable) => setPredecessor(t0).runNow()), setSuccessor = js.Any.fromFunction1((t0: XConnectable) => setSuccessor(t0).runNow()), writeBoolean = js.Any.fromFunction1((t0: Boolean) => writeBoolean(t0).runNow()), writeByte = js.Any.fromFunction1((t0: Double) => writeByte(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeChar = js.Any.fromFunction1((t0: String) => writeChar(t0).runNow()), writeDouble = js.Any.fromFunction1((t0: Double) => writeDouble(t0).runNow()), writeFloat = js.Any.fromFunction1((t0: Double) => writeFloat(t0).runNow()), writeHyper = js.Any.fromFunction1((t0: Double) => writeHyper(t0).runNow()), writeLong = js.Any.fromFunction1((t0: Double) => writeLong(t0).runNow()), writeObject = js.Any.fromFunction1((t0: XPersistObject) => writeObject(t0).runNow()), writeShort = js.Any.fromFunction1((t0: Double) => writeShort(t0).runNow()), writeUTF = js.Any.fromFunction1((t0: String) => writeUTF(t0).runNow()))
    __obj.asInstanceOf[ObjectOutputStream]
  }
}
