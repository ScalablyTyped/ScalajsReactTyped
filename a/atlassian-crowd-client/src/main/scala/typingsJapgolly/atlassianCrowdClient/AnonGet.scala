package typingsJapgolly.atlassianCrowdClient

import typingsJapgolly.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  def add(groupname: String, username: String): js.Promise[Unit] = js.native
  def get(groupname: String, username: String): js.Promise[String] = js.native
  def get(groupname: String, username: String, nested: Boolean): js.Promise[String] = js.native
  def list(groupname: String): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^ ]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^ ]] = js.native
  def remove(groupname: String, username: String): js.Promise[Unit] = js.native
}

