package typingsJapgolly.jqueryTools

import typingsJapgolly.jqueryTools.JQueryTools.ToolsStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var tools: ToolsStatic
}
object JQueryStatic {
  
  inline def apply(tools: ToolsStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tools = tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setTools(value: ToolsStatic): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
  }
}
