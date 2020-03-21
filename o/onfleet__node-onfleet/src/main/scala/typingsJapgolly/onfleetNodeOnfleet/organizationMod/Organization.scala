package typingsJapgolly.onfleetNodeOnfleet.organizationMod

import typingsJapgolly.onfleetNodeOnfleet.AnonTasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  def get(): js.Promise[js.Array[OnfleetOrganization]] = js.native
  def get(id: String): js.Promise[OnfleetOrganization | Delegatee] = js.native
  def insertTask(id: String, obj: AnonTasks): js.Promise[_] = js.native
}

