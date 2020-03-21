package typingsJapgolly.reactBootstrapTable

import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPageList extends js.Object {
  /**
  		 * The default list of page change buttons.
  		 */
  var pageList: HTMLUListElement
  /**
  		 * Default sizePerPageDropdown component.
  		 */
  var sizePerPageDropDown: SizePerPageDropDown
  /**
  		 * Text/element to display when displaying the total number of rows.
  		 */
  var totalText: String | Element
}

object AnonPageList {
  @scala.inline
  def apply(pageList: HTMLUListElement, sizePerPageDropDown: SizePerPageDropDown, totalText: String | Element): AnonPageList = {
    val __obj = js.Dynamic.literal(pageList = pageList.asInstanceOf[js.Any], sizePerPageDropDown = sizePerPageDropDown.asInstanceOf[js.Any], totalText = totalText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPageList]
  }
}

