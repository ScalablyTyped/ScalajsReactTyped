package typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftBlockRenderConfig extends js.Object {
  var element: String
  var wrapper: js.UndefOr[Node] = js.undefined
}

object DraftBlockRenderConfig {
  @scala.inline
  def apply(element: String, wrapper: VdomNode = null): DraftBlockRenderConfig = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftBlockRenderConfig]
  }
}

