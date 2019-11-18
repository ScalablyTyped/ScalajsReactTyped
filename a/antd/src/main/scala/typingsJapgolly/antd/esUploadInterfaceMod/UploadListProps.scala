package typingsJapgolly.antd.esUploadInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadListProps extends js.Object {
  var items: js.UndefOr[js.Array[UploadFile]] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: UploadLocale
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile, Unit]] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile, Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* file */ UploadFile, Unit | Boolean]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
  var progressAttr: js.UndefOr[js.Object] = js.undefined
  var showDownloadIcon: js.UndefOr[Boolean] = js.undefined
  var showPreviewIcon: js.UndefOr[Boolean] = js.undefined
  var showRemoveIcon: js.UndefOr[Boolean] = js.undefined
}

object UploadListProps {
  @scala.inline
  def apply(
    locale: UploadLocale,
    items: js.Array[UploadFile] = null,
    listType: UploadListType = null,
    onDownload: /* file */ UploadFile => Callback = null,
    onPreview: /* file */ UploadFile => Callback = null,
    onRemove: /* file */ UploadFile => CallbackTo[Unit | Boolean] = null,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => CallbackTo[js.Thenable[String]] = null,
    progressAttr: js.Object = null,
    showDownloadIcon: js.UndefOr[Boolean] = js.undefined,
    showPreviewIcon: js.UndefOr[Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[Boolean] = js.undefined
  ): UploadListProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.UploadFile) => onDownload(t0).runNow()))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.UploadFile) => onPreview(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.UploadFile) => onRemove(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    if (progressAttr != null) __obj.updateDynamic("progressAttr")(progressAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(showDownloadIcon)) __obj.updateDynamic("showDownloadIcon")(showDownloadIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadListProps]
  }
}

