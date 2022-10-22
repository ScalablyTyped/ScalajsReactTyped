package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the entry point to modify the visual style of the graph after initialisation.
  * http://js.cytoscape.org/#core/style
  */
trait ElementStylesheetStyle
  extends StObject
     with StylesheetStyle {
  
  def json(): Any
}
object ElementStylesheetStyle {
  
  inline def apply(
    json: CallbackTo[Any],
    selector: String,
    style: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core
  ): ElementStylesheetStyle = {
    val __obj = js.Dynamic.literal(json = json.toJsFn, selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetStyle]
  }
  
  extension [Self <: ElementStylesheetStyle](x: Self) {
    
    inline def setJson(value: CallbackTo[Any]): Self = StObject.set(x, "json", value.toJsFn)
  }
}
