package typingsJapgolly.marked.mod.marked.Tokens

import typingsJapgolly.marked.markedStrings.html
import typingsJapgolly.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML
  extends StObject
     with Token {
  
  var pre: Boolean
  
  var raw: String
  
  var text: String
  
  var `type`: html
}
object HTML {
  
  inline def apply(pre: Boolean, raw: String, text: String): HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
    __obj.asInstanceOf[HTML]
  }
  
  extension [Self <: HTML](x: Self) {
    
    inline def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
