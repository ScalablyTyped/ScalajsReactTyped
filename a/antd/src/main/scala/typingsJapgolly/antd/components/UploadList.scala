package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsJapgolly.antd.uploadInterfaceMod.UploadFile
import typingsJapgolly.antd.uploadInterfaceMod.UploadListProps
import typingsJapgolly.antd.uploadInterfaceMod.UploadListType
import typingsJapgolly.antd.uploadInterfaceMod.UploadLocale
import typingsJapgolly.antd.uploadListMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UploadList {
  def apply(
    locale: UploadLocale,
    downloadIcon: VdomNode = null,
    iconRender: (/* file */ UploadFile[js.Any], /* listType */ js.UndefOr[UploadListType]) => CallbackTo[Node] = null,
    items: js.Array[UploadFile[_]] = null,
    listType: UploadListType = null,
    onDownload: /* file */ UploadFile[js.Any] => Callback = null,
    onPreview: /* file */ UploadFile[js.Any] => Callback = null,
    onRemove: /* file */ UploadFile[js.Any] => CallbackTo[Unit | Boolean] = null,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => CallbackTo[js.Thenable[String]] = null,
    progressAttr: js.Object = null,
    removeIcon: VdomNode = null,
    showDownloadIcon: js.UndefOr[Boolean] = js.undefined,
    showPreviewIcon: js.UndefOr[Boolean] = js.undefined,
    showRemoveIcon: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[UploadListProps, default, Unit, UploadListProps] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
  
      if (downloadIcon != null) __obj.updateDynamic("downloadIcon")(downloadIcon.rawNode.asInstanceOf[js.Any])
    if (iconRender != null) __obj.updateDynamic("iconRender")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.antd.uploadInterfaceMod.UploadFile[js.Any], t1: /* listType */ js.UndefOr[typingsJapgolly.antd.uploadInterfaceMod.UploadListType]) => iconRender(t0, t1).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.uploadInterfaceMod.UploadFile[js.Any]) => onDownload(t0).runNow()))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.uploadInterfaceMod.UploadFile[js.Any]) => onPreview(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.antd.uploadInterfaceMod.UploadFile[js.Any]) => onRemove(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob) => previewFile(t0).runNow()))
    if (progressAttr != null) __obj.updateDynamic("progressAttr")(progressAttr.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(showDownloadIcon)) __obj.updateDynamic("showDownloadIcon")(showDownloadIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreviewIcon)) __obj.updateDynamic("showPreviewIcon")(showPreviewIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveIcon)) __obj.updateDynamic("showRemoveIcon")(showRemoveIcon.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.uploadInterfaceMod.UploadListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.uploadListMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.uploadInterfaceMod.UploadListProps])(children: _*)
  }
  @JSImport("antd/lib/upload/UploadList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

