package typingsJapgolly.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeForecastResponse extends js.Object {
  /**
    * When the forecast creation task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the dataset group that provided the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The forecast ARN as specified in the request.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the forecast.
    */
  var ForecastName: js.UndefOr[Name] = js.native
  /**
    * The quantiles at which proababilistic forecasts were generated.
    */
  var ForecastTypes: js.UndefOr[typingsJapgolly.awsSdk.forecastserviceMod.ForecastTypes] = js.native
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when inference (creating the forecast) starts (status changed to CREATE_IN_PROGRESS), and when inference is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The ARN of the predictor used to generate the forecast.
    */
  var PredictorArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast must be ACTIVE before you can query or export the forecast. 
    */
  var Status: js.UndefOr[String] = js.native
}

object DescribeForecastResponse {
  @scala.inline
  def apply(
    CreationTime: js.Date = null,
    DatasetGroupArn: Arn = null,
    ForecastArn: Arn = null,
    ForecastName: Name = null,
    ForecastTypes: ForecastTypes = null,
    LastModificationTime: js.Date = null,
    Message: ErrorMessage = null,
    PredictorArn: Arn = null,
    Status: String = null
  ): DescribeForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DatasetGroupArn != null) __obj.updateDynamic("DatasetGroupArn")(DatasetGroupArn.asInstanceOf[js.Any])
    if (ForecastArn != null) __obj.updateDynamic("ForecastArn")(ForecastArn.asInstanceOf[js.Any])
    if (ForecastName != null) __obj.updateDynamic("ForecastName")(ForecastName.asInstanceOf[js.Any])
    if (ForecastTypes != null) __obj.updateDynamic("ForecastTypes")(ForecastTypes.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastResponse]
  }
}

