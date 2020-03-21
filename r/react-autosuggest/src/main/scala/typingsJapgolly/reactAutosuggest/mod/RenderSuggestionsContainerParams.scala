package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactAutosuggest.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionsContainerParams extends js.Object {
  var children: Node
  var containerProps: AnonClassName
  var query: String
}

object RenderSuggestionsContainerParams {
  @scala.inline
  def apply(containerProps: AnonClassName, query: String, children: VdomNode = null): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
}

