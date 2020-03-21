package typingsJapgolly.pulumiAws.inputMod.kinesis

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSources extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  var s3: Input[AnalyticsApplicationReferenceDataSourcesS3] = js.native
  var schema: Input[AnalyticsApplicationReferenceDataSourcesSchema] = js.native
  var tableName: Input[String] = js.native
}

object AnalyticsApplicationReferenceDataSources {
  @scala.inline
  def apply(
    s3: Input[AnalyticsApplicationReferenceDataSourcesS3],
    schema: Input[AnalyticsApplicationReferenceDataSourcesSchema],
    tableName: Input[String],
    id: Input[String] = null
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
}

