package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface can be used to represent a seekable input stream. */
trait XSeekableInputStream
  extends StObject
     with XInputStream
     with XSeekable
object XSeekableInputStream {
  
  inline def apply(
    Length: Double,
    Position: Double,
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    getLength: CallbackTo[Double],
    getPosition: CallbackTo[Double],
    queryInterface: `type` => Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: Callback,
    seek: Double => Callback,
    skipBytes: Double => Callback
  ): XSeekableInputStream = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, getLength = getLength.toJsFn, getPosition = getPosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = release.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[XSeekableInputStream]
  }
}
