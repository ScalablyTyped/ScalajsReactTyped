package typingsJapgolly.uiGrid.mod.resizeColumns

import typingsJapgolly.uiGrid.AnonColumnSizeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridResizeColumnsApi extends js.Object {
  // Events
  var on: AnonColumnSizeChanged
}

object IGridResizeColumnsApi {
  @scala.inline
  def apply(on: AnonColumnSizeChanged): IGridResizeColumnsApi = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGridResizeColumnsApi]
  }
}

