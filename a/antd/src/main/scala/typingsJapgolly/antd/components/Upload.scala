package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.esUploadInterfaceMod.HttpRequestHeader
import typingsJapgolly.antd.esUploadInterfaceMod.RcCustomRequestOptions
import typingsJapgolly.antd.esUploadInterfaceMod.RcFile
import typingsJapgolly.antd.esUploadInterfaceMod.ShowUploadListInterface
import typingsJapgolly.antd.esUploadInterfaceMod.UploadChangeParam
import typingsJapgolly.antd.esUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.esUploadInterfaceMod.UploadListType
import typingsJapgolly.antd.esUploadInterfaceMod.UploadLocale
import typingsJapgolly.antd.esUploadInterfaceMod.UploadProps
import typingsJapgolly.antd.esUploadInterfaceMod.UploadType
import typingsJapgolly.antd.esUploadMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Upload {
  def apply(
    accept: String = null,
    action: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => CallbackTo[Boolean | js.Thenable[Unit]] = null,
    className: String = null,
    customRequest: /* options */ RcCustomRequestOptions => Callback = null,
    data: js.Object | (js.Function1[/* file */ UploadFile, js.Object]) = null,
    defaultFileList: js.Array[UploadFile] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fileList: js.Array[UploadFile] = null,
    headers: HttpRequestHeader = null,
    id: String = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* info */ UploadChangeParam[UploadFile] => Callback = null,
    onDownload: /* file */ UploadFile => Callback = null,
    onPreview: /* file */ UploadFile => Callback = null,
    onRemove: /* file */ UploadFile => CallbackTo[Unit | Boolean | (js.Promise[Unit | Boolean])] = null,
    openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => CallbackTo[js.Thenable[String]] = null,
    showUploadList: Boolean | ShowUploadListInterface = null,
    style: CSSProperties = null,
    supportServerRender: js.UndefOr[Boolean] = js.undefined,
    transformFile: /* file */ RcFile => CallbackTo[String | Blob | File | (js.Thenable[String | Blob | File])] = null,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[UploadProps, default, Unit, UploadProps] = {
    val __obj = js.Dynamic.literal()
  
      if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.RcFile, t1: /* FileList */ js.Array[typingsJapgolly.antd.esUploadInterfaceMod.RcFile]) => beforeUpload(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customRequest != null) __obj.updateDynamic("customRequest")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.antd.esUploadInterfaceMod.RcCustomRequestOptions) => customRequest(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultFileList != null) __obj.updateDynamic("defaultFileList")(defaultFileList.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.antd.esUploadInterfaceMod.UploadChangeParam[typingsJapgolly.antd.esUploadInterfaceMod.UploadFile]) => onChange(t0).runNow()))
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.UploadFile) => onDownload(t0).runNow()))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.UploadFile) => onPreview(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.UploadFile) => onRemove(t0).runNow()))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender.asInstanceOf[js.Any])
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.esUploadInterfaceMod.RcFile) => transformFile(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esUploadInterfaceMod.UploadProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.esUploadMod.default](js.constructorOf[typingsJapgolly.antd.esUploadMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esUploadInterfaceMod.UploadProps])(children: _*)
  }
}

