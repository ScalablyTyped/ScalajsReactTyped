package typingsJapgolly.keytar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keytar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def deletePassword(service: String, account: String): js.Promise[Boolean] = js.native
  def findCredentials(service: String): js.Promise[js.Array[AnonAccount]] = js.native
  def findPassword(service: String): js.Promise[String | Null] = js.native
  def getPassword(service: String, account: String): js.Promise[String | Null] = js.native
  def setPassword(service: String, account: String, password: String): js.Promise[Unit] = js.native
}

