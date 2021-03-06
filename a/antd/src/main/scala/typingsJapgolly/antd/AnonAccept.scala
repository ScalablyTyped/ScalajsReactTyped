package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antd.uploadInterfaceMod.UploadListType
import typingsJapgolly.antd.uploadInterfaceMod.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  var accept: String
  var action: String
  var beforeUpload: js.Function0[Boolean]
  var className: String
  var disabled: Boolean
  var listType: UploadListType
  var multiple: Boolean
  var showUploadList: Boolean
  var supportServerRender: Boolean
  var `type`: UploadType
}

object AnonAccept {
  @scala.inline
  def apply(
    accept: String,
    action: String,
    beforeUpload: CallbackTo[Boolean],
    className: String,
    disabled: Boolean,
    listType: UploadListType,
    multiple: Boolean,
    showUploadList: Boolean,
    supportServerRender: Boolean,
    `type`: UploadType
  ): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], showUploadList = showUploadList.asInstanceOf[js.Any], supportServerRender = supportServerRender.asInstanceOf[js.Any])
    __obj.updateDynamic("beforeUpload")(beforeUpload.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccept]
  }
}

