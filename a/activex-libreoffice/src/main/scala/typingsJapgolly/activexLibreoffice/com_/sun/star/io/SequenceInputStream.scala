package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service allows to wrap a sequence of bytes with a stream object. */
trait SequenceInputStream
  extends StObject
     with XSeekableInputStream {
  
  /** allows to create a stream based on the sequence. */
  def createStreamFromSequence(aData: SeqEquiv[Double]): Unit
}
object SequenceInputStream {
  
  inline def apply(
    Length: Double,
    Position: Double,
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    createStreamFromSequence: SeqEquiv[Double] => Callback,
    getLength: CallbackTo[Double],
    getPosition: CallbackTo[Double],
    queryInterface: `type` => Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: Callback,
    seek: Double => Callback,
    skipBytes: Double => Callback
  ): SequenceInputStream = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, createStreamFromSequence = js.Any.fromFunction1((t0: SeqEquiv[Double]) => createStreamFromSequence(t0).runNow()), getLength = getLength.toJsFn, getPosition = getPosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = release.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[SequenceInputStream]
  }
  
  extension [Self <: SequenceInputStream](x: Self) {
    
    inline def setCreateStreamFromSequence(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "createStreamFromSequence", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
  }
}
