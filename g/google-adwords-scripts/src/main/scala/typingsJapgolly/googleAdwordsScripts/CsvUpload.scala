package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvUpload extends BulkUpload[CsvUpload] {
  def append(row: js.Object): CsvUpload
  @JSName("apply")
  def apply(): Unit
}

object CsvUpload {
  @scala.inline
  def apply(
    append: js.Object => CallbackTo[CsvUpload],
    apply: Callback,
    forCampaignManagement: CallbackTo[CsvUpload],
    forOfflineConversions: CallbackTo[CsvUpload],
    preview: Callback,
    setFileName: String => CallbackTo[CsvUpload]
  ): CsvUpload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: js.Object) => append(t0).runNow()))
    __obj.updateDynamic("apply")(apply.toJsFn)
    __obj.updateDynamic("forCampaignManagement")(forCampaignManagement.toJsFn)
    __obj.updateDynamic("forOfflineConversions")(forOfflineConversions.toJsFn)
    __obj.updateDynamic("preview")(preview.toJsFn)
    __obj.updateDynamic("setFileName")(js.Any.fromFunction1((t0: java.lang.String) => setFileName(t0).runNow()))
    __obj.asInstanceOf[CsvUpload]
  }
}

