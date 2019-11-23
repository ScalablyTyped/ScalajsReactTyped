package typingsJapgolly.atReachRouter.atReachRouterMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationProviderProps extends js.Object {
  var children: js.UndefOr[Node | LocationProviderRenderFn] = js.undefined
  var history: js.UndefOr[History] = js.undefined
}

object LocationProviderProps {
  @scala.inline
  def apply(children: Node | LocationProviderRenderFn = null, history: History = null): LocationProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationProviderProps]
  }
}

