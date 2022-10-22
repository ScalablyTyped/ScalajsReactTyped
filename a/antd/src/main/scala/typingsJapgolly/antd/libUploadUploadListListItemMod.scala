package typingsJapgolly.antd

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libUploadInterfaceMod.ItemRender
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProgressProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListType
import typingsJapgolly.antd.libUploadInterfaceMod.UploadLocale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUploadUploadListListItemMod extends Shortcut {
  
  @JSImport("antd/lib/upload/UploadList/ListItem", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ListItemProps extends StObject {
    
    def actionIconRender(customIcon: Node, callback: js.Function0[Unit], prefixCls: String): Node = js.native
    def actionIconRender(customIcon: Node, callback: js.Function0[Unit], prefixCls: String, title: String): Node = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var downloadIcon: js.UndefOr[Node | (js.Function1[/* file */ UploadFile[Any], Node])] = js.native
    
    var file: UploadFile[Any] = js.native
    
    def iconRender(file: UploadFile[Any]): Node = js.native
    
    var isImgUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[Any]] = js.native
    
    var items: js.Array[UploadFile[Any]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    def onClose(file: UploadFile[Any]): Unit = js.native
    
    def onDownload(file: UploadFile[Any]): Unit = js.native
    
    def onPreview(file: UploadFile[Any], e: ReactEventFrom[HTMLElement]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var previewIcon: js.UndefOr[Node | (js.Function1[/* file */ UploadFile[Any], Node])] = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[Node | (js.Function1[/* file */ UploadFile[Any], Node])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  
  type _To = ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libUploadUploadListListItemMod.foo` */
  override def _to: ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLDivElement]] = default
}
