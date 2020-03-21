package typingsJapgolly.onfleetNodeOnfleet.onfleetMod

import typingsJapgolly.onfleetNodeOnfleet.AnonBaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@onfleet/node-onfleet/onfleet", JSImport.Namespace)
@js.native
class ^ protected () extends Onfleet {
  def this(api_key: String) = this()
  /* CompleteClass */
  override var admins: typingsJapgolly.onfleetNodeOnfleet.administratorsMod.^ = js.native
  /* CompleteClass */
  override var api: AnonBaseUrl = js.native
  /* CompleteClass */
  override var apiKey: String = js.native
  /* CompleteClass */
  override var containers: typingsJapgolly.onfleetNodeOnfleet.containersMod.^ = js.native
  /* CompleteClass */
  override var destinations: typingsJapgolly.onfleetNodeOnfleet.destinationsMod.^ = js.native
  /* CompleteClass */
  override var hubs: typingsJapgolly.onfleetNodeOnfleet.hubsMod.^ = js.native
  /* CompleteClass */
  override var organization: typingsJapgolly.onfleetNodeOnfleet.organizationMod.^ = js.native
  /* CompleteClass */
  override var recipients: typingsJapgolly.onfleetNodeOnfleet.recipientsMod.^ = js.native
  /* CompleteClass */
  override var tasks: typingsJapgolly.onfleetNodeOnfleet.tasksMod.^ = js.native
  /* CompleteClass */
  override var teams: typingsJapgolly.onfleetNodeOnfleet.teamsMod.^ = js.native
  /* CompleteClass */
  override var webhooks: typingsJapgolly.onfleetNodeOnfleet.webhooksMod.^ = js.native
  /* CompleteClass */
  override var workers: typingsJapgolly.onfleetNodeOnfleet.workersMod.^ = js.native
  /* CompleteClass */
  override def verifyKey(): Boolean = js.native
}

