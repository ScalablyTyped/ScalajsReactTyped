package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementStylesheetCSS extends StylesheetCSS {
  def json(): js.Any
}

object ElementStylesheetCSS {
  @scala.inline
  def apply(
    css: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core,
    json: CallbackTo[js.Any],
    selector: String
  ): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
}

