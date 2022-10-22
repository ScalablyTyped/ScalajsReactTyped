package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to control an active data source.
  *
  * This interface should be supported by objects which implement {@link XActiveDataSource} or {@link XActiveDataSink} .
  */
trait XActiveDataControl
  extends StObject
     with XInterface {
  
  /**
    * registers an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addListener(aListener: XStreamListener): Unit
  
  /**
    * unregisters an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeListener(aListener: XStreamListener): Unit
  
  /**
    * starts I/O.
    *
    * Either XActiveDataControl::setInputStream() or XActiveDataControl::setOutputStream() must be called beforehand.
    *
    * This method does not block the thread, so reading is generally not finished when the method returns.
    */
  def start(): Unit
  
  /**
    * does a weak abort.
    *
    * It closes all connected resources and calls XInputStream::close() or XOutputStream::close() and fires the {@link XStreamListener.terminated()} -event.
    */
  def terminate(): Unit
}
object XActiveDataControl {
  
  inline def apply(
    acquire: Callback,
    addListener: XStreamListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeListener: XStreamListener => Callback,
    start: Callback,
    terminate: Callback
  ): XActiveDataControl = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addListener = js.Any.fromFunction1((t0: XStreamListener) => addListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListener = js.Any.fromFunction1((t0: XStreamListener) => removeListener(t0).runNow()), start = start.toJsFn, terminate = terminate.toJsFn)
    __obj.asInstanceOf[XActiveDataControl]
  }
  
  extension [Self <: XActiveDataControl](x: Self) {
    
    inline def setAddListener(value: XStreamListener => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: XStreamListener) => value(t0).runNow()))
    
    inline def setRemoveListener(value: XStreamListener => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: XStreamListener) => value(t0).runNow()))
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
