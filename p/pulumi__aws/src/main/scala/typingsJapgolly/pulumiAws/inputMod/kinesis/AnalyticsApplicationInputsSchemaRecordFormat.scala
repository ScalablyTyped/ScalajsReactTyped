package typingsJapgolly.pulumiAws.inputMod.kinesis

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsSchemaRecordFormat extends js.Object {
  var mappingParameters: js.UndefOr[Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters]] = js.native
  var recordFormatType: js.UndefOr[Input[String]] = js.native
}

object AnalyticsApplicationInputsSchemaRecordFormat {
  @scala.inline
  def apply(
    mappingParameters: Input[AnalyticsApplicationInputsSchemaRecordFormatMappingParameters] = null,
    recordFormatType: Input[String] = null
  ): AnalyticsApplicationInputsSchemaRecordFormat = {
    val __obj = js.Dynamic.literal()
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters.asInstanceOf[js.Any])
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsSchemaRecordFormat]
  }
}

