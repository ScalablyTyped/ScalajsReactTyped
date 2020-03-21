package typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.DelegatesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.FiltersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.ForwardingAddressesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings.SendAsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCollection extends js.Object {
  var Delegates: js.UndefOr[DelegatesCollection] = js.undefined
  var Filters: js.UndefOr[FiltersCollection] = js.undefined
  var ForwardingAddresses: js.UndefOr[ForwardingAddressesCollection] = js.undefined
  var SendAs: js.UndefOr[SendAsCollection] = js.undefined
  // Gets the auto-forwarding setting for the specified account.
  def getAutoForwarding(userId: String): AutoForwarding
  // Gets IMAP settings.
  def getImap(userId: String): ImapSettings
  // Gets POP settings.
  def getPop(userId: String): PopSettings
  // Gets vacation responder settings.
  def getVacation(userId: String): VacationSettings
  // Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def updateAutoForwarding(resource: AutoForwarding, userId: String): AutoForwarding
  // Updates IMAP settings.
  def updateImap(resource: ImapSettings, userId: String): ImapSettings
  // Updates POP settings.
  def updatePop(resource: PopSettings, userId: String): PopSettings
  // Updates vacation responder settings.
  def updateVacation(resource: VacationSettings, userId: String): VacationSettings
}

object SettingsCollection {
  @scala.inline
  def apply(
    getAutoForwarding: String => CallbackTo[AutoForwarding],
    getImap: String => CallbackTo[ImapSettings],
    getPop: String => CallbackTo[PopSettings],
    getVacation: String => CallbackTo[VacationSettings],
    updateAutoForwarding: (AutoForwarding, String) => CallbackTo[AutoForwarding],
    updateImap: (ImapSettings, String) => CallbackTo[ImapSettings],
    updatePop: (PopSettings, String) => CallbackTo[PopSettings],
    updateVacation: (VacationSettings, String) => CallbackTo[VacationSettings],
    Delegates: DelegatesCollection = null,
    Filters: FiltersCollection = null,
    ForwardingAddresses: ForwardingAddressesCollection = null,
    SendAs: SendAsCollection = null
  ): SettingsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAutoForwarding")(js.Any.fromFunction1((t0: java.lang.String) => getAutoForwarding(t0).runNow()))
    __obj.updateDynamic("getImap")(js.Any.fromFunction1((t0: java.lang.String) => getImap(t0).runNow()))
    __obj.updateDynamic("getPop")(js.Any.fromFunction1((t0: java.lang.String) => getPop(t0).runNow()))
    __obj.updateDynamic("getVacation")(js.Any.fromFunction1((t0: java.lang.String) => getVacation(t0).runNow()))
    __obj.updateDynamic("updateAutoForwarding")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.AutoForwarding, t1: java.lang.String) => updateAutoForwarding(t0, t1).runNow()))
    __obj.updateDynamic("updateImap")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.ImapSettings, t1: java.lang.String) => updateImap(t0, t1).runNow()))
    __obj.updateDynamic("updatePop")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.PopSettings, t1: java.lang.String) => updatePop(t0, t1).runNow()))
    __obj.updateDynamic("updateVacation")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Gmail.Schema.VacationSettings, t1: java.lang.String) => updateVacation(t0, t1).runNow()))
    if (Delegates != null) __obj.updateDynamic("Delegates")(Delegates.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (ForwardingAddresses != null) __obj.updateDynamic("ForwardingAddresses")(ForwardingAddresses.asInstanceOf[js.Any])
    if (SendAs != null) __obj.updateDynamic("SendAs")(SendAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsCollection]
  }
}

