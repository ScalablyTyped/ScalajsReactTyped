package typingsJapgolly.gapiClientGmail.gapi.client.gmail

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGmail.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsResource extends js.Object {
  var filters: FiltersResource
  var forwardingAddresses: ForwardingAddressesResource
  var sendAs: SendAsResource
  /** Gets the auto-forwarding setting for the specified account. */
  def getAutoForwarding(request: AnonAlt): Request_[AutoForwarding]
  /** Gets IMAP settings. */
  def getImap(request: AnonAlt): Request_[ImapSettings]
  /** Gets POP settings. */
  def getPop(request: AnonAlt): Request_[PopSettings]
  /** Gets vacation responder settings. */
  def getVacation(request: AnonAlt): Request_[VacationSettings]
  /**
    * Updates the auto-forwarding setting for the specified account. A verified forwarding address must be specified when auto-forwarding is enabled.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def updateAutoForwarding(request: AnonAlt): Request_[AutoForwarding]
  /** Updates IMAP settings. */
  def updateImap(request: AnonAlt): Request_[ImapSettings]
  /** Updates POP settings. */
  def updatePop(request: AnonAlt): Request_[PopSettings]
  /** Updates vacation responder settings. */
  def updateVacation(request: AnonAlt): Request_[VacationSettings]
}

object SettingsResource {
  @scala.inline
  def apply(
    filters: FiltersResource,
    forwardingAddresses: ForwardingAddressesResource,
    getAutoForwarding: AnonAlt => CallbackTo[Request_[AutoForwarding]],
    getImap: AnonAlt => CallbackTo[Request_[ImapSettings]],
    getPop: AnonAlt => CallbackTo[Request_[PopSettings]],
    getVacation: AnonAlt => CallbackTo[Request_[VacationSettings]],
    sendAs: SendAsResource,
    updateAutoForwarding: AnonAlt => CallbackTo[Request_[AutoForwarding]],
    updateImap: AnonAlt => CallbackTo[Request_[ImapSettings]],
    updatePop: AnonAlt => CallbackTo[Request_[PopSettings]],
    updateVacation: AnonAlt => CallbackTo[Request_[VacationSettings]]
  ): SettingsResource = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], forwardingAddresses = forwardingAddresses.asInstanceOf[js.Any], sendAs = sendAs.asInstanceOf[js.Any])
    __obj.updateDynamic("getAutoForwarding")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => getAutoForwarding(t0).runNow()))
    __obj.updateDynamic("getImap")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => getImap(t0).runNow()))
    __obj.updateDynamic("getPop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => getPop(t0).runNow()))
    __obj.updateDynamic("getVacation")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => getVacation(t0).runNow()))
    __obj.updateDynamic("updateAutoForwarding")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => updateAutoForwarding(t0).runNow()))
    __obj.updateDynamic("updateImap")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => updateImap(t0).runNow()))
    __obj.updateDynamic("updatePop")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => updatePop(t0).runNow()))
    __obj.updateDynamic("updateVacation")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGmail.AnonAlt) => updateVacation(t0).runNow()))
    __obj.asInstanceOf[SettingsResource]
  }
}

