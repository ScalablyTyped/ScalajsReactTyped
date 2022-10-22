package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTable.anon.PageList
import typingsJapgolly.reactBootstrapTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationPanelProps extends StObject {
  
  /**
    * Callback function to use to change page.
    */
  def changePage(pageNum: Double): Unit
  
  /**
    * Callback function to use to set a new size per page.
    */
  def changeSizePerPage(sizePerPage: Double): Unit
  
  /**
    * The basic components for the pagination panel, provided here so that you have the option to use some of them
    * if you don't want to customize all of them.
    */
  var components: PageList
  
  /**
    * Current page number
    */
  var currPage: Double
  
  /**
    * Index number for the first page of data.
    * Comes from Options.pageStartIndex.
    */
  var pageStartIndex: Double
  
  /**
    * Current number of rows to show per page
    */
  var sizePerPage: Double
  
  /**
    * Choices for size per page dropdown component
    */
  var sizePerPageList: SizePerPageList
  
  /**
    * Callback function to trigger the toggle on sizePerPage dropdown button
    */
  def toggleDropDown(): Unit
}
object PaginationPanelProps {
  
  inline def apply(
    changePage: Double => Callback,
    changeSizePerPage: Double => Callback,
    components: PageList,
    currPage: Double,
    pageStartIndex: Double,
    sizePerPage: Double,
    sizePerPageList: SizePerPageList,
    toggleDropDown: Callback
  ): PaginationPanelProps = {
    val __obj = js.Dynamic.literal(changePage = js.Any.fromFunction1((t0: Double) => changePage(t0).runNow()), changeSizePerPage = js.Any.fromFunction1((t0: Double) => changeSizePerPage(t0).runNow()), components = components.asInstanceOf[js.Any], currPage = currPage.asInstanceOf[js.Any], pageStartIndex = pageStartIndex.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = toggleDropDown.toJsFn)
    __obj.asInstanceOf[PaginationPanelProps]
  }
  
  extension [Self <: PaginationPanelProps](x: Self) {
    
    inline def setChangePage(value: Double => Callback): Self = StObject.set(x, "changePage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setChangeSizePerPage(value: Double => Callback): Self = StObject.set(x, "changeSizePerPage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setComponents(value: PageList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setCurrPage(value: Double): Self = StObject.set(x, "currPage", value.asInstanceOf[js.Any])
    
    inline def setPageStartIndex(value: Double): Self = StObject.set(x, "pageStartIndex", value.asInstanceOf[js.Any])
    
    inline def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageList(value: SizePerPageList): Self = StObject.set(x, "sizePerPageList", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageListVarargs(value: (Double | Value)*): Self = StObject.set(x, "sizePerPageList", js.Array(value*))
    
    inline def setToggleDropDown(value: Callback): Self = StObject.set(x, "toggleDropDown", value.toJsFn)
  }
}
