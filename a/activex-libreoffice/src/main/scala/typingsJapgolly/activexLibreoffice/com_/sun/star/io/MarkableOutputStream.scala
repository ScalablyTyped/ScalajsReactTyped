package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to set marks in an outputstream and to later jump back to these marks.
  *
  * The implementation stores the data as long as marks exists and later writes these data into the output stream, that has been set previously at the
  * {@link XActiveDataSource} interface.
  */
trait MarkableOutputStream
  extends StObject
     with XOutputStream
     with XMarkableStream
     with XActiveDataSource
     with XConnectable
object MarkableOutputStream {
  
  inline def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: Callback,
    closeOutput: Callback,
    createMark: CallbackTo[Double],
    deleteMark: Double => Callback,
    flush: Callback,
    getOutputStream: CallbackTo[XOutputStream],
    getPredecessor: CallbackTo[XConnectable],
    getSuccessor: CallbackTo[XConnectable],
    jumpToFurthest: Callback,
    jumpToMark: Double => Callback,
    offsetToMark: Double => Double,
    queryInterface: `type` => Any,
    release: Callback,
    setOutputStream: XOutputStream => Callback,
    setPredecessor: XConnectable => Callback,
    setSuccessor: XConnectable => Callback,
    writeBytes: SeqEquiv[Double] => Callback
  ): MarkableOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, createMark = createMark.toJsFn, deleteMark = js.Any.fromFunction1((t0: Double) => deleteMark(t0).runNow()), flush = flush.toJsFn, getOutputStream = getOutputStream.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, jumpToFurthest = jumpToFurthest.toJsFn, jumpToMark = js.Any.fromFunction1((t0: Double) => jumpToMark(t0).runNow()), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), setPredecessor = js.Any.fromFunction1((t0: XConnectable) => setPredecessor(t0).runNow()), setSuccessor = js.Any.fromFunction1((t0: XConnectable) => setSuccessor(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()))
    __obj.asInstanceOf[MarkableOutputStream]
  }
}
