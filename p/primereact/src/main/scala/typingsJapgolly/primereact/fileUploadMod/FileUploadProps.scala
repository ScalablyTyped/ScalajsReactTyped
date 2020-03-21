package typingsJapgolly.primereact.fileUploadMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.File
import typingsJapgolly.primereact.AnonFiles
import typingsJapgolly.primereact.AnonFilesAny
import typingsJapgolly.primereact.AnonFilesOriginalEvent
import typingsJapgolly.primereact.AnonFormData
import typingsJapgolly.primereact.AnonProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadProps extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var auto: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[String] = js.undefined
  var chooseLabel: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customUpload: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var invalidFileSizeMessageDetail: js.UndefOr[String] = js.undefined
  var invalidFileSizeMessageSummary: js.UndefOr[String] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ AnonFormData, Unit]] = js.undefined
  var onBeforeUpload: js.UndefOr[js.Function1[/* e */ AnonFormData, Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ AnonFiles, Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* e */ AnonProgress, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ AnonFilesOriginalEvent, Unit]] = js.undefined
  var onUpload: js.UndefOr[js.Function1[/* e */ AnonFiles, Unit]] = js.undefined
  var onValidationFail: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
  var previewWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var uploadHandler: js.UndefOr[js.Function1[/* e */ AnonFilesAny, Unit]] = js.undefined
  var uploadLabel: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object FileUploadProps {
  @scala.inline
  def apply(
    accept: String = null,
    auto: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    chooseLabel: String = null,
    className: String = null,
    customUpload: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    invalidFileSizeMessageDetail: String = null,
    invalidFileSizeMessageSummary: String = null,
    maxFileSize: Int | Double = null,
    mode: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBeforeSend: /* e */ AnonFormData => Callback = null,
    onBeforeUpload: /* e */ AnonFormData => Callback = null,
    onClear: js.UndefOr[Callback] = js.undefined,
    onError: /* e */ AnonFiles => Callback = null,
    onProgress: /* e */ AnonProgress => Callback = null,
    onSelect: /* e */ AnonFilesOriginalEvent => Callback = null,
    onUpload: /* e */ AnonFiles => Callback = null,
    onValidationFail: /* file */ File => Callback = null,
    previewWidth: Int | Double = null,
    style: js.Object = null,
    uploadHandler: /* e */ AnonFilesAny => Callback = null,
    uploadLabel: String = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): FileUploadProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (chooseLabel != null) __obj.updateDynamic("chooseLabel")(chooseLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(customUpload)) __obj.updateDynamic("customUpload")(customUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidFileSizeMessageDetail != null) __obj.updateDynamic("invalidFileSizeMessageDetail")(invalidFileSizeMessageDetail.asInstanceOf[js.Any])
    if (invalidFileSizeMessageSummary != null) __obj.updateDynamic("invalidFileSizeMessageSummary")(invalidFileSizeMessageSummary.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBeforeSend != null) __obj.updateDynamic("onBeforeSend")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFormData) => onBeforeSend(t0).runNow()))
    if (onBeforeUpload != null) __obj.updateDynamic("onBeforeUpload")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFormData) => onBeforeUpload(t0).runNow()))
    onClear.foreach(p => __obj.updateDynamic("onClear")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFiles) => onError(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonProgress) => onProgress(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFilesOriginalEvent) => onSelect(t0).runNow()))
    if (onUpload != null) __obj.updateDynamic("onUpload")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFiles) => onUpload(t0).runNow()))
    if (onValidationFail != null) __obj.updateDynamic("onValidationFail")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File) => onValidationFail(t0).runNow()))
    if (previewWidth != null) __obj.updateDynamic("previewWidth")(previewWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uploadHandler != null) __obj.updateDynamic("uploadHandler")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonFilesAny) => uploadHandler(t0).runNow()))
    if (uploadLabel != null) __obj.updateDynamic("uploadLabel")(uploadLabel.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadProps]
  }
}

