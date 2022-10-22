package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.syncstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@js.native
trait EmailMailboxSyncManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[EmailMailboxSyncManager, Any]): Unit = js.native
  
  /** Gets the last time the mailbox attempted to sync. */
  var lastAttemptedSyncTime: js.Date = js.native
  
  /** Gets the last time the mailbox was successfully synced. */
  var lastSuccessfulSyncTime: js.Date = js.native
  
  /** Fires whenever a mailbox's sync status changes. */
  def onsyncstatuschanged(ev: Any & WinRTEvent[EmailMailboxSyncManager]): Unit = js.native
  /** Fires whenever a mailbox's sync status changes. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: TypedEventHandler[EmailMailboxSyncManager, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[EmailMailboxSyncManager, Any]): Unit = js.native
  
  /** Gets the sync state of the mailbox. */
  var status: EmailMailboxSyncStatus = js.native
  
  /**
    * Initiates a sync of this mailbox.
    * @return A Boolean value indicating success.
    */
  def syncAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}
