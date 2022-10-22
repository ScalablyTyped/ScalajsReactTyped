package typingsJapgolly.cytoscape.mod

import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#cy.style
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cytoscape.mod.StylesheetStyle
  - typingsJapgolly.cytoscape.mod.StylesheetCSS
*/
trait Stylesheet extends StObject
object Stylesheet {
  
  inline def StylesheetCSS(css: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core, selector: String): typingsJapgolly.cytoscape.mod.StylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cytoscape.mod.StylesheetCSS]
  }
  
  inline def StylesheetStyle(selector: String, style: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core): typingsJapgolly.cytoscape.mod.StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cytoscape.mod.StylesheetStyle]
  }
}
