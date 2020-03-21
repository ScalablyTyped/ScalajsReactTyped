package typingsJapgolly.cytoscape.mod

import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#cy.style
  */
trait StylesheetCSS extends Stylesheet {
  var css: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core
  var selector: String
}

object StylesheetCSS {
  @scala.inline
  def apply(css: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core, selector: String): StylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StylesheetCSS]
  }
}

