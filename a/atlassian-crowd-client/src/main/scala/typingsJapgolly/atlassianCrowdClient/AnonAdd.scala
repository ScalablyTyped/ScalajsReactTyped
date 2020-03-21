package typingsJapgolly.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  def add(groupname: String, childname: String): js.Promise[Unit] = js.native
  def get(groupname: String, childname: String): js.Promise[String] = js.native
  def get(groupname: String, childname: String, nested: Boolean): js.Promise[String] = js.native
  def list(groupname: String): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String]] = js.native
  def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
  def remove(groupname: String, childname: String): js.Promise[Unit] = js.native
}

