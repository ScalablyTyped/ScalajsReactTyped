package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import typingsJapgolly.primereact.AnonFiles
import typingsJapgolly.primereact.AnonFilesAny
import typingsJapgolly.primereact.AnonFilesOriginalEvent
import typingsJapgolly.primereact.AnonFormData
import typingsJapgolly.primereact.AnonProgress
import typingsJapgolly.primereact.fileUploadMod.FileUploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FileUpload {
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
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FileUploadProps, 
    typingsJapgolly.primereact.primereactFileuploadMod.FileUpload, 
    Unit, 
    FileUploadProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.fileUploadMod.FileUploadProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactFileuploadMod.FileUpload](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.fileUploadMod.FileUploadProps])(children: _*)
  }
  @JSImport("primereact/fileupload", "FileUpload")
  @js.native
  object componentImport extends js.Object
  
}

