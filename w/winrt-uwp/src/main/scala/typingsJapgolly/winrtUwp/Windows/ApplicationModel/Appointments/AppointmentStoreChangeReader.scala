package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the calling app to read through the changes to appointments in its appointment store. */
trait AppointmentStoreChangeReader extends StObject {
  
  /** Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync have been addressed by the app. */
  def acceptChanges(): Unit
  
  /**
    * Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync , up to the specified AppointmentStoreChange , have been addressed by the app.
    * @param lastChangeToAccept The AppointmentStoreChange object indicating the latest change that has been addressed by the app.
    */
  def acceptChangesThrough(lastChangeToAccept: AppointmentStoreChange): Unit
  
  /**
    * Returns a list of the changes that have occurred in the appointment store that have not yet been accepted by the calling app.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]]
}
object AppointmentStoreChangeReader {
  
  inline def apply(
    acceptChanges: Callback,
    acceptChangesThrough: AppointmentStoreChange => Callback,
    readBatchAsync: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  ): AppointmentStoreChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = acceptChanges.toJsFn, acceptChangesThrough = js.Any.fromFunction1((t0: AppointmentStoreChange) => acceptChangesThrough(t0).runNow()), readBatchAsync = readBatchAsync.toJsFn)
    __obj.asInstanceOf[AppointmentStoreChangeReader]
  }
  
  extension [Self <: AppointmentStoreChangeReader](x: Self) {
    
    inline def setAcceptChanges(value: Callback): Self = StObject.set(x, "acceptChanges", value.toJsFn)
    
    inline def setAcceptChangesThrough(value: AppointmentStoreChange => Callback): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1((t0: AppointmentStoreChange) => value(t0).runNow()))
    
    inline def setReadBatchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]): Self = StObject.set(x, "readBatchAsync", value.toJsFn)
  }
}
