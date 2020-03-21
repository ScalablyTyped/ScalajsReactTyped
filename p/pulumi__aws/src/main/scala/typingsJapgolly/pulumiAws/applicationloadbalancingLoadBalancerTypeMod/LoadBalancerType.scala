package typingsJapgolly.pulumiAws.applicationloadbalancingLoadBalancerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.application
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.network
*/
trait LoadBalancerType extends js.Object

object LoadBalancerType {
  @scala.inline
  def application: typingsJapgolly.pulumiAws.pulumiAwsStrings.application = this.cast("application")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def network: typingsJapgolly.pulumiAws.pulumiAwsStrings.network = this.cast("network")
}

