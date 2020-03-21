package typingsJapgolly.intercomClient.mod

import typingsJapgolly.intercomClient.AnonAppApiKey
import typingsJapgolly.intercomClient.AnonToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(auth: AnonAppApiKey) = this()
  def this(auth: AnonToken) = this()
  def this(username: String, password: String) = this()
  var companies: Companies = js.native
  var contacts: Leads = js.native
  var events: Events = js.native
  var leads: Leads = js.native
  var tags: Tags = js.native
  var users: Users = js.native
  var visitors: Visitors = js.native
}

