package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to set marks in an inputstream and to later jump back to these marks.
  *
  * The implementation reads the original data from the input stream, that has been set previously at the {@link XActiveDataSink} interface. In general
  * the implementation must buffer the data.
  */
trait MarkableInputStream
  extends StObject
     with XInputStream
     with XMarkableStream
     with XActiveDataSink
     with XConnectable
object MarkableInputStream {
  
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
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: Callback,
    setInputStream: XInputStream => Callback,
    setPredecessor: XConnectable => Callback,
    setSuccessor: XConnectable => Callback,
    skipBytes: Double => Callback
  ): MarkableInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, createMark = createMark.toJsFn, deleteMark = js.Any.fromFunction1((t0: Double) => deleteMark(t0).runNow()), getInputStream = getInputStream.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, jumpToFurthest = jumpToFurthest.toJsFn, jumpToMark = js.Any.fromFunction1((t0: Double) => jumpToMark(t0).runNow()), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = release.toJsFn, setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setPredecessor = js.Any.fromFunction1((t0: XConnectable) => setPredecessor(t0).runNow()), setSuccessor = js.Any.fromFunction1((t0: XConnectable) => setSuccessor(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[MarkableInputStream]
  }
}
