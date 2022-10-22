package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.accountcommandsrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
@js.native
trait AccountsSettingsPane extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accountcommandsrequested(
    `type`: accountcommandsrequested,
    listener: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
  
  /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
  def onaccountcommandsrequested(ev: AccountsSettingsPaneCommandsRequestedEventArgs & WinRTEvent[AccountsSettingsPane]): Unit = js.native
  /** Occurs when the user opens the accounts pane. Handling this event lets the app initialize the accounts commands and pause its UI until the user closes the pane. */
  @JSName("onaccountcommandsrequested")
  var onaccountcommandsrequested_Original: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accountcommandsrequested(
    `type`: accountcommandsrequested,
    listener: TypedEventHandler[AccountsSettingsPane, AccountsSettingsPaneCommandsRequestedEventArgs]
  ): Unit = js.native
}
