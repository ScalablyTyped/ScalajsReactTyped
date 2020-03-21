package typingsJapgolly.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionSettings extends js.Object {
  /**
    * The time, in seconds, that the connection is allowed to be idle (no data has been sent over the connection) before it is closed by the load balancer.
    */
  var IdleTimeout: typingsJapgolly.awsSdk.elbMod.IdleTimeout = js.native
}

object ConnectionSettings {
  @scala.inline
  def apply(IdleTimeout: IdleTimeout): ConnectionSettings = {
    val __obj = js.Dynamic.literal(IdleTimeout = IdleTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionSettings]
  }
}

