package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.Download
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProgressProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListType
import typingsJapgolly.antd.libUploadInterfaceMod.UploadLocale
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UploadList {
  
  inline def apply(locale: UploadLocale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UploadListProps[Any] & RefAttributes[Any]]))
  }
  
  @JSImport("antd/lib/upload/UploadList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appendAction(value: VdomNode): this.type = set("appendAction", value.rawNode.asInstanceOf[js.Any])
    
    inline def appendActionNull: this.type = set("appendAction", null)
    
    inline def appendActionVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("appendAction", js.Array(value*))
    
    inline def appendActionVdomElement(value: VdomElement): this.type = set("appendAction", value.rawElement.asInstanceOf[js.Any])
    
    inline def appendActionVisible(value: Boolean): this.type = set("appendActionVisible", value.asInstanceOf[js.Any])
    
    inline def downloadIcon(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* file */ UploadFile[Any], japgolly.scalajs.react.facade.React.Node])
    ): this.type = set("downloadIcon", value.asInstanceOf[js.Any])
    
    inline def downloadIconFunction1(value: /* file */ UploadFile[Any] => japgolly.scalajs.react.facade.React.Node): this.type = set("downloadIcon", js.Any.fromFunction1(value))
    
    inline def downloadIconNull: this.type = set("downloadIcon", null)
    
    inline def downloadIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("downloadIcon", js.Array(value*))
    
    inline def downloadIconVdomElement(value: VdomElement): this.type = set("downloadIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconRender(
      value: (/* file */ UploadFile[Any], /* listType */ js.UndefOr[UploadListType]) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("iconRender", js.Any.fromFunction2(value))
    
    inline def isImageUrl(value: /* file */ UploadFile[Any] => Boolean): this.type = set("isImageUrl", js.Any.fromFunction1(value))
    
    inline def itemRender(
      value: (/* originNode */ japgolly.scalajs.react.facade.React.Element, /* file */ UploadFile[Any], /* fileList */ js.Array[UploadFile[Any]], /* actions */ Download) => japgolly.scalajs.react.facade.React.Node
    ): this.type = set("itemRender", js.Any.fromFunction4(value))
    
    inline def items(value: js.Array[UploadFile[Any]]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: UploadFile[Any]*): this.type = set("items", js.Array(value*))
    
    inline def listType(value: UploadListType): this.type = set("listType", value.asInstanceOf[js.Any])
    
    inline def onDownload(value: /* file */ UploadFile[Any] => Callback): this.type = set("onDownload", js.Any.fromFunction1((t0: /* file */ UploadFile[Any]) => value(t0).runNow()))
    
    inline def onPreview(value: /* file */ UploadFile[Any] => Callback): this.type = set("onPreview", js.Any.fromFunction1((t0: /* file */ UploadFile[Any]) => value(t0).runNow()))
    
    inline def onRemove(value: /* file */ UploadFile[Any] => Unit | Boolean): this.type = set("onRemove", js.Any.fromFunction1(value))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def previewFile(value: /* file */ File | Blob => PromiseLike[String]): this.type = set("previewFile", js.Any.fromFunction1(value))
    
    inline def previewIcon(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* file */ UploadFile[Any], japgolly.scalajs.react.facade.React.Node])
    ): this.type = set("previewIcon", value.asInstanceOf[js.Any])
    
    inline def previewIconFunction1(value: /* file */ UploadFile[Any] => japgolly.scalajs.react.facade.React.Node): this.type = set("previewIcon", js.Any.fromFunction1(value))
    
    inline def previewIconNull: this.type = set("previewIcon", null)
    
    inline def previewIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("previewIcon", js.Array(value*))
    
    inline def previewIconVdomElement(value: VdomElement): this.type = set("previewIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def progress(value: UploadListProgressProps): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def removeIcon(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* file */ UploadFile[Any], japgolly.scalajs.react.facade.React.Node])
    ): this.type = set("removeIcon", value.asInstanceOf[js.Any])
    
    inline def removeIconFunction1(value: /* file */ UploadFile[Any] => japgolly.scalajs.react.facade.React.Node): this.type = set("removeIcon", js.Any.fromFunction1(value))
    
    inline def removeIconNull: this.type = set("removeIcon", null)
    
    inline def removeIconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("removeIcon", js.Array(value*))
    
    inline def removeIconVdomElement(value: VdomElement): this.type = set("removeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def showDownloadIcon(value: Boolean): this.type = set("showDownloadIcon", value.asInstanceOf[js.Any])
    
    inline def showPreviewIcon(value: Boolean): this.type = set("showPreviewIcon", value.asInstanceOf[js.Any])
    
    inline def showRemoveIcon(value: Boolean): this.type = set("showRemoveIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UploadListProps[Any] & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
