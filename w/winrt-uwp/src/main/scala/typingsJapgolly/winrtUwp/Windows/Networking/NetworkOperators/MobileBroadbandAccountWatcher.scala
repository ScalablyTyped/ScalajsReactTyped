package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.accountadded
import typingsJapgolly.winrtUwp.winrtUwpStrings.accountremoved
import typingsJapgolly.winrtUwp.winrtUwpStrings.accountupdated
import typingsJapgolly.winrtUwp.winrtUwpStrings.enumerationcompleted
import typingsJapgolly.winrtUwp.winrtUwpStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information regarding availability of and updates to Mobile Broadband Accounts. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher")
@js.native
/** Creates a new instance of a MobileBroadbandAccountWatcher . */
class MobileBroadbandAccountWatcher () extends js.Object {
  /** Occurs when a Mobile Broadband Account is added to the client. */
  @JSName("onaccountadded")
  var onaccountadded_Original: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs] = js.native
  /** Occurs when a Mobile Broadband Account is removed from the client. */
  @JSName("onaccountremoved")
  var onaccountremoved_Original: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs] = js.native
  /** Occurs when a Mobile Broadband Account is updated on the client. */
  @JSName("onaccountupdated")
  var onaccountupdated_Original: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountUpdatedEventArgs] = js.native
  /** Occurs when the account watcher has finished enumerating accounts for the client. */
  @JSName("onenumerationcompleted")
  var onenumerationcompleted_Original: TypedEventHandler[MobileBroadbandAccountWatcher, _] = js.native
  /** Occurs when the MobileBroadbandAccountWatcher has stopped. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[MobileBroadbandAccountWatcher, _] = js.native
  /** Gets the status of the account watcher. */
  var status: MobileBroadbandAccountWatcherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountadded(
    `type`: accountadded,
    listener: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountremoved(
    `type`: accountremoved,
    listener: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountupdated(
    `type`: accountupdated,
    listener: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountUpdatedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[MobileBroadbandAccountWatcher, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(`type`: stopped, listener: TypedEventHandler[MobileBroadbandAccountWatcher, _]): Unit = js.native
  /** Occurs when a Mobile Broadband Account is added to the client. */
  def onaccountadded(ev: MobileBroadbandAccountEventArgs with WinRTEvent[MobileBroadbandAccountWatcher]): Unit = js.native
  /** Occurs when a Mobile Broadband Account is removed from the client. */
  def onaccountremoved(ev: MobileBroadbandAccountEventArgs with WinRTEvent[MobileBroadbandAccountWatcher]): Unit = js.native
  /** Occurs when a Mobile Broadband Account is updated on the client. */
  def onaccountupdated(ev: MobileBroadbandAccountUpdatedEventArgs with WinRTEvent[MobileBroadbandAccountWatcher]): Unit = js.native
  /** Occurs when the account watcher has finished enumerating accounts for the client. */
  def onenumerationcompleted(ev: js.Any with WinRTEvent[MobileBroadbandAccountWatcher]): Unit = js.native
  /** Occurs when the MobileBroadbandAccountWatcher has stopped. */
  def onstopped(ev: js.Any with WinRTEvent[MobileBroadbandAccountWatcher]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountadded(
    `type`: accountadded,
    listener: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountremoved(
    `type`: accountremoved,
    listener: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountupdated(
    `type`: accountupdated,
    listener: TypedEventHandler[MobileBroadbandAccountWatcher, MobileBroadbandAccountUpdatedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enumerationcompleted(`type`: enumerationcompleted, listener: TypedEventHandler[MobileBroadbandAccountWatcher, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(`type`: stopped, listener: TypedEventHandler[MobileBroadbandAccountWatcher, _]): Unit = js.native
  /** Starts the account watcher. */
  def start(): Unit = js.native
  /** Stops the account watcher. */
  def stop(): Unit = js.native
}

