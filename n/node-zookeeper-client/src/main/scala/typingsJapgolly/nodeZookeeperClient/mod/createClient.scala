package typingsJapgolly.nodeZookeeperClient.mod

import typingsJapgolly.nodeZookeeperClient.PartialOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zookeeper-client", "createClient")
@js.native
object createClient extends js.Object {
  def apply(connectionString: String): Client = js.native
  def apply(connectionString: String, options: PartialOption): Client = js.native
}

