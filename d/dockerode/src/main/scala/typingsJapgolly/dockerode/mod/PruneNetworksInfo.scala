package typingsJapgolly.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PruneNetworksInfo extends js.Object {
  var NetworksDeleted: js.Array[String]
}

object PruneNetworksInfo {
  @scala.inline
  def apply(NetworksDeleted: js.Array[String]): PruneNetworksInfo = {
    val __obj = js.Dynamic.literal(NetworksDeleted = NetworksDeleted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PruneNetworksInfo]
  }
}

