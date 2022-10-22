package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.Download
import typingsJapgolly.antd.anon.UploadPropsanyheightnumbe
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
import typingsJapgolly.antd.libUploadInterfaceMod.RcFile
import typingsJapgolly.antd.libUploadInterfaceMod.ShowUploadListInterface
import typingsJapgolly.antd.libUploadInterfaceMod.UploadChangeParam
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProgressProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListType
import typingsJapgolly.antd.libUploadInterfaceMod.UploadLocale
import typingsJapgolly.antd.libUploadInterfaceMod.UploadProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadType
import typingsJapgolly.rcUpload.esInterfaceMod.UploadRequestOption
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Upload {
  
  object Dragger {
    
    @JSImport("antd", "Upload.Dragger")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Dragger.type): SharedBuilder_UploadPropsanyheightnumbe_553613363 = new SharedBuilder_UploadPropsanyheightnumbe_553613363(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: UploadPropsanyheightnumbe): SharedBuilder_UploadPropsanyheightnumbe_553613363 = new SharedBuilder_UploadPropsanyheightnumbe_553613363(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Upload")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def action(value: String | (js.Function1[/* file */ RcFile, PromiseLike[String] | String])): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def actionFunction1(value: /* file */ RcFile => PromiseLike[String] | String): this.type = set("action", js.Any.fromFunction1(value))
    
    inline def beforeUpload(
      value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => BeforeUploadValueType | js.Promise[BeforeUploadValueType]
    ): this.type = set("beforeUpload", js.Any.fromFunction2(value))
    
    inline def capture(value: Boolean | user | environment): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def customRequest(value: /* options */ UploadRequestOption[Any] => Callback): this.type = set("customRequest", js.Any.fromFunction1((t0: /* options */ UploadRequestOption[Any]) => value(t0).runNow()))
    
    inline def data(
      value: (Record[String, Any]) | (js.Function1[
          /* file */ UploadFile[Any], 
          (Record[String, Any]) | (js.Promise[Record[String, Any]])
        ])
    ): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataFunction1(value: /* file */ UploadFile[Any] => (Record[String, Any]) | (js.Promise[Record[String, Any]])): this.type = set("data", js.Any.fromFunction1(value))
    
    inline def defaultFileList(value: js.Array[UploadFile[Any]]): this.type = set("defaultFileList", value.asInstanceOf[js.Any])
    
    inline def defaultFileListVarargs(value: UploadFile[Any]*): this.type = set("defaultFileList", js.Array(value*))
    
    inline def directory(value: Boolean): this.type = set("directory", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fileList(value: js.Array[UploadFile[Any]]): this.type = set("fileList", value.asInstanceOf[js.Any])
    
    inline def fileListVarargs(value: UploadFile[Any]*): this.type = set("fileList", js.Array(value*))
    
    inline def headers(value: HttpRequestHeader): this.type = set("headers", value.asInstanceOf[js.Any])
    
    inline def iconRender(
      value: (/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("iconRender", js.Any.fromFunction2(value))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isImageUrl(value: /* file */ UploadFile[Any] => Boolean): this.type = set("isImageUrl", js.Any.fromFunction1(value))
    
    inline def itemRender(
      value: (/* originNode */ japgolly.scalajs.react.facade.React.Element, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[Any]], /* actions */ Download) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    
    inline def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
    
    inline def locale(value: UploadLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
    
    inline def method(value: POST | PUT | PATCH | post_ | put_ | patch_): this.type = set("method", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* info */ UploadChangeParam[UploadFile[Any]] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* info */ UploadChangeParam[UploadFile[Any]]) => value(t0).runNow()))
    
    inline def onDownload(value: /* file */ UploadFile[Any] => Callback): this.type = set("onDownload", js.Any.fromFunction1((t0: /* file */ UploadFile[Any]) => value(t0).runNow()))
    
    inline def onDrop(value: /* event */ ReactDragEventFrom[HTMLDivElement] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: /* event */ ReactDragEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onPreview(value: /* file */ UploadFile[Any] => Callback): this.type = set("onPreview", js.Any.fromFunction1((t0: /* file */ UploadFile[Any]) => value(t0).runNow()))
    
    inline def onRemove(value: /* file */ UploadFile[Any] => Unit | Boolean | (js.Promise[Unit | Boolean])): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    inline def openFileDialogOnClick(value: Boolean): this.type = set("openFileDialogOnClick", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def previewFile(value: /* file */ File | Blob => PromiseLike[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
    
    inline def progress(value: UploadListProgressProps): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def showUploadList(value: Boolean | ShowUploadListInterface): this.type = set("showUploadList", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def supportServerRender(value: Boolean): this.type = set("supportServerRender", value.asInstanceOf[js.Any])
    
    inline def transformFile(value: /* file */ RcFile => String | Blob | File | (PromiseLike[String | Blob | File])): this.type = set("transformFile", js.Any.fromFunction1(value))
    
    inline def `type`(value: UploadType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Upload.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: UploadProps[Any] & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
