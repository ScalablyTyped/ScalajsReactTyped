package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRecordersRequest extends js.Object {
  /**
    * A list of configuration recorder names.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.native
}

object DescribeConfigurationRecordersRequest {
  @scala.inline
  def apply(ConfigurationRecorderNames: ConfigurationRecorderNameList = null): DescribeConfigurationRecordersRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationRecorderNames != null) __obj.updateDynamic("ConfigurationRecorderNames")(ConfigurationRecorderNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRecordersRequest]
  }
}

