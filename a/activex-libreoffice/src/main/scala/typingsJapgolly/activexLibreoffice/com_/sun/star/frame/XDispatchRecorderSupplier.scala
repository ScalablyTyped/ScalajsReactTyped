package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the record mechanism of dispatches
  *
  * With a {@link XDispatchRecorder} it's possible to record calls of {@link XDispatch.dispatch()} . The recorded data (may a script) can be used to
  * automate recorded dispatch and start it at later time again. This supplier provides access to the recorder and supports some functionality to work
  * with the macro recording mechanism in an easy manner.
  * @see XDispatchRecorder
  * @since OOo 1.1.2
  */
trait XDispatchRecorderSupplier
  extends StObject
     with XInterface {
  
  /**
    * provides access on the recorder of this supplier
    *
    * Returned recorder can be used to record dispatches manually or to get recorded data for further using e.g. saving. It is internally used too due to
    * the method {@link XDispatchRecorderSupplier.dispatchAndRecord()} .
    * @returns the dispatch recorder of this supplier
    * @see XDispatchRecorder
    */
  var DispatchRecorder: XDispatchRecorder
  
  /**
    * dispatch given URL and record it if recording is enabled
    *
    * Parameter **Dispatcher** is used internally to make the dispatch. If recording isn't enabled it will be a normal {@link XDispatch.dispatch()} call.
    * Otherwise follow algorithm is used: If **Dispatcher** doesn't support the interface {@link XRecordableDispatch} a normal dispatch() call will be made
    * and depend from the result state of that the request will be recorded. In this case it's possible to record the incoming parameter ( **URL** and
    * **Arguments** ) only. Parameters of internal processes can't be recorded then and will be lost.If **Dispatcher** support the interface {@link
    * XRecordableDispatch} it will be used to dispatch and record all necessary parameters of the whole process.
    * @see XRecordableDispatch
    */
  def dispatchAndRecord(URL: URL, Arguments: SeqEquiv[PropertyValue], Dispatcher: XDispatch): Unit
  
  /**
    * provides access on the recorder of this supplier
    *
    * Returned recorder can be used to record dispatches manually or to get recorded data for further using e.g. saving. It is internally used too due to
    * the method {@link XDispatchRecorderSupplier.dispatchAndRecord()} .
    * @returns the dispatch recorder of this supplier
    * @see XDispatchRecorder
    */
  def getDispatchRecorder(): XDispatchRecorder
  
  /**
    * set a dispatch recorder on this supplier
    *
    * Setting of a new recorder make it possible to change recording mode. May there can exist different implementations of a recorder (e.g. to generate
    * Java, Basic or other formats). Changing between local recording inside one {@link Frame} or global one by using more than ones can be forced too.
    * @param Recorder the new recorder for this supplier
    */
  def setDispatchRecorder(Recorder: XDispatchRecorder): Unit
}
object XDispatchRecorderSupplier {
  
  inline def apply(
    DispatchRecorder: XDispatchRecorder,
    acquire: Callback,
    dispatchAndRecord: (URL, SeqEquiv[PropertyValue], XDispatch) => Callback,
    getDispatchRecorder: CallbackTo[XDispatchRecorder],
    queryInterface: `type` => Any,
    release: Callback,
    setDispatchRecorder: XDispatchRecorder => Callback
  ): XDispatchRecorderSupplier = {
    val __obj = js.Dynamic.literal(DispatchRecorder = DispatchRecorder.asInstanceOf[js.Any], acquire = acquire.toJsFn, dispatchAndRecord = js.Any.fromFunction3((t0: URL, t1: SeqEquiv[PropertyValue], t2: XDispatch) => (dispatchAndRecord(t0, t1, t2)).runNow()), getDispatchRecorder = getDispatchRecorder.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDispatchRecorder = js.Any.fromFunction1((t0: XDispatchRecorder) => setDispatchRecorder(t0).runNow()))
    __obj.asInstanceOf[XDispatchRecorderSupplier]
  }
  
  extension [Self <: XDispatchRecorderSupplier](x: Self) {
    
    inline def setDispatchAndRecord(value: (URL, SeqEquiv[PropertyValue], XDispatch) => Callback): Self = StObject.set(x, "dispatchAndRecord", js.Any.fromFunction3((t0: URL, t1: SeqEquiv[PropertyValue], t2: XDispatch) => (value(t0, t1, t2)).runNow()))
    
    inline def setDispatchRecorder(value: XDispatchRecorder): Self = StObject.set(x, "DispatchRecorder", value.asInstanceOf[js.Any])
    
    inline def setGetDispatchRecorder(value: CallbackTo[XDispatchRecorder]): Self = StObject.set(x, "getDispatchRecorder", value.toJsFn)
    
    inline def setSetDispatchRecorder(value: XDispatchRecorder => Callback): Self = StObject.set(x, "setDispatchRecorder", js.Any.fromFunction1((t0: XDispatchRecorder) => value(t0).runNow()))
  }
}
