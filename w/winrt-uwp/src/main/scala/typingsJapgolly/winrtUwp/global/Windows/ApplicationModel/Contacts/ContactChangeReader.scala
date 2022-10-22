package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way to monitor and react to changes to contacts. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeReader")
@js.native
open class ContactChangeReader ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangeReader {
  
  /** Call this method to indicate that you have processed and accepted all changes and you don't want the system to show them to you again. */
  /* CompleteClass */
  override def acceptChanges(): Unit = js.native
  
  /**
    * Call this method to indicate that you have processed and accepted up through the specified change.
    * @param lastChangeToAccept The last change that you want to system to track as accepted by your app.
    */
  /* CompleteClass */
  override def acceptChangesThrough(lastChangeToAccept: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactChange): Unit = js.native
  
  /**
    * Asynchronously gets a list of ContactChange objects.
    * @return A list of ContactChange objects.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
}
