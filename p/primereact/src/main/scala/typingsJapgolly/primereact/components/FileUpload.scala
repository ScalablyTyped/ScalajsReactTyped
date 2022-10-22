package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.DragEvent
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadBeforeSendParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadBeforeUploadParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadEmptyTemplateType
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadErrorParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadHandlerParam
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadHeaderTemplateOptions
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadHeaderTemplateType
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadItemTemplateType
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadModeType
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadOptionsType
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadProgressBarTemplateType
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadProgressParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadProps
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadRemoveParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadSelectParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.FileUploadUploadParams
import typingsJapgolly.primereact.fileuploadFileuploadMod.ItemTemplateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileUpload {
  
  @JSImport("primereact", "FileUpload")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.FileUpload] {
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def auto(value: Boolean): this.type = set("auto", value.asInstanceOf[js.Any])
    
    inline def cancelLabel(value: String): this.type = set("cancelLabel", value.asInstanceOf[js.Any])
    
    inline def cancelOptions(value: FileUploadOptionsType): this.type = set("cancelOptions", value.asInstanceOf[js.Any])
    
    inline def chooseLabel(value: String): this.type = set("chooseLabel", value.asInstanceOf[js.Any])
    
    inline def chooseOptions(value: FileUploadOptionsType): this.type = set("chooseOptions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def customUpload(value: Boolean): this.type = set("customUpload", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def emptyTemplate(value: FileUploadEmptyTemplateType): this.type = set("emptyTemplate", value.asInstanceOf[js.Any])
    
    inline def emptyTemplateFunction1(value: /* props */ FileUploadProps => Node): this.type = set("emptyTemplate", js.Any.fromFunction1(value))
    
    inline def emptyTemplateNull: this.type = set("emptyTemplate", null)
    
    inline def emptyTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("emptyTemplate", js.Array(value*))
    
    inline def emptyTemplateVdomElement(value: VdomElement): this.type = set("emptyTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    
    inline def headerStyle(value: js.Object): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    inline def headerTemplate(value: FileUploadHeaderTemplateType): this.type = set("headerTemplate", value.asInstanceOf[js.Any])
    
    inline def headerTemplateFunction1(value: /* options */ FileUploadHeaderTemplateOptions => Node): this.type = set("headerTemplate", js.Any.fromFunction1(value))
    
    inline def headerTemplateNull: this.type = set("headerTemplate", null)
    
    inline def headerTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("headerTemplate", js.Array(value*))
    
    inline def headerTemplateVdomElement(value: VdomElement): this.type = set("headerTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def invalidFileSizeMessageDetail(value: String): this.type = set("invalidFileSizeMessageDetail", value.asInstanceOf[js.Any])
    
    inline def invalidFileSizeMessageSummary(value: String): this.type = set("invalidFileSizeMessageSummary", value.asInstanceOf[js.Any])
    
    inline def itemTemplate(value: FileUploadItemTemplateType): this.type = set("itemTemplate", value.asInstanceOf[js.Any])
    
    inline def itemTemplateFunction2(value: (/* file */ js.Object, /* options */ ItemTemplateOptions) => Node): this.type = set("itemTemplate", js.Any.fromFunction2(value))
    
    inline def itemTemplateNull: this.type = set("itemTemplate", null)
    
    inline def itemTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("itemTemplate", js.Array(value*))
    
    inline def itemTemplateVdomElement(value: VdomElement): this.type = set("itemTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxFileSize(value: Double): this.type = set("maxFileSize", value.asInstanceOf[js.Any])
    
    inline def mode(value: FileUploadModeType): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBeforeDrop(value: /* e */ DragEvent => Callback): this.type = set("onBeforeDrop", js.Any.fromFunction1((t0: /* e */ DragEvent) => value(t0).runNow()))
    
    inline def onBeforeSelect(value: /* e */ FileUploadSelectParams => Callback): this.type = set("onBeforeSelect", js.Any.fromFunction1((t0: /* e */ FileUploadSelectParams) => value(t0).runNow()))
    
    inline def onBeforeSend(value: /* e */ FileUploadBeforeSendParams => Callback): this.type = set("onBeforeSend", js.Any.fromFunction1((t0: /* e */ FileUploadBeforeSendParams) => value(t0).runNow()))
    
    inline def onBeforeUpload(value: /* e */ FileUploadBeforeUploadParams => Callback): this.type = set("onBeforeUpload", js.Any.fromFunction1((t0: /* e */ FileUploadBeforeUploadParams) => value(t0).runNow()))
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onError(value: /* e */ FileUploadErrorParams => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* e */ FileUploadErrorParams) => value(t0).runNow()))
    
    inline def onProgress(value: /* e */ FileUploadProgressParams => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: /* e */ FileUploadProgressParams) => value(t0).runNow()))
    
    inline def onRemove(value: /* e */ FileUploadRemoveParams => Callback): this.type = set("onRemove", js.Any.fromFunction1((t0: /* e */ FileUploadRemoveParams) => value(t0).runNow()))
    
    inline def onSelect(value: /* e */ FileUploadSelectParams => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* e */ FileUploadSelectParams) => value(t0).runNow()))
    
    inline def onUpload(value: /* e */ FileUploadUploadParams => Callback): this.type = set("onUpload", js.Any.fromFunction1((t0: /* e */ FileUploadUploadParams) => value(t0).runNow()))
    
    inline def onValidationFail(value: /* file */ File => Callback): this.type = set("onValidationFail", js.Any.fromFunction1((t0: /* file */ File) => value(t0).runNow()))
    
    inline def previewWidth(value: Double): this.type = set("previewWidth", value.asInstanceOf[js.Any])
    
    inline def progressBarTemplate(value: FileUploadProgressBarTemplateType): this.type = set("progressBarTemplate", value.asInstanceOf[js.Any])
    
    inline def progressBarTemplateFunction1(value: /* props */ FileUploadProps => Node): this.type = set("progressBarTemplate", js.Any.fromFunction1(value))
    
    inline def progressBarTemplateNull: this.type = set("progressBarTemplate", null)
    
    inline def progressBarTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("progressBarTemplate", js.Array(value*))
    
    inline def progressBarTemplateVdomElement(value: VdomElement): this.type = set("progressBarTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def uploadHandler(value: /* e */ FileUploadHandlerParam => Callback): this.type = set("uploadHandler", js.Any.fromFunction1((t0: /* e */ FileUploadHandlerParam) => value(t0).runNow()))
    
    inline def uploadLabel(value: String): this.type = set("uploadLabel", value.asInstanceOf[js.Any])
    
    inline def uploadOptions(value: FileUploadOptionsType): this.type = set("uploadOptions", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    
    inline def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FileUpload.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FileUploadProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
