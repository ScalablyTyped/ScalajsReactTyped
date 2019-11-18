package typingsJapgolly.antd.esUploadInterfaceMod

import typingsJapgolly.antd.Anon_Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadChangeParam[T /* <: js.Object */] extends js.Object {
  var event: js.UndefOr[Anon_Percent] = js.undefined
  var file: T
  var fileList: js.Array[UploadFile]
}

object UploadChangeParam {
  @scala.inline
  def apply[T /* <: js.Object */](file: T, fileList: js.Array[UploadFile], event: Anon_Percent = null): UploadChangeParam[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadChangeParam[T]]
  }
}

