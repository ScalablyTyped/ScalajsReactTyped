package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptionsModel extends js.Object {
  /** The position about which to zoom. */
  var position: Position
}

object ZoomOptionsModel {
  @scala.inline
  def apply(position: Position): ZoomOptionsModel = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZoomOptionsModel]
  }
}

