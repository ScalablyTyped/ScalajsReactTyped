package typingsJapgolly.reactPdf.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactPdf.distPageMod.PDFPageProxy
import typingsJapgolly.reactPdf.distPageMod.Props
import typingsJapgolly.reactPdf.distPageMod.RenderFunction
import typingsJapgolly.reactPdf.distPageMod.TextItem
import typingsJapgolly.reactPdf.distPageMod.TextLayerItemInternal
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("react-pdf", "Page")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPdf.mod.Page] {
    
    inline def canvasRef(value: LegacyRef[HTMLCanvasElement]): this.type = set("canvasRef", value.asInstanceOf[js.Any])
    
    inline def canvasRefFunction1(value: HTMLCanvasElement | Null => Callback): this.type = set("canvasRef", js.Any.fromFunction1((t0: HTMLCanvasElement | Null) => value(t0).runNow()))
    
    inline def canvasRefNull: this.type = set("canvasRef", null)
    
    inline def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameVarargs(value: String*): this.type = set("className", js.Array(value*))
    
    inline def customTextRenderer(value: /* layer */ TextLayerItemInternal => Element): this.type = set("customTextRenderer", js.Any.fromFunction1(value))
    
    inline def error(value: String | japgolly.scalajs.react.facade.React.Element | RenderFunction): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorCallbackTo(value: CallbackTo[Element]): this.type = set("error", value.toJsFn)
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: LegacyRef[HTMLDivElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def loading(value: String | japgolly.scalajs.react.facade.React.Element | RenderFunction): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingCallbackTo(value: CallbackTo[Element]): this.type = set("loading", value.toJsFn)
    
    inline def loadingVdomElement(value: VdomElement): this.type = set("loading", value.rawElement.asInstanceOf[js.Any])
    
    inline def noData(value: String | japgolly.scalajs.react.facade.React.Element | RenderFunction): this.type = set("noData", value.asInstanceOf[js.Any])
    
    inline def noDataCallbackTo(value: CallbackTo[Element]): this.type = set("noData", value.toJsFn)
    
    inline def noDataVdomElement(value: VdomElement): this.type = set("noData", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* event */ ReactMouseEventFrom[org.scalajs.dom.Element], /* page */ PDFPageProxy) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element], t1: /* page */ PDFPageProxy) => (value(t0, t1)).runNow()))
    
    inline def onGetAnnotationsError(value: /* error */ js.Error => Callback): this.type = set("onGetAnnotationsError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onGetAnnotationsSuccess(value: /* annotations */ Any => Callback): this.type = set("onGetAnnotationsSuccess", js.Any.fromFunction1((t0: /* annotations */ Any) => value(t0).runNow()))
    
    inline def onGetTextError(value: /* error */ js.Error => Callback): this.type = set("onGetTextError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onGetTextSuccess(value: /* items */ js.Array[TextItem] => Callback): this.type = set("onGetTextSuccess", js.Any.fromFunction1((t0: /* items */ js.Array[TextItem]) => value(t0).runNow()))
    
    inline def onLoadError(value: /* error */ js.Error => Callback): this.type = set("onLoadError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onLoadSuccess(value: /* page */ PDFPageProxy => Callback): this.type = set("onLoadSuccess", js.Any.fromFunction1((t0: /* page */ PDFPageProxy) => value(t0).runNow()))
    
    inline def onRenderError(value: /* error */ js.Error => Callback): this.type = set("onRenderError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onRenderSuccess(value: /* page */ PDFPageProxy => Callback): this.type = set("onRenderSuccess", js.Any.fromFunction1((t0: /* page */ PDFPageProxy) => value(t0).runNow()))
    
    inline def pageIndex(value: Double): this.type = set("pageIndex", value.asInstanceOf[js.Any])
    
    inline def pageNumber(value: Double): this.type = set("pageNumber", value.asInstanceOf[js.Any])
    
    inline def renderAnnotationLayer(value: Boolean): this.type = set("renderAnnotationLayer", value.asInstanceOf[js.Any])
    
    inline def renderInteractiveForms(value: Boolean): this.type = set("renderInteractiveForms", value.asInstanceOf[js.Any])
    
    inline def renderMode(value: canvas | svg | none): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    inline def renderTextLayer(value: Boolean): this.type = set("renderTextLayer", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def scale(value: Double): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Page.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
