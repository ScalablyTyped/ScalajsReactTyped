package typingsJapgolly.reactOverlays.portalMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  var container: js.UndefOr[Node | js.Function] = js.undefined
  var onRendered: js.UndefOr[js.Function] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(container: Node | js.Function = null, onRendered: js.Function = null): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalProps]
  }
}

