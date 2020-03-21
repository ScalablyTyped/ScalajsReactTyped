package typingsJapgolly.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAnomalyDetectorsOutput extends js.Object {
  /**
    * The list of anomaly detection models returned by the operation.
    */
  var AnomalyDetectors: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.AnomalyDetectors] = js.native
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAnomalyDetectorsOutput {
  @scala.inline
  def apply(AnomalyDetectors: AnomalyDetectors = null, NextToken: NextToken = null): DescribeAnomalyDetectorsOutput = {
    val __obj = js.Dynamic.literal()
    if (AnomalyDetectors != null) __obj.updateDynamic("AnomalyDetectors")(AnomalyDetectors.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnomalyDetectorsOutput]
  }
}

