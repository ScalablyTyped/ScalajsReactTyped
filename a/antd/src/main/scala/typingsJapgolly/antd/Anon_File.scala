package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var listType: UploadListType
  var previewFile: js.Function1[/* file */ File | Blob, js.Promise[String]]
  var progressAttr: Anon_ShowInfo
  var showDownloadIcon: Boolean
  var showPreviewIcon: Boolean
  var showRemoveIcon: Boolean
}

object Anon_File {
  @scala.inline
  def apply(
    listType: UploadListType,
    previewFile: /* file */ File | Blob => CallbackTo[js.Promise[String]],
    progressAttr: Anon_ShowInfo,
    showDownloadIcon: Boolean,
    showPreviewIcon: Boolean,
    showRemoveIcon: Boolean
  ): Anon_File = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any], progressAttr = progressAttr.asInstanceOf[js.Any], showDownloadIcon = showDownloadIcon.asInstanceOf[js.Any], showPreviewIcon = showPreviewIcon.asInstanceOf[js.Any], showRemoveIcon = showRemoveIcon.asInstanceOf[js.Any])
    __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    __obj.asInstanceOf[Anon_File]
  }
}

