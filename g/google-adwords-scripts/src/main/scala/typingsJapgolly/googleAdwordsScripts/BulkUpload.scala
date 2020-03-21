package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkUpload[T] extends js.Object {
  def forCampaignManagement(): T
  def forOfflineConversions(): T
  def preview(): Unit
  def setFileName(fileName: String): T
}

object BulkUpload {
  @scala.inline
  def apply[T](
    forCampaignManagement: CallbackTo[T],
    forOfflineConversions: CallbackTo[T],
    preview: Callback,
    setFileName: String => CallbackTo[T]
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forCampaignManagement")(forCampaignManagement.toJsFn)
    __obj.updateDynamic("forOfflineConversions")(forOfflineConversions.toJsFn)
    __obj.updateDynamic("preview")(preview.toJsFn)
    __obj.updateDynamic("setFileName")(js.Any.fromFunction1((t0: java.lang.String) => setFileName(t0).runNow()))
    __obj.asInstanceOf[BulkUpload[T]]
  }
}

