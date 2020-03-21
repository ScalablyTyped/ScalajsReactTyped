package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevProviderProps extends js.Object {
  var children: Node
  /** DebugEngineContext */
  var debug: js.UndefOr[DebugEngine] = js.undefined
  var debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  var value: StandardEngine
}

object DevProviderProps {
  @scala.inline
  def apply(
    value: StandardEngine,
    children: VdomNode = null,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  ): DevProviderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevProviderProps]
  }
}

