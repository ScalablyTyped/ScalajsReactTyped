package typingsJapgolly.antdMobile.drawerPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.left
import typingsJapgolly.antdMobile.antdMobileStrings.right
import typingsJapgolly.antdMobile.antdMobileStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[left | right | top | bottom] = js.undefined
  var sidebar: js.UndefOr[Node] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    onOpenChange: /* isOpen */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: VdomNode = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onOpenChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

