package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBootstrapTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizePerPageFunctionProps extends StObject {
  
  /**
    * Callback function to use to change the current size per page.
    */
  def changeSizePerPage(newSizePerPage: Double): Unit
  
  /**
    * Current size per page as a string value.
    */
  var currSizePerPage: String
  
  /**
    * Flag indicating that the sizePerPage dropdown should be hidden.
    */
  var hideSizePerPage: Boolean
  
  /**
    * Flag to indicate that the sizePerPage dropdown should currently be 'open'.
    */
  var open: Boolean
  
  /**
    * Array of the size per page options to display in the dropdown.
    */
  var sizePerPageList: SizePerPageList
  
  /**
    * On-click toggle function callback to open/close the size per page dropdown list.
    */
  def toggleDropDown(): Unit
}
object SizePerPageFunctionProps {
  
  inline def apply(
    changeSizePerPage: Double => Callback,
    currSizePerPage: String,
    hideSizePerPage: Boolean,
    open: Boolean,
    sizePerPageList: SizePerPageList,
    toggleDropDown: Callback
  ): SizePerPageFunctionProps = {
    val __obj = js.Dynamic.literal(changeSizePerPage = js.Any.fromFunction1((t0: Double) => changeSizePerPage(t0).runNow()), currSizePerPage = currSizePerPage.asInstanceOf[js.Any], hideSizePerPage = hideSizePerPage.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = toggleDropDown.toJsFn)
    __obj.asInstanceOf[SizePerPageFunctionProps]
  }
  
  extension [Self <: SizePerPageFunctionProps](x: Self) {
    
    inline def setChangeSizePerPage(value: Double => Callback): Self = StObject.set(x, "changeSizePerPage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setCurrSizePerPage(value: String): Self = StObject.set(x, "currSizePerPage", value.asInstanceOf[js.Any])
    
    inline def setHideSizePerPage(value: Boolean): Self = StObject.set(x, "hideSizePerPage", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageList(value: SizePerPageList): Self = StObject.set(x, "sizePerPageList", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageListVarargs(value: (Double | Value)*): Self = StObject.set(x, "sizePerPageList", js.Array(value*))
    
    inline def setToggleDropDown(value: Callback): Self = StObject.set(x, "toggleDropDown", value.toJsFn)
  }
}
