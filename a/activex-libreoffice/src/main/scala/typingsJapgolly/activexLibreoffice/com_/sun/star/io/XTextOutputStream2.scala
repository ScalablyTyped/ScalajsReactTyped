package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the new-style service {@link TextOutputStream} .
  * @since LibreOffice 4.1
  */
trait XTextOutputStream2
  extends StObject
     with XTextOutputStream
     with XActiveDataSource
object XTextOutputStream2 {
  
  inline def apply(
    OutputStream: XOutputStream,
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    getOutputStream: CallbackTo[XOutputStream],
    queryInterface: `type` => Any,
    release: Callback,
    setEncoding: String => Callback,
    setOutputStream: XOutputStream => Callback,
    writeBytes: SeqEquiv[Double] => Callback,
    writeString: String => Callback
  ): XTextOutputStream2 = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, getOutputStream = getOutputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setEncoding = js.Any.fromFunction1((t0: String) => setEncoding(t0).runNow()), setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()), writeString = js.Any.fromFunction1((t0: String) => writeString(t0).runNow()))
    __obj.asInstanceOf[XTextOutputStream2]
  }
}
