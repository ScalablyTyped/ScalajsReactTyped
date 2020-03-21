package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingColumnSorting extends js.Object {
  var ID: Double
  var Index: Double
  var SortAscending: Boolean
  def Clone(): IFolderListingColumnSorting
}

object IFolderListingColumnSorting {
  @scala.inline
  def apply(Clone: CallbackTo[IFolderListingColumnSorting], ID: Double, Index: Double, SortAscending: Boolean): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
}

