package typingsJapgolly.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptionsRendered extends js.Object {
  /** The rendered position about which to zoom. */
  var renderedPosition: Position
}

object ZoomOptionsRendered {
  @scala.inline
  def apply(renderedPosition: Position): ZoomOptionsRendered = {
    val __obj = js.Dynamic.literal(renderedPosition = renderedPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZoomOptionsRendered]
  }
}

