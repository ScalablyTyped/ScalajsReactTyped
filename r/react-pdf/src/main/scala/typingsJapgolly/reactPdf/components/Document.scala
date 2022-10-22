package typingsJapgolly.reactPdf.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentProxy
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactPdf.anon.PageNumber
import typingsJapgolly.reactPdf.distDocumentMod.LoadingProcessData
import typingsJapgolly.reactPdf.distDocumentMod.Props
import typingsJapgolly.reactPdf.distDocumentMod.RenderFunction
import typingsJapgolly.reactPdf.reactPdfStrings._blank
import typingsJapgolly.reactPdf.reactPdfStrings._parent
import typingsJapgolly.reactPdf.reactPdfStrings._self
import typingsJapgolly.reactPdf.reactPdfStrings._top
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Document {
  
  inline def apply(file: Any): Builder = {
    val __props = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-pdf", "Document")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPdf.mod.Document] {
    
    inline def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameVarargs(value: String*): this.type = set("className", js.Array(value*))
    
    inline def error(value: String | Element | RenderFunction): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorCallbackTo(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("error", value.toJsFn)
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
    
    inline def externalLinkTarget(value: _self | _blank | _parent | _top): this.type = set("externalLinkTarget", value.asInstanceOf[js.Any])
    
    inline def imageResourcesPath(value: String): this.type = set("imageResourcesPath", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: LegacyRef[HTMLDivElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def loading(value: String | Element | RenderFunction): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingCallbackTo(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("loading", value.toJsFn)
    
    inline def loadingVdomElement(value: VdomElement): this.type = set("loading", value.rawElement.asInstanceOf[js.Any])
    
    inline def noData(value: String | Element | RenderFunction): this.type = set("noData", value.asInstanceOf[js.Any])
    
    inline def noDataCallbackTo(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("noData", value.toJsFn)
    
    inline def noDataVdomElement(value: VdomElement): this.type = set("noData", value.rawElement.asInstanceOf[js.Any])
    
    inline def onItemClick(value: /* hasPageNumber */ PageNumber => Callback): this.type = set("onItemClick", js.Any.fromFunction1((t0: /* hasPageNumber */ PageNumber) => value(t0).runNow()))
    
    inline def onLoadError(value: /* error */ js.Error => Callback): this.type = set("onLoadError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onLoadProgress(value: /* data */ LoadingProcessData => Callback): this.type = set("onLoadProgress", js.Any.fromFunction1((t0: /* data */ LoadingProcessData) => value(t0).runNow()))
    
    inline def onLoadSuccess(value: /* pdf */ PDFDocumentProxy => Callback): this.type = set("onLoadSuccess", js.Any.fromFunction1((t0: /* pdf */ PDFDocumentProxy) => value(t0).runNow()))
    
    inline def onPassword(value: (/* callback */ js.Function1[/* password */ String, Unit], /* reason */ String) => Callback): this.type = set("onPassword", js.Any.fromFunction2((t0: /* callback */ js.Function1[/* password */ String, Unit], t1: /* reason */ String) => (value(t0, t1)).runNow()))
    
    inline def onSourceError(value: /* error */ js.Error => Callback): this.type = set("onSourceError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onSourceSuccess(value: Callback): this.type = set("onSourceSuccess", value.toJsFn)
    
    inline def options(value: Any): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def renderMode(value: canvas | svg | none): this.type = set("renderMode", value.asInstanceOf[js.Any])
    
    inline def rotate(value: Double): this.type = set("rotate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
