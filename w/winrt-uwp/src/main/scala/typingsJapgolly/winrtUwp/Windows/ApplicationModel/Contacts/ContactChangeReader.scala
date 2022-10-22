package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way to monitor and react to changes to contacts. */
trait ContactChangeReader extends StObject {
  
  /** Call this method to indicate that you have processed and accepted all changes and you don't want the system to show them to you again. */
  def acceptChanges(): Unit
  
  /**
    * Call this method to indicate that you have processed and accepted up through the specified change.
    * @param lastChangeToAccept The last change that you want to system to track as accepted by your app.
    */
  def acceptChangesThrough(lastChangeToAccept: ContactChange): Unit
  
  /**
    * Asynchronously gets a list of ContactChange objects.
    * @return A list of ContactChange objects.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]]
}
object ContactChangeReader {
  
  inline def apply(
    acceptChanges: Callback,
    acceptChangesThrough: ContactChange => Callback,
    readBatchAsync: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  ): ContactChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = acceptChanges.toJsFn, acceptChangesThrough = js.Any.fromFunction1((t0: ContactChange) => acceptChangesThrough(t0).runNow()), readBatchAsync = readBatchAsync.toJsFn)
    __obj.asInstanceOf[ContactChangeReader]
  }
  
  extension [Self <: ContactChangeReader](x: Self) {
    
    inline def setAcceptChanges(value: Callback): Self = StObject.set(x, "acceptChanges", value.toJsFn)
    
    inline def setAcceptChangesThrough(value: ContactChange => Callback): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1((t0: ContactChange) => value(t0).runNow()))
    
    inline def setReadBatchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]): Self = StObject.set(x, "readBatchAsync", value.toJsFn)
  }
}
