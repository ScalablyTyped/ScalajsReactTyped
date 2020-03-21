package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHyperParameterTuningJobRequest extends js.Object {
  /**
    * The name of the tuning job to describe.
    */
  var HyperParameterTuningJobName: typingsJapgolly.awsSdk.sagemakerMod.HyperParameterTuningJobName = js.native
}

object DescribeHyperParameterTuningJobRequest {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName): DescribeHyperParameterTuningJobRequest = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobName = HyperParameterTuningJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeHyperParameterTuningJobRequest]
  }
}

