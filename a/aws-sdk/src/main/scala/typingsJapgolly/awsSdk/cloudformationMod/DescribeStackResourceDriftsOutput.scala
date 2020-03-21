package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackResourceDriftsOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call DescribeStackResourceDrifts again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * Drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection.
    */
  var StackResourceDrifts: typingsJapgolly.awsSdk.cloudformationMod.StackResourceDrifts = js.native
}

object DescribeStackResourceDriftsOutput {
  @scala.inline
  def apply(StackResourceDrifts: StackResourceDrifts, NextToken: NextToken = null): DescribeStackResourceDriftsOutput = {
    val __obj = js.Dynamic.literal(StackResourceDrifts = StackResourceDrifts.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceDriftsOutput]
  }
}

