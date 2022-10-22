package typingsJapgolly.reactPdf.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPdf.anon.PageNumber
import typingsJapgolly.reactPdf.distOutlineMod.Awaited
import typingsJapgolly.reactPdf.distOutlineMod.Props
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Outline {
  
  @JSImport("react-pdf", "Outline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPdf.mod.Outline] {
    
    inline def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameVarargs(value: String*): this.type = set("className", js.Array(value*))
    
    inline def onItemClick(value: /* hasPageNumber */ PageNumber => Callback): this.type = set("onItemClick", js.Any.fromFunction1((t0: /* hasPageNumber */ PageNumber) => value(t0).runNow()))
    
    inline def onLoadError(value: /* error */ js.Error => Callback): this.type = set("onLoadError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
    
    inline def onLoadSuccess(
      value: /* outline */ Awaited[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: react-pdf.react-pdf/dist/Outline.Awaited<std.ReturnType<(src : pdfjs-dist.pdfjs-dist/types/src/display/api.GetDocumentParameters): pdfjs-dist.pdfjs-dist/types/src/display/api.PDFDocumentLoadingTask>['promise']>['getOutline'] */ js.Any
          ]
        ] => Callback
    ): this.type = set("onLoadSuccess", js.Any.fromFunction1((t0: /* outline */ Awaited[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: react-pdf.react-pdf/dist/Outline.Awaited<std.ReturnType<(src : pdfjs-dist.pdfjs-dist/types/src/display/api.GetDocumentParameters): pdfjs-dist.pdfjs-dist/types/src/display/api.PDFDocumentLoadingTask>['promise']>['getOutline'] */ js.Any
          ]
        ]) => value(t0).runNow()))
  }
  
  implicit def make(companion: Outline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
