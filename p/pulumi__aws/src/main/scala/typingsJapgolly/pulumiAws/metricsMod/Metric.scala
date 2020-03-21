package typingsJapgolly.pulumiAws.metricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupMinSize
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupMaxSize
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupInServiceInstances
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupPendingInstances
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupStandbyInstances
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupTotalInstances
*/
trait Metric extends js.Object

object Metric {
  @scala.inline
  def GroupDesiredCapacity: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = this.cast("GroupDesiredCapacity")
  @scala.inline
  def GroupInServiceInstances: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = this.cast("GroupInServiceInstances")
  @scala.inline
  def GroupMaxSize: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupMaxSize = this.cast("GroupMaxSize")
  @scala.inline
  def GroupMinSize: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupMinSize = this.cast("GroupMinSize")
  @scala.inline
  def GroupPendingInstances: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupPendingInstances = this.cast("GroupPendingInstances")
  @scala.inline
  def GroupStandbyInstances: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = this.cast("GroupStandbyInstances")
  @scala.inline
  def GroupTerminatingInstances: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = this.cast("GroupTerminatingInstances")
  @scala.inline
  def GroupTotalInstances: typingsJapgolly.pulumiAws.pulumiAwsStrings.GroupTotalInstances = this.cast("GroupTotalInstances")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

