package typingsJapgolly.igniteUi

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to footers table DOM element.
  	 */
  var table: js.UndefOr[Element] = js.undefined
}

object FooterRenderedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, table: Element = null): FooterRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterRenderedEventUIParam]
  }
}

