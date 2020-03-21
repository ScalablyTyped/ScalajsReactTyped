package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.accountcommandsrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
@JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPane")
@js.native
abstract class AccountsSettingsPane () extends js.Object {
  /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
  @JSName("onaccountcommandsrequested")
  var onaccountcommandsrequested_Original: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountcommandsrequested(
    `type`: accountcommandsrequested,
    listener: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
  /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
  def onaccountcommandsrequested(ev: AccountsSettingsPaneCommandsRequestedEventArgs with WinRTEvent[AccountsSettingsPane]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountcommandsrequested(
    `type`: accountcommandsrequested,
    listener: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.UI.ApplicationSettings.AccountsSettingsPane")
@js.native
object AccountsSettingsPane extends js.Object {
  /**
    * Gets an AccountsSettingsPane object that is associated with the current app view (that is, with CoreWindow ).
    * @return The account settings pane.
    */
  def getForCurrentView(): AccountsSettingsPane = js.native
  /** Displays the account settings pane. */
  def show(): Unit = js.native
}

