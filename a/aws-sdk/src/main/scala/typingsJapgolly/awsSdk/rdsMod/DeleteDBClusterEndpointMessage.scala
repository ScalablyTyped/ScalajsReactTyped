package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier associated with the custom endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
}

object DeleteDBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String): DeleteDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDBClusterEndpointMessage]
  }
}

