package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunInstancesMonitoringEnabled extends js.Object {
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var Enabled: Boolean = js.native
}

object RunInstancesMonitoringEnabled {
  @scala.inline
  def apply(Enabled: Boolean): RunInstancesMonitoringEnabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunInstancesMonitoringEnabled]
  }
}

