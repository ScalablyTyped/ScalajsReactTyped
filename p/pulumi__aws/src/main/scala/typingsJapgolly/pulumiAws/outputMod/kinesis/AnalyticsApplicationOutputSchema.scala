package typingsJapgolly.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationOutputSchema extends js.Object {
  var recordFormatType: js.UndefOr[String] = js.native
}

object AnalyticsApplicationOutputSchema {
  @scala.inline
  def apply(recordFormatType: String = null): AnalyticsApplicationOutputSchema = {
    val __obj = js.Dynamic.literal()
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationOutputSchema]
  }
}

