package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.syncstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for syncing contact information with the server. */
@js.native
trait ContactListSyncManager extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[ContactListSyncManager, Any]): Unit = js.native
  
  /** Gets the last time a sync was attempted with the server. */
  var lastAttemptedSyncTime: js.Date = js.native
  
  /** Gets the last time the ContactList was successfully synced with the server. */
  var lastSuccessfulSyncTime: js.Date = js.native
  
  /** Occurs when the sync status with the server has changed. */
  def onsyncstatuschanged(ev: Any & WinRTEvent[ContactListSyncManager]): Unit = js.native
  /** Occurs when the sync status with the server has changed. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: TypedEventHandler[ContactListSyncManager, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(`type`: syncstatuschanged, listener: TypedEventHandler[ContactListSyncManager, Any]): Unit = js.native
  
  /** Gets the ContactListSyncStatus . */
  var status: ContactListSyncStatus = js.native
  
  /**
    * Asynchronously attempts to sync with the contacts server.
    * @return A Boolean value indicating if the sync was successful.
    */
  def syncAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}
