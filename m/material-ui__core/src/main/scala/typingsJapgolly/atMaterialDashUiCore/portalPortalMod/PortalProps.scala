package typingsJapgolly.atMaterialDashUiCore.portalPortalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps extends js.Object {
  var children: Element
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance] | Null] = js.undefined
  var disablePortal: js.UndefOr[Boolean] = js.undefined
  var onRendered: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PortalProps {
  @scala.inline
  def apply(
    children: VdomElement,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: js.UndefOr[Callback] = js.undefined
  ): PortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal.asInstanceOf[js.Any])
    onRendered.foreach(p => __obj.updateDynamic("onRendered")(p.toJsFn))
    __obj.asInstanceOf[PortalProps]
  }
}

