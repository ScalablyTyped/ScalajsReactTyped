package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends an existing {@link XDispatch} implementation with functionality for dispatch recording
  *
  * This interface can be implemented as an additional one beside an existing {@link XDispatch} one to provide record functionality of dispatches. Because
  * it's an additional interface the status events are available there and not at this interface.
  *
  * But normally this interface mustn't be used directly. If a dispatch object is well known and recording was enabled on a {@link
  * XDispatchRecorderSupplier} it's possible to use method {@link XDispatchRecorderSupplier.dispatchAndRecord()} of it to make dispatch and recording
  * automatically. The interface {@link XRecordableDispatch} is used transparently there.
  *
  * {{program example here, see documentation}}
  * @see XDispatchRecorderSupplier
  * @see XDispatch
  * @since OOo 1.1.2
  */
trait XRecordableDispatch
  extends StObject
     with XInterface {
  
  /**
    * dispatch and record it
    * @param URL full parsed URL which describe the feature which should be dispatched (executed)
    * @param Arguments optional arguments for this request (see {@link com.sun.star.document.MediaDescriptor} for details)
    * @param Recorder object which can be used to record the request (available on {@link XDispatchRecorderSupplier.getDispatchRecorder()} )
    */
  def dispatchAndRecord(URL: URL, Arguments: SeqEquiv[PropertyValue], Recorder: XDispatchRecorder): Unit
}
object XRecordableDispatch {
  
  inline def apply(
    acquire: Callback,
    dispatchAndRecord: (URL, SeqEquiv[PropertyValue], XDispatchRecorder) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRecordableDispatch = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dispatchAndRecord = js.Any.fromFunction3((t0: URL, t1: SeqEquiv[PropertyValue], t2: XDispatchRecorder) => (dispatchAndRecord(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRecordableDispatch]
  }
  
  extension [Self <: XRecordableDispatch](x: Self) {
    
    inline def setDispatchAndRecord(value: (URL, SeqEquiv[PropertyValue], XDispatchRecorder) => Callback): Self = StObject.set(x, "dispatchAndRecord", js.Any.fromFunction3((t0: URL, t1: SeqEquiv[PropertyValue], t2: XDispatchRecorder) => (value(t0, t1, t2)).runNow()))
  }
}
