package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesImageViewerMod.ImageViewerProps
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageViewer {
  
  @JSImport("wix-style-react", "ImageViewer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ImageViewer] {
    
    inline def addImageInfo(value: String): this.type = set("addImageInfo", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def downloadImageInfo(value: String): this.type = set("downloadImageInfo", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def imageUrl(value: String): this.type = set("imageUrl", value.asInstanceOf[js.Any])
    
    inline def moreImageInfo(value: String): this.type = set("moreImageInfo", value.asInstanceOf[js.Any])
    
    inline def onAddImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onAddImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onDownloadImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onDownloadImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onImageLoad(value: ReactEventFrom[HTMLImageElement & Element] => Callback): this.type = set("onImageLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
    
    inline def onRemoveImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onRemoveImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onUpdateImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): this.type = set("onUpdateImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def removeImageInfo(value: String): this.type = set("removeImageInfo", value.asInstanceOf[js.Any])
    
    inline def removeRoundedBorders(value: Boolean): this.type = set("removeRoundedBorders", value.asInstanceOf[js.Any])
    
    inline def showDownloadButton(value: Boolean): this.type = set("showDownloadButton", value.asInstanceOf[js.Any])
    
    inline def showRemoveButton(value: Boolean): this.type = set("showRemoveButton", value.asInstanceOf[js.Any])
    
    inline def showUpdateButton(value: Boolean): this.type = set("showUpdateButton", value.asInstanceOf[js.Any])
    
    inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltipProps(value: TooltipCommonProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
    
    inline def updateImageInfo(value: String): this.type = set("updateImageInfo", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImageViewer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageViewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
