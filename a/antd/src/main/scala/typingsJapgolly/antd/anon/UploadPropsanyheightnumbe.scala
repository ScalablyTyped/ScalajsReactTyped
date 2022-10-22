package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.antdStrings.PATCH
import typingsJapgolly.antd.antdStrings.POST
import typingsJapgolly.antd.antdStrings.PUT
import typingsJapgolly.antd.antdStrings.environment
import typingsJapgolly.antd.antdStrings.patch_
import typingsJapgolly.antd.antdStrings.post_
import typingsJapgolly.antd.antdStrings.put_
import typingsJapgolly.antd.antdStrings.user
import typingsJapgolly.antd.libUploadInterfaceMod.BeforeUploadValueType
import typingsJapgolly.antd.libUploadInterfaceMod.HttpRequestHeader
import typingsJapgolly.antd.libUploadInterfaceMod.ItemRender
import typingsJapgolly.antd.libUploadInterfaceMod.PreviewFileHandler
import typingsJapgolly.antd.libUploadInterfaceMod.RcFile
import typingsJapgolly.antd.libUploadInterfaceMod.ShowUploadListInterface
import typingsJapgolly.antd.libUploadInterfaceMod.TransformFileHandler
import typingsJapgolly.antd.libUploadInterfaceMod.UploadChangeParam
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProgressProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListType
import typingsJapgolly.antd.libUploadInterfaceMod.UploadLocale
import typingsJapgolly.antd.libUploadInterfaceMod.UploadType
import typingsJapgolly.rcUpload.esInterfaceMod.UploadRequestOption
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/upload/interface.UploadProps<any> & {  height :number | undefined} & react.react.RefAttributes<unknown> */
trait UploadPropsanyheightnumbe extends StObject {
  
  var accept: js.UndefOr[String] = js.undefined
  
