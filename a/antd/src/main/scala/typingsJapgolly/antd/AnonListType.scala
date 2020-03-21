package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.uploadInterfaceMod.UploadListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListType extends js.Object {
  var listType: UploadListType
  var previewFile: js.Function1[/* file */ File | Blob, js.Promise[String]]
  var progressAttr: AnonShowInfo
  var showDownloadIcon: Boolean
  var showPreviewIcon: Boolean
  var showRemoveIcon: Boolean
}

object AnonListType {
  @scala.inline
  def apply(
    listType: UploadListType,
    previewFile: /* file */ File | Blob => CallbackTo[js.Promise[String]],
    progressAttr: AnonShowInfo,
    showDownloadIcon: Boolean,
    showPreviewIcon: Boolean,
    showRemoveIcon: Boolean
  ): AnonListType = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any], progressAttr = progressAttr.asInstanceOf[js.Any], showDownloadIcon = showDownloadIcon.asInstanceOf[js.Any], showPreviewIcon = showPreviewIcon.asInstanceOf[js.Any], showRemoveIcon = showRemoveIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    __obj.asInstanceOf[AnonListType]
  }
}

