package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWhenUploadedInput extends js.Object {
  var FileShareARN: typingsJapgolly.awsSdk.storagegatewayMod.FileShareARN = js.native
}

object NotifyWhenUploadedInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN): NotifyWhenUploadedInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotifyWhenUploadedInput]
  }
}

