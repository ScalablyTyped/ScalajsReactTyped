package typingsJapgolly.rmcPullToRefresh.propsTypeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indicator extends js.Object {
  var activate: js.UndefOr[Node] = js.undefined
  var deactivate: js.UndefOr[Node] = js.undefined
  var finish: js.UndefOr[Node] = js.undefined
  var release: js.UndefOr[Node] = js.undefined
}

object Indicator {
  @scala.inline
  def apply(
    activate: VdomNode = null,
    deactivate: VdomNode = null,
    finish: VdomNode = null,
    release: VdomNode = null
  ): Indicator = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate.rawNode.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate.rawNode.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.rawNode.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
}

