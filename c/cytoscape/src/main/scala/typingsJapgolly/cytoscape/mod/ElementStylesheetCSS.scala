package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementStylesheetCSS
  extends StObject
     with StylesheetCSS {
  
  def json(): Any
}
object ElementStylesheetCSS {
  
  inline def apply(css: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core, json: CallbackTo[Any], selector: String): ElementStylesheetCSS = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], json = json.toJsFn, selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementStylesheetCSS]
  }
  
  extension [Self <: ElementStylesheetCSS](x: Self) {
    
    inline def setJson(value: CallbackTo[Any]): Self = StObject.set(x, "json", value.toJsFn)
  }
}
