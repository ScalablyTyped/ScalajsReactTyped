package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The implementation of an output stream and an input stream.
  *
  * All data written through the outputstream is buffered until it is read again from the input stream. Often two different threads access input and
  * outputstream.
  *
  * With the pipe-service, an outputstream can be converted into an input stream at the cost of an additional buffer.
  * @since LibreOffice 4.0
  */
trait XPipe
  extends StObject
     with XOutputStream
     with XInputStream
object XPipe {
  
  inline def apply(
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    closeOutput: Callback,
    flush: Callback,
    queryInterface: `type` => Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: Callback,
    skipBytes: Double => Callback,
    writeBytes: SeqEquiv[Double] => Callback
  ): XPipe = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = release.toJsFn, skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()))
    __obj.asInstanceOf[XPipe]
  }
}
