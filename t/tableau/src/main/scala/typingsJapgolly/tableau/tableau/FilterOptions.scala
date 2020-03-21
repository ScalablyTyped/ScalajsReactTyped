package typingsJapgolly.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Filtering
trait FilterOptions extends js.Object {
  /**
    * Determines whether the filter will apply in exclude mode or include mode.
    * The default is include, which means that you use the fields as part of a filter.
    * Exclude mode means that you include everything else except the specified fields.
    */
  var isExcludeMode: Boolean
}

object FilterOptions {
  @scala.inline
  def apply(isExcludeMode: Boolean): FilterOptions = {
    val __obj = js.Dynamic.literal(isExcludeMode = isExcludeMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterOptions]
  }
}

