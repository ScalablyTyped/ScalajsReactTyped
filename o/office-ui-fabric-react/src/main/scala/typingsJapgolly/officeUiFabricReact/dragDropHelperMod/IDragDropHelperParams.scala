package typingsJapgolly.officeUiFabricReact.dragDropHelperMod

import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropHelperParams extends js.Object {
  var minimumPixelsForDrag: js.UndefOr[Double] = js.undefined
  var selection: ISelection[IObjectWithKey]
}

object IDragDropHelperParams {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey], minimumPixelsForDrag: Int | Double = null): IDragDropHelperParams = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    if (minimumPixelsForDrag != null) __obj.updateDynamic("minimumPixelsForDrag")(minimumPixelsForDrag.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropHelperParams]
  }
}

