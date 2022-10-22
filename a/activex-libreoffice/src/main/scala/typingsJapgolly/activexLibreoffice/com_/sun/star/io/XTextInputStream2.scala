package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style service {@link TextInputStream} .
  * @since LibreOffice 4.1
  */
trait XTextInputStream2
  extends StObject
     with XTextInputStream
     with XActiveDataSink
object XTextInputStream2 {
  
  inline def apply(
    InputStream: XInputStream,
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    getInputStream: CallbackTo[XInputStream],
    isEOF: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readLine: CallbackTo[String],
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readString: (SeqEquiv[String], Boolean) => String,
    release: Callback,
    setEncoding: String => Callback,
    setInputStream: XInputStream => Callback,
    skipBytes: Double => Callback
  ): XTextInputStream2 = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, getInputStream = getInputStream.toJsFn, isEOF = isEOF.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readLine = readLine.toJsFn, readSomeBytes = js.Any.fromFunction2(readSomeBytes), readString = js.Any.fromFunction2(readString), release = release.toJsFn, setEncoding = js.Any.fromFunction1((t0: String) => setEncoding(t0).runNow()), setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[XTextInputStream2]
  }
}