  var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])] = js.undefined
  
  var beforeUpload: js.UndefOr[
    js.Function2[
      /* file */ RcFile, 
      /* FileList */ js.Array[RcFile], 
      BeforeUploadValueType | js.Promise[BeforeUploadValueType]
    ]
  ] = js.undefined
  
  var capture: js.UndefOr[Boolean | user | environment] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var customRequest: js.UndefOr[js.Function1[/* options */ UploadRequestOption[Any], Unit]] = js.undefined
  
  var data: js.UndefOr[
    (Record[String, Any]) | (js.Function1[
      /* file */ UploadFile[Any], 
      (Record[String, Any]) | (js.Promise[Record[String, Any]])
    ])
  ] = js.undefined
  
  var defaultFileList: js.UndefOr[js.Array[UploadFile[Any]]] = js.undefined
  
  var directory: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fileList: js.UndefOr[js.Array[UploadFile[Any]]] = js.undefined
  
  var headers: js.UndefOr[HttpRequestHeader] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType], Node]
  ] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isImageUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.undefined
  
  var itemRender: js.UndefOr[ItemRender[Any]] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key | Null] = js.undefined
  
  var listType: js.UndefOr[UploadListType] = js.undefined
  
  var locale: js.UndefOr[UploadLocale] = js.undefined
  
  /** Config max count of `fileList`. Will replace current one when `maxCount` is 1 */
  var maxCount: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[POST | PUT | PATCH | post_ | put_ | patch_] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[Any]], Unit]] = js.undefined
  
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Unit]] = js.undefined
  
  var onDrop: js.UndefOr[js.Function1[/* event */ ReactDragEventFrom[HTMLDivElement], Unit]] = js.undefined
  
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Unit]] = js.undefined
  
  var onRemove: js.UndefOr[
    js.Function1[/* file */ UploadFile[Any], Unit | Boolean | (js.Promise[Unit | Boolean])]
  ] = js.undefined
  
  var openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var previewFile: js.UndefOr[PreviewFileHandler] = js.undefined
  
  var progress: js.UndefOr[UploadListProgressProps] = js.undefined
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[Any]] = js.undefined
  
  var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var supportServerRender: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated Please use `beforeUpload` directly */
  var transformFile: js.UndefOr[TransformFileHandler] = js.undefined
  
  var `type`: js.UndefOr[UploadType] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object UploadPropsanyheightnumbe {
  
  inline def apply(): UploadPropsanyheightnumbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadPropsanyheightnumbe]
  }
  
  extension [Self <: UploadPropsanyheightnumbe](x: Self) {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAction(value: String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: /* file */ RcFile => PromiseLike[String] | String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBeforeUpload(
      value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => BeforeUploadValueType | js.Promise[BeforeUploadValueType]
    ): Self = StObject.set(x, "beforeUpload", js.Any.fromFunction2(value))
    
    inline def setBeforeUploadUndefined: Self = StObject.set(x, "beforeUpload", js.undefined)
    
    inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCustomRequest(value: /* options */ UploadRequestOption[Any] => Callback): Self = StObject.set(x, "customRequest", js.Any.fromFunction1((t0: /* options */ UploadRequestOption[Any]) => value(t0).runNow()))
    
    inline def setCustomRequestUndefined: Self = StObject.set(x, "customRequest", js.undefined)
    
    inline def setData(
      value: (Record[String, Any]) | (js.Function1[
          /* file */ UploadFile[Any], 
          (Record[String, Any]) | (js.Promise[Record[String, Any]])
        ])
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFunction1(value: /* file */ UploadFile[Any] => (Record[String, Any]) | (js.Promise[Record[String, Any]])): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefaultFileList(value: js.Array[UploadFile[Any]]): Self = StObject.set(x, "defaultFileList", value.asInstanceOf[js.Any])
    
    inline def setDefaultFileListUndefined: Self = StObject.set(x, "defaultFileList", js.undefined)
    
    inline def setDefaultFileListVarargs(value: UploadFile[Any]*): Self = StObject.set(x, "defaultFileList", js.Array(value*))
    
    inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFileList(value: js.Array[UploadFile[Any]]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    
    inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
    
    inline def setFileListVarargs(value: UploadFile[Any]*): Self = StObject.set(x, "fileList", js.Array(value*))
    
    inline def setHeaders(value: HttpRequestHeader): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIconRender(value: (/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType]) => Node): Self = StObject.set(x, "iconRender", js.Any.fromFunction2(value))
    
    inline def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsImageUrl(value: /* file */ UploadFile[Any] => Boolean): Self = StObject.set(x, "isImageUrl", js.Any.fromFunction1(value))
    
    inline def setIsImageUrlUndefined: Self = StObject.set(x, "isImageUrl", js.undefined)
    
    inline def setItemRender(
      value: (/* originNode */ Element, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[Any]], /* actions */ Download) => Node
    ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
    
    inline def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
    
    inline def setKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setListType(value: UploadListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
    
    inline def setLocale(value: UploadLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setMethod(value: POST | PUT | PATCH | post_ | put_ | patch_): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: /* info */ UploadChangeParam[UploadFile[Any]] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* info */ UploadChangeParam[UploadFile[Any]]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDownload(value: /* file */ UploadFile[Any] => Callback): Self = StObject.set(x, "onDownload", js.Any.fromFunction1((t0: /* file */ UploadFile[Any]) => value(t0).runNow()))
    
    inline def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
    
    inline def setOnDrop(value: /* event */ ReactDragEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: /* event */ ReactDragEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnPreview(value: /* file */ UploadFile[Any] => Callback): Self = StObject.set(x, "onPreview", js.Any.fromFunction1((t0: /* file */ UploadFile[Any]) => value(t0).runNow()))
    
    inline def setOnPreviewUndefined: Self = StObject.set(x, "onPreview", js.undefined)
    
    inline def setOnRemove(value: /* file */ UploadFile[Any] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOpenFileDialogOnClick(value: Boolean): Self = StObject.set(x, "openFileDialogOnClick", value.asInstanceOf[js.Any])
    
    inline def setOpenFileDialogOnClickUndefined: Self = StObject.set(x, "openFileDialogOnClick", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setPreviewFile(value: /* file */ File | Blob => PromiseLike[String]): Self = StObject.set(x, "previewFile", js.Any.fromFunction1(value))
    
    inline def setPreviewFileUndefined: Self = StObject.set(x, "previewFile", js.undefined)
    
    inline def setProgress(value: UploadListProgressProps): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setShowUploadList(value: Boolean | ShowUploadListInterface): Self = StObject.set(x, "showUploadList", value.asInstanceOf[js.Any])
    
    inline def setShowUploadListUndefined: Self = StObject.set(x, "showUploadList", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSupportServerRender(value: Boolean): Self = StObject.set(x, "supportServerRender", value.asInstanceOf[js.Any])
    
    inline def setSupportServerRenderUndefined: Self = StObject.set(x, "supportServerRender", js.undefined)
    
    inline def setTransformFile(value: /* file */ RcFile => String | Blob | File | (PromiseLike[String | Blob | File])): Self = StObject.set(x, "transformFile", js.Any.fromFunction1(value))
    
    inline def setTransformFileUndefined: Self = StObject.set(x, "transformFile", js.undefined)
    
    inline def setType(value: UploadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
