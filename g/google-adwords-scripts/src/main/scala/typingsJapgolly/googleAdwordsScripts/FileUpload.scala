package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpload extends BulkUpload[FileUpload] {
  @JSName("apply")
  def apply(): Unit
}

object FileUpload {
  @scala.inline
  def apply(
    apply: Callback,
    forCampaignManagement: CallbackTo[FileUpload],
    forOfflineConversions: CallbackTo[FileUpload],
    preview: Callback,
    setFileName: String => CallbackTo[FileUpload]
  ): FileUpload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply.toJsFn)
    __obj.updateDynamic("forCampaignManagement")(forCampaignManagement.toJsFn)
    __obj.updateDynamic("forOfflineConversions")(forOfflineConversions.toJsFn)
    __obj.updateDynamic("preview")(preview.toJsFn)
    __obj.updateDynamic("setFileName")(js.Any.fromFunction1((t0: java.lang.String) => setFileName(t0).runNow()))
    __obj.asInstanceOf[FileUpload]
  }
}

