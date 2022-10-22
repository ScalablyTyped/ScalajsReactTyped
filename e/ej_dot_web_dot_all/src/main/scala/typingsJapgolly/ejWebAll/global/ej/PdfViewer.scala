package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PdfViewer")
@js.native
open class PdfViewer protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.PdfViewer {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object PdfViewer {
  
  @JSGlobal("ej.PdfViewer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PdfViewer.AnnotationType")
  @js.native
  object AnnotationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationType & Double] = js.native
    
    /* 2 */ val Highlight: typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationType.Highlight & Double = js.native
    
    /* 1 */ val Strikethrough: typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationType.Strikethrough & Double = js.native
    
    /* 0 */ val Underline: typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationType.Underline & Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.BufferingMode")
  @js.native
  object BufferingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PdfViewer.BufferingMode & Double] = js.native
    
    /* 1 */ val Complete: typingsJapgolly.ejWebAll.ej.PdfViewer.BufferingMode.Complete & Double = js.native
    
    /* 0 */ val Default: typingsJapgolly.ejWebAll.ej.PdfViewer.BufferingMode.Default & Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.InteractionMode")
  @js.native
  object InteractionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PdfViewer.InteractionMode & Double] = js.native
    
    /* 1 */ val Pan: typingsJapgolly.ejWebAll.ej.PdfViewer.InteractionMode.Pan & Double = js.native
    
    /* 0 */ val TextSelection: typingsJapgolly.ejWebAll.ej.PdfViewer.InteractionMode.TextSelection & Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.LinkTarget")
  @js.native
  object LinkTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PdfViewer.LinkTarget & Double] = js.native
    
    /* 0 */ val Default: typingsJapgolly.ejWebAll.ej.PdfViewer.LinkTarget.Default & Double = js.native
    
    /* 1 */ val NewTab: typingsJapgolly.ejWebAll.ej.PdfViewer.LinkTarget.NewTab & Double = js.native
    
    /* 2 */ val NewWindow: typingsJapgolly.ejWebAll.ej.PdfViewer.LinkTarget.NewWindow & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PdfViewer.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.PdfViewer.PdfService")
  @js.native
  object PdfService extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PdfViewer.PdfService & Double] = js.native
    
    /* 0 */ val Local: typingsJapgolly.ejWebAll.ej.PdfViewer.PdfService.Local & Double = js.native
    
    /* 1 */ val Remote: typingsJapgolly.ejWebAll.ej.PdfViewer.PdfService.Remote & Double = js.native
  }
  
  @JSGlobal("ej.PdfViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems & Double] = js.native
    
    /* 8 */ val All: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.All & Double = js.native
    
    /* 3 */ val DownloadTool: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.DownloadTool & Double = js.native
    
    /* 0 */ val MagnificationTools: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.MagnificationTools & Double = js.native
    
    /* 1 */ val PageNavigationTools: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.PageNavigationTools & Double = js.native
    
    /* 2 */ val PrintTools: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.PrintTools & Double = js.native
    
    /* 7 */ val SelectionTool: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.SelectionTool & Double = js.native
    
    /* 6 */ val SignatureTool: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.SignatureTool & Double = js.native
    
    /* 5 */ val TextMarkupAnnotationTools: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.TextMarkupAnnotationTools & Double = js.native
    
    /* 4 */ val TextSearchTool: typingsJapgolly.ejWebAll.ej.PdfViewer.ToolbarItems.TextSearchTool & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PdfViewer.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.PdfViewer = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.PdfViewer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
