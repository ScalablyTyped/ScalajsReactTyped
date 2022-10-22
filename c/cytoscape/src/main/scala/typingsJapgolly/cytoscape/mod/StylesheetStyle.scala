package typingsJapgolly.cytoscape.mod

import typingsJapgolly.cytoscape.mod.Css.Edge
import typingsJapgolly.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylesheetStyle
  extends StObject
     with Stylesheet {
  
  var selector: String
  
  var style: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core
}
object StylesheetStyle {
  
  inline def apply(selector: String, style: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core): StylesheetStyle = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesheetStyle]
  }
  
  extension [Self <: StylesheetStyle](x: Self) {
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Node | Edge | typingsJapgolly.cytoscape.mod.Css.Core): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
