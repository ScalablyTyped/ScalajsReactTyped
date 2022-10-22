package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_HTML: html
}
object HTML {
  
  inline def apply(value: Any): HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
    __obj.asInstanceOf[HTML]
  }
  
  extension [Self <: HTML](x: Self) {
    
    inline def setType(value: html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
