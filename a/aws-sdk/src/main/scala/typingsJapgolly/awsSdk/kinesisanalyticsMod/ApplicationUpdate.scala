package typingsJapgolly.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationUpdate extends js.Object {
  /**
    * Describes application code updates.
    */
  var ApplicationCodeUpdate: js.UndefOr[ApplicationCode] = js.native
  /**
    * Describes application CloudWatch logging option updates.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.CloudWatchLoggingOptionUpdates] = js.native
  /**
    * Describes application input configuration updates.
    */
  var InputUpdates: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.InputUpdates] = js.native
  /**
    * Describes application output configuration updates.
    */
  var OutputUpdates: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.OutputUpdates] = js.native
  /**
    * Describes application reference data source updates.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsMod.ReferenceDataSourceUpdates] = js.native
}

object ApplicationUpdate {
  @scala.inline
  def apply(
    ApplicationCodeUpdate: ApplicationCode = null,
    CloudWatchLoggingOptionUpdates: CloudWatchLoggingOptionUpdates = null,
    InputUpdates: InputUpdates = null,
    OutputUpdates: OutputUpdates = null,
    ReferenceDataSourceUpdates: ReferenceDataSourceUpdates = null
  ): ApplicationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ApplicationCodeUpdate != null) __obj.updateDynamic("ApplicationCodeUpdate")(ApplicationCodeUpdate.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionUpdates != null) __obj.updateDynamic("CloudWatchLoggingOptionUpdates")(CloudWatchLoggingOptionUpdates.asInstanceOf[js.Any])
    if (InputUpdates != null) __obj.updateDynamic("InputUpdates")(InputUpdates.asInstanceOf[js.Any])
    if (OutputUpdates != null) __obj.updateDynamic("OutputUpdates")(OutputUpdates.asInstanceOf[js.Any])
    if (ReferenceDataSourceUpdates != null) __obj.updateDynamic("ReferenceDataSourceUpdates")(ReferenceDataSourceUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationUpdate]
  }
}

