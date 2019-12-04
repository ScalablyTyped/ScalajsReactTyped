package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListType
import typingsJapgolly.antd.libUploadInterfaceMod.UploadLocale
import typingsJapgolly.antd.libUploadUploadListMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UploadList {
  def apply(
    locale: UploadLocale,
    items: js.Array[UploadFile[_]] = null,
    listType: UploadListType = null,
    onDownload: /* file */ UploadFile[js.Any] => Callback = null,
    onPreview: /* file */ UploadFile[js.Any] => Callback = null,
    onRemove: /* file */ UploadFile[js.Any] => CallbackTo[Unit | Boolean] = null,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => CallbackTo[js.Thenable[String]] = null,
    progressAttr: js.Object = null,
    showDownloadIcon: js.UndefOr[Boolean] = js.undefined,
    showPreviewIcon: js.UndefOr[Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[UploadListProps, default, Unit, UploadListProps] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]) => onDownload(t0).runNow()))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]) => onPreview(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.libUploadInterfaceMod.UploadFile[js.Any]) => onRemove(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    if (progressAttr != null) __obj.updateDynamic("progressAttr")(progressAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(showDownloadIcon)) __obj.updateDynamic("showDownloadIcon")(showDownloadIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libUploadInterfaceMod.UploadListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libUploadUploadListMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libUploadInterfaceMod.UploadListProps])(children: _*)
  }
  @JSImport("antd/lib/upload/UploadList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

