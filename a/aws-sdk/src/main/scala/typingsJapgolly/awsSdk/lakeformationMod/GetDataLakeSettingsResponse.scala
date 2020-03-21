package typingsJapgolly.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataLakeSettingsResponse extends js.Object {
  /**
    * A list of AWS Lake Formation principals. 
    */
  var DataLakeSettings: js.UndefOr[typingsJapgolly.awsSdk.lakeformationMod.DataLakeSettings] = js.native
}

object GetDataLakeSettingsResponse {
  @scala.inline
  def apply(DataLakeSettings: DataLakeSettings = null): GetDataLakeSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataLakeSettings != null) __obj.updateDynamic("DataLakeSettings")(DataLakeSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataLakeSettingsResponse]
  }
}

