package typingsJapgolly.pdfViewerReactjs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Document
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.pdfViewerReactjs.mod.Err
import typingsJapgolly.pdfViewerReactjs.mod.PDFViewerProps
import typingsJapgolly.pdfViewerReactjs.mod.ShowThumbnail
import typingsJapgolly.pdfViewerReactjs.mod.Watermark
import typingsJapgolly.pdfViewerReactjs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PdfViewerReactjs {
  
  inline def apply(document: Document): Builder = {
    val __props = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PDFViewerProps]))
  }
  
  @JSImport("pdf-viewer-reactjs", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def alert(value: /* err */ Err => Node): this.type = set("alert", js.Any.fromFunction1(value))
    
    inline def canvasCss(value: String): this.type = set("canvasCss", value.asInstanceOf[js.Any])
    
    inline def css(value: String): this.type = set("css", value.asInstanceOf[js.Any])
    
    inline def externalInput(value: Boolean): this.type = set("externalInput", value.asInstanceOf[js.Any])
    
    inline def getMaxPageCount(value: /* pageCount */ Double => Callback): this.type = set("getMaxPageCount", js.Any.fromFunction1((t0: /* pageCount */ Double) => value(t0).runNow()))
    
    inline def hideNavbar(value: Boolean): this.type = set("hideNavbar", value.asInstanceOf[js.Any])
    
    inline def hideRotation(value: Boolean): this.type = set("hideRotation", value.asInstanceOf[js.Any])
    
    inline def hideZoom(value: Boolean): this.type = set("hideZoom", value.asInstanceOf[js.Any])
    
    inline def loader(value: VdomNode): this.type = set("loader", value.rawNode.asInstanceOf[js.Any])
    
    inline def loaderNull: this.type = set("loader", null)
    
    inline def loaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loader", js.Array(value*))
    
    inline def loaderVdomElement(value: VdomElement): this.type = set("loader", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxScale(value: Double): this.type = set("maxScale", value.asInstanceOf[js.Any])
    
    inline def minScale(value: Double): this.type = set("minScale", value.asInstanceOf[js.Any])
    
    inline def navbarOnTop(value: Boolean): this.type = set("navbarOnTop", value.asInstanceOf[js.Any])
    
    inline def navigation(value: Any): this.type = set("navigation", value.asInstanceOf[js.Any])
    
    inline def onDocumentClick(value: Callback): this.type = set("onDocumentClick", value.toJsFn)
    
    inline def onNextBtnClick(value: /* page */ Double => Callback): this.type = set("onNextBtnClick", js.Any.fromFunction1((t0: /* page */ Double) => value(t0).runNow()))
    
    inline def onPrevBtnClick(value: /* page */ Double => Callback): this.type = set("onPrevBtnClick", js.Any.fromFunction1((t0: /* page */ Double) => value(t0).runNow()))
    
    inline def onRotation(value: /* angle */ Double => Callback): this.type = set("onRotation", js.Any.fromFunction1((t0: /* angle */ Double) => value(t0).runNow()))
    
    inline def onZoom(value: /* scale */ Double => Callback): this.type = set("onZoom", js.Any.fromFunction1((t0: /* scale */ Double) => value(t0).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def password(value: String): this.type = set("password", value.asInstanceOf[js.Any])
    
    inline def protectContent(value: Boolean): this.type = set("protectContent", value.asInstanceOf[js.Any])
    
    inline def rotationAngle(value: Double): this.type = set("rotationAngle", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleStep(value: Double): this.type = set("scaleStep", value.asInstanceOf[js.Any])
    
    inline def showThumbnail(value: ShowThumbnail): this.type = set("showThumbnail", value.asInstanceOf[js.Any])
    
    inline def watermark(value: Watermark): this.type = set("watermark", value.asInstanceOf[js.Any])
    
    inline def withCredentials(value: Boolean): this.type = set("withCredentials", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PDFViewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
