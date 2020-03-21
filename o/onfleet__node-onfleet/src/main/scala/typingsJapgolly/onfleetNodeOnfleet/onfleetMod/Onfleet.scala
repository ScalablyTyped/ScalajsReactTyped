package typingsJapgolly.onfleetNodeOnfleet.onfleetMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.onfleetNodeOnfleet.AnonBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Onfleet extends js.Object {
  var admins: typingsJapgolly.onfleetNodeOnfleet.administratorsMod.^
  var api: AnonBaseUrl
  var apiKey: String
  var containers: typingsJapgolly.onfleetNodeOnfleet.containersMod.^
  var destinations: typingsJapgolly.onfleetNodeOnfleet.destinationsMod.^
  var hubs: typingsJapgolly.onfleetNodeOnfleet.hubsMod.^
  var organization: typingsJapgolly.onfleetNodeOnfleet.organizationMod.^
  var recipients: typingsJapgolly.onfleetNodeOnfleet.recipientsMod.^
  var tasks: typingsJapgolly.onfleetNodeOnfleet.tasksMod.^
  var teams: typingsJapgolly.onfleetNodeOnfleet.teamsMod.^
  var webhooks: typingsJapgolly.onfleetNodeOnfleet.webhooksMod.^
  var workers: typingsJapgolly.onfleetNodeOnfleet.workersMod.^
  def verifyKey(): Boolean
}

object Onfleet {
  @scala.inline
  def apply(
    admins: typingsJapgolly.onfleetNodeOnfleet.administratorsMod.^,
    api: AnonBaseUrl,
    apiKey: String,
    containers: typingsJapgolly.onfleetNodeOnfleet.containersMod.^,
    destinations: typingsJapgolly.onfleetNodeOnfleet.destinationsMod.^,
    hubs: typingsJapgolly.onfleetNodeOnfleet.hubsMod.^,
    organization: typingsJapgolly.onfleetNodeOnfleet.organizationMod.^,
    recipients: typingsJapgolly.onfleetNodeOnfleet.recipientsMod.^,
    tasks: typingsJapgolly.onfleetNodeOnfleet.tasksMod.^,
    teams: typingsJapgolly.onfleetNodeOnfleet.teamsMod.^,
    verifyKey: CallbackTo[Boolean],
    webhooks: typingsJapgolly.onfleetNodeOnfleet.webhooksMod.^,
    workers: typingsJapgolly.onfleetNodeOnfleet.workersMod.^
  ): Onfleet = {
    val __obj = js.Dynamic.literal(admins = admins.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], apiKey = apiKey.asInstanceOf[js.Any], containers = containers.asInstanceOf[js.Any], destinations = destinations.asInstanceOf[js.Any], hubs = hubs.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.updateDynamic("verifyKey")(verifyKey.toJsFn)
    __obj.asInstanceOf[Onfleet]
  }
}

