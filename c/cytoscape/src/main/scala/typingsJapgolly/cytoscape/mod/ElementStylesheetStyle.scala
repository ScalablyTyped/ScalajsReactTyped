package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get the entry point to modify the visual style of the graph after initialisation.
  * http://js.cytoscape.org/#core/style
  */
trait ElementStylesheetStyle extends StylesheetStyle {
  def json(): js.Any
}

object ElementStylesheetStyle {
  @scala.inline
  def apply(
    json: CallbackTo[js.Any],
    selector: String,
    style: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core
  ): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
}

