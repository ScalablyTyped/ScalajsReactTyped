package typingsJapgolly.marked.mod.marked.Tokens

import typingsJapgolly.marked.markedStrings.escape
import typingsJapgolly.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Escape
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var `type`: escape
}
object Escape {
  
  inline def apply(raw: String, text: String): Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("escape")
    __obj.asInstanceOf[Escape]
  }
  
  extension [Self <: Escape](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: escape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
