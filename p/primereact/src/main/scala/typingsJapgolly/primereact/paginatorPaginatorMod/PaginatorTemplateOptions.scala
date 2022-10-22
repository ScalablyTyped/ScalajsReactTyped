package typingsJapgolly.primereact.paginatorPaginatorMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorTemplateOptions extends StObject {
  
  var CurrentPageReport: PaginatorCurrentPageReportType
  
  var FirstPageLink: PaginatorFirstPageLinkType
  
  var JumpToPageInput: PaginatorJumpToPageInputType
  
  var LastPageLink: PaginatorLastPageLinkType
  
  var NextPageLink: PaginatorNextPageLinkType
  
  var PageLinks: PaginatorPageLinksType
  
  var PrevPageLink: PaginatorPrevPageLinkType
  
  var RowsPerPageDropdown: PaginatorRowsPerPageDropdownType
  
  var layout: String
}
object PaginatorTemplateOptions {
  
  inline def apply(layout: String): PaginatorTemplateOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], CurrentPageReport = null, FirstPageLink = null, JumpToPageInput = null, LastPageLink = null, NextPageLink = null, PageLinks = null, PrevPageLink = null, RowsPerPageDropdown = null)
    __obj.asInstanceOf[PaginatorTemplateOptions]
  }
  
  extension [Self <: PaginatorTemplateOptions](x: Self) {
    
    inline def setCurrentPageReport(value: PaginatorCurrentPageReportType): Self = StObject.set(x, "CurrentPageReport", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageReportFunction1(value: /* options */ PaginatorCurrentPageReportOptions => Node): Self = StObject.set(x, "CurrentPageReport", js.Any.fromFunction1(value))
    
    inline def setCurrentPageReportNull: Self = StObject.set(x, "CurrentPageReport", null)
    
    inline def setCurrentPageReportVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "CurrentPageReport", js.Array(value*))
    
    inline def setCurrentPageReportVdomElement(value: VdomElement): Self = StObject.set(x, "CurrentPageReport", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFirstPageLink(value: PaginatorFirstPageLinkType): Self = StObject.set(x, "FirstPageLink", value.asInstanceOf[js.Any])
    
    inline def setFirstPageLinkFunction1(value: /* options */ PaginatorFirstPageLinkOptions => Node): Self = StObject.set(x, "FirstPageLink", js.Any.fromFunction1(value))
    
    inline def setFirstPageLinkNull: Self = StObject.set(x, "FirstPageLink", null)
    
    inline def setFirstPageLinkVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "FirstPageLink", js.Array(value*))
    
    inline def setFirstPageLinkVdomElement(value: VdomElement): Self = StObject.set(x, "FirstPageLink", value.rawElement.asInstanceOf[js.Any])
    
    inline def setJumpToPageInput(value: PaginatorJumpToPageInputType): Self = StObject.set(x, "JumpToPageInput", value.asInstanceOf[js.Any])
    
    inline def setJumpToPageInputFunction1(value: /* options */ PaginatorJumpToPageInputOptions => Node): Self = StObject.set(x, "JumpToPageInput", js.Any.fromFunction1(value))
    
    inline def setJumpToPageInputNull: Self = StObject.set(x, "JumpToPageInput", null)
    
    inline def setJumpToPageInputVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "JumpToPageInput", js.Array(value*))
    
    inline def setJumpToPageInputVdomElement(value: VdomElement): Self = StObject.set(x, "JumpToPageInput", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLastPageLink(value: PaginatorLastPageLinkType): Self = StObject.set(x, "LastPageLink", value.asInstanceOf[js.Any])
    
    inline def setLastPageLinkFunction1(value: /* options */ PaginatorLastPageLinkOptions => Node): Self = StObject.set(x, "LastPageLink", js.Any.fromFunction1(value))
    
    inline def setLastPageLinkNull: Self = StObject.set(x, "LastPageLink", null)
    
    inline def setLastPageLinkVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "LastPageLink", js.Array(value*))
    
    inline def setLastPageLinkVdomElement(value: VdomElement): Self = StObject.set(x, "LastPageLink", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setNextPageLink(value: PaginatorNextPageLinkType): Self = StObject.set(x, "NextPageLink", value.asInstanceOf[js.Any])
    
    inline def setNextPageLinkFunction1(value: /* options */ PaginatorNextPageLinkOptions => Node): Self = StObject.set(x, "NextPageLink", js.Any.fromFunction1(value))
    
    inline def setNextPageLinkNull: Self = StObject.set(x, "NextPageLink", null)
    
    inline def setNextPageLinkVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "NextPageLink", js.Array(value*))
    
    inline def setNextPageLinkVdomElement(value: VdomElement): Self = StObject.set(x, "NextPageLink", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPageLinks(value: PaginatorPageLinksType): Self = StObject.set(x, "PageLinks", value.asInstanceOf[js.Any])
    
    inline def setPageLinksFunction1(value: /* options */ PaginatorPageLinksOptions => Node): Self = StObject.set(x, "PageLinks", js.Any.fromFunction1(value))
    
    inline def setPageLinksNull: Self = StObject.set(x, "PageLinks", null)
    
    inline def setPageLinksVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "PageLinks", js.Array(value*))
    
    inline def setPageLinksVdomElement(value: VdomElement): Self = StObject.set(x, "PageLinks", value.rawElement.asInstanceOf[js.Any])
    
    inline def setPrevPageLink(value: PaginatorPrevPageLinkType): Self = StObject.set(x, "PrevPageLink", value.asInstanceOf[js.Any])
    
    inline def setPrevPageLinkFunction1(value: /* options */ PaginatorPrevPageLinkOptions => Node): Self = StObject.set(x, "PrevPageLink", js.Any.fromFunction1(value))
    
    inline def setPrevPageLinkNull: Self = StObject.set(x, "PrevPageLink", null)
    
    inline def setPrevPageLinkVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "PrevPageLink", js.Array(value*))
    
    inline def setPrevPageLinkVdomElement(value: VdomElement): Self = StObject.set(x, "PrevPageLink", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRowsPerPageDropdown(value: PaginatorRowsPerPageDropdownType): Self = StObject.set(x, "RowsPerPageDropdown", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageDropdownFunction1(value: /* options */ PaginatorRowsPerPageDropdownOptions => Node): Self = StObject.set(x, "RowsPerPageDropdown", js.Any.fromFunction1(value))
    
    inline def setRowsPerPageDropdownNull: Self = StObject.set(x, "RowsPerPageDropdown", null)
    
    inline def setRowsPerPageDropdownVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "RowsPerPageDropdown", js.Array(value*))
    
    inline def setRowsPerPageDropdownVdomElement(value: VdomElement): Self = StObject.set(x, "RowsPerPageDropdown", value.rawElement.asInstanceOf[js.Any])
  }
}
