package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshCacheOutput extends js.Object {
  var FileShareARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var NotificationId: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.NotificationId] = js.native
}

object RefreshCacheOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null, NotificationId: NotificationId = null): RefreshCacheOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    if (NotificationId != null) __obj.updateDynamic("NotificationId")(NotificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshCacheOutput]
  }
}

