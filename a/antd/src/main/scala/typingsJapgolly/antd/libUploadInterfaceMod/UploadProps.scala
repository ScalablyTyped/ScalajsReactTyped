package typingsJapgolly.antd.libUploadInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.antdStrings.POST
import typingsJapgolly.antd.antdStrings.PUT
import typingsJapgolly.antd.antdStrings.post_
import typingsJapgolly.antd.antdStrings.put_
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProps extends js.Object {
  var accept: js.UndefOr[String] = js.undefined
  var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])] = js.undefined
  var beforeUpload: js.UndefOr[
    js.Function2[/* file */ RcFile, /* FileList */ js.Array[RcFile], Boolean | js.Thenable[Unit]]
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customRequest: js.UndefOr[js.Function1[/* options */ RcCustomRequestOptions, Unit]] = js.undefined
  var data: js.UndefOr[js.Object | (js.Function1[/* file */ UploadFile[_], js.Object])] = js.undefined
  var defaultFileList: js.UndefOr[js.Array[UploadFile[_]]] = js.undefined
  var directory: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fileList: js.UndefOr[js.Array[UploadFile[_]]] = js.undefined
  var headers: js.UndefOr[HttpRequestHeader] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var listType: js.UndefOr[UploadListType] = js.undefined
  var locale: js.UndefOr[UploadLocale] = js.undefined
  var method: js.UndefOr[POST | PUT | post_ | put_] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[_]], Unit]] = js.undefined
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.undefined
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.undefined
  var onRemove: js.UndefOr[
    js.Function1[/* file */ UploadFile[_], Unit | Boolean | (js.Promise[Unit | Boolean])]
  ] = js.undefined
  var openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
  var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var supportServerRender: js.UndefOr[Boolean] = js.undefined
  var transformFile: js.UndefOr[TransformFileHandler] = js.undefined
  var `type`: js.UndefOr[UploadType] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object UploadProps {
  @scala.inline
  def apply(
    accept: String = null,
    action: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => CallbackTo[Boolean | js.Thenable[Unit]] = null,
    className: String = null,
    customRequest: /* options */ RcCustomRequestOptions => Callback = null,
    data: js.Object | (js.Function1[/* file */ UploadFile[_], js.Object]) = null,
    defaultFileList: js.Array[UploadFile[_]] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fileList: js.Array[UploadFile[_]] = null,
    headers: HttpRequestHeader = null,
    id: String = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    method: POST | PUT | post_ | put_ = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* info */ UploadChangeParam[UploadFile[js.Any]] => Callback = null,
    onDownload: /* file */ UploadFile[js.Any] => Callback = null,
    onPreview: /* file */ UploadFile[js.Any] => Callback = null,
    onRemove: /* file */ UploadFile[js.Any] => CallbackTo[Unit | Boolean | (js.Promise[Unit | Boolean])] = null,
    openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => CallbackTo[js.Thenable[String]] = null,
    showUploadList: Boolean | ShowUploadListInterface = null,
    style: CSSProperties = null,
    supportServerRender: js.UndefOr[Boolean] = js.undefined,
    transformFile: /* file */ RcFile => CallbackTo[String | Blob | File | (js.Thenable[String | Blob | File])] = null,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): UploadProps = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.RcFile, t1: /* FileList */ js.Array[typingsJapgolly.antd.libUploadInterfaceMod.RcFile]) => beforeUpload(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customRequest != null) __obj.updateDynamic("customRequest")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.libUploadInterfaceMod.RcCustomRequestOptions) => customRequest(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultFileList != null) __obj.updateDynamic("defaultFileList")(defaultFileList.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.antd.libUploadInterfaceMod.UploadChangeParam[typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]]) => onChange(t0).runNow()))
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]) => onDownload(t0).runNow()))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]) => onPreview(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]) => onRemove(t0).runNow()))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender.asInstanceOf[js.Any])
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.RcFile) => transformFile(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProps]
  }
}

