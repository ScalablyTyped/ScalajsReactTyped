package typingsJapgolly.atlassianCrowdClient

import typingsJapgolly.atlassianCrowdClient.groupMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren extends js.Object {
  var attributes: AnonRemove = js.native
  var children: AnonAdd = js.native
  var parents: AnonAddGet = js.native
  var users: AnonGet = js.native
  def create(group: ^): js.Promise[^] = js.native
  def get(groupname: String): js.Promise[^] = js.native
  def get(groupname: String, withAttributes: Boolean): js.Promise[^] = js.native
  def membership(): js.Promise[String] = js.native
  def remove(groupname: String): js.Promise[Unit] = js.native
  def update(groupname: String, group: ^): js.Promise[^] = js.native
}

