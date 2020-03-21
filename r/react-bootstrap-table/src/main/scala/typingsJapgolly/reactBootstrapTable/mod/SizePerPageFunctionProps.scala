package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizePerPageFunctionProps extends js.Object {
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
  	 * Callback function to use to change the current size per page.
  	 */
  def changeSizePerPage(newSizePerPage: Double): Unit
  /**
  	 * On-click toggle function callback to open/close the size per page dropdown list.
  	 */
  def toggleDropDown(): Unit
}

object SizePerPageFunctionProps {
  @scala.inline
  def apply(
    changeSizePerPage: Double => Callback,
    currSizePerPage: String,
    hideSizePerPage: Boolean,
    open: Boolean,
    sizePerPageList: SizePerPageList,
    toggleDropDown: Callback
  ): SizePerPageFunctionProps = {
    val __obj = js.Dynamic.literal(currSizePerPage = currSizePerPage.asInstanceOf[js.Any], hideSizePerPage = hideSizePerPage.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any])
    __obj.updateDynamic("changeSizePerPage")(js.Any.fromFunction1((t0: scala.Double) => changeSizePerPage(t0).runNow()))
    __obj.updateDynamic("toggleDropDown")(toggleDropDown.toJsFn)
    __obj.asInstanceOf[SizePerPageFunctionProps]
  }
}

