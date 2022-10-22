package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the implementation of a data source and a data sink.
  *
  * A thread will be created that reads from the input stream and writes the data to the connected output stream. Data will not be buffered by this
  * service.
  */
trait Pump
  extends StObject
     with XActiveDataSource
     with XActiveDataSink
     with XActiveDataControl
object Pump {
  
  inline def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: Callback,
    addListener: XStreamListener => Callback,
    getInputStream: CallbackTo[XInputStream],
    getOutputStream: CallbackTo[XOutputStream],
    queryInterface: `type` => Any,
    release: Callback,
    removeListener: XStreamListener => Callback,
    setInputStream: XInputStream => Callback,
    setOutputStream: XOutputStream => Callback,
    start: Callback,
    terminate: Callback
  ): Pump = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, addListener = js.Any.fromFunction1((t0: XStreamListener) => addListener(t0).runNow()), getInputStream = getInputStream.toJsFn, getOutputStream = getOutputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListener = js.Any.fromFunction1((t0: XStreamListener) => removeListener(t0).runNow()), setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()), setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), start = start.toJsFn, terminate = terminate.toJsFn)
    __obj.asInstanceOf[Pump]
  }
}
